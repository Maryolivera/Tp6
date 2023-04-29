/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

/**
 *
 * @author Mary
 */
public class Tp6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Directorio directorio=new Directorio();
        directorio.agregarCliente();
        directorio.buscarCliente("5689");
        directorio.buscarTelefono("Perez");
        directorio.buscarClientes("San Luis");
        directorio.borrarCliente("4541");
        
    }
    
}
