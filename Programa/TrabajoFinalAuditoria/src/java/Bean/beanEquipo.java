/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;

import Dao.EquipoDao;
import Model.Equipo;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
/**
 *
 * @author FrancoSebastian
 */
@Named(value = "beanEquipo")
@ViewScoped
public class beanEquipo implements Operaciones {

    /**
     * Creates a new instance of beanCuentas
     */
    List<Equipo> equipos;
    Equipo equipo;

    public List<Equipo> getEquipos() {
        EquipoDao linkDao = new EquipoDao();
        equipos = linkDao.Listar();
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    
    public beanEquipo(){
        equipo= new Equipo();
    }
    

    @Override
    public List Listar() {
        EquipoDao linkDao = new EquipoDao();
        equipos = linkDao.Listar();
        return equipos;
    }

    @Override
    public void Insertar() {
        EquipoDao linkDao = new EquipoDao();
        linkDao.Insertar(equipo);
        equipo=new Equipo(); //
    }

    @Override
    public void Actualizar() {
        EquipoDao linkDao = new EquipoDao();
        linkDao.Actualizar(equipo);
        equipo=new Equipo();
    }

    @Override
    public void Borrar() {
        EquipoDao linkDao = new EquipoDao();
        linkDao.Borrar(equipo);
        equipo=new Equipo();
    }
    
    
    }
    

