public class Rec7 {
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n ==1){
            System.out.println("transfer disk" +n+ "from"+src+"src to"+dest);
            // towerOfHanoi(n-1, helper, src, dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk" +n+ "from"+src+"src to"+dest);
        towerOfHanoi(n-1, helper, src, dest);
        
    }
    public static void main(String[] args) {
        int  n =3;
        towerOfHanoi(n, "s", "h","d");
    
    }
    
}
