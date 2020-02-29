import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter first Integer:");
        int x = in.nextInt();

        System.out.println("Enter second Integer:");
        int y = in.nextInt();

        if(x == y){
            System.out.print(x);
            System.out.print(" = ");
            System.out.println(y);
            
            System.out.print(x);
            System.out.print(" >= ");
            System.out.println(y);
            
            System.out.print(x);
            System.out.print(" <= ");
            System.out.println(y);
        }
       

        if(x < y){
                        
            System.out.print(x);
            System.out.print(" != ");
            System.out.println(y);
            
            System.out.print(x);
            System.out.print(" < ");
            System.out.println(y);
            
            System.out.print(x);
            System.out.print(" <= ");
            System.out.println(y);
        }
        else {
            
            System.out.print(x);
            System.out.print(" != ");
            System.out.println(y);
            
            System.out.print(x);
            System.out.print(" > ");
            System.out.println(y);
            
            System.out.print(x);
            System.out.print(" >= ");
            System.out.println(y);
        }

        
    }
}