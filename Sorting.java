package Application;

//  Created by Clayton Paplaczyk
//  Description: Sorts linked list into a queue. 

import java.util.LinkedList; //LinkedList will be used as a queue

public class Sorting
{
	private LinkedList<Object> mainQueue; //Main-Queue to be used to show intermediate stage of the sorting
	private LinkedList[] subQueues; //An array of queues to be used for the sorting
	private final int SIZE = 10; //used to create an array of Linked List subQueues as its size.
	private int maxDigits; //maximum number of digits. It should be initialized to 0.
	
//The constructor instantiates the mainQueue using the LinkedList,
//subQueue array as an array of LinkedList using SIZE(10),
//and initializes maxDigits = 0;
	public Sorting()
	{
		mainQueue = new LinkedList<Object>();
		subQueues[0] = new LinkedList<Object>();
		subQueues[1] = new LinkedList<Object>();
		subQueues[2] = new LinkedList<Object>();
		subQueues[3] = new LinkedList<Object>();
		subQueues[4] = new LinkedList<Object>();
		subQueues[5] = new LinkedList<Object>();
		subQueues[6] = new LinkedList<Object>();
		subQueues[7] = new LinkedList<Object>();
		subQueues[8] = new LinkedList<Object>();
		subQueues[9] = new LinkedList<Object>();
		maxDigits = 0;
	}

//The addToMainQueue method checks the number of digits
//of the positive integer parameter "num", and
//if it is larger than the current value in "maxDigits",
//updates its value to the number of digits of "num".
//The method also enqueues "num" to the main-queue.
	public void addToMainQueue(Integer num)
	{
		if(num > maxDigits)
			maxDigits = num;
		
		mainQueue.add(num);
		/**** COMPLETE THIS METHOD ****/

	}


//The listMaintQueue method returns a string containing
//the content of the main-queue
	public String listMainQueue()
	{
		return ("mainQueue = " + listQueue(mainQueue)+"\n");
	}


//The listSubQueues method returns a string containing
//the content of the sub-queues
	public String listSubQueues()
	{
		String result = "";

		for (int i=0; i<SIZE; i++)
		{
			result += "subQueue[" + i + "]:";
			result += listQueue(subQueues[i]);
			result += "\n";
		}
		return result;
	}


//The listQueue method returns a string containing
//the content of the parameter queue
	public String listQueue(LinkedList<Object> queue)
	{
		LinkedList<Object> temp = new LinkedList<Object>();
		String result = "{ ";

		//Removing each element from the queue
		//and appending to the string to be returned
		while (!queue.isEmpty())
		{
			Object removed = queue.remove();
			result += removed + " ";
			temp.offer(removed);
		}
		result += "}\n";

		//Copying the temporary queue back to the
		//original queue
		while (!temp.isEmpty())
		{
			Object removed2 = temp.remove();
			queue.offer(removed2);
		}
		return result;
	}


//The sortNumbers method sorts numbers in the main queue.
	public void sortNumbers()
	{


		/**** COMPLETE THIS PART ****/


		/*** DO NOT DELETE THE LINE BELOW (if deleted, you won't pass test cases) ***/
		System.out.print(listSubQueues());  //Step 5

		/**** COMPLETE THIS PART ****/

		/*** DO NOT DELETE THE LINE BELOW (if deleted, you won't pass test cases) ***/
		System.out.print(listMainQueue());  //Step 9


/***********************************************************
2.  In the sortNumbers( ) method, remove a number from the mainQueue and extract its right most digit (every number in the queue will be a positive integer) This digit will be called "digit".

3.  Enqueue the number mentioned in (2) to the SubQueue[digit].

4.  Repeat above step (2) and step (3) until mainQueue becomes empty. Note that the step (2) needs to be repeated for the 2nd from the right most digit for the second time. Thus, the step (2) can be re-written as: "remove a number from the mainQueue and extract its i-th right most digit where i starts with 1 and is incremented every iteration of the loop".

5.  Print the subQueues (This code is already in the sortNumbers( ) method)

6.  Remove (dequeue) the first element from the subQueues[0] and insert (enqueue) it into the mainQueue.

7.  Repeat step (6) until the subQueues[0] is empty.

8.  Do similar operation for the steps 6-7 on subQueues[i], where i takes value from 1 to 9.

9.  Print the mainQueue (This code is already in the sortNumbers( ) method)

10. Repeat the procedure starting from step (2) maxDigits times where the value of maxDigits is equal to the number of digits in the largest number of the sequence.
*************************************************************/


	}
}
