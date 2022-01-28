
package iloveyouboss;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

public class ProfileTest {
	Question question ;
	Profile profile   ;
	Criteria criteria ;
	@Before
	public void create() {
	      question = new BooleanQuestion(1, "Got bonuses?");
	      profile   = new Profile("Bull Hockey, Inc.");
	      criteria = new Criteria();
	}
	
   @Test
   public void matchAnswersFalseWhenMustMatchCriteriaNotMet() {

      profile.add(new Answer(question, Bool.FALSE));
      criteria.add(new Criterion(new Answer(question, Bool.TRUE), 
    		  Weight.MustMatch));
      
      boolean matches = profile.matches(criteria);
      assertFalse(matches);
//      assertTrue(matches);
   }
   
   
   @Test
   public void matchAnswersTrueForAnyDontCareCriteria() {
      profile.add(new Answer(question, Bool.FALSE));
      
      criteria.add(new Criterion(new Answer(question, Bool.TRUE),
    		  Weight.DontCare));
      
      boolean matches = profile.matches(criteria);
//      assertFalse(matches);
      assertTrue(matches);
   }
}
