public class Rec10 {

    public static int countPath(int i, int j, int n, int m) {
        // Base case: if we've reached the boundary of the grid
        if (i == n || j == m) {
            return 0;
        }
        // Base case: if we've reached the bottom-right corner
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // Count paths by moving down and right
        int downPath = countPath(i + 1, j, n, m);
        int rightPath = countPath(i, j + 1, n, m);

        // Return the total number of paths
        return downPath + rightPath;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        int totalPaths = countPath(0, 0, n, m);
        System.out.println(totalPaths);
    }

}
