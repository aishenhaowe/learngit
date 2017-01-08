/**
 *  统一接口
 */
public interface ICalculator {
    public int calculate(String exp);
}

/**
 *  辅助类
 */

public abstract class AbstractCalculator {
    
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

public class Plus extends AbstractCalculator implements ICalculator {
    
    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\+");
        return arrayInt[0]+arrayInt[1];
    }
}

/**
 *  减法类
 */

public class Minus extends AbstractCalculator implements ICalculator {
    
    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"-");
        return arrayInt[0]-arrayInt[1];
    }
}

/**
 *  乘法类
 */

public class Multiply extends AbstractCalculator implements ICalculator {
    
    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\*");
        return arrayInt[0]*arrayInt[1];
    }
}

/**
 *  测试主程序
 */

public class StrategyTest {
    
    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
        
    }
}





