package br.com.gsstrozi.jclipboard.stack;

import java.util.List;
import java.util.stream.Collectors;

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
    
    public static void update(String element) {
    	items.remove(element);

    	ObservableList<String> obsList = FXCollections.observableArrayList();
    	obsList.add(element);
    	
    	if (items.size() == 10) {
			items.remove(9);
		}
    	
    	obsList.addAll(items);
		
        items = obsList;
	}
    
    public static void filter(String strToFilter) {
    	List<String> filtList = items.stream().
    	         filter(value -> value.toUpperCase().
    	         contains(strToFilter)).
    	         collect(Collectors.toList());
    	
    	items.clear();
    	items.addAll(filtList);
    }
}
