class WordCount {

  public static int NumberOfWords(String str) {
    String[] words = str.split("\\s+");
    return words.length;
  }

  public static void main(String[] args) {

    int result = NumberOfWords("Hello word");
    System.out.println("The number of words is " + result);

  }
}
