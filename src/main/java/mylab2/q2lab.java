package mylab2;

public class q2lab {
	
	public int reverse(int a) {
		int c=0;
		while(a!=0) {
			c=c*10+a%10;
			a=a/10;
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q2lab ob=new q2lab();
		System.out.print(ob.reverse(256));

	}

}
