package test;

import Calculator.service.ICalculator;
import Calculator.service.impl.Minus;
import Calculator.service.impl.Multiply;
import Calculator.service.impl.Plus;

/**
 * Created by ll on 2017/5/15.
 */
public class StrategyTest {
    public static void main(String[] args) {
        String exp="2+8";
        ICalculator cal=new Plus();
        int result=cal.calculate(exp);
        System.out.println("result = " + result);

        exp="9-3";
        cal=new Minus();
        result=cal.calculate(exp);
        System.out.println("result = " + result);

        exp="3*9";
        cal=new Multiply();
        result=cal.calculate(exp);
        System.out.println("result = " + result);
    }
}
