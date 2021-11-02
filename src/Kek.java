import java.util.Scanner;

public class Kek {
    

    
    public static int calculator() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Operator");
        String op = sc.nextLine();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        sc.nextLine();
        
        switch(op){
            case "+":
            return a+b;
            case "-":
            return a-b;
            case "*":
            return a*b;
            case "/": 
            return a/b;
            default:
            System.out.println("Incorrect Operator!");
            return -1;
        }
        
    }
    public static void print(String j) {
        System.out.println(j);
    }
}
