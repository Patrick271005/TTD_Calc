public class Calculator
{
    public int add(int firstNum, int secondNum)
    {
        long result =(long)firstNum+secondNum;
        if(result > Integer.MAX_VALUE)
        {
            throw new IllegalArgumentException("Input is too large");
        }
        return (int)result;
    }
    public int sub(int firstNum, int secondNum)
    {
        long result =(long)firstNum-secondNum;
        if(result <0)
        {
            throw new IllegalStateException("Input cannot be negative");
        }
        return (int)result;
    }


    public int div(int firstNum, int secondNum)
    {

        if(secondNum ==0)
        {
            throw new ArithmeticException("Input cannot divide by zero");
        }
        long result =(long)firstNum/secondNum;
        return (int)result;
    }


}
