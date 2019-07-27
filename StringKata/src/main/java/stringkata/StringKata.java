package stringkata;

public class StringKata {
	public int calculateSum(String numericString) {
		int sum = 0;
		if(numericString == null || numericString.isEmpty()) {
			return 0;
		}
		String[] numericStringArray = numericString.split(",");
		for(String str: numericStringArray) {
			sum+=Integer.parseInt(str);
		}
		return sum;
	}
}
