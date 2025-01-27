import java.util.Stack;

public class Stack1 {
   
    static void stack_push(Stack<Integer> stack,int ele)
    {
          stack.push(ele);
    }
    static void stack_pop(Stack<Integer> stack)
    {
        stack.pop();
    }
    static void stack_peek(Stack<Integer> stack)
    {
        System.out.println("TOP Element is: "+stack.peek());
    }
    static void stack_search(Stack<Integer> stack,int n)
    {
        int pos = stack.search(n);
        if(pos==-1)
        {
            System.out.println("Element is Not Found");
        }else
        {
            System.out.println("Element is Found  at Position: "+pos);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();

       stack_push(s1,1);
       stack_push(s1, 2);
       stack_push(s1, 4);
       stack_push(s1, 5);

       stack_pop(s1);

       stack_peek(s1);

       stack_search(s1, 1);
     
      for(int ele:s1)
      {
        System.out.print(ele+" ");
      }
    }
}
