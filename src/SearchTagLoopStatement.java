public class SearchTagLoopStatement {
    public static void main(String[] args) {

        String phrase = "Three sad tigers swallow wheat in a wheat field";
        String word = "wheat";

        int maxWord = word.length();
        int maxPhrase = phrase.length() - maxWord;

        int quantity = 0;
        char letter = 'g';
        buscar:
        for(int i = 0; i <= maxPhrase;){
            int k = i;
            for(int j = 0; j < maxWord; j++) {
                if (phrase.charAt(k++) != word.charAt(j)) {
                    i++;
                    continue buscar;
                }
            }
            quantity++;
            i = i + maxWord;
        }
        System.out.println("Found = " + quantity + " times the word '"+word+"' in the phrase");
    }
}
