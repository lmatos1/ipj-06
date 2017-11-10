public class PrintBinary {

    public static void printBinary(int num){
        if(num >1){
            int rem = num/2;
            printBinary(num/2);
            System.out.print(rem);
        }
    }
}
