package Calculator.service.impl;

import Calculator.service.ICalculator;

/**
 * Created by ll on 2017/5/15.
 */
public class Minus extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int arrayInt[]=split(exp,"-");
        return arrayInt[0]-arrayInt[1];
    }
}
