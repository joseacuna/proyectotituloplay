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
    @ManyToOne
    public Usuario usuario;
    @ManyToOne
    public TipoUsuario tipoUsuario;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    public Establecimiento getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(Establecimiento establecimiento) {
        this.establecimiento = establecimiento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public static Persona findPersonaByAltKey(String altKey) {
        try{
            Persona persona= JPA.em().createQuery("select pr FROM Persona pr where pr.altKey=?1",Persona.class).setParameter(1,altKey).getSingleResult();
            return persona;
        }catch (NoResultException e){
            return null;
        }
    }


}
