package Coding;

public class toStringOverride {
	private double re, im;

	public toStringOverride(double re, double im) {
		this.re = re;
		this.im = im;
	}
	
	@Override
    public String toString() { 
        return String.format(re +" "+ im); 
    } 

	// Driver class to test the Complex class
	public static void main(String[] args) {
		toStringOverride c1 = new toStringOverride(10, 15);
		System.out.println(c1);
	}
}
