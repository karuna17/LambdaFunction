import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoodAnalyser {

	String mood="";
	MoodTest m = new MoodTest();
	@Test
	void happyTest() {
		mood = m.testMood("happy");
		assertEquals("HAPPY",mood);
	}
	
	@Test
	void sadTest() {
		mood = m.testMood("happy");
		assertEquals("SAD",mood);
	}
	 
}
