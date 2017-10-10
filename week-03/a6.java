// Assignment 6 source code

public class QueueTest
{
  public static void main (String [] args)
  {
    Queue q = new Queue();
    String lastName = "Beach";
    String firstName = "Landon";
    String major = "Computer Science";
    String className = "CSIS 2420";

    q.enqueue(lastName);
    q.enqueue(firstName);
    q.enqueue(major);
    q.enqueue(className);

    System.out.println("The front of the queue is " + q.peek());
  }
}


// Queue Class

public class Queue
{
  private List list;

  public Queue ()
  {
    list = new List("Default Queue");
  }

  public Queue (String name)
  {
    list = new List(name);
  }

  public void enqueue (Object obj)
  {
    list.insertAtBack(obj);
  }

  public Object dequeue ()
  {
    if (isEmpty())
    return null;
    return list.removeFromFront();
  }

  public boolean isEmpty ()
  {
    return list.isEmpty();
  }

  public Object peek ()
  {
    Object tempObj = list.removeFromFront();
    list.insertAtFront(tempObj);
    return tempObj;
  }
}
