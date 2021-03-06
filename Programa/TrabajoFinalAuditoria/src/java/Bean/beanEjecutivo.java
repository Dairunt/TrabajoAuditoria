/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;

import Dao.EjecutivoDao;
import Model.Ejecutivo;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
/**
 *
 * @author FrancoSebastian
 */
@Named(value = "beanEjecutivo")
@ViewScoped
public class beanEjecutivo implements Operaciones {

    /**
     * Creates a new instance of beanCuentas
     */
    List<Ejecutivo> ejecutivos;
    Ejecutivo ejecutivo;
    
     public void buttonAction(ActionEvent actionEvent) {
        addMessage("Insertando datos");
        Insertar();
    }
    
     public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public List<Ejecutivo> getEjecutivos() {
        EjecutivoDao linkDao = new EjecutivoDao();
        ejecutivos = linkDao.Listar();
        return ejecutivos;
    }

    public void setEjecutivos(List<Ejecutivo> ejecutivos) {
        this.ejecutivos = ejecutivos;
    }

    public Ejecutivo getEjecutivo() {
        return ejecutivo;
    }

    public void setEjecutivo(Ejecutivo ejecutivo) {
        this.ejecutivo = ejecutivo;
    }
    

    public beanEjecutivo(){
         ejecutivo=new Ejecutivo(); 
    }
    

    @Override
    public List Listar() {
        EjecutivoDao linkDao = new EjecutivoDao();
        ejecutivos = linkDao.Listar();
        return ejecutivos;
    }

    @Override
    public void Insertar() {
        EjecutivoDao linkDao = new EjecutivoDao();
        linkDao.Insertar(ejecutivo);
        ejecutivo=new Ejecutivo();
    }

    @Override
    public void Actualizar() {
        EjecutivoDao linkDao = new EjecutivoDao();
        linkDao.Actualizar(ejecutivo);
        ejecutivo=new Ejecutivo();
    }

    @Override
    public void Borrar() {
        EjecutivoDao linkDao = new EjecutivoDao();
        linkDao.Borrar(ejecutivo);
        ejecutivo=new Ejecutivo();
    }
    
    
    }
    

