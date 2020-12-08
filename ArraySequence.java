import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;


  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int[] other){
    data = new int[other.length];
    for (int i = 0; i < other.length; i++) {
      data[i] = other[i];
    }
    currentIndex = 0;
  }

    public void reset(){
      currentIndex = 0;
    }

    public int length(){
      return data.length;
    }

    //When current is no longer a valid element in the range, it should return false.
    public boolean hasNext(){
      return (currentIndex < data.length);
    }

    //@throws NoSuchElementException when hasNext() is false.
    //This will return the current value, it will also increase current value by 1.
    //e.g.  if current is 5. This will make current 6, and return 5.
    public int next(){
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
      else {
      currentIndex++;
      return data[currentIndex-1];
      }
    }
}
