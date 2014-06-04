
public class getDigitOfNumber {
	public int countDigits(int num){
		if (num < 10){
			return 1;
		}
		else{
			return 1 + countDigits(num / 10);
		}
	}

}
