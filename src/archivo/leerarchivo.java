
package archivo;
import java.util.Scanner;
import java.io.File;

public class leerarchivo {
    
    
    public void conteo(){
      int z=0;
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
     
    //arreglo
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
     
    for(int b=0;b<z;b++){
     System.out.println(" "+arreglo[b]);
     }
    
}
}
