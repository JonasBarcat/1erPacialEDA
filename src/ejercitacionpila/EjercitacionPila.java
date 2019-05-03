/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercitacionpila;

import java.util.ArrayList;

/**
 *
 * @author jonas
 */
public class EjercitacionPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Pila pila1=new Pila();
//        
//        pila1.push("Ubuntu");
//        pila1.push("windows");
//        pila1.push("jajajaja");
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
//        pila1.verPila();
//        System.out.println();
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
//        System.out.println("");
//        System.out.println("");
//        System.out.println("##############################################");
//        System.out.println("");
//        
//        Pila pila2=new Pila();
//        
//        
//        pila2.push("jonas");
//        pila2.push("joel");
//        pila2.push("hola");
//
//        pila2.verPila();
//        System.out.println();
//        
//        
//         System.out.println("");
//        System.out.println("");
//        System.out.println("##############################################");
//        System.out.println("");
//        
//        Pila pila3=union(pila1,pila2);
//        pila3.verPila();
//
//        
          System.out.println("");
        System.out.println("");
        System.out.println("#################### a postfija #######################");
        System.out.println("");
        

        String postfija=postFija("a*b+c/d=");
        System.out.println("Expresion postfija: "+postfija);
        
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
    
    
    ///////// PASAR DE INFIJA A POSTFIJA
    public static String postFija(String infija){   //RECIBE UNA EXPRESION POSTFIJA
        Pila OPERADORES=new Pila();
        Pila EP=new Pila();
       
       System.out.println("Expresion ingresada: "+infija);
       char[] caracter = infija.toCharArray();
       int i=0;
    
            while(caracter[i]!='='){
                if(caracter[i]!='+' || caracter[i]!='-' || caracter[i]!='*' || caracter[i]!='/' || caracter[i]!='(' || caracter[i]!=')'){
                    EP.push(Character.toString(caracter[i]));
                    i++;
                }
                if(caracter[i]=='('){
                    EP.push(Character.toString(caracter[i]));
                    i++;
                }
                if(caracter[i]=='*' || caracter[i]=='/'){
                    OPERADORES.push(Character.toString(caracter[i]));
                    i++;
                }
                if(caracter[i]=='+' || caracter[i]=='-'){
                        if(OPERADORES.esPilaVacia() || (OPERADORES.top()!="*" && OPERADORES.top()!= "/")){
                            OPERADORES.push(Character.toString(caracter[i]));
                            i++;
                        }else{
                            while(OPERADORES.top()=="*" || OPERADORES.top()=="/"){
                                EP.push(OPERADORES.top());
                                OPERADORES.pop();
                            }
                            OPERADORES.push(Character.toString(caracter[i]));
                            i++;
                        }
                }
                if(caracter[i]==')'){
                    while(OPERADORES.top()!="("){
                        EP.push(OPERADORES.top());
                        OPERADORES.pop();
                    }
                    OPERADORES.pop();
                    i++;
                }
                
            }
            
            while(!OPERADORES.esPilaVacia()){
                EP.push(OPERADORES.top());
                OPERADORES.pop();
            }
            
  
         
            Pila postfija=new Pila();
            while(!EP.esPilaVacia()){
                postfija.push(EP.top());
                EP.pop();
            }
            
            StringBuilder convertirstring=new StringBuilder();
            while(!postfija.esPilaVacia()){
                convertirstring.append(postfija.top());
                postfija.pop();
            }
            String expresionpostfija;
            expresionpostfija=convertirstring.toString();
           
    return expresionpostfija; 

    }
    
    
    
}
