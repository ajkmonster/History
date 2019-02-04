import java.util.Scanner;

public class History {
    public static void main(String[] args){
        String[] arr = new String[10];
        int x;
        Scanner key = new Scanner(System.in);
        System.out.println("Please write the last 10 presidents of the USA: ");
        for (x=0; x<=9; x++){
            arr[x] = key.next();
        }
        Scanner key1 = new Scanner(System.in);
        String y = key1.next();
        if (y.equalsIgnoreCase("history")) {
            for (x=9;x>=0;x--){
                System.out.println(arr[x]);
            }
        }
    }
}
