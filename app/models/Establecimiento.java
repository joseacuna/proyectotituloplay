package models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

/**
 * Created by Jose on 06-11-15.
 */
@Entity
public class Establecimiento extends EntidadAutoLongAltKey {

    public String nombreEdificio;
    public String descripcion; // Indicar si Es Casa Matriz,Sede;
    public String direccion; // Direccion Del Establecimiento;
    @ManyToOne(fetch = FetchType.LAZY)
    public Comuna comuna;
    @ManyToOne(fetch = FetchType.LAZY)
    public Provincia provincia;
    @ManyToOne(fetch = FetchType.LAZY)
    public Region region;
    @ManyToOne(fetch = FetchType.LAZY)
    public Pais pais;
}
