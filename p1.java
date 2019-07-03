/*
  Federico Rubino
  frubino
  federico.rubino8@gmail.com
  p1 class
  Assignment #1
  working/ tested
*/

import java.util.Scanner;

//class with main
//utelizes List, LinkNode and Stack class
public class p1{

    public static void main(String args[]){
	Stack myStack = new Stack();
	Scanner input = new Scanner(System.in);
	String tempString;
	while(input.hasNext()){
	    tempString = input.nextLine();
	    myStack.push(tempString);
	    //	    myStack.print(); //testing purposes
	}
	while(!myStack.isEmpty()){
	    System.out.println(myStack.pop());
	}
    }//main
}//class

