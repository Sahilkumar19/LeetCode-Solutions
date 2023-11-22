public class FirstOccuranceInString {
    public static void main(String[] args) {
        String one="sahil";
        String two="sa";
        System.out.println(strStr(one,two));
    }
    public static int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
}
