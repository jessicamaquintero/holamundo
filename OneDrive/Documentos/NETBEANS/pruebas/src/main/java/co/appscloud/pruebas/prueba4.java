/* 
Pregunta 7
Se tiene una matriz de n x n que contiene números del 1 al 9, simulado usando una matriz unidimensional. Así, por ejemplo, esta matriz:

1 2 9
2 5 3
5 1 5

Se representaría como (1,2,9,2,5,3,5,1,5). El objetivo es identificar el camino que de la menor suma al recorrer el arreglo bi-dimencional de izquierda a derecha. Se empieza en la columna izquierda y se mueve siempre una columna a la derecha de la misma fila o a una fila hacia arriba o hacia abajo. En el ejemplo, si parte de 1, puede pasar al 2 o al 5. De ahí, si pasó al 5 puede pasar al 9 al 3 o al 5. Por otro lado , si pasa del 1 al 2, desde el 2 de la columna del medio no podría pasar al 5 de la ultima fila en la columna derecha. El valor de n puede ser entre 1 y 4.

Es necesario encontrar el camino que produce el número más bajo al suma los valores de cada número que visita. Así que para el ejemplo, la ruta con la menor suma sería 1,2,3

El código para declarar y poblar myArray ya está ahí y tambien el que asinga el valor de n, puede editarlo para probar con otros valores y puede hacer clic en el botón de actualizar junto a él para volver al valor original que se utilizará para validar su código durante la prueba.

El resultado de su programa debe ser los n números por los que paso para obtener la menor suma separados por un espacio. Para el ejemplo, la salida sería exactamente así:
1 2 3

Nota: Asumir que esta escribiendo el codigo dentro de una clase Main, por lo que no debe declarar la clase Main, pero si el metodo public static void main para ejecutar su código. 
package co.appscloud.pruebas;
*/
package co.appscloud.pruebas;
/**
* @author quind
 */
public class prueba4
{
static int[] myArray = {1,2,1,2,5,3,5,1,5}; 

 public static void main (String args[]) {
	 int suma=9999999;
         int valor=0;
         int camino1=0;
         int camino2=0;
         int camino3=0;
         
   for(int a=0;a< myArray.length;a++)
   {     
	 if((a+1)<myArray.length)
         {    
         for(int b=3; b<=myArray.length;b=b+3)
	 {
            if((b+3)<myArray.length)
            {    
                valor= myArray[a]+myArray[a+1]+myArray[b+3];
                if(valor<suma)
                {
                suma=valor;
                camino1=a;
                camino2=a+1;
                camino3=b+2;
                } 
            }
         }
         }
   }
   
     System.out.println(myArray[camino1]+" "+myArray[camino2]+" "+myArray[camino3]);
  }//main

}
