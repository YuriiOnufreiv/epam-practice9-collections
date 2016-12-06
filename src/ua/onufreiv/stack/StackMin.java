package ua.onufreiv.stack;

/**
 * Created by yurii on 12/5/16.
 */
public class StackMin<T extends Comparable<T>> extends Stack<T> {
    private Stack<T> stackMin;

    public StackMin(int capacity) {
        super(capacity);
        stackMin = new Stack<T>(capacity);
    }

    @Override
    public boolean push(T element) {
        if (!super.push(element)) {
            return false;
        }
        if (stackMin.peek() == null || element.compareTo(stackMin.peek()) <= 0) {
            stackMin.push(element);
        }
        return true;
    }

    @Override
    public T pop() {
        T topElement = super.pop();
        if (topElement != null && topElement.compareTo(stackMin.peek()) == 0) {
            stackMin.pop();
        }
        return topElement;
    }

    @Override
    public String toString() {
        return super.toString() + ", min = " +
                (isEmpty() ? "null" : stackMin.peek().toString());
    }
}