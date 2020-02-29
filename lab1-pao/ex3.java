import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Introduceti valoarea lui n:");
        int n = in.nextInt();

        int i, suma = 0;

        for (i = 3; i <= n; i++)
            if(i % 3 == 0 || i %5 == 0)
                suma = suma + i;

        System.out.print("Suma este: ");
        System.out.print(suma);
    }
}