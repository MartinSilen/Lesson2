import java.util.Scanner;

public class Kek {

    public static double calculator() throws Exception {
        Scanner sc = new Scanner(System.in);
        
       while(true){ System.out.println("Enter first number");
        double a = sc.nextDouble();
        sc.nextLine();
        String op;
        while(true){System.out.println("Enter Operator");
        String com = sc.nextLine();
        if (!com.equals("+") && !com.equals("-") && !com.equals("*") && !com.equals("/")){
            System.out.println("Incorrect Operator!");
            continue;
        } else op = com;
        break;
        }

        System.out.println("Enter second number");
        double b = sc.nextDouble();
        sc.nextLine();

        switch (op) {
        case "+":
            return a + b;
        case "-":
            return a - b;
        case "*":
            return a * b;
        case "/":
            return a / b;
        }
    }

    }

    public static void print(String j) {
        System.out.println(j);
    }
}
