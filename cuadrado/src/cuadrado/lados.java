/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrado;

/**
 *
 * @author Ivan
 */
public class lados {
    private int size;
    
    public lados (int tamaño){
        size = tamaño;
    }
    private void imprimirlineacompleta(int size){
        for (int i = 0 ; i < size ; i++){
            System.out.print("*");
         
        }
          
    }
    
    private void imprimirlineavacia(int size){
        System.out.print("*");
        for (int i=0; i < size - 2; i++){
            System.out.print(" ");
        }
        System.out.print("*");
        
    }
    public void crear(){
        for (int i= 0; i < size; i++){
            if (i == 0 || i == size - 1){
                imprimirlineacompleta(size);
            }else{
                imprimirlineavacia(size);
            }
            System.out.print("\n");
        }
    }

    }
