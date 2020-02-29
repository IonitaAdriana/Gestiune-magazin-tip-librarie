import java.util.Scanner;

public class ex7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Introduceti numarul: ");
        int n = in.nextInt();
        int fact_max = 2;

        while(n > 1)
    {
        
        while(n % fact_max == 0)
        {
            n = n/fact_max;
        }
        
        fact_max++;
        
        if(n>1 && fact_max * fact_max > n){
            fact_max = n; 
        }
    }
    
     fact_max--;
    
     System.out.print("Cel mai mare este: ");
     System.out.print(fact_max);
    
   }
}
