package escuelaing.edu.co.arep;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CalculatorService implements RestService{

    public Double calculate(Method operation, Double number1, Double number2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        Double result = (Double) operation.invoke(Math.class, number1, number2);
        return result;
    }

    @Override
    public String response() {
        return "";
    }

}