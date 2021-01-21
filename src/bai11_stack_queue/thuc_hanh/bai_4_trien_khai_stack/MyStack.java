package bai11_stack_queue.thuc_hanh.bai_4_trien_khai_stack;

public class MyStack {
    private int arr[];
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }
    public void push(int element){
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }

    public boolean isEmpty() {
        return true;
    }

    public int size() {
        return index;
    }
    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }
}
