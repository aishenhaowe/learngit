
/**
 *  ���Թ�����
 */
class CalculatorContext{
    private ICalculator innercalculate = null;
    
    public CalculatorContext(ICalculator outcalculate){
        innercalculate = outcalculate;
    }
    
    public int calculate(String exp){
        return innercalculate.calculate(exp);
     }
}

/**
 *  ����������
 */

public class StrategyTest {
    
    public static void main(String[] args) {
        CalculatorContext context;
        
        String exp = "2+8";
        ICalculator cal = new Plus();
        context = new CalculatorContext(cal);
        int result = context.calculate(exp);
        System.out.println(result);
        
    }
}






