/**
 * INSTRUCTIONS.
 * 
 * Welcome to Problem Set 4, where we'll dive into writing our own methods with
 * parameters and return values. The focus, this time, will be on the built-in @String
 * and @Math classes.
 * 
 * You'll note that most of the methods have not been included. Instead, you'll see
 * specifications pertaining to their signatures (i.e., the method name, as well as
 * its return type and parameter list). You'll need to be sure to meet these
 * specifications exactly.
 * 
 * As always, please be mindful of your output (in this case, returned values rather
 * than printed text). Your solutions will be tested against a set of expected
 * values, and the grading script will expect an exact match.
 * 
 * This problem set contains 10 exercises worth 50 points. It is due no later than
 * 11:59pm on Sunday, November 4, 2018. Good luck! 
 */

public class ProblemSet4 {
	
	public static void main(String[] args) {
		ProblemSet4 ps = new ProblemSet4();
		System.out.println(ps.isNotEqual(null));
	}
	
	public String surroundMe(String out, String in) {
		if (out == null || in == null) {
			return null;
		} else if (out.length() != 4) {
			return null;
		} else if (in.length() != 3) {
			return null; 
		} else {
			return "" + out.charAt(0) + out.charAt(1) + in + out.charAt(2) + out.charAt(3);
		}
	}
	
	public String endsMeet(String str, int n) {
		if (str == null) {
			return null;
		}
		if (str.length() < 1 || str.length() > 10) {
			return null;
		}
		if (n < 1 || n > str.length()) {
			return null;
		}
		int length = str.length();
		if (n < length/2) {
			return "" + str.substring(0, n) + str.substring(length - n, length);
		}
		return null;
	}
	
	public String middleMan(String str) {
		if (str == null) {
			return null;
		} else if (str.length() % 2 == 0 || str.length() == 1) {
			return null;
		} else {
			return "" + str.substring(str.length()/2 - 1, str.length()/2 + 2);
		}
	}	
	
	public String doubleVision(String str) {
		String a = "";
		if (str == null) {
			return null;
		} else {
			for(int i = 0; i <= str.length()-1; i++) {
				a += "" + str.charAt(i) + str.charAt(i);
			}
			return a;
		}
	}
	
	public boolean centered(String str, String target) {
		if (str == null || target == null) {
			return false;
		} else if (target.length() != 3) {
			return false;
		} else if (str.length() >= 3) {
			if (str.length() % 2 == 0) {
				if (("" + str.substring(str.length()/2 - 2, str.length()/2) + 1).equals(target)) {
					return true;
				} else if (("" + str.substring(str.length()/2 - 1, str.length()/2 + 2)).equals(target)) {
					return true;
				}
			} else if (str.length() % 2 == 1) {
				if (("" + str.substring(str.length()/2 - 1, str.length()/2 + 2)).equals(target)) {
					return true;
				}
			}
		} 
		return false;
	}
	
	public int upOrDown(double number, char operation) {
		if (operation == 'r' || operation == 'f' || operation == 'c') {
			if (operation == 'r') {
				return (int) Math.round(number);	  
			} else if (operation == 'f') {
				return (int) Math.floor(number);
			} else if (operation == 'c' ) {
				return (int) Math.ceil(number);
			}
		}
		return -1;
	}
	
	public int countMe(String text, char end) {
		if (text != null && Character.isLetter(end) == true) {
			int count = 0;
			for (int i = 0; i < text.length(); i++) {
				if (text.charAt(i) == ' ') {
					if (text.charAt(i-1) == end) {
						count++;
					}
				}
			}
			if (text.charAt(text.length()-1) == end) {
				count++;
			}
			return count;
		}
		return -1;
	}
	
	public boolean isNotEqual(String str) {
		int ifs = 0;
		int nots = 0;
		if (str != null) {
			for(int i = 0; i < str.length()-1; i++) {
				if(("is").equals(str.substring(i, i+2))) {
					ifs++;
				}
			}
			for(int i = 0; i < str.length() - 2; i++) {
				if(("not").equals(str.substring(i, i+3))) {
					nots++;
				}
			}
			if (ifs == nots) {
				return true;
			}
		}
		return false;
	}
}