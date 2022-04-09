package iloveyouboss;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ProfileTest3 {
	Profile pf;
	Question question;
	Criteria criteria;
	
	@Before void intialize() {
		//준비.
		pf = new Profile("dongseok Cop.");
		question = new BooleanQuestion(1,"20일 이상의 연차를 회사에 제공하나?");
		criteria = new Criteria();
	}
	
	@Test
	public void test() {
		//준비.
		pf.add(new Answer(question,Bool.FALSE));
		criteria.add(new Criterion(new Answer(question, Bool.TRUE), Weight.MustMatch));
		
		//실행.
		//단언.
		assertFalse(pf.matches(criteria));
		
	}
	
	@Test
	public void test2() {
		//준비.
		
		// 실행.
		
		// 단언.
		
		Profile pf = new Profile("dongseok Cop.");
		Question question = new BooleanQuestion(1,"20일 이상의 연차를 회사에 제공하나?");

		Answer pfAnswer = new Answer(question,Bool.FALSE);
		pf.add(pfAnswer);
		
		Criteria criteria = new Criteria();
		Answer cAnswer = new Answer(question, Bool.TRUE);
		Criterion criterion = new Criterion(cAnswer, Weight.DontCare);
		criteria.add(criterion);
		
		//System.out.println();
		

		assertTrue(pf.matches(criteria));
		assertFalse(pf.matches(criteria));
		
	}
}
