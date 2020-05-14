/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jessica.holam;

/**
 *
 * @author jessica quintero
 */
public class numeroMayor {

public static void main (String args[]) 
 {
 int[] myArray = {13,2,4,35,1};
 compararmayor(myArray);
}

public static void compararmayor(int[]myArray)
{
 int tamano=myArray.length; 
 int mayor=0;

 for(int a=0; a<tamano;a++)
 {
  if(myArray[a]>mayor)
  {
   mayor=myArray[a];
  }
 }
 System.out.println(mayor);
} 
    
}
