package Lab8;
import java.util.Stack;
public class StackDemo {
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();
        stack.push("aaa");
        stack.push("bbb");
        stack.push("ccc");
        for(String sItem: stack)
            System.out.print(sItem + " - ");
        System.out.println();
        stack.pop();
        for (String sItem: stack)
            System.out.print(sItem + " - ");
        System.out.println();
    }
}
