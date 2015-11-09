package models;

import play.db.jpa.JPA;
import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Comuna extends Model{
    public String nombre;
    @ManyToOne
    public Provincia provincia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public static List<Comuna> findAllComunasByIdProvincias(Long id_provincia) {
        List<Comuna> comunas= JPA.em().createQuery("select co FROM Comuna co where co.provincia.id=?1").setParameter(1,id_provincia).getResultList();
        return comunas;

    }
}
