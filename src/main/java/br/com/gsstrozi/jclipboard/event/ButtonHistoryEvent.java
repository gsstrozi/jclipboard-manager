package br.com.gsstrozi.jclipboard.event;

import br.com.gsstrozi.jclipboard.components.ListViewComponent;
import br.com.gsstrozi.jclipboard.stack.Stack;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ButtonHistoryEvent implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent event) {
		Stack.items.clear();
		updateComponent();
	}

	private void updateComponent() {		
		ListViewComponent.update();
	}

}