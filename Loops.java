import java.util.*;

public class Loops {

    // Using for loops and printing 1 to 10
    // public static void main(String[] args) {
    //     for(int i = 1; i <= 10; i++){
    //         System.out.println(i);
    //     }
    // }

    // Using while loops
    // public static void main(String[] args) {
    //     int i = 1;
    //     while (i <= 10) {
    //         System.out.println(i);
    //         i++;
    //     }
    // }

    //using do while loops
    // public static void main(String[] args) {
    //     int i=1;
    //     do{
    //         System.out.print(i);
    //         i++;
    //     }while(i<11);
    // }

    //wap to print sum of first n natural number
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
//     int sum =0;
//     for(int i=0; i<=n; i++){
//         sum=sum+i;
//     }
//     System.out.println(sum);


// printing table
      for(int i=1; i<11; i++){
        System.out.println(n*i);
      }
}
}

