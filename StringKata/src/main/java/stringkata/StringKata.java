package stringkata;

public class StringKata {
	public int calculateSum(String numericString) {
		if(numericString == null || numericString.isEmpty()) {
			return 0;
		}
		return Integer.parseInt(numericString);
	}
}
