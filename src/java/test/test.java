/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.usuarioDAO;
import dto.usuario;
import java.util.ArrayList;
import java.util.List;
import util.Conexion;

/**
 *
 * @author FIA-LAB1D6
 */
public class test {
    private static final usuarioDAO aO = new usuarioDAO();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        listar();
    }
    public static void conex(){
        if (Conexion.getConexion()!=null) {
            System.out.println("si");
        }else{
            System.out.println("no");
        }
    }
    public static void listar(){
        List<usuario> u = new ArrayList<>();
        u = aO.readAll();
        for (int i = 0; i< u.size(); i++) {
            System.out.println(u.get(i).getUser());
        }
    }
}
