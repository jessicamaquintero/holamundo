package jessica.holam;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'diverseDeputation' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER m
     *  2. INTEGER w
     */

    public static int diverseDeputation(int m, int w) {
    //to select a diverse deputation of 3 people
    int retorno=0;
    
    if((m+w)>=3)
    {
      int numerow1=0;
      int numerow2=0;
      int numerom=0;
      int contar=0;

        if((w<=1)&&(m<=1))
        {
        retorno= 0;
        }
      
       if(((w==1)&&(m==2))||((w==2)&&(m==1)))
        {
        retorno= 1;
        }
      if((w==2)&&(m==2))
        {
        retorno= 4;
        }

        //debo realizar posibles combinaciones
        if((w>=3)&&(m>=3))
        {
    
        for(int wom=1;wom<=w;wom++)
        {
          numerow1=wom;
          numerow2=wom+1;   
            for(int men=1;men<=w;men++)
            {
            contar++;     
            if((numerow1<wom)&&(numerow2<wom))
            {
            contar++;    
            } 
            if(numerow1==wom)
            {
            contar++;    
            } 
           }
        }
        retorno=contar;
        }

       

     }
     return retorno;
    }
}

public class examen1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        int w = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.diverseDeputation(m, w);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

