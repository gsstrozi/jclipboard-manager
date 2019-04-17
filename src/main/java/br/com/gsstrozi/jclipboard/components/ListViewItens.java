package br.com.gsstrozi.jclipboard.components;

import java.util.List;

import br.com.gsstrozi.jclipboard.event.ViewItemEvent;
import br.com.gsstrozi.jclipboard.stack.ClipboardStack;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class ListViewItens {

	public ListView<String> render(Stage stage) {
		List<String> stack = ClipboardStack.load();
		
		ObservableList<String> observableList = FXCollections.observableArrayList(stack);
		ListView<String> viewItens = new ListView<String>(observableList);

		ViewItemEvent event = new ViewItemEvent(stage, viewItens);
		
		viewItens.setOnKeyPressed(event);
		
		viewItens.setOrientation(Orientation.VERTICAL);
		viewItens.setPrefSize(300, 250);
		return viewItens;
	}
}
