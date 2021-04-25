package LinkedList;

public class LinkedList {

  private Node head;

  public void insert(int data) {

    Node tempNode = new Node();
    tempNode.setData(data);


    if (head == null) {
      head = tempNode;
    }
    else {
      Node pointerNode = head;
      while (pointerNode.getNextNode() != null) {
        pointerNode = pointerNode.getNextNode();
      }
      pointerNode.setNextNode(tempNode);
    }
  }

  public void printList() {
    System.out.println("Printing....");
    Node pointerNode = head;
    while(pointerNode != null) {
      System.out.println(pointerNode.getData());
      pointerNode = pointerNode.getNextNode();
    }
  }

}
