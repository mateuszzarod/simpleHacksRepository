public class StringReverse {
    public static String stringReverse(String str){

        String reverse = "";
        //zacznik od końca strlenght()-1
        //do zera zjedź i >=0 a potem zmniejsz i
        //pusty string dopisz listerkę na charAt(i);
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
        return reverse;
    }

    public static String stringReverseSimple(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        System.out.println(sb);
        return sb.toString();
    }

    public static void main(String[] args) {
        stringReverse("mateusz!");
        stringReverseSimple("Mateusz cho na obiad");
    }

}
