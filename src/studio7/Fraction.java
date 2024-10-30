package studio7;

public class Fraction {
	private int num;
	private int den;
	
	
	public Fraction() {
	}
	public Fraction(int num, int den) {
		this.num = num;
		this.den = den;
	}
	

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getDen() {
		return den;
	}
	public void setDen(int den) {
		this.den = den;
	}
	
	
	public Fraction add(Fraction other) {
		int newnum = this.num*other.den + other.num*this.den;
		int newden = this.den*other.den;
		Fraction add = new Fraction(newnum,newden);
		add.simplify();
		return add;
		
	}
	
	
	public Fraction mutiply(Fraction other) {
		int newnum =this.num*other.num;
		int newden = this.den*other.den;
		Fraction mul = new Fraction(newnum,newden);
		mul.simplify();
		return mul;
	}
	
	public Fraction reciprocal() {
		int newnum =den;
		int newden =num;
		return new Fraction(newnum,newden);
	}
	
	public String toString() {
		return this.num + "/" + this.den; 
	}
	
	private void simplify() {
        int gcd = gcd(num, den);
        num /= gcd;
        den /= gcd;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(2,5);
		Fraction f2 = new Fraction(3,4);
		
		
		System.out.println(f1.add(f2));
		System.out.println(f1.mutiply(f2));
		System.out.println(f1.reciprocal());

	}

}
