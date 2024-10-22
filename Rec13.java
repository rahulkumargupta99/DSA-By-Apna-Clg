import java.util.ArrayList;

public class Rec13 {
    // Method to print a subset
    public static void printSubset(ArrayList<Integer> subset) {
        System.out.println(subset);
    }

    // Recursive method to find all subsets
    public static void findSubsets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            // When n is 0, print the current subset
            printSubset(subset);
            return;
        }

        // Include n in the subset
        subset.add(n);
        findSubsets(n - 1, subset);

        // Exclude n from the subset (backtracking step)
        subset.remove(subset.size() - 1);
        findSubsets(n - 1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();

        // Find all subsets for the given n
        findSubsets(n, subset);
    }
}
