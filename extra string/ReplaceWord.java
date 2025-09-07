public class ReplaceWord {
    public static String replace(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            if (w.equals(oldWord)) sb.append(newWord).append(" ");
            else sb.append(w).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";
        System.out.println(replace(sentence, "Java", "Python"));
    }
}
