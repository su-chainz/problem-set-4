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
	
	public int triplets(String input) {
		int inputLength = input.length();
		boolean whitespaceCheck = false;
		boolean letterCheck = false;
		char first = 'a';
		char second = 'b';
		char third = 'c';
		int tripletCount = 0;
		for (int i = 0; i < inputLength; i++) {
			if (input.charAt(i) == ' ') {
				whitespaceCheck = true;
			}
		}
		for (int g = 0; g < inputLength; g++) {
			if (Character.isDigit(input.charAt(g)) == true) {
				letterCheck = true;
			}
		}
		if (input == null || whitespaceCheck == true || letterCheck == true) {
			System.out.println("failed");
			return -1;
		}
		for (int h = 0; h < inputLength; h++) {
			if (h+2 < inputLength) {
				first = input.charAt(h);
				second = input.charAt(h+1);
				third = input.charAt(h+2);
				if (first == second && second == third ) {
					tripletCount += 1;
				}
			}
		}
		System.out.println(tripletCount);
		return tripletCount;
	}
	
	
	public int addMe(String input, boolean add) {
		char jeff = ' ';
		int numberStart = 0;
		int numberEnd = 1;
		String number = null;
		int sum = 0;
		int numberReal = 0;
		boolean whitespaceCheck = false;
		int digit = 0;
		int inputLength = input.length();
		for (int i = 0; i < inputLength; i++) {
			if (input.charAt(i) == ' ') {
				whitespaceCheck = true;
			}
		}
		if (input == null || whitespaceCheck == true) {
			return -1;
		}
		if (add == true) {
			for (int g = 0; g < inputLength; g++) {
				if (Character.isDigit(input.charAt(g)) == true) {
					jeff = input.charAt(g);
					digit = jeff - '0';
					sum += digit;
				}
			}
		}
		else {
			for (int h = 0; h <inputLength; h++) {
				if (Character.isDigit(input.charAt(h)) == true) {
					numberStart = h;
					for (int j = h; j<inputLength; j++) {
						if(Character.isLetter(input.charAt(j)) == true && j < inputLength-1) {
							numberEnd = j;
							break;
						}
						else if (j == inputLength-1 && Character.isDigit(input.charAt(inputLength-1)) == true) {
							numberEnd = inputLength;
							break;
						}
					}
					number = input.substring(numberStart, numberEnd);
					numberReal = Integer.parseInt(number);
					System.out.println(numberReal);
					sum += numberReal;
					h = numberEnd;
				}
			}
			
		}
		System.out.println(sum);
		return sum;
		
}

}