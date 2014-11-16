/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;

import Dao.CuentasDao;
import Model.Cuentas;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author FrancoSebastian
 */
@Named(value = "beanCuentas")
@ViewScoped
public class beanCuentas implements Operaciones {

    /**
     * Creates a new instance of beanCuentas
     */
    List<Cuentas> cuentas;
    Cuentas cuenta;

    public List<Cuentas> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuentas> cuentas) {
        this.cuentas = cuentas;
    }

    public Cuentas getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuentas cuenta) {
        this.cuenta = cuenta;
    }
    
    public beanCuentas() {
       Cuentas cuenta=new Cuentas(); 
    }
    

    @Override
    public List Listar() {
        CuentasDao linkDao = new CuentasDao();
        cuentas = linkDao.Listar();
        return cuentas;
    }

    @Override
    public void Insertar() {
        CuentasDao linkDao = new CuentasDao();
        linkDao.Insertar(cuenta);
        cuenta=new Cuentas();
    }

    @Override
    public void Actualizar() {
        CuentasDao linkDao = new CuentasDao();
        linkDao.Actualizar(cuenta);
        cuenta=new Cuentas();
    }

    @Override
    public void Borrar() {
        CuentasDao linkDao = new CuentasDao();
        linkDao.Borrar(cuenta);
        cuenta=new Cuentas();
    }
    
    
    }
    

