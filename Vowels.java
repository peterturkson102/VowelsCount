import java.util.ArrayList;
import java.util.List;


public class Vowels {

  public static int getCount(String str) {
    List<Character> vowels = List.of('a','e','i','o','u');
    int sum =0;
    for(int i =0; i<str.length(); i++){
      if(vowels.contains(str.charAt(i))){
        sum++;
      }
    }
    return sum;
  }

}
