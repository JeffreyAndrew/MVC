/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;

/**
 *
 * @author FIA-LAB1D6
 * @param <Entidad>
 */
public interface operacion <Entidad>{
    
    public int create(Entidad e);
    public int update(Entidad e);
    public int delete(Entidad e);
    public List<Entidad> readAll();
    public Entidad read(Object ob);
            
}
