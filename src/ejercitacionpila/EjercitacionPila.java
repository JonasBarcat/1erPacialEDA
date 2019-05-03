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
public class EjercitacionPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pila pila1=new Pila();
        
        pila1.push("Ubuntu");
        pila1.push("windows");
        pila1.push("jajajaja");
//        
//        if(pila1.esPilaVacia()){
//            System.out.println("La lista se encuentra vacía");
//        }else System.out.println("La lista no está vacía");
//        
//        
//        for(int i=0;i<5;i++){
//            pila1.push("jonas");
//        }
//        
        pila1.verPila();
        System.out.println();
//        
//           if(pila1.esPilaVacia()){
//            System.out.println("La lista se encuentra vacía");
//        }else System.out.println("La lista no está vacía");
//        
//        pila1.push("hola");
//        System.out.println(pila1.top());
//        
//        System.out.println(pila1.fondo());
//        
//        pila1.reemplazar("JONAS", "EZEQUIEL");
//        pila1.verPila();
//        
//        pila1.pop();
//        System.out.println();
//        pila1.verPila();
//        
//        
//        System.out.println();
//        System.out.println("Cantidad de items es: "+pila1.cantidad());
//        
        // testear eliminar
        System.out.println("");
        System.out.println("");
        System.out.println("##############################################");
        System.out.println("");
        
        Pila pila2=new Pila();
        
        
        pila2.push("jonas");
        pila2.push("joel");
        pila2.push("hola");

        pila2.verPila();
        System.out.println();
        
        
         System.out.println("");
        System.out.println("");
        System.out.println("##############################################");
        System.out.println("");
        
        Pila pila3=union(pila1,pila2);
        pila3.verPila();

    }
    
    
    public static Pila union(Pila p1,Pila p2){
        Pila nueva=new Pila();
        while(!p1.esPilaVacia()){
            nueva.push(p1.top());
            p1.pop();
        }
        while(!p2.esPilaVacia()){
            nueva.push(p2.top());
            p2.pop();
        }
        return nueva;
    }
    
    
}
