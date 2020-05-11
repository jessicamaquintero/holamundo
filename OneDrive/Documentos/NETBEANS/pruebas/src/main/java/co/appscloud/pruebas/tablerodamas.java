/*
Pregunta 2
Imprimir un tablero de damas donde la "X" representa el color negro y el "_" representa el blanco. El tablero debe tener n x n casillas. Por ejemplo, para n=5 el tablero se vería así:

X_X_X
_X_X_
X_X_X
_X_X_
X_X_X

Tu tablero siempre debe partir con un cuadro negro (una "X") en la esquina superior izquierda y el valor de n puede ir de 1 a 10. En caso de que el valor de n sea diferente, asumir que n es igual a 5.

El código para el tamaño de n ya está ahí, puede editarlo para probar con otros valores y puede hacer clic en el botón de actualización junto a él para volver al valor original que se utiliza para validar su código durante la prueba. Tenga en cuenta que el código debe imprimir los resultados exactamente como se muestra con el fin de que la pregunta sea considerada valida durante la prueba.

Nota: Asumir que esta escribiendo el codigo dentro de una clase Main, por lo que no debe declarar la clase Main, pero si el metodo public static void main para ejecutar su código. 
 */
package co.appscloud.pruebas;

/**
 *
 * @author quind
 */
public class tablerodamas {
  
 
public static void main (String args[]) {
   int n=6;
   llenarTablero(n);
}

public static void llenarTablero(int n)
{  
  String negro="X";
  String blanco="_";
  String intercalar="X";
  int fila=1;
  
  if(n>10)
  {
  n=5; // si es superior a 10 automaticamente se vuelve 5    
  }    
  
  //si son impares
  if(n%2!=0)
  {
  for(int f=0;f<n;f++)
  {  
    for(int c=0;c<n;c++)
    {    
         if(intercalar.equals("X"))
         {    
	 System.out.print(negro);
         intercalar="_";
         }
         else
         {
         System.out.print(blanco);
         intercalar="X";
         }    
         }
          System.out.println("");
	
  }
  }
  else// si es par
   { 
    int contadorPar=1; 
    String iniciaFila="X";
    for(int f=0;f<n;f++)
    {
     fila++;   
     for(int c=0;c<n;c++)
	 {
         if((contadorPar==1)&&(fila>1))
         {
            if(iniciaFila.equals("X"))
           {
           intercalar="_"; 
           iniciaFila="_"; 
           contadorPar++;
           }  
           else
           {
           intercalar="X";  
           iniciaFila="X";
           contadorPar++;
           }  
             
         }    
         if(contadorPar>n)
            {  
             contadorPar=1;
            } 
            else
            {
            contadorPar++;
            }    
         
         
        if(intercalar.equals("X"))
        {    
        System.out.print(negro);
        intercalar="_";
        }
        else
        {
        System.out.print(blanco);
        intercalar="X";
        }    
        }
         System.out.println("");
     }    
     }
}  
}
    

