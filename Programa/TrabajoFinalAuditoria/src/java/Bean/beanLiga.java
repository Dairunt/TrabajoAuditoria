/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;

import Dao.LigaDao;
import Model.Liga;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
/**
 *
 * @author FrancoSebastian
 */
@Named(value = "beanLiga")
@ViewScoped
public class beanLiga implements Operaciones {

    /**
     * Creates a new instance of beanCuentas
     */
    List<Liga> ligas;
    Liga liga;

    public List<Liga> getLigas() {
         LigaDao linkDao = new LigaDao();
        ligas = linkDao.Listar();
        return ligas;
    }

    public void setLigas(List<Liga> ligas) {
        this.ligas = ligas;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }
    
    public beanLiga(){
         liga = new Liga();
                 
        }
    

    @Override
    public List Listar() {
        LigaDao linkDao = new LigaDao();
        ligas = linkDao.Listar();
        return ligas;
    }

    @Override
    public void Insertar() {
        LigaDao linkDao = new LigaDao();
        linkDao.Insertar(liga);
        liga=new Liga();
    }

    @Override
    public void Actualizar() {
        LigaDao linkDao = new LigaDao();
        linkDao.Actualizar(liga);
        liga = new Liga();
    }

    @Override
    public void Borrar() {
        LigaDao linkDao = new LigaDao();
        linkDao.Borrar(liga);
        liga = new Liga();
    }
    
    
    }
    