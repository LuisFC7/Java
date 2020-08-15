
public class Operation {
    int num1, num2, result;
 	double result1;   
    //methods
    public void Operation1(int num1, int num2){
        result = num1 + num2;
        System.out.println("The result is : "+result);
    }

    public void Operation2(int num1, int num2){
	    result = num1-num2;
	    System.out.println("The result is: "+result);
    }

    public void Operation3(int num1, int num2){
	    result = num1 * num2;
	    System.out.println("The result is: "+result);
    }
    
    public void Operation4(int num1, int num2){
	result1=(double)num1 /(double)num2;
	    System.out.println("The result is: "+result1);
    }
}

