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
	
	public static int UCLN(int a, int b) {
	    while (b != 0) {
	      int r = a % b;
	      a = b;
	      b = r;
	    }
	    return a;
	  }

	  public static int BCNN(int a, int b) {
	    return a * b / UCLN(a, b);
	  }
	  
	  public static boolean LKSNT(int n) {
		    if (n <= 1) {
		      return false;
		    }
		    for (int i = 2; i < n; i++) {
		      if (n % i == 0) {
		        return false;
		      }
		    }
		    return true;
		  }
	  
	  public static int tinhTongSN(int n) {
		    int sum = 0;
		    while (n > 0) {
		      int digit = n % 10;
		      sum += digit;
		      n /= 10;
		    }
		    return sum;
	  }
	 
	  public static boolean LKFibonacci(int n) {
		    if (n <= 1) {
		      return false;
		    }
		    for (int i = 2; i < n; i++) {
		      if (n % i == 0) {
		        return false;
		      }
		    }
		    return true;
		  }
	  public static long Fibo2(int n) {
		  long[] F = new long [n+1];
		  F[0] = 0;F[1] = 1;
		  for(int i = 2;i<=n;i++) {
			  F[i] = F[i-1] + F[i-2];
		  }
		  return F[n];  
	  }
	  
	  public static long UCLN(long a,long b) {
		  while(a!=b) {
			  if(a>b)
				  a = a - b;
			  else
				  b = b - a;
		  }
		  return a;
	  }
	  
	  public static long DQ_UCLN(long a, long b) {
		  if(a == b) return a;
		  if(a>b) return DQ_UCLN(a-b,b);
		  return DQ_UCLN(a,b-a);
	  }
	  
	  public static long BCNN(long a,long b) {
		  return a*b/UCLN(a, b);
	  }
	  public static boolean LaSNT(long n) {
		  if(n<2) return false;
		  for(long i = 2;i<n;i++)
			  if(n%i==0)
				  return false;
		  return true;
	  }
	  public static void LietKeSNT_NhoHon(long n) {
		  for(long i = 2;i<n;i++) {
			  if(LaSNT(n))
				  System.out.println(i + " ");
		  }
	  }
	  public static void LietKeNSNT(long n) {
		  long dem = 0;
		  long i=2;
		  while(dem!=n) {
			  if(LaSNT(i)) {
				  System.out.println(i+ " ");
				  dem++;
			  }
			  i++;
		  }
	  }
	  
	  public static void LietKeSNT5ChuSo() {
		  
	  }
}