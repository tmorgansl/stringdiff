public class Application {
  public static void main(String[] args) {
    if (args.length != 2) {
      System.err.println("Please provide two strings to compare");
    } else {
      System.out.println(Comparer.characterDifference(args[0], args[1]));
    }
  }
}
