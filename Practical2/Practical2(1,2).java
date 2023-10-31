import java.util.Scanner;
class prac{
    public static void main(String[] args){

        Scanner startScanner = new Scanner(System.in);
        System.out.println("Please enter the starting number(int):");
        int start = startScanner.nextInt();

        Scanner endScanner = new Scanner(System.in);
        System.out.println("Please enter the ending number(int):");
        int end = endScanner.nextInt();

        if(start > end){
            System.out.println("The starting number should not be larger than the ending number!");
        }

        int num = 0;
        while(start <= end){
            num += start;
            start++;
        }
        System.out.println("The result is " + num);
    }
}