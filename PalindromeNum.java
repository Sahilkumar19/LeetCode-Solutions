public class PalindromeNum {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        int original=x;
        int pal=0;
        while (x>0){
            int rem=x%10;
            pal=pal*10+rem;
            x=x/10;
        }
        return pal==original;
    }
}
