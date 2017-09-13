package calculator;



public class Binaries {


	
	
    private String left;
    private String right;
    
    
    public String getLeft() {
    	return left;
    }
    public String getRight() {
        return right;
    }


    public void setLeft( Integer a ) {
    	if( a.toString().matches( "[01]+" ) ) {
    		this.left = a.toString();
    	} else {
    		this.left = Integer.toBinaryString( a );
    	}
    }
    
    public void setRight( Integer b ) {
    	if( b.toString().matches( "[01]+" ) ) {
    		this.right = b.toString();
    	} else {
    		this.right = Integer.toBinaryString( b );
    	}
    }




}
