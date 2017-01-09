/**
 *  ºı∑®¿‡
 */

public class Div extends AbstractCalculator implements ICalculator {
    
    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"/");
        if(arrayInt[1] != 0){
            return arrayInt[0]/arrayInt[1];
        }else{
            return 0;
        }
    }
}
