/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.usuario;
import interfaces.operacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.Conexion;

/**
 *
 * @author FIA-LAB1D6
 */
public class usuarioDAO implements operacion<usuario> {
    
    private Connection cx;
    private PreparedStatement ps;
    private ResultSet rs;
    String sql;

    @Override
    public int create(usuario e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int update(usuario e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int delete(usuario e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<usuario> readAll() {
        sql = "SELECT *FROM usuario";
        List<usuario> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                usuario us = new usuario();
                us.setIduser(rs.getInt("idusuario"));
                us.setUser(rs.getString("nom_user"));
                us.setPass(rs.getString("pass"));
                lista.add(us);
            }
        } catch (Exception e) {
            System.out.println("Error readAll" + e);
        }
        return lista;
    }
    
    @Override
    public usuario read(Object ob) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
