/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercitacionpila;

/**
 *
 * @author jonas
 */
public class Item {
    
    private Item siguiente;
    private String propiedad;

    public Item(String propiedad) {
        this.siguiente =null;
        this.propiedad = propiedad;
    }
    
    
    

    public Item getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Item siguiente) {
        this.siguiente = siguiente;
    }

    public String getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(String propiedad) {
        this.propiedad = propiedad;
    }

  
    
    
}
