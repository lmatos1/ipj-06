public class PrintBinary {

    public static void printBinary(int num){
        if(num >1){
            int rem = num%2;
            printBinary(num/2);
            StdOut.print(rem+" ");
        }
        else {
            StdOut.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int num;
        StdOut.print("Enter positive number: ");
        num=StdIn.readInt();
        StdOut.print("Binary representation of "+num+" is: ");
        printBinary(num);
    }
}
