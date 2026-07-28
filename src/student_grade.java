import java.util.Scanner;

import static java.lang.Integer.sum;

public class student_grade {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------student grade calculator--------");
        System.out.print("Name      : ");
        String name = input.nextLine();
        System.out.print("USN       : ");
        char USN = input.next().trim().charAt(0);
        System.out.print("Subject 1 : ");
        int m1 = input.nextInt();
        System.out.print("Subject 2 : ");
        int m2 = input.nextInt();
        System.out.print("Subject 3 : ");
        int m3 = input.nextInt();
        System.out.print("Subject 4 : ");
        int m4 = input.nextInt();
        System.out.print("Subject 5 : ");
        int m5= input.nextInt();
        int total = m1 + m2 + m3 + m4 + m5;
        System.out.print("Total     : " + total);
        float percentage = (total / 5.0f);
        System.out.print("\nPercentage: " + percentage + "%");
        if (m1 > 35 && m2 > 35 &&  m3 > 35 &&  m4 > 35 &&  m5 > 35) {
            System.out.println("\nResult    : PASS");
        } else {
            System.out.println("\nresult    : FAIL");
        }
        if (percentage >= 90 ) {
            System.out.println("Grade     : A+");
        } else if (percentage >= 80) {
            System.out.println("Grade     : A");
        } else if (percentage >= 70 ) {
            System.out.println("Grade     : B");
        } else if (percentage >= 60 ) {
            System.out.println("Grade     : C");
        } else if (percentage >= 50 ) {
            System.out.println("Grade     : D");
        } else if (percentage >= 35 ) {
            System.out.println("Grade     : F");
        }

    }
}
