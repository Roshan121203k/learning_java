
public class Complex {
	private int real;
	private int imag;
	
	
	public Complex() {
		System.out.println("default constructor");
		real = 0;
		imag  = 0;
	}
	
	public Complex(int real, int imag) {
		System.out.println("Parameterized constructor");
		this.real = real;
		this.imag = imag;
	}
	
	
	public int getReal() {
		return real;
	}
	
	public void setReal(int real) {
		this.real = real;
	}
	
	public int getImag() {
		return imag;
	}
	
	public void setImag(int imag) {
		this.imag = imag;
	}
	@Override
	public String toString() {
		return "real number is " + real + "and the imag number is " + imag;
	}
}
