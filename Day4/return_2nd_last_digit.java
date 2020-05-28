import java.io.*;
import java.util.*:
class userMainCode
{
  public int secondLastDigitOf(int input){
  //Read only region end
  int n,sl,secondlast;
  n=Math.abs(input);
  if(n>9){
    sl=n%100;
    secondlast=sl/10;
    return(secondlast);
 }
    else{
      return -1;
    }
  }
 }
