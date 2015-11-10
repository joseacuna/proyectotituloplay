package models;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

/**
 * Created by Jose on 10-11-15.
 */
@Entity
@SequenceGenerator(initialValue = 1,name = "idAutoGen", sequenceName = "seq_tipo_usuario")
public class TipoUsuario extends EntidadAutoLongAltKey {
    public String tipoUsuario;

    @Override
    public String toString() {
        return tipoUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
