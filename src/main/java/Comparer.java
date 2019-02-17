public class Comparer {
  private Comparer() {}

  public static int characterDifference(String first, String second) {
    char[] charArrayFirst = first.toCharArray();
    char[] charArraySecond = second.toCharArray();

    if (charArrayFirst.length != charArraySecond.length) {
      throw new InvalidInputException("cannot compare characters from strings of different length");
    }

    int diffCount = 0;

    // assumuption we care about differences in case
    for (int i = 0; i < charArrayFirst.length; i++) {
      if (charArrayFirst[i] != charArraySecond[i]) {
        diffCount++;
      }
    }

    return diffCount;
  }
}
