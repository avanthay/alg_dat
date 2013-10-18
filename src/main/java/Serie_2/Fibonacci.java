package Serie_2;


public class Fibonacci {

	public static void main(String[] args) {
		Fibonacci fibo = new Fibonacci();
		System.out.println(fibo.calculate(4000000));
		System.out.println(fibo.summ2Fibo(4000000));
	}

	public long calculate(int zahl) {
		long x = 0;
		long y = 1;
		long z = 0;
		for(int i = 2; i <= zahl;i++) {
			z = x + y;
			x = y;
			y = z;
		}
		return z;
	}
	
	public long summ2Fibo(int limit){
		int i = 0;
		long res = 0;
		long result = 0;
		while(res < limit){
			res = calculate(i);
			i++;
			if (res%2 == 0){
				result += res;
			}
		}
		return result;
	}
}
