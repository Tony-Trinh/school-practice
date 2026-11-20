package fall.pkg2026;
/**
   A class of bags whose entries are stored in a chain of linked nodes.
	The bag is never full.
*/

public class LinkedBag<T> implements BagInterface<T>{



	private class Node 
	{
		private T    data; // Entry in bag
		private Node next; // Link to next node
	
		private Node(T dataPortion)
		{
			this(dataPortion, null);	
		} // end constructor
		
		private Node(T dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;	
		} // end constructor
	} // end Node

	
	private Node firstNode;       // Reference to first node
	private int numberOfEntries;

	// Default constructor
	public LinkedBag() 
	{
            firstNode = null;
            numberOfEntries = 0;
		
		
	} // end default constructor
	
	@Override
	public int getCurrentSize() {
		// TODO Auto-generated method stub
		return numberOfEntries;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return numberOfEntries <= 0;
	}

	@Override
	public boolean add(T newEntry) {
		// TODO Auto-generated method stub
                Node newNode = new Node(newEntry);
                newNode.next = firstNode;
                firstNode = newNode;
                numberOfEntries++;
		return true;
	}

	@Override
	public T remove() {
		// TODO Auto-generated method stub
                if (isEmpty()) return null;
                T buff = firstNode.data;
                firstNode = firstNode.next;
                numberOfEntries--;
		return buff;
	}

 	// Locates a given entry within this bag.
	// Returns a reference to the node containing the entry, if located,
	// or null otherwise.
	private Node getReferenceTo(T anEntry)
	{
		Node currentNode; 
		
		for (currentNode = firstNode;currentNode != null; currentNode = currentNode.next)
		{
			if (anEntry==currentNode.data)
				return currentNode;
		} // end while
		return currentNode;
	} // end getReferenceTo

	@Override
	public boolean remove(T anEntry) {
		// TODO Auto-generated method stub
               
                Node TargetNode = getReferenceTo(anEntry);
                if (TargetNode != null)
                {
                    while (TargetNode != null)
                    {
                        TargetNode.data = firstNode.data;
                        firstNode = firstNode.next;
                        numberOfEntries--;
                        TargetNode = getReferenceTo(anEntry);
                    }                    
                    return true;
                    
                }
                return false;    
        }
    

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		firstNode = null;
                numberOfEntries = 0;
	}

	@Override
	public int getFrequencyOf(T anEntry) {
		// TODO Auto-generated method stub
                int count = 0;
                Node temp = firstNode;
                while (temp != null)
                {
                    if (temp.data.equals(anEntry))
                    {
                        count++;
                    }
                    temp = temp.next;
                }
		return count;
	}

	@Override
	public boolean contains(T anEntry) {
		// TODO Auto-generated method stub
		return getFrequencyOf(anEntry) > 0;
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
                Node temp = firstNode;
                T[] tmarray = (T[]) new Object[numberOfEntries];
                for (int i = 0; i < numberOfEntries; i++)
                {
                    tmarray[i] = temp.data;
                    temp = temp.next;
                }
		return tmarray;
	}
	
}
