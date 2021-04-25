package LinkedList;

public class Node {

  private int data;

  private Node nextNode;

  public Node(final int data, final Node nextNode) {
    this.data = data;
    this.nextNode = nextNode;
  }

  public Node() {
    // empty
  }

  public int getData() {
    return data;
  }

  public void setData(final int data) {
    this.data = data;
  }

  public Node getNextNode() {
    return nextNode;
  }

  public void setNextNode(final Node nextNode) {
    this.nextNode = nextNode;
  }
}
