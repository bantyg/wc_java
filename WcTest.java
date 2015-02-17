import org.junit.Test;
import static org.junit.Assert.*;
public class WcTest{
	@Test
	public void countWord_will_counts_number_of_words_of_string(){
		Wc wc = new Wc();
		assertEquals(4,wc.countWords("hello how are you."));
	}
}