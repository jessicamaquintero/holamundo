package co.appscloud.pruebas;

/**
* @author quind
 */
public class prueba2arreglosimetrico {
    static String[] myArray = {"a", "b", "c", "d", "d", "c", "x", "a"};
    static  int n=8;

        public static void main (String[] args) throws java.lang.Exception
        {
        int tamano= myArray.length;
        boolean esSimetrica=true;

if(tamano==n)
    {
      if(n%2==0)
      {
            int primeraLetra=myArray[0].codePointAt(0);
            int contador=0;
            int max=n;
            for(int a=0;a<myArray.length;a++)
            {
              if((myArray[a].codePointAt(0)>=65)&&(myArray[a].codePointAt(0)<=122))
              {      
                    if((a<=3))
                    {
                        if(myArray[a].codePointAt(0)==primeraLetra)
                        {
                        }
                        else
                        {
                        esSimetrica=false;
                        }
                         primeraLetra++;
                   }
                    
                   if(a==4)
                    {   
                        primeraLetra--;
                        if(myArray[a].codePointAt(0)==(primeraLetra))
                        {
                        }
                        else
                        {
                        esSimetrica=false;
                        }
                        contador++;
                         primeraLetra--;
                    } 
                   
                    if(a>4)
                    {   
                        if(myArray[a].codePointAt(0)==primeraLetra)
                        {
                        }
                        else
                        {
                        esSimetrica=false;
                        }
                        primeraLetra--;
                  }    
              }
              else
              {
                esSimetrica=false;
                break;
              }
            }
            
            if(esSimetrica==true)
            {
            System.out.println("Symmetric");
            }
            else
            {
            System.out.println("Asymmetric");
            }  
       }
    }
}//main
}// clase
