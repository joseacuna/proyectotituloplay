package models;

import javax.persistence.Entity;
import javax.persistence.*;

/**
 * Created by Jose on 09-11-15.
 */
@Entity
@SequenceGenerator(name = "idAutoGen", sequenceName = "seq_departamento")
public class Departamento extends EntidadAutoLongAltKey {

    public String nombre;

    @ManyToOne
    public Establecimiento establecimiento;

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
}
