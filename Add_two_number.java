import java.util.Scanner;

public class Add_two_number {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter any two number :");
        Scanner sc= new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        c= a+b;
        System.out.println("Add two Number :"+c);
    }
}
