package models;
import play.db.jpa.JPA;
import javax.persistence.Entity;
import javax.persistence.*;

/**
 * Created by Jose on 09-11-15.
 */
@Entity
@SequenceGenerator(name = "idAutoGen", sequenceName = "seq_persona")
public class Persona extends EntidadAutoLongAltKey{

    public String nombres;
    public String apellidoPaterno;
    public String apellidoMaterno;
    public String rut;
    public int genero;
    public String telefono;
    public String anexo;

    @ManyToOne
    public Establecimiento establecimiento;

    public static Persona findPersonaByAltKey(String altKey) {
        try{
            Persona persona= JPA.em().createQuery("select pr FROM Persona pr where pr.altKey=?1",Persona.class).setParameter(1,altKey).getSingleResult();
            return persona;
        }catch (NoResultException e){
            return null;
        }
    }


}
