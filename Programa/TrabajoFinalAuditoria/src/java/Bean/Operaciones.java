/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;

import java.util.List;

/**
 *
 * @author FrancoSebastian
 * @param <T>
 */
public interface Operaciones <T> {
    public List<T> Listar();
    public void Insertar();
    public void Actualizar();
    public void Borrar();
    
}
