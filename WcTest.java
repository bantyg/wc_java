import org.junit.Test;
import static org.junit.Assert.*;
public class WcTest{

	@Test
	public void countLines_will_counts_number_of_lines_of_string_which_has_3_lines(){
		Wc wc = new Wc();
		assertEquals(3,wc.countLines("hello how are you.\r\n I am fine \r\n what about you"));
	}

	@Test
	public void countLines_will_counts_number_of_lines_of_string_which_has_4_lines(){
		Wc wc = new Wc();
		assertEquals(4,wc.countLines("hello how are you.\r\n I am fine \r\n what about you \r\n Bawlt"));
	}


	@Test
	public void countWord_will_counts_number_of_words_of_string(){
		Wc wc = new Wc();
		assertEquals(4,wc.countWords("hello how are you."));
	}

	@Test
	public void countWords_will_counts_number_of_words_of_string_which_has_4_lines(){
		Wc wc = new Wc();
		assertEquals(11,wc.countWords("hello how are you.\r\nI am fine\r\nwhat about you\r\nBawlt"));
	}

	@Test
	public void countWords_will_counts_number_of_words_of_string_which_has_5_lines(){
		Wc wc = new Wc();
		assertEquals(13,wc.countWords("hello how are you.\r\nI am fine\r\nwhat about you\r\nBawlt\r\nwhat's new"));
	}

}