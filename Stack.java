/*
  Federico Rubino
  frubino
  federico.rubino8@gmail.com
  Stack class
  Assignment #1
  working/ tested
*/

// Stack class that uses List class
public class Stack{
    List myList;

    //constructor
    public Stack(){
	myList = new List();
    }

    //checks if empty
    public boolean isEmpty(){
	return myList.isEmpty();
    }

    //pushes from front
    public void push(String data){
	myList.insertFront(data);
    }

    //pushes from the rear
    public void pushRear(String data){
	myList.insertRear(data);
    }

    //testing purposes
    public void print(){
	myList.print();
    }

    //pops the front node
    public String pop(){
	return myList.popFront();
    }

    //pops the rear node
    public String popRear(){
	return myList.popRear();
    }
}//end of class

