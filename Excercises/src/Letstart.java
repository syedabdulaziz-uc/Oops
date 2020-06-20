
class Calculation{
	int z;
	public void add(int x, int y) {
		z=x+y;
		System.out.println("The sum is here" +z);
	}
	public void sub(int x, int y) {
		z=x-y;
		System.out.println("The difference is here"+z);
	}
}
public class Letstart extends Calculation {
	public void mul(int x,int y) {
		z=x*y;
		System.out.println("The multiplication is"+z);
	}
	public static void main(String[] args) {
		int x=10,y=20;
		Letstart see=new Letstart();
		see.add(x,y);
		see.sub(x, y);
		see.mul(x, y);
		
		
	}
}
