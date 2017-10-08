package data_structures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS
	// A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		Stack<String> match = new Stack<String>();
		for (int i = 0; i < b.length(); i++) {
			if (b.substring(0, 1).equals("}")) {
				return false;
			} 
			
			else if (b.substring(i, i + 1).equals("{")) {
				match.push(b.substring(0, 1));
			}
			
			else if (b.substring(i, i + 1).equals("}")) {
				match.pop();
			}
		}
		if (match.size() == 0) {
			return true;
		}
		return false;
	}

}