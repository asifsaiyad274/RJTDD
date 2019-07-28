package stringkata;

public class StringKata {
	public int calculateSum(String numericString){
		int sum = 0;
		if(numericString == null || numericString.isEmpty()) {
			return 0;
		}
		
		numericString = numericString.replace("//", "");
		String[] numericStringArray = numericString.split(",|\n|;");
		StringBuilder negativeValueMessage = new StringBuilder("Negatives not allowed : "); 
		
		for(String strNumber: numericStringArray) {
			if(!strNumber.isEmpty()) {
				int number = Integer.parseInt(strNumber);
				if(number>=0 && number<=1000) {
					sum+=Integer.parseInt(strNumber);
				}else if(number<0) {
					negativeValueMessage.append(number).append(" ");
				}
			}
		}
		
		if(negativeValueMessage.indexOf("-") > 0) {
			throw new NegativeNotAllowedExpection(negativeValueMessage.toString().trim());
		}
		
		return sum;
	}
}
