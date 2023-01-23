package interfprogcarte;

import java.util.Iterator;
import java.util.Stack;

public class ProgStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Ana");
        stack.push("are");
        stack.push("mere");
        stack.push("si");
        stack.push("pere");
        Iterator<String> it = stack.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        stack.pop();
        System.out.println("Tipareste cu tostring");
        System.out.println(stack);
        System.out.println("Tipareste cu iterator:");
        it = stack.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }

    }
}
