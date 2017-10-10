// Assignment 5 source code

public class myHashTable_Assignment
{
  public static void main (String[] args)
  {
    int key;
    int value;
    final int TABLE_SIZE = 199;
    List[] hashTable = new List[TABLE_SIZE];

    for (int i = 0; i < TABLE_SIZE; i++)
    {
      hashTable[i] = new List();
    }

    for (int i = 0; i < 100; i++)
    {
      value = (int) (Math.random() * 1000000);
      key = value % TABLE_SIZE;
      hashTable[key].insertAtFront(value);
    }

    for (int i = 0; i < TABLE_SIZE; i++)
    {
      System.out.println("Index " + i + " " + hashTable[i].print());
    }
  }
}
