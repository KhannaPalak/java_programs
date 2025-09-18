import java.util.*;
public class ReverseTheWordsOfSentence {
    public static void main(String[] args) {
        String sentence = "Mary had a little lamb.Its fleece was white as snow";
        System.out.println("Sentence before reversing: " + sentence);

        
        String words[] = sentence.split(" ");
        
        Stack<String> stack = new Stack<>();
        
       
        for (String word : words) 
        {
            if(word.endsWith(".")==false){
                stack.push(word);
            }
            

        }
        
        String Rsentence =" ";
        while(!stack.isEmpty()) {
            Rsentence += stack.pop() + " ";
        }
        System.out.println("Sentence after reversing: "+ Rsentence);
    }
}