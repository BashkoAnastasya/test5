public class Calc {
    public  double calculator(double x, double y,char operation)
    {
        double result;
        switch (operation){
            case '+':
                result =getSum(x,y);
                break;
            case '-':
                result = getMinus(x,y);
                break;
            case '*':
                result = getUmn(x,y);
                break;
            case '/':
                if (y==0)
                {throw new IllegalArgumentException("Число нельзя делить на ноль");}
                result = getDil(x,y);
                break;
            default:
                System.out.println("Операция не распознана.");
                result=calculator(x,  y, operation);
        }
        return result;
}

public  double getSum (double x , double y){
        double result;
        result=x+y;
        return  result;

        }
public  double getMinus(double x, double y){
    double result;
    result=x-y;
    return  result;
}
    public  double getUmn(double x, double y){
        double result;
        result=x*y;
        return  result;
    }
    public  double getDil(double x, double y){
        double result;
        if (y==0)
        {throw new IllegalArgumentException("Число нельзя делить на ноль");}
        result = x/y;
        return  result;
    }

}
