//find binary search
   //find now implements a binary search
   //NOTE THE BINARY SEARCH
   public int find(long searchKey)	//Modify to binary search
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