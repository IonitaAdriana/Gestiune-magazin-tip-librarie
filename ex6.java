 
import java.util.Scanner;

public class ex6 {
    
    static int Fibo(int nr){
        int x = 0, y = 1;
        int z = 0;
        
        if (nr == 0)
            return x;

        for (int i = 2; i <= nr; i++){
            z = x + y;
            x = y;
            y = z;
        }
        return z;
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Introduceti pozitia numarului: ");
        int nr = in.nextInt();

        System.out.print("Numarul de pe pozitia nr este: ");
        System.out.print(Fibo(nr));
    }
}
       
    