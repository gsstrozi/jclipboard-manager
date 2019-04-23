package br.com.gsstrozi.jclipboard.event;

import br.com.gsstrozi.jclipboard.components.ListViewComponent;
import br.com.gsstrozi.jclipboard.stack.Stack;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class TextSearchEvent implements ChangeListener<String> {

	@Override
	public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
		Stack.filter(newValue);
		updateComponente();
	}
	
	private void updateComponente() {
		ListViewComponent.update();
	}
}