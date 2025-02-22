import java.util.*;
public class Exponen{
    public static void exponen(int a, int b){
        if(b==0)System.out.println("x^n = " + "1");
        else if(b==1)System.out.println("x^n = " + a);
        else {
            int result=1;
            for(int i=1; i<=b; i++){
                result*=a;
            }
            System.out.println("x^n = " + result);
        }
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base (x): ");
        int x = scan.nextInt();
        while(x==0){
            System.out.println("Base can't be Zero!!!");
            System.out.print("Enter the base (x) again: ");
            x=scan.nextInt();
        }
        System.out.print("Enter the exponent (n): ");
        int n = scan.nextInt();
        exponen(x, n);

    }
}