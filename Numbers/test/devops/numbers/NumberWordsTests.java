package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberTen() {
		Assert.assertEquals( "PASS", "TEN", numberWords.toWords( 10 )  ) ;
	}

	@Test
	public void numberOneTwoThree() {
		Assert.assertEquals( "PASS", "ONE TWENTY  THREE", numberWords.toWords( 123 )  ) ;
	}

	@Test
	public void numberFiveSixEight() {
		Assert.assertEquals( "PASS", "FIVE SIXTY  EIGHT", numberWords.toWords( 568 )  ) ;
	}

	@Test
	public void numberOutOfRange() {
		Assert.assertEquals( "PASS", "NUMBER OUT OF RANGE", numberWords.toWords( 1002 )  ) ;
	}


}
