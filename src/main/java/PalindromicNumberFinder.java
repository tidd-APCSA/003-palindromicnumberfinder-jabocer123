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
      int firstNum = num;
      int nextPal = num + 1;
      
      while(testPalindromicNum(nextPal) == false){
        nextPal++;
      }
      return nextPal - firstNum;
    }

    // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
      Integer number = num;
      String reversedNum = reverseNum(num);
      String firstNum = number.toString();
      return firstNum.equals(reversedNum);
    }


    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){
      Integer thisNum = num;
      String s = thisNum.toString();
      String str = "";
      for(int i = 0; i < s.length(); i++){
        str = str + s.charAt(s.length() - (1 + i));
      }
      
      return str;
    }


    @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}
