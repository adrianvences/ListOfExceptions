import java.util.ArrayList;
import java.util.*;


public class ListUtil {

  public static void main(String[] args) {
    ArrayList<Object> myList = new ArrayList<Object>();
    try{
    myList.add(13);
    myList.add("hello world");
    myList.add(43);
    myList.add("goodbye world");
      
  
  
      for(int i = 0; i < myList.size(); i++) {
        Integer castedValue = (Integer) myList.get(i);
        
    }
  } catch(NumberFormatExeption e) {
      System.out.println("errorrrrrrrrr");
      
  }



  }
  
}