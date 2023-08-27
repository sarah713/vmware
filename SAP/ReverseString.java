package SAP;

public class ReverseString {
    String reverseWords(String S) {
        // code here
        String[] arr = S.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            if (i != 0) {
                sb.append(".");
            }
        }
        return sb.toString();
    }
}
