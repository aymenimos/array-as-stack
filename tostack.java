public class tostack {

    private int size = 5;
    private int[] arr;
    private int top;
   private int maxtop;

    public void CreatStack() {
        top = -1;
       maxtop = size - 1;
        arr = new int[size];
    }

    public void push(int number) {
        if (isfull()) {
            System.out.println("the stack is full");

        } else {

            top++;
            arr[top] = number;

        }
    }

    public double pop() {
        if (isempty()) {
            System.out.println("the stack is empty from pop method");
        } else {

            // double store= arr[top];
            // top--;
            // System.out.println("the top element is: " + store );

        }
        return arr[top--];
    }

    public boolean isfull() {

        return top == maxtop - 1;
    }

    private boolean isempty() {
        return top == -1;

    }

    public void top() {

        if (isempty()) {
            System.out.println("the stack is empty from top method");
        } else {
            System.out.println(arr[top] + " from top method");
        }

    }

    public void popuntilempty() {
        while (isempty() == false) {
            System.out.println(arr[top]);
            top--;
        }

    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }

}
