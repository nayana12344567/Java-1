import java.util.Scanner;
public class SimpleCalculator{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the first number(num1):");
        double num1=scanner.nextDouble();
        System.out.print("enter the second number(num2):");
        double num2=scanner.nextDouble();
        double sum=num1+num2;
        double diff=num1-num2;
        double prod=num1*num2;
        double div1=num1/num2;
        long div2=(long)num1/(long)num2;
        double rem1=num1%num2;
        double exp1=Math.pow(num1,num2);
        System.out.println("sum="+ sum);
        System.out.println("difference="+ diff);
        System.out.println("product="+ prod);
        System.out.println("decimal division="+ div1);
        System.out.println("quotient="+ div2);
        System.out.println("remainder="+ rem1);
        System.out.println("exponentiation="+ exp1);
        scanner.close();
        
    }
    
}