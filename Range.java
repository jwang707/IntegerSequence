import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;

  /*
*@precondition: start <= end
*@param start : the starting value (inclusive)
*@param end : the ending value which is also inclusive.*/
  public Range(int min,  int max){
    start = min;
    end = max;
    reset();
  }

  public void reset(){
    current = start;
  }
  
  public int length(){
    return (end - start + 1);
  }

  //When current is no longer a valid element in the range, it should return false.
  public boolean hasNext(){
    return (current <= end);
  }

  //@throws NoSuchElementException when hasNext() is false.
  //This will return the current value, it will also increase current value by 1.
  //e.g.  if current is 5. This will make current 6, and return 5.
  public int next(){
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    else {
    current++;
    return current-1;
    }
  }
}
