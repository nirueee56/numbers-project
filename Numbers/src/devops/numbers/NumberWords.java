package devops.numbers;

public class NumberWords {

	public String toWords( int number ) {
		String result = "0" ;
		if(number>=0 && number<=999){
			if(number==0){
				return null;
			} else {
				System.out.print("\nNUMBER AFTER CONVERSION:\t");
				result = numberToWord(((number / 100) % 10), " HUNDRED");
				result = result + numberToWord((number % 100), " ");
			}

		} else{
			result = "NUMBER OUT OF RANGE";
		}
		System.out.print("\n" + result.trim());
		return result.trim();
	}

	public static String numberToWord(int num, String val) {
		String ones[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"
		};
		String tens[] = {" ", " ", " TWENTY", " THIRTY", " FOURTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
		if (num > 19) {
			 val = tens[num / 10] + " " + ones[num % 10];
		} else {
			val = ones[num];
		}
		return val;
	}

}
