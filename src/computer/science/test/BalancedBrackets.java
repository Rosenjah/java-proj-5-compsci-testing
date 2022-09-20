package computer.science.test;

import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {
        String strBracketed = new String("(97650({fghjk(fdgfhgh)trt}))");
        balancedBrackets(strBracketed);
    }

    public static boolean balancedBrackets(String strCheck) {

        //Step 1 runtime complexity - O(1)
        //Step 2 runtime complexity - O(n)

        //The solutions are more or less the same as they are both using Stack data structure.
        //I had started of with using char array instead of a string
        //Step 1 & 2 are easier to combine using a Stack data structure to traverse through the string

        Stack<Character> stackVessel = new Stack<>();

        if (strCheck.isEmpty()) {
            //System.out.println("The string is balanced");
            return true;
        }

        for (int i = 0; i < strCheck.length(); i++) {
            char presentChar = strCheck.charAt(i);
            if (presentChar == '(' || presentChar == '[' || presentChar == '{' || presentChar == '<') {
                stackVessel.push(presentChar);
            } else {
                if (stackVessel.isEmpty()) {
                    //System.out.println("The string is not balanced");
                    return false;
                }

                char topChar = stackVessel.peek();
                if ((presentChar == ')' && topChar != '(')
                        || (presentChar == ']' && topChar != '[')
                        || (presentChar == '}' && topChar != '{')
                        || (presentChar == '>' && topChar != '<')
                ) {
                    //System.out.println("The string is not balanced");
                    return false;
                } else {
                    stackVessel.pop();
                }
            }
        }

        //System.out.println("The string is balanced");
        return true;
    }
}
