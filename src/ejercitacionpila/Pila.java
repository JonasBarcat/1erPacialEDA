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
public class Pila {
    
    private Item primero;
    private static int cant=0;
    
    public Pila() {
    }
    
    
    public boolean esPilaVacia(){
        if(this.primero==null){
            return true;
        }else{
            return false;
        }
    }
    
    
    public void verPila(){
        Item aux=this.primero;
        while(aux!=null){
            System.out.print("--> "+aux.getPropiedad());
            aux=aux.getSiguiente();
        }
    }
    
    
    public void pop(){
            if(esPilaVacia()){
                //devuelve la pila vacia
            }
            else{//elimina el primer elemento
                this.primero=this.primero.getSiguiente();
                cant--;
            }
    }
    
    
    public String top(){
        if(esPilaVacia()){
            return null;
        }else{
            return this.primero.getPropiedad();
        }
    }
    
    public void push(String propiedad){
        Item aux=new Item(propiedad);
        aux.setSiguiente(this.primero);
        this.primero=aux;
        cant++;
    }
    
    
    
    public String fondo(){
           if(esPilaVacia()){
               return null;
           }else{
            Item aux=this.primero;
            return fondear(aux);
           }
        }
    private String fondear(Item aux){
        if(aux.getSiguiente()==null){
            return aux.getPropiedad();
        }else{
            aux=aux.getSiguiente();
            return fondear(aux);
        }
    }
    
    
    public void reemplazar(String a,String b){//reemplaza las ocurrencias de a por b
            Item aux=this.primero;
            reemp(aux,a,b);
    }
    private void reemp(Item aux,String a,String b){
        if(aux==null){//termina
        }
        else if(aux.getPropiedad().equalsIgnoreCase(a)){
            aux.setPropiedad(b);
            aux=aux.getSiguiente();
            reemp(aux,a,b);
        }else{
            aux=aux.getSiguiente();
            reemp(aux,a,b);
        }
    }
    
    public int cantidad(){
        return cant;
    }
    
    
    
    public boolean esta(String propiedad){
                Item aux=this.primero;
                return internoesta(propiedad,aux);
    }
    private boolean internoesta(String propiedad,Item aux){ // metodo interior de "esta"
            if(aux==null){
                return false;
            }else{
                if(aux.getPropiedad().equalsIgnoreCase(propiedad)){
                    return true;
                }else{
                    aux=aux.getSiguiente();
                    return internoesta(propiedad,aux);
                }
            }
    }
    
    
    
    public void eliminar(String propiedad){   
            if(esPilaVacia()){
            }else{  // aqui solo evalua cuando la lista tiene 1 solo item
              if(this.primero.getSiguiente()==null && propiedad.equalsIgnoreCase(this.primero.getPropiedad())){
                  this.primero=this.primero.getSiguiente();
                  cant--;
              }else{// de aqui en adelante evalua cuando hay mas de 1 item
                  Item aux=this.primero;
                  while(aux.getSiguiente()!=null){
                      if(this.primero.getPropiedad().equalsIgnoreCase(propiedad)){ // elimina el primero
                          this.primero=this.primero.getSiguiente();
                          cant--;
                      }
                      if(aux.getSiguiente().getPropiedad().equalsIgnoreCase(propiedad)){
                                 aux.setSiguiente(aux.getSiguiente().getSiguiente());
                           cant--;
                      }                      
                      if(aux.getSiguiente()!=null){ //sirve cuando se elimina el ultimo item, si se borra este if podria resultar null pointer
                            aux=aux.getSiguiente();
                      }  
                  }
              }
            }
    }
    
    
    
}


