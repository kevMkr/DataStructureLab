import java.util.Stack;

public class ReverseSentence {
    static void pushStack(Stack<String> stack, String sentence) {
        String[] words = sentence.split(" ");
        for (String word : words) {
            stack.push(word);
        }
    }

    static String popStack(Stack<String> stack) {
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
            if (!stack.isEmpty()) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String sentence = "you gae";

        pushStack(stack, sentence);
        String reversedSentence = popStack(stack);

        System.out.println("Reversed: " + reversedSentence);
    }
}
