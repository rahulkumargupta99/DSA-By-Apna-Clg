public class Rec8 {
    public static void moveAllX(String str, int idx, int count, String newString) {
        // Base case: If we've reached the end of the string
        if (idx == str.length()) {
            // Append all 'x' characters at the end of the new string
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        // Get the current character
        char currChar = str.charAt(idx);

        // If the current character is 'x', increment the count and move to the next character
        if (currChar == 'x') {
            moveAllX(str, idx + 1, count + 1, newString);
        } else {
            // Otherwise, add the current character to the new string and move to the next character
            newString += currChar;
            moveAllX(str, idx + 1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "abxcxxxxd";
        moveAllX(str, 0, 0, "");
    }
}
