public class PrintBinary {

    public static void printBinary(int num){
        if(num >1){
            int rem = num%2;
            printBinary(num/2);
            System.out.print(rem+" ");
        }
        else {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int num;
        System.out.print("Enter positive number: ");
        num=StdIn.readInt();
        System.out.print("Binary representation of "+num+" is: ");
        printBinary(num);
    }
}
