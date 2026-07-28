import java.util.Scanner;

import static java.lang.Integer.sum;

public class student_grade {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("-----student grade calculator-----");
        System.out.print("enter your name:");
        String name = input.nextLine();
        System.out.print("enter the five subject marks: ");
        System.out.print("enter the first subject mark: ");
        int m1 = input.nextInt();
        System.out.print("enter the second subject mark: ");
        int m2 = input.nextInt();
        System.out.print("enter the third subject mark: ");
        int m3 = input.nextInt();
        System.out.print("enter the fourth subject mark: ");
        int m4 = input.nextInt();
        System.out.print("enter the fifth subject mark: ");
        int m5= input.nextInt();
        int total = m1 + m2 + m3 + m4 + m5;
        float percentage = (total / 5.0f);
        System.out.print("grade: " + percentage);
        if (m1 > 35 && m2 > 35 &&  m3 > 35 &&  m4 > 35 &&  m5 > 35) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("result: FAIL");
        }
        if (percentage >= 90 ) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70 ) {
            System.out.println("Grade: B");
        } else if (percentage >= 60 ) {
            System.out.println("Grade: C");
        } else if (percentage >= 50 ) {
            System.out.println("Grade: D");
        } else if (percentage >= 35 ) {
            System.out.println("Grade: F");
        }

    }
}
