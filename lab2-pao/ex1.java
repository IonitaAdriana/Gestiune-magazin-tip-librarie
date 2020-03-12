import java.util.Scanner;

    public class ex1 {
        public static void main(String[] args){
            int[] studentsGrade = new int[20];
            Scanner scaner = new Scanner(System.in);
            int sum = 0;
            int i = 0;
            for(i=0; i<studentsGrade.length; i++) {
                int value = scaner.nextInt();
                if (value == -1) {
                    break;
                } else {
                    studentsGrade[i] = value;
                    sum += value;
                }
            }
            System.out.println("The grades average is: " + sum/i);
        }

    }

