package stringkata;

public class NegativeNotAllowedExpection extends RuntimeException {

	private static final long serialVersionUID = 6385342627309597046L;
	
	public NegativeNotAllowedExpection(String string) {
		super(string);
	}
}
