public class Rec12 {
    public static int callGuest(int n){
        if(n <= 1){
            return 1;
        }
        int ways1 = callGuest(n-1);

        int ways2 = (n-2) * callGuest(n-2);
        return ways1 + ways2;
    }
    public static void main(String[] args) {
        int n =4;
        System.out.println(n);
    }
}
