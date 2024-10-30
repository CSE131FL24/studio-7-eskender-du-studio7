package studio7;

public class Die {
	private int sides;
	private int random;
	
	
	public Die() {
	}
	public Die(int sides, int random) {
		this.sides = sides;
		this.random = random;
	}
	
	
	public int getSides() {
		return sides;
	}
	public void setSides(int sides) {
		this.sides = sides;
	}
	public int getRandom() {
		return random;
	}
	public void setRandom(int random) {
		this.random = random;
	}
	
	public int roll(int n) {
		return random =(int)(Math.random()*(n+1)+1);
	}
	
	public static void main(String[] args) {
		Die d1 = new Die();
		System.out.println(d1.roll(6));
		}


}
