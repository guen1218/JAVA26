package homework;

public class Complex {
	double a;
	double b = 0.0;
	Complex(double a){
		this.a = a;
	}
	Complex(double a, double b){
		this.a = a;
		this.b = b;
	}
	void print() {
		System.out.printf("%.1f + %.1fi\n",a,b);
	}
}
