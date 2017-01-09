
/**
 *  统一接口
 */
interface ICalculator {
    public int calculate(String exp);
}

/**
 *  辅助类
 */

abstract class AbstractCalculator {

    public int[] split(String exp,String opt){
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}

/**
 *  加法类
 */

class Plus extends com.meicai.lihaoran.lottery.view.AbstractCalculator implements com.meicai.lihaoran.lottery.view.ICalculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\+");
        return arrayInt[0]+arrayInt[1];
    }
}

/**
 *  减法类
 */

class Minus extends com.meicai.lihaoran.lottery.view.AbstractCalculator implements com.meicai.lihaoran.lottery.view.ICalculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"-");
        return arrayInt[0]-arrayInt[1];
    }
}

/**
 *  乘法类
 */

class Multiply extends com.meicai.lihaoran.lottery.view.AbstractCalculator implements com.meicai.lihaoran.lottery.view.ICalculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\*");
        return arrayInt[0]*arrayInt[1];
    }
}

/**
 *  策略管理类
 */
class CalculatorContext{
    private com.meicai.lihaoran.lottery.view.ICalculator innercalculate = null;

    public CalculatorContext(com.meicai.lihaoran.lottery.view.ICalculator cal)
    {
        innercalculate = cal;
    }


    public int calculate(String exp)
    {
        return innercalculate.calculate(exp);
    }
}

/**
 *  测试主程序
 */

class StrategyTest {

    public static void main(String[] args) {
        com.meicai.lihaoran.lottery.view.CalculatorContext context;

        String exp = "2+8";
        com.meicai.lihaoran.lottery.view.ICalculator cal = new com.meicai.lihaoran.lottery.view.Plus();
        context = new com.meicai.lihaoran.lottery.view.CalculatorContext(cal);
        int result = context.calculate(exp);
        System.out.println(result);

    }
}






