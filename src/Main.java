import java.util.Scanner;

public class Main {
	static boolean LaChan(int n) {
		if (n % 2 == 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
//	LaChan(2);
		Scanner scan = new Scanner(System.in);
//		System.out.println("Nhap a: ");
//		int a = scan.nextInt();
//		System.out.println("Nhap b: ");
//		int b = scan.nextInt();
//		System.out.println("Nhap c: ");
//		int c = scan.nextInt();
//		System.out.println("Nhap n: ");
//		int n = scan.nextInt();
		// b1
//		b1.PTB2(a, b, c);

		// b2
//		long rs = b1.GT(n);
//		System.out.printf("%d!=%d",n,rs);

		// b3
//		System.out.println("So Fibonacci thu " + n + " la: " + b1.Fibo(n));
//		System.out.println("So Fibonacci thu " + n + " la: " + b1.DQFibo(n));

		// b4
//		System.out.println("UCLN cua " + a + " va " + b + " la: " + b1.UCLN(a, b));
//	    System.out.println("BCNN cua " + a + " va " + b + " la: " + b1.BCNN(a, b));

		// b5
//		System.out.println("Cac so nguyen to nho hon " + n + " la: ");
//		for (int i = 2; i < n; i++) {
//			if (b1.LKSNT(i)) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}

		// b6
//		System.out.println(n + " so nguyen to dau tien la: ");
//		int count = 0;
//		int j = 2;
//		while (count < n) {
//			if (b1.LKSNT(j)) {
//				System.out.print(j + " ");
//				count++;
//			}
//			j++;
//		}
//		System.out.println();

//		//b7
//	    int sum = b1.tinhTongSN(n);
//	    System.out.println("Tong cac chu so cua " + n + " la: " + sum);

//		// b8
//		System.out.println(b1.tinhTongSN(n));

		// b10
//		int f0 = 0, f1 = 1, f2 = 1;
//		while (f2 < n) {
//			if (b1.LKFibonacci(f2)) {
//				System.out.println(f2 + " la so nguyen to trong day Fibonacci");
//			}
//			f0 = f1;
//			f1 = f2;
//			f2 = f0 + f1;
//		}
//		
//		b1.LietKeSNT_NhoHon(n);
//		System.out.println();
//		b1.LietKeNSNT(n);
		
		float mang[] = {1,3,5,7,9};
//		float mang2[] = new float[n];
//		float[] nhap = b1.NhapMang();
//		mang2[0] = 10;
//		mang2[1] = 20;
//		mang[2] = 30;
//		float s = b1.Tong(mang);
//		float s2 = b1.Tong(mang2);
//		System.out.println("Tong mang la: " + s);
//		System.out.println("Tong mang la: " + s2);
		
		float[] mma = b1.MinMaxAve(b1.NhapMang());
		System.out.printf("Min = %f, Max = %f Ave = %f",mma[0],mma[1],mma[2]);
	}
}
