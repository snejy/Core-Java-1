
import java.util.Arrays;

public class Problems2Impl implements Problems2{

	@Override
	public boolean isOdd(int number) {
		return Math.abs(number) % 2 == 1;
	}

	@Override
	public boolean isPrime(int number) {
		for(int i = 2; i<= Math.sqrt(number); i++){
			if(number % i == 0){
				return false;
			}
		}
		return true;
	}

	@Override
	public int min(int... array) {
		Arrays.sort(array);
		return array[0];
	}

	@Override
	public int kthMin(int k, int[] array) {
		Arrays.sort(array);
		return array[k-1];
	}

	@Override
	public float getAverage(int[] array) {
		float sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum/array.length;
	}

	@Override
	public long getSmallestMultiple(int upperBound) {
		int smallest = 1;
		for (int i = 2; i <= upperBound; i++) {
			if( isPrime(i) ){
				smallest *= i;
			}
			if( smallest % i != 0 ){
				for(int j = 1; j<= i; j++){
					if( smallest % i == 0){
						break;
					}
					if( i % j == 0){
						smallest *= j;
					}
					
				}
			}
			
		}
		return smallest;
	}

	@Override
	public long getLargestPalindrome(long N) {
		for (long i = N; i >= 1; i--) {
			if (N < 10){
				return N;
			}
			String numberToString = String.valueOf(i);
			String reversed = new StringBuilder(numberToString).reverse().toString();
			if (numberToString.equals(reversed)){
				return Long.valueOf(numberToString).longValue();
			}
		}
		return 0;
	}

	@Override
	public int[] histogram(short[][] image) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long doubleFac(int n) {
		int fac = n;
		for (int j = 1; j<=2; j++) {
			int times = fac;
			for (int i = times-1; i > 0; i--) {
				fac *= i;
			}
		}
		return fac;
	}

	@Override
	public long kthFac(int k, int n) {
		long fac = n;
		for (int j = 1; j <= k; j++) {
			long times = fac;
			for (long i = times-1; i > 0; i--) {
				fac *= i;
			}
		}
		return fac;
	}

	@Override
	public int getOddOccurrence(int[] array) {
	     int result = 0;
	     for (int i=0; i < array.length; i++)    
	    	 result ^= array[i];
	     return result;
	}

	@Override
	public long pow(int a, int b) {
		long sum = 1;
		for (int i = 0; i < b; i++) {
			sum *= a;
		}
		return sum;
	}

	@Override
	public long maximalScalarSum(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		long result = 0;
		int len = (a.length <= b.length) ? a.length : b.length;
		for (int i = 0; i < len; i++) {
			result = result + a[i] * b[i];
		}
		return result;
	}

	@Override
	public int maxSpan(int[] array) {
		int left_at = 0;
		int right_at = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == array[array.length - 1]){
				right_at = array.length - i ;
				break;
			}
		}
		for(int i = array.length - 1; i>=0; i --){
			if(array[i] == array[0]){
				left_at = i + 1;
				break;
			}
		}
		return ( right_at > left_at ? right_at : left_at);
	}

	@Override
	public boolean canBalance(int[] array) {
		int sumleft = 0;
		int sumright = 0;
		boolean odd = array.length % 2 == 1;
		for (int i = 0; i < array.length / 2; i++) {
			sumleft += array[i];
		}
		for (int i = array.length-1; i >= array.length/2; i--) {
			sumright += array[i];
		}
		int less = (sumright > sumleft )? sumleft : sumright;
		int more = (sumright > sumleft )? sumright : sumleft ;
		if(odd){
			
			less += array[array.length/2 +1 ] ;
		}
		return less == more;
	}

	@Override
	public int[][] rescale(int[][] original, int newWidth, int newHeight) {
		// TODO Auto-generated method stub
		return null;
	}

}
