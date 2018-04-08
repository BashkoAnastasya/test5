import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);

    public static  void main (String[] args)
    {
        double num1 = getdouble();
        double num2 = getdouble();
        char operation = getOperation();
        Calc culc= new Calc();
        double result = culc.calculator(num1,num2,operation);
        System.out.println("Результат операции: "+result);

    }
    public static double getdouble(){
        System.out.println("Введите число:");
        double num;
        if(scanner.hasNextDouble()){
            num = scanner.nextDouble();
        } else {
            System.out.println("Ошибка. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getdouble();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ошибка. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }






}
