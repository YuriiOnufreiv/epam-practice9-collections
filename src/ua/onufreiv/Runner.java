package ua.onufreiv;

import ua.onufreiv.stack.Stack;
import ua.onufreiv.stack.StackMin;

import java.util.Random;

/**
 * Created by yurii on 12/2/16.
 */
public class Runner {
    public static void main(String[] args) {
        Stack<Integer> stack = new StackMin<>(4);
        stack.pop();
        stack.peek();
        System.out.println(stack);
        stack.push(9);
        System.out.println(stack);
        stack.push(5);
        System.out.println(stack);
        stack.push(3);
        System.out.println(stack);
        stack.push(4);
        System.out.println(stack);
        stack.push(4);
        System.out.println(stack);
        stack.push(4);
        System.out.println(stack);
        stack.peek();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
