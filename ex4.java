import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Introduceti valoarea lui n:");
        int n = in.nextInt();

        int i, p = 1;

        for (i = 1; i <= n; i++)
                p = p * i;

        System.out.print("Factorialul este: ");
        System.out.print(p);
    }
}