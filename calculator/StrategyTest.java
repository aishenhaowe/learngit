
/**
 *  策略管理类
 */
class CalculatorContext{
    private ICalculator innercalculate = null;
    
    public CalculatorContext(ICalculator outcalculate){
        innercalculate = outcalculate;
    }
    
    public int calculate(String exp){
    	if (null == exp)
    		return -1;
    	
        return innercalculate.calculate(exp);
     }
}

/**
 *  测试主程序
 */

public class StrategyTest {
    
    public static void main(String[] args) {
    	// Invalid check
    	if (args.length < 2)
    	{
    		System.out.println("Invalid input params");
    		return;
    	}
    	
        CalculatorContext context;
        
        String exp = args[1];
        ICalculator cal = new Div();
        context = new CalculatorContext(cal);
        int result = context.calculate(exp);
        System.out.println(result);
        
    }
}






