/*
  Federico Rubino
  frubino
  federico.rubino8@gmail.com
  List class
  Assignment #1
  working/ tested
*/

//List class that uses a generic doubly link list
public class List{

    //LinkNodes for the List class
    private class LinkNode{
	private String data;
	private LinkNode next;
	private LinkNode prev;
    
	//Node constructor
	private LinkNode(){
	    next = prev = null;
	    data = "";
	}
	
	//Node constructor with data as parameter
	private LinkNode(String data){
	    next = prev = null;
	    this.data = data;
	}
    }//end of Node class

    private LinkNode front;
    private LinkNode rear;

    //List constructor
    public List(){
	front = rear = null;
    }

    //checks if List is empty
    public boolean isEmpty(){
	return front == null && rear == null;
    }

    //pushes a node into the front
    public void insertFront(String data){
	LinkNode temp = new LinkNode(data);
	if(isEmpty()){
	    front = rear = temp;
	    return;
	}
	front.prev = temp;
	temp.next = front;
	front = temp;
    }

    //inserts(pushes) from the rear
    public void insertRear(String data){
	LinkNode temp = new LinkNode(data);
	if(front == null){
	    front = rear = temp;
	    return;
	}
	rear.next = temp;
	temp.prev = rear;
	rear = temp;
    }

    //pops the front node
    public String popFront(){
	String temp;
	if(isEmpty()){ return null;}
	//
	temp = front.data;
	//
	if(front == rear){
	    front = rear = null;
	    return temp;
	}
	front.next.prev = null;
	front = front.next;
	return temp;
    }

    //pops the rear node
    public String popRear(){
	String temp;
	if(isEmpty()){ return null;}
	//
	temp = rear.data;
	//
	if(front == rear){
	    front = rear = null;
	    return temp;
	}
	rear.prev.next = null;
	rear = rear.prev;
	return temp;
    }

    //print method for testing purposes
    public void print(){
        LinkNode temp = front;
        while(temp != null){
            System.out.print(temp.data);
            System.out.print(" ");
            temp = temp.next;
        }
        System.out.println();
    }
}//end of List class

