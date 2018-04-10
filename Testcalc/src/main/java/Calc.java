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
                result = getDel(x,y);
                break;
            default:
                throw new IllegalArgumentException("Операция не распознана");
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
    public  double getDel(double x, double y){
        double result;
        result = x/y;
        return  result;
    }

}
