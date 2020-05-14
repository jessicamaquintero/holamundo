package jessica.holam;

/**
* @author quind
 */
public class main {
 
	public static void main (String[] args) throws java.lang.Exception
	{
		//BufferedReader r = new BufferedReader (new InputStreamReader (System.in));
		String [] s=new String [] {"1","2","3","texto"};
		//while (  (s=r.readLine()) != null)
                for(int a=0;a<4;a++)
                {
                    System.out.println(is_my_number_prime(s[a]));
                }  
	}
       
       
    public static String is_my_number_prime(String input)
    {
        //metoodo
      int largo=input.length();
      boolean esNumero=true;
      int contador=0;
      String texto="NO_ES_PRIMO";
      int numero;
      
      for(int n=0;n<largo;n++)
      {
      
      if((input.codePointAt(n)<48) || (input.codePointAt(n)>57)) //identifica si es un numero, falso para otro caracter
      {
       esNumero=false;	
      }
      }
      
      if(esNumero==true)
      {
       numero=Integer.parseInt(input);		
      
     
      if((numero%2 !=0)&&( numero>0)&&(esNumero==true))
      {
       for(int a=1;a<=numero;a++)
       {
          if(numero%a==0)
          {
          contador++;	
          }       
       }
      } 
      }
      
      if(contador==2) //primo debe dar exactamente 2
      {
      texto="PRIMO";	
      }
      
      if(esNumero==false)
      {
      texto="no es un numero";		
      }
      
	return texto; 
    } 

    
    
    
    
}
