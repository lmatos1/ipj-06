// Use of LargestPalindrome.java from metro-cs1-ipj-selected-solutions
// https://github.com/ivogeorg/metro-cs1-ipj-selected-solutions/blob/master/homework-solutions/largest-palindrome/src/edu/msud/cs/cs1/LargestPalindrome.java
import java.util.ArrayList;
public class LargestPalindrome {
    private String str,palindrome;
    public LargestPalindrome(String input){
        str=input;
        palindrome=longestPaliSub(str,str.length());
    }
    private boolean isPalindrome(String s){
        return s.equals((new StringBuffer(s)).reverse().toString());
    }
    private String longestPaliSub(String s, int length) {
        String outputString="";
        ArrayList<String> subList=new ArrayList<String>();
        String sub="";

        for(int i=0;i<length;i++){
            for(int j=1;j<=length-i;j++){
                sub=s.substring(i,i+j);
                subList.add(sub);
            }
        }
        int maxLength=0;
        for(String s1 : subList){
            if(isPalindrome(s1)){
                if(maxLength<s1.length()){
                    maxLength=s1.length();
                    outputString=s1;
                }
            }
        }

        if(outputString.length()==1){
            return "";
        }

        return outputString;
    }
    public String get(){
        return palindrome;
    }
    public static void main(String[] args){
        System.out.println(new LargestPalindrome("alcohol").get());
        System.out.println(new LargestPalindrome("alhambra").get());
        System.out.println(new LargestPalindrome("tattarrattat").get());
    }
}
