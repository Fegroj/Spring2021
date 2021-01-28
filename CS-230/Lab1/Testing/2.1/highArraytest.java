// highArray.java
// demonstrates array class with high-level interface
////////////////////////////////////////////////////////////////
class HighArray
   {
   private long[] a;                 // ref to array a
   private int nElems;               // number of data items
   //-----------------------------------------------------------
   public HighArray(int max)         // constructor
      {
      a = new long[max];                 // create the array 'a'
      nElems = 0;                        // no items yet //nElems is just an integer
      }
   //-----------------------------------------------------------
   public boolean find(long searchKey)//Method is called 'find' for a reason
      {                              // find specified value
      int j;                             // Declaring 'j' as an int in the method
      for(j=0; j<nElems; j++)            // for each element,//start 0, move up j
         if(a[j] == searchKey)           // found item?//array 'a' with cell #j
            break;                       // exit loop before end
      if(j == nElems)                    // gone to end?
         return false;                   // yes, can't find it
      else
         return true;                    // no, found it
      }  // end find()
   //-----------------------------------------------------------
   public void insert(long value)    // put element into array
      {
      a[nElems] = value;             // insert it
      nElems++;                      // increment size
      }
   //-----------------------------------------------------------
   public boolean delete(long value)
      {
      int j;
      for(j=0; j<nElems; j++)        // look for it
         if( value == a[j] )
            break;
      if(j==nElems)                  // can't find it
         return false;
      else                           // found it
         {
         for(int k=j; k<nElems; k++) // move higher ones down
            a[k] = a[k+1];
         nElems--;                   // decrement size
         return true;
         }
      }  // end delete()
	  
   //-----------------------------------------------------------
   public void display()             // displays array contents
      {
      for(int j=0; j<nElems; j++)       // for each element,
         System.out.print(a[j] + " ");  // display it
      System.out.println("");
      }
   //-----------------------------------------------------------
      //New code for Lab 1
   /*2.1.) To the HighArray class in the highArray.java program (Listing 2.3), add a
	method called getMax() that returns the value of the highest key in the array,
	or –1 if the array is empty. Add some code in main() to exercise this method.
	You can assume all the keys are positive numbers.
   */
   //found from 
   //https://www.geeksforgeeks.org/java-program-for-program-to-find-largest-element-in-an-array/
	
    public long getMax() //Method: Iterative searching for max
    {
    //no need to declare j again when it can be declared in   the 'for' loop 
    //normal procedure up array
    //No parathesis needed for a 'for' loop
    //a[j] is array 'a' with element number 'j' as it counts through
    //'max' needs to be declared as the highest number found in the array
        long max = a[0];
        
        for (int j=0; j<nElems; j++)
            if (a[j] >max)
                max = a[j];
                System.out.println ("Largest in given array is: " + max + "\n");
        return max;
    }
        
  }
////////////////////////////////////////////////////////////////
class HighArrayApp
   {
   public static void main(String[] args)
      {
      int maxSize = 100;            // array size
      HighArray arr;                // reference to array
      arr = new HighArray(maxSize); // create the array

      arr.insert(77);               // insert 10 items
      arr.insert(99);
      arr.insert(44);
      arr.insert(55);
      arr.insert(22);
      arr.insert(88);
      arr.insert(11);
      arr.insert(00);
      arr.insert(66);
      arr.insert(33);

      arr.display();                // display items
      arr.getMax(); 
      int searchKey = 35;           // search for item
      if( arr.find(searchKey) )
         System.out.println("Found " + searchKey);
      else
         System.out.println("Can't find " + searchKey);

      arr.delete(00);               // delete 3 items
      arr.delete(55);
      arr.delete(99);

      arr.display();
      arr.getMax();
                    // display items again
      }  // end main()
   }  // end class HighArrayApp
