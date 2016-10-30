/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author homero
 */

@Entity
@Table(name = "sucursales")
public class Sucursales  implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codsucursal;
    
    @Column(name = "nombresucursal")
    private String nombresucursal;
    
    @Column(name = "direccion")
    private String direccion;
    
    @Column(name = "telefono")
    private int telefono;

    public int getCodsucursal() {
        return codsucursal;
    }

    public void setCodsucursal(int codsucursal) {
        this.codsucursal = codsucursal;
    }

    public String getNombresucursal() {
        return nombresucursal;
    }

    public void setNombresucursal(String nombresucursal) {
        this.nombresucursal = nombresucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.codsucursal;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sucursales other = (Sucursales) obj;
        if (this.codsucursal != other.codsucursal) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sucursales{" + "codsucursal=" + codsucursal + '}';
    }

    
    

    
}
