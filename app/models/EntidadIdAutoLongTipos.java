package models;

import play.db.jpa.GenericModel;
import javax.persistence.*;

/**
 * Created by Jose on 09-11-15.
 */
    @MappedSuperclass
    public abstract class EntidadIdAutoLongTipos extends GenericModel {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO, generator = "idAutonGen")
        @Column(unique = true)
        public Long id;

        public boolean activo;
}
