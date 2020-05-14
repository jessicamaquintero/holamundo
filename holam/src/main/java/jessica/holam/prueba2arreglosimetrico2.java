/* 
Pregunta 5
Escribir un programa en Java que recorra un arreglo y genere un histograma en base a los números de este. El arreglo se llama myArray y contiene 10 elementos que corresponden a números enteros del 1 al 5. Un histograma representa que tanto un elemento aparece en un conjunto de datos (Debe mostrar la frecuencia para todos los números del 1 al 5, incluso si no están presentes en el arreglo). Por ejemplo, para el arreglo: myArray:=(1,2,1,3,3,1,2,1,5,1) el histograma se vería asi:

1: *****
2: **
3: **
4:
5: *

El código para declarar y poblar myArray ya está ahí, puede editarlo para probar con otros valores
y puede hacer clic en el botón de actualizar junto a él para volver al valor original que se 
utilizará para validar su código durante la prueba. Asegúrese de que los resultados se impriman exactamente como aparecen aquí, ya que incluso un espacio faltante o sobrante puede marcar la pregunta como incorrecta (Notar espacio entre los ":" y el primer asterisco y que los resultados deben mostrarse ordenados de forma ascendente).

Nota: Asumir que esta escribiendo el codigo dentro de una clase Main, por lo que no debe declarar la clase Main, pero si el metodo public static void main para ejecutar su código. 
*/

package jessica.holam;

/**
* @author quind
 */
public class prueba2arreglosimetrico2
{
static int[] myArray = {1,2,1,3,3,1,2,1,5,1};

public static void main (String args[]) {
{
 int numMayor=mayor(myArray);   
 contar(myArray, numMayor);
}//main
}// clase


public static int mayor(int [] myArray)
{
      int max=0;
  //escojo el máximo
            for(int a=0;a<myArray.length;a++)
            {
			  if(myArray[a]>max)
			  {
			   max= myArray[a];	
			  }  
            }
     return max;       
}


public static void contar(int [] myArray,int numMayor)
{
 // imprimo si son iguales para contar           
            for(int a=1;a<=numMayor;a++)
            {               
                          System.out.print((a)+": ");  
			   for(int b=1;b<=myArray.length;b++)
			  { 
				
                               if(myArray[b-1]==a)
				{
				 System.out.print("*");	
				}  
                             }
            System.out.println("");	
            }
            
}
}