package Java.calculator;

public class Substraction {

    public Integer sub(Integer a, Integer b) {
        return a-b;
    };


    public String sub(String a, String b) {

        int foo = Integer.parseInt(a, 2) - Integer.parseInt(b, 2) ;

        return Integer.toBinaryString( foo );

    }

}
