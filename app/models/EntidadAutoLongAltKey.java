package models;

import play.db.jpa.GenericModel;

import javax.persistence.*;
import java.util.UUID;


@MappedSuperclass
public class EntidadAutoLongAltKey extends GenericModel
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "idAutoGen")
    public Long id;

    @Column(unique = true)
    public String altKey;


    @PrePersist
    public void prePersist() {
        altKey = (UUID.randomUUID().toString());
    }

}
