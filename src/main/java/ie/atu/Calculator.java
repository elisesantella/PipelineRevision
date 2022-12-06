package ie.atu;

public class Calculator {
    private int t;

    public Calculator(){
        t = 0;
    }

    public int add(int one, int two){
        t = one + two;
        return t;
    }

    public int subtract(int one, int two)
    {
        t = one - two;
        return t;
    }

    public int multiply(int one, int two){
        t = one * two;
        return t;
    }

}