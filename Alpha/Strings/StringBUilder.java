public class StringBUilder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++) {
            sb.append(ch);
        }   //abcdefgh.....
        // O(26) in case of StringBulider
        // O(n^2) in case of normal string looping
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
