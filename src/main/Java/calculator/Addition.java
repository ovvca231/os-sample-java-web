package Java.calculator;

public class Addition {

    public Integer add(Integer a, Integer b) {
        return a+b;
    };

    public String add(String a, String b) {

    	int foo = Integer.parseInt(a, 2) + Integer.parseInt(b, 2) ;

        return Integer.toBinaryString( foo );

    }
    
    
}
