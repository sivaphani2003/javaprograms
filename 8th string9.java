// A bubble sort for Strings.
class SortString 
{
  static String arr[] = 
  {
  "Now", "is", "the", "time", "for", "all", "good", "men",
  "to", "come", "to", "the", "aid", "of", "their", "country"
  };
  public static void main(String args[]) 
  {
    for(int j = 0; j < arr.length; j++) 
    {
      for(int i = j + 1; i < arr.length; i++) 
      {
        if(arr[i].compareTo(arr[j]) < 0) 
        {
          String t = arr[j];
          arr[j] = arr[i];
          arr[i] = t;
        }
      }
      System.out.println(arr[j]);
    }
  }
}
// here upper case letters are also taken into consideration so remove that case consideration use compareToIgnoreCase( ) in place of compareTo().
/*The output of this program is the list of words:
Now
aid
all
come
country
for
good
is
men
of
the
the
their
time
to
to*/
