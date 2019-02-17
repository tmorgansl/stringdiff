import static org.junit.Assert.assertEquals;

import com.morgan.stringdiff.Comparer;
import com.morgan.stringdiff.InvalidInputException;
import org.junit.Test;

public class ComparerTest {

  @Test
  public void characterDifferenceSameLengthStringsReturnsCorrectResult() {
    final int diffCount = Comparer.characterDifference("teststring", "taststr1nG");
    assertEquals(3, diffCount);
  }

  @Test(expected = InvalidInputException.class)
  public void characterDifferenceDifferentLengthStringsThrowsInvalidInputException() {
    Comparer.characterDifference("foo", "foo2");
  }
}
