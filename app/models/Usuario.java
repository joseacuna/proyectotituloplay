package models;
import play.db.jpa.JPA;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

/**
 * Created by Jose on 10-11-15.
 */
@Entity
@SequenceGenerator(initialValue = 1,name = "idAutoGen", sequenceName = "seq_usuario")
public class Usuario extends EntidadAutoLongAltKey{
    public String usuario;
    public String password;
    public String email;

    @Override
    public String toString() {
        return usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
