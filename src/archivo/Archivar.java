/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import java.io.File;
import java.util.Scanner;

public class Archivar {
   int z=0;
    
    public void conteo(){
      Scanner archivo=null;
        try{
      archivo= new Scanner(new File("C:\\Users\\alejandro\\Desktop\\numeros.txt"));
      }
      catch(Exception e){
          System.out.println("archivo no encontrado!!");
      }
      while(archivo.hasNext()){
      archivo.nextInt();
      z=z+1;
      }
    }
    
   
     
    public void arreglo(){
     int arreglo[]=new int[z];
        int num=0,l=0;
        Scanner archi=null;
        try{
      archi= new Scanner(new File("C:\\Users\\alejandro\\Desktop\\numeros.txt"));
      }
      catch(Exception e){
          System.out.println("archivo no encontrado!!");
      }  
      while(archi.hasNext()){
      num = archi.nextInt();
      arreglo[l]=num;
      l=l+1;
      
     }
     
      int aux=0;
     
        for(int i=1;i<z;i++){ 
       for(int j=i+1;j<z;j++){
        if(arreglo[i]<arreglo[j]){
          aux=arreglo[i];
          arreglo[i]=arreglo[j];
          arreglo[j]=aux;
            }
       
    }
    }
     
    
     
    if(arreglo[0]==z-1){
       System.out.println("el arreglo es de: "+arreglo[0]+" digitos"); 
      for(int b=1;b<z;b++){
       System.out.println(" "+arreglo[b]);
      }
    }
    else{System.out.println("el numero de elementos no corresponde con el numero especifico");}
   }  
 }
