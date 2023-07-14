import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        long myNum=11111111;
        float newNum=2.22f;
        char myVar= 76;
        String text= "The quick brown fox jumps over a lazy dog";
        String newText= ""+text.length(); //String.valueOf(text.length());
        String upperText= String.valueOf(text.toUpperCase());
        String indexOfText= String.valueOf(text.indexOf("fox"));
//        System.out.println(myNum);
//        System.out.println(newNum);
//        System.out.println(myVar);
        System.out.println(
                        text +" "+ "\n "+
                        newText+ "\n " +"\n" +
                        text.indexOf("fox")
                );
        }
    }
