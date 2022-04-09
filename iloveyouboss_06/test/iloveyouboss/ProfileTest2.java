package iloveyouboss;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ProfileTest2 {
	Question question;
	Profile profile;
	Criteria criteria;
	@Before
	public void initialize() {
		question = new BooleanQuestion(0, "get more than 20 annual leave?");
		profile = new Profile("dongseok Inc.");
		criteria = new Criteria();
	}
	
	@Test
	public void didmustmatchworkwell() {
		profile.add(new Answer(question, Bool.FALSE));
		criteria.add(new Criterion(new Answer(question, Bool.TRUE), Weight.MustMatch));
		
		boolean matches = profile.matches(criteria);
//		System.out.println(matches);
		assertFalse(matches);
//		assertTrue(matches);
	}
	
	
	@Test
	public void diddontcareworkwell() {
		profile.add(new Answer(question, Bool.FALSE));
		criteria.add(new Criterion(new Answer(question, Bool.TRUE), Weight.DontCare));
		
		
		boolean matches = profile.matches(criteria);
//		System.out.println(matches);
//		assertFalse(matches);
		assertTrue(matches);
	}
}
