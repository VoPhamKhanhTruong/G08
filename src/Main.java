import java.util.Scanner;

public class Main {
	static boolean LaChan(int n) {
		if(n%2==0) return true;
	return false;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap a: ");
		int a = scan.nextInt();
		System.out.println("Nhap b: ");
		int b = scan.nextInt();
		System.out.println("Nhap c: ");
		int c = scan.nextInt();
		System.out.println("Nhap n: ");
		int n = scan.nextInt();
//		b1.PTB2(a, b, c);
//		long rs = b1.GT(n);
//		System.out.printf("%d!=%d",n,rs);
		System.out.println("So Fibonacci thu " + n + " la: " + b1.Fibo(n));
		System.out.println("So Fibonacci thu " + n + " la: " + b1.DQFibo(n));
		
		LaChan(2);
	}
}
