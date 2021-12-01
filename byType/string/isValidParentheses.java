public class MyClass {
    public boolean isValidParentheses(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                count++;
            }
            else {
                if (count == 0) {
                    return false;
                }
                count--;
            }
        }
        return count == 0;
    }
   
    public static void main(String args[]) {
        MyClass sol = new MyClass();
        // String s = "(())())";
        String s = "(())()";
        System.out.println(sol.isValidParentheses(s));

    }
}
