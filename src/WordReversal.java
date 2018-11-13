public class WordReversal {
    public static void reverseWords(String words){
        String[] wordsReverse = words.split(" ");
        String reversedString = "";
        //przeiteruj tablicę wyrazów
        for (int i=0; i<wordsReverse.length; i++){
            //weź pierwsze słowo przypisz je do zmiennej
            String word = wordsReverse[i];
            String reverseWord = "";
            //weź [przeiteruj drugą pętlą po całym słowie od końca word.lenght()-1
            for (int j=word.length()-1;j>=0;j--){
                reverseWord+= word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.println(words);
        System.out.println(reversedString);
    }

    public static String reverseWordsSimple(String words){
        StringBuilder sb = new StringBuilder();
        String result = sb.append(words).reverse().toString();
        System.out.println(result);
        return result;
    }



    public static void main(String[] args){
        reverseWords("Mateusz je zupe");
        reverseWordsSimple("Mateusz je zupe");
    }
}


//weź stringa
//podziel go na słowa (split) tablicę
//przeiteruj tablicę
//w każdym elemencie tablicy srób reverse słowa