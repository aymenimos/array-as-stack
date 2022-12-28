
public class Main {

    public static void main(String[] args) {
        tostack stack = new tostack();
        stack.CreatStack();

        stack.push(29);
        stack.push(14);
        stack.push(56);
        stack.push(29);
        stack.push(14);
        stack.push(56);
        stack.push(29);
        stack.push(14);
        stack.push(56);
    //    // stack.display();
    //     stack.top();
    //     System.out.println(stack.pop() + "  poped");
    //     stack.top();
    //     System.out.println(stack.pop() + " poped");
    //    // stack.top();
        stack.popuntilempty();
        stack.push(29);
        stack.push(14);
        stack.push(56);
        stack.push(29);
        stack.push(14);
        stack.push(56);
        stack.display();
     

    }

}