package stringkata;

public class StringKata {
	public int calculateSum(String numericString){
		int sum = 0;
		if(numericString == null || numericString.isEmpty()) {
			return 0;
		}
		
		numericString = numericString.replace("//", "");
		String[] numericStringArray = numericString.split(",|\n|;");
		
		for(String strNumber: numericStringArray) {
			if(!strNumber.isEmpty()) {
				int number = Integer.parseInt(strNumber);
				if(number>=0) {
					sum+=Integer.parseInt(strNumber);
					continue;
				}
				throw new NegativeNotAllowedExpection("Negatives not allowed : "+number);
			}
		}
		
		return sum;
	}
}
