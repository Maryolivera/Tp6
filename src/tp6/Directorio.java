/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Mary
 */
public class Directorio {

    private Map<String, Cliente> clientes = new HashMap<>();

    public void agregarCliente() {
        Menu menu=new Menu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        
       
        clientes.put("4212", new Cliente("3548", "Juan", "Lopez", "San Luis", "Belgrano 1234"));
        clientes.put("2545", new Cliente("5689", "Pedro", "Lucero", "San Luis", "Ayachucho 980"));
        clientes.put("4565", new Cliente("5845", "Luis", "Rodriguez", "San Luis", "Mitre 1234"));

    }

    public Cliente buscarCliente(String numero) {
        for(Map.Entry<String,Cliente> entry:clientes.entrySet()){
            String key=entry.getKey();
            Cliente value=entry.getValue();
            if(numero.equals(key))
                return value;
            }
      //
     // System.out.println("no se encontro un cliente asociado al telefono");  
        JOptionPane.showMessageDialog(null,"no se encontro un cliente asociado al telefono");
return null;
    }

    public ArrayList<Cliente> buscarClientes(String ciudad) {
        ArrayList<Cliente> lista = new ArrayList<Cliente>();

        Iterator<String> it = clientes.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            if (clientes.get(key).getCiudad().equals(ciudad)) {
                lista.add(clientes.get(key));
                
                System.out.println(lista);
              
            }
        }
        return lista;
    }

    public ArrayList<String> buscarTelefono(String apellido) {
        ArrayList<String> list = new ArrayList<String>();

        Iterator<String> it = clientes.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();

            if (clientes.get(key).getApellido().equals(apellido)) {
                list.add(key);
            }
        }
        return list;
    }
    public void borrarCliente(String telefono){
        Cliente aux=clientes.remove(telefono);
        if (aux!=null){
            System.out.println("se elimino");
        }else{
           // System.out.println("cliente no encontrado");
            JOptionPane.showMessageDialog(null,"CLIENTE NO ENCONTRADO");
                    
        }
    }
}