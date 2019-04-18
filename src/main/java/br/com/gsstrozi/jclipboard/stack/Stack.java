package br.com.gsstrozi.jclipboard.stack;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Stack {

    public static ObservableList<String> items = FXCollections.observableArrayList();

    public static void load() {
    	items.add("1111");
    	items.add("2222");
    	items.add("3333");
    	items.add("4444");
    	items.add("5555");
    	items.add("6666");
    	items.add("7777");
    	items.add("8888");
    	items.add("9999");
    }
    
    public static void push(String el) {
    	Integer index = items.indexOf(el);

		if (index == -1) {
			items.add(el);
		} else {
			update(el);
		}
		
		show();
    }
    
    public static void update(String element) {
    	items.remove(element);

    	ObservableList<String> itemsToAdd = FXCollections.observableArrayList();
        itemsToAdd.add(element);
        itemsToAdd.addAll(items);
		
        items = itemsToAdd;
	}
    public static void show() {
    	System.out.println(items);
    }
}
