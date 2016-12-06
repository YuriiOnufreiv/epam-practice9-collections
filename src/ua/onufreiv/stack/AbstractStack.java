package ua.onufreiv.stack;

/**
 * Created by yurii on 12/2/16.
 */
public interface AbstractStack<T> {
    boolean push(T element);

    T pop();

    T peek();

    boolean isEmpty();

    int size();
}
