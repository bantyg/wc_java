import org.junit.Test;
import static org.junit.Assert.*;
public class WcTest{

	@Test
	public void countLines_will_count_number_of_lines_of_string_which_has_3_lines(){
		Wc wc = new Wc();
		assertEquals(2,wc.countLines("hello how are you.\r\n I am fine \r\n what about you"));
	}

	@Test
	public void countLines_will_count_number_of_lines_of_string_which_has_4_lines(){
		Wc wc = new Wc();
		assertEquals(3,wc.countLines("hello how are you.\r\n I am fine \r\n what about you \r\n Bawlt"));
	}


	@Test
	public void countWord_will_count_number_of_words_of_string(){
		Wc wc = new Wc();
		assertEquals(4,wc.countWords("hello how are you."));
	}

	@Test
	public void countWords_will_count_number_of_words_of_string_which_has_4_lines(){
		Wc wc = new Wc();
		assertEquals(11,wc.countWords("hello how are you.\r\nI am fine\r\nwhat about you\r\nBawlt"));
	}

	@Test
	public void countWords_will_count_number_of_words_of_string_which_has_5_lines(){
		Wc wc = new Wc();
		assertEquals(13,wc.countWords("hello how are you.\r\nI am fine\r\nwhat about you\r\nBawlt\r\nwhat's new"));
	}

	@Test
	public void countChars_will_count_number_of_characters_present_in_the_string(){
		Wc wc = new Wc();
		assertEquals(18,wc.countChars("hello how are you."));
	}

	@Test
	public void countChars_will_count_number_of_characters_of_string_which_has_4_lines(){
		Wc wc = new Wc();
		assertEquals(52,wc.countChars("hello how are you.\r\nI am fine\r\nwhat about you\r\nBawlt"));
	}

	@Test
	public void countChars_will_count_number_of_characters_of_string_which_has_5_lines(){
		Wc wc = new Wc();
		assertEquals(64,wc.countChars("hello how are you.\r\nI am fine\r\nwhat about you\r\nBawlt\r\nwhat's new"));
	}

	@Test
	public void getLongestString_will_give_the_longest_line_from_number_of_lines(){
		Wc wc = new Wc();
		int val1 = 5,val2 = 6;
		String longest = wc.getLongestLine("hello how are you.\r\nI am fine\r\nwhat about you\r\nBawlt\r\nwhat's new");
		assertTrue(longest.equals("hello how are you."));
	}
}