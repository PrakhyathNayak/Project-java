import java.util.Scanner;
class Stack{
  int top;
  int stk[]=new int[10];
  Stack(){
    top=-1;}
  void push(int item){
    if(stk.length-1==top){
      System.out.println("Stack overflow");}
    else{
      top=top+1;
      stk[top]=item;}}
    void pop(){
      if(top==-1){
          System.out.println("stack underflow");}
      else{
        int item=stk[top];
        System.out.println("Item pooped is:"+item);
        top=top-1;}}
  void display(){
    if(top==-1){
        System.out.println("Stack is empty.No item to display");}
    else{
        System.out.println("Item in the stack are");
        for(int i=top;i>=0;i--){
            System.out.println(stk[i]);}}}}

public class P2{
  public static void main(String[] args){
      int ch;
      Stack stack1=new Stack();
      Scanner sc1=new Scanner(System.in);
      while(true){
          System.out.println("1:Push 2.Pop 3.Display 4.Exit");
          ch=sc1.nextInt();
          switch(ch){
              case 1:
                System.out.println("Enter the items to be pushed");
                int item=sc1.nextInt();
                stack1.push(item);
               break;
              case 2:
                  stack1.pop();
                  break;
              case 3:
                  stack1.display();
              case 4:
                  System.exit(0);
              default:
                  System.out.println("Enter the valid choice");
            }
        }
    }      
}      
          