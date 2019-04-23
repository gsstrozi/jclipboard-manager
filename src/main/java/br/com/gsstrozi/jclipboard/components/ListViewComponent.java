package br.com.gsstrozi.jclipboard.components;

import br.com.gsstrozi.jclipboard.event.ViewItemEvent;
import br.com.gsstrozi.jclipboard.stack.Stack;
import javafx.geometry.Orientation;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class ListViewComponent {

	public static ListView<String> viewItens = new ListView<String>(Stack.items);
	
	public ListView<String> render(Stage stage) {

		ViewItemEvent event = new ViewItemEvent(stage);
		
		viewItens.setOnKeyPressed(event);
		
		viewItens.setOrientation(Orientation.VERTICAL);
		viewItens.setPrefSize(300, 250);
		
		return viewItens;
	}
	
	public static void update() {
		viewItens.setItems(Stack.items);
		viewItens.refresh();
	}
}
