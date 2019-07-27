package stringkata;

public class StringKata {
	public int calculateSum(String numericString) {
		int sum = 0;
		if(numericString == null || numericString.isEmpty()) {
			return 0;
		}
		
		numericString = numericString.replace("//", "");
		String[] numericStringArray = numericString.split(",|\n|;");
		
		for(String str: numericStringArray) {
			if(!str.isEmpty()) {
				sum+=Integer.parseInt(str);
			}
		}
		
		return sum;
	}
}
