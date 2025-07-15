
public class Words {

    public static void main(String[] args) {

        // how many words
        String sentence = "Java is the programming language";
        String[] words = sentence.split(" ");
        System.out.println("Number of words: " + words.length);

        // remove the spaces
        String[] word = sentence.split("");
        System.out.println("The remove of space:" + word.length);


        // reverse it
        // String[] words = sentence.split(" ");
        
         String reversed = "";

    for(int i = words.length -1;i>=0;i--){
        reversed += words[i] + " ";
    }
    System.out.println( "The reversed name is: "+reversed.trim());

// reverse each word

    String reverse = " ";
    for(int i=sentence.length()-1; i>=0 ;i--){
        reverse += sentence.charAt(i);
    }
    System.out.println(reverse);

    }
}
