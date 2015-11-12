package models;
import javax.persistence.*;

/**
 * Created by Jose on 09-11-15.
 */
@Entity
@SequenceGenerator(initialValue = 1, name = "idAutonGen", sequenceName = "seq_tipo_de_departamento")
public class TipoDeDepartamento extends EntidadIdAutoLongTipos{

    public String tipo;


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return tipo;
    }
}
