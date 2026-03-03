public class hello {

    public static Boolean palindrome(String s){
        int Length = s.length();
        for (int i=0 ; i< Length ; i++){
            if( s.charAt(i) !=  s.charAt(Length-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main( String[] args ) throws Exception {
        System.out.println("Hi Trixie!");
        System.out.println("hello is palindrome ? "+palindrome("hello"));
    }
 
}
