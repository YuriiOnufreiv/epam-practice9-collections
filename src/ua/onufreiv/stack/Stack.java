package ua.onufreiv.stack;

import java.util.Arrays;

/**
 * Created by yurii on 12/2/16.
 */
public class Stack<T extends Comparable<T>> implements AbstractStack<T> {
    private int capacity;
    private Object[] array;
    private int top;
    //private Stack<T> minStack;

    public Stack(int capacity) {
        this.capacity = capacity;
        array = new Object[capacity];
        top = 0;
    }

    @Override
    public boolean push(T element) {
        if (size() == capacity) {
            return false;
        }
        array[top++] = element;
        return true;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        return (T) array[--top];
    }

    @Override
    @SuppressWarnings("unchecked")
    public T peek() {
        if (!isEmpty()) {
            return (T) array[top - 1];
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public String toString() {
        return "STACK: " + "capacity = " + capacity + "; top element = " +
                (isEmpty() ? "null" : array[top - 1]) + ", " +
                (isEmpty() ? "[]" : Arrays.toString(Arrays.copyOfRange(array, 0, top)));
    }
}
