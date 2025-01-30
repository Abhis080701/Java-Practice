@FunctionalInterface
 interface FunctionalInterface1 {
  int action(int x,int y);
    
}

public class FunInterface
{
    public static void main(String[] args) {
        FunctionalInterface1 add = (x,y)-> x+y;
        FunctionalInterface1 sub = (x,y)->x-y;

        System.out.println(add.action(3, 2));
        System.out.println(sub.action(4, 2));


    }
}
