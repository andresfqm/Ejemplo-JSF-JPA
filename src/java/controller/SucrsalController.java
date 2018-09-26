/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ejb.SucursalesFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import modelo.Sucursales;

/**
 *
 * @author homero
 */
@Named
@ViewScoped
public class SucrsalController implements Serializable {

    // Utilizamos la siguiente anotación para evitarnos escribir new EJB
    @EJB
    private SucursalesFacadeLocal SucursalEJB;

    private Sucursales sucursal;

    @PostConstruct

    public void init() {
        sucursal = new Sucursales();

    }

    public Sucursales getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursales sucursal) {
        this.sucursal = sucursal;
    }

    public void registrarSucursal() {
        try {

            SucursalEJB.create(sucursal);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Sucursal registrada correctamente"));

        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error al registrar la sucursal"));
        }

    }

    public List<Sucursales> listarSucursales() {

        return this.SucursalEJB.findAll();

    }

    public void eliminarSucursal(Sucursales s) {

        SucursalEJB.remove(sucursal);

    }
    
    public void metodoPruebaGit(){
        System.out.println("Prueba git");
    }
}
