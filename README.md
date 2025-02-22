import java.util.*;
public class PracQuestions{
    public static void comparator(double x, double y){
        if(x==y)System.out.println("Both Numbers are Equal");
        else if(x>y) System.out.println(x + " is greater than " + y);
        else System.out.println(x + " is smaller than " + y);
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers you want to compare: ");
        double a = scan.nextDouble(), b = scan.nextDouble();
        comparator(a, b);
    }
}
