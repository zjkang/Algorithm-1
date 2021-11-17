public class AmazonCipher {
    //sample: encrypted = 'VTAOG' k = 2
    //output: 'TRYME'
    public String simpleCipher(String encrypted, int k) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < encrypted.length(); i++) {
            char c = encrypted.charAt(i);
            int i1 = (c - 'A' - k + 26) % 26 + 'A';
            result.append((char)i1);
        }
        return result.toString();
    }

    public static void main(String[] args) {
//        AmazonCipher sol = new AmazonCipher();
        String str = "VTAOG";
        int k = 2;
        System.out.println(sol.simpleCipher(str, k));
    }
}
