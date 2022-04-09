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
		//�غ�.
		pf = new Profile("dongseok Cop.");
		question = new BooleanQuestion(1,"20�� �̻��� ������ ȸ�翡 �����ϳ�?");
		criteria = new Criteria();
	}
	
	@Test
	public void test() {
		//�غ�.
		pf.add(new Answer(question,Bool.FALSE));
		criteria.add(new Criterion(new Answer(question, Bool.TRUE), Weight.MustMatch));
		
		//����.
		//�ܾ�.
		assertFalse(pf.matches(criteria));
		
	}
	
	@Test
	public void test2() {
		//�غ�.
		
		// ����.
		
		// �ܾ�.
		
		Profile pf = new Profile("dongseok Cop.");
		Question question = new BooleanQuestion(1,"20�� �̻��� ������ ȸ�翡 �����ϳ�?");

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
