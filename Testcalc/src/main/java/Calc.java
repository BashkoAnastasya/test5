public class Calc {
    public double calculator(double x, double y, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = getSum(x, y);
                break;
            case '-':
                result = getMinus(x, y);
                break;
            case '*':
                result = getMultiplication(x, y);
                break;
            case '/':
                if (y == 0) {
                    throw new IllegalArgumentException("Число нельзя делить на ноль");
                }
                result = getDivision(x, y);
                break;
            default:
                throw new IllegalArgumentException("Операция не распознана");
        }
        return result;
    }

    public double getSum(double x, double y) {
        return x + y;
    }

    public double getMinus(double x, double y) {
        return x - y;
    }

    public double getMultiplication(double x, double y) {
        return x * y;
    }

    public double getDivision(double x, double y) {
        return x / y;
    }

}
