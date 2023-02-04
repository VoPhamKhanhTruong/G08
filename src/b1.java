public class b1 {
	public static void PTB2(float a, float b, float c) {
		double delta = Math.pow(b, 2) - 4*a*c;
		if(delta < 0)
			System.out.println("PT vo nghiem");
		else if(delta ==0) {
			System.out.println("PT co nghiem kep la: " + (-b/2*a));
		}
		else {
			double x1 = (-b-Math.sqrt(delta)/2*a);
			double x2 = (-b-Math.sqrt(delta)/2*a);
			String s = String.format("PT co 2 nghiem, x1 = %f, x2 = %f",x1,x2);
			System.out.println(s);
		}
	}
	
	public static long GT(int n) {
		long s = 1;
		for(int i=1;i<=n;i++) {
			s*=i;
		}
		return s;
	}
	
	public static long DQGT(int n) {
		if(n==0) return 1;
		return n * DQGT(n-1);
	}
	
	public static long Fibo(int n) {
		    if (n <= 1) {
		      return n;
		    }
		    long f0 = 0, f1 = 1, fn = 0;
		    for (int i = 2; i <= n; i++) {
		      fn = f0 + f1;
		      f0 = f1;
		      f1 = fn;
		    }
		    return fn;
	}
	
	public static long DQFibo(int n) {
		if (n <= 1) return n;
	    else return DQFibo(n-1) + DQFibo(n-2);
	}
}
