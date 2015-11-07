package models;
import play.db.jpa.JPA;
import javax.persistence.Entity;
import javax.persistence.*;


/**
 * Created by Jose on 06-11-15.
 */
@Entity
@SequenceGenerator(name = "idAutoGen",sequenceName = "seq_dependencia")
public class Dependencia extends EntidadAutoLongAltKey{
    public String nombreDependencia;
    public String ubicacion;

    @ManyToOne
    public Establecimiento establecimiento;

    public String getNombreDependencia() {
        return nombreDependencia;
    }

    public void setNombreDependencia(String nombreDependencia) {
        this.nombreDependencia = nombreDependencia;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
