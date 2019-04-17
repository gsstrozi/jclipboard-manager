package br.com.gsstrozi.jclipboard.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ClipboardStack {

	private static List<String> stack;

	public static List<String> load() {
		if (stack == null) {
			stack = new Stack<String>();
			dummyStack();
		}
		
		return stack;
	}

	public static void push(String element) {
		Integer index = stack.indexOf(element);

		if (index == -1) {
			stack.add(element);
		} else {
			update(element);
		}
	}

	public static void update(String element) {
		stack.remove(element);
		List<String> newStack = new ArrayList<String>();
		newStack.add(element);
		newStack.addAll(stack);
		stack = newStack;
	}
	
	private static void dummyStack() {
		stack.add("1111");
		stack.add("2222");
		stack.add("3333");
		stack.add("4444");
		stack.add("5555");
		stack.add("6666");
		stack.add("7777");
		stack.add("8888");
		stack.add("9999");
	}
}
