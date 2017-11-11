public class Permutations {
    private static String swap(String inputStr, int left,int i){
        char ch;
        String result;
        char[] charArray = inputStr.toCharArray();

        ch = charArray[left];
        charArray[left] = charArray[i];
        charArray[i]=ch;
        result=String.valueOf(charArray);
        return result;
    }

    private static void permutation(String inputStr,int left,int right){
        if(left==right){
            StdOut.println(inputStr);
        }
        else{
            for(int i=left;i<=right;i++){
                inputStr=swap(inputStr,left,i);
                permutation(inputStr,left+1,right);
                inputStr=swap(inputStr,left,i);
            }
        }
    }

    public static void main(String[] args) {
    String alphabet ="abcdefghijklmnopqrstuvwzyz";
        int num = 0;
        String inputStr;
        if(args.length == 1){
            num = Integer.parseInt(args[0]);
            if(num <= 26){
                StdOut.println("Permutations of length "+ num + " are: ");
                inputStr = alphabet.substring(0,num);
                permutation(inputStr,0,num-1);
            }
            else{
                StdOut.println("Command line argument should be less than 27");
            }
        }
        else{
            StdOut.println("Please enter command line arguments");
        }

    }
}
