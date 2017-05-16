package test;

import calculate.AbstractCalculator;
import calculate.Plus;

/**
 * Created by ll on 2017/5/15.
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
        String exp="2+9";
        AbstractCalculator cal=new Plus();
        int result=cal.calculate(exp,"\\+");
        System.out.println("result = " + result);
    }
}
