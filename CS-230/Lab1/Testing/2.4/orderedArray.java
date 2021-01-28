// orderedArray.java
// demonstrates ordered array class
////////////////////////////////////////////////////////////////

//this class will define an ordered array and find, insert, delete, size, and display methods
// the class also provides constructors
class OrdArray
   {
	   
   //NOTE THAT THESE VARIABLES ARE PRIVATE
   //THEY CAN ONLY BE ACCESSED OUTSIDE OF THE CLASS VIA METHODS
   private long[] a;                 // ref to array a
   private int nElems;               // number of data items
   
   //-----------------------------------------------------------
   public OrdArray(int max)          // constructor, number of elements as the argument
      {
      a = new long[max];             // create array
      nElems = 0;
      }
   //-----------------------------------------------------------
   public int size()
      { return nElems; }
   //-----------------------------------------------------------
   
   
   //find now implements a binary search
   //NOTE THE BINARY SEARCH
   public int find(long searchKey)
      {
      int lowerBound = 0;
      int upperBound = nElems-1;
      int curIn;

      while(true)
         {
	     //find the middle
         curIn = (lowerBound + upperBound ) / 2;
		 //check to see if the middle is correct
         if(a[curIn]==searchKey)
            return curIn;              // found it
         else if(lowerBound > upperBound)
            return nElems;             // can't find it
         else                          // divide range
            {
            if(a[curIn] < searchKey)
               lowerBound = curIn + 1; // it's in upper half, change the lowerBound to the current value
            else
               upperBound = curIn - 1; // it's in lower half, change the upperBound to the current value
            }  // end else divide range
         }  // end while
      }  // end find()
   //-----------------------------------------------------------
   
   //insert an element into the array at the correct spot, and also shift all the other values
   public void insert(long value)    // put element into array
      {
      int j;
      for(j=0; j<nElems; j++)        // find where it goes
         if(a[j] > value)            // linear search - note that this could be reprogrammed to use binary search
            break;                   // this method could be much faster with binary search
      for(int k=nElems; k>j; k--)    // now, j is set to the index where the value should go, so move bigger ones up
         a[k] = a[k-1];
      a[j] = value;                  // insert it
      nElems++;                      // increment size
      }  // end insert()
   //-----------------------------------------------------------
   //delete a value in the array, 
   public boolean delete(long value)
      {
      int j = find(value);
      if(j==nElems)                  // can't find it
         return false;
      else                           // found it
         {
         for(int k=j; k<nElems; k++) // move bigger ones down
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
   }  // end class OrdArray
////////////////////////////////////////////////////////////////
class OrderedApp
   {
   public static void main(String[] args)
      {
      int maxSize = 100;             // array size
      OrdArray arr;                  // reference to array
      arr = new OrdArray(maxSize);   // create the array

      arr.insert(77);                // insert 10 items
      arr.insert(99);
      arr.insert(44);
      arr.insert(55);
      arr.insert(22);
      arr.insert(88);
      arr.insert(11);
      arr.insert(00);
      arr.insert(66);
      arr.insert(33);

      int searchKey = 55;            // search for item
      if( arr.find(searchKey) != arr.size() )
         System.out.println("Found " + searchKey);
      else
         System.out.println("Can't find " + searchKey);

      arr.display();                 // display items

      arr.delete(00);                // delete 3 items
      arr.delete(55);
      arr.delete(99);

      arr.display();                 // display items again
      }  // end main()
   }  // end class OrderedApp
