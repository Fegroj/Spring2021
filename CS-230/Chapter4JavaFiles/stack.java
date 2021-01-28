// stack.java
// demonstrates stacks
////////////////////////////////////////////////////////////////

//Class for a stack
class StackX
   {
	
   // create attributes of StackX class
   private int maxSize;        // size of stack array
   
   //NOTE THAT WE ARE STILL USING AN ARRAY
   private long[] stackArray;
   private int top;            // top of stack variable
   
   
//--------------------------------------------------------------

   // constructor for object
   // NOTE THAT THE UNDERLYING DATA STRUCTURE IS STILL AN ARRAY
   // HOWEVER, WE WILL MODIFY HOW WE ACCESS THE ARRAY
   // we can only access the stack via the public methods defined in the StackX class
   public StackX(int s)         // constructor
      {
      maxSize = s;             // set array size
      stackArray = new long[maxSize];  // create array
      top = -1;                // no items yet
      }
//--------------------------------------------------------------
   //Can only interact with the array via the methods defined here
   //notice the order of the auto increment
   public void push(long j)    // put item on top of stack
      {
      stackArray[++top] = j;     // increment top, then insert item
      }
//--------------------------------------------------------------
   //notice the order of the auto decrement
   public long pop()           // take item from top of stack
      {
      return stackArray[top--];  // access item, then decrement top
      }
//--------------------------------------------------------------
   public long peek()          // peek at top of stack - do not remove
      {
      return stackArray[top];
      }
//--------------------------------------------------------------
   // top will be -1 if the last value is removed
   public boolean isEmpty()    // true if stack is empty
      {
      return (top == -1);
      }
//--------------------------------------------------------------
   public boolean isFull()     // true if stack is full
      {
      return (top == maxSize-1);
      }
//--------------------------------------------------------------
   }  // end class StackX
////////////////////////////////////////////////////////////////
class StackApp
   {
   public static void main(String[] args)
      {
		  
	  // make a new stack object. 
      StackX theStack = new StackX(10);  // make new stack that can hold 10 items
      theStack.push(20);               // push 4 items onto stack
      theStack.push(40);
      theStack.push(60);
      theStack.push(80);

	  //loop through, pop the values until empty
      while( !theStack.isEmpty() )     // until it's empty,
         {                             // delete item from stack
         long value = theStack.pop();
         System.out.print(value);      // display it
         System.out.print(" ");
         }  // end while
      System.out.println("");
      }  // end main()
   }  // end class StackApp
////////////////////////////////////////////////////////////////
