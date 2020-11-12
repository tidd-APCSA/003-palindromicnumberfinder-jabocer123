public class PalindromicNumberFinder {
    private int num;

    // constructor
    public PalindromicNumberFinder(int num){
        this.num = num;
    }

    // accessor/getter method
    public int getNum(){
        return this.num;
    }

    // this method should find the next palindromic number
    public int searchForPalindromicNum(int num){
      
      int nextPal = num + 1;
      
      while(testPalindromicNum(nextPal) == false){
        nextPal++;
      }
      return nextPal;
    }

    // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
      boolean isPalindromic = false;

      while(isPalindromic == false){
        if((Integer.toString(num)).equals(reverseNum(Integer.toString(num))) == true){
          isPalindromic = true;
        }
      }
      return isPalindromic;
    }


    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(String num){
      
      String str = "";
      for(int i = 0; i < num.length(); i++){
        str = str + num.charAt(num.length() - (1 + i));
      }
      
      return str;
    }


    @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}
