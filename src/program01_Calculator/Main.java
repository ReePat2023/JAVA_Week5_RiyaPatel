package program01_Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Please Input First Number : ");
            int a = scanner.nextInt();
            System.out.println("Please Input Second Number : ");
            int b = scanner.nextInt();
            System.out.println("Please Input the Symbol +, -, *, / : ");
            char symbol = scanner.next().charAt(0);
            Calculator calculator = new Calculator();
            calculator.calculateResult(a,b,symbol);
            System.out.println("Would You like to do more calculation Please Enter 'Y' for Yes and 'N' for No : ");
            answer = scanner.next().toLowerCase();
        }
        while (answer.startsWith("y"));
        scanner.close();
    }
}
