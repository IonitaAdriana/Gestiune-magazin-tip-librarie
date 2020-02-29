import java.util.Scanner;

public class ex5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Introduceti numarul: ");
        int n = in.nextInt();
        int OK = 0;

        for (int i = 2; i < n/2; i++)
            if(n % i == 0){
                OK = 1;
                break;
            }

        if (OK == 0)
            System.out.print("Numarul este prim");
        else
            System.out.print("Numarul nu este prim");
    }
}
