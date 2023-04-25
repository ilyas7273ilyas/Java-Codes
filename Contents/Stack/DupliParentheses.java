import java.util.Stack;

public class DupliParentheses {
    public static boolean isDuplicate(String str) {  //O(n)
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            //closing
            if(ch == ')') {
                int count = 0;
                while(s.pop() != '(') {
                    count++;
                }
                if(count < 1) {
                    return true;  //duplicate
                }
            }
            //opening
            else { 
                s.push(ch);
            }
        }

        return false;
    }

    public static void main(String args[]) {
        //Valid String
        String str1 = "((a-b))"; //true
        String str2 = "(a-b)"; //false
        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2));
    }
}
