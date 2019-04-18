package br.com.gsstrozi.jclipboard.components;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ClipboardPanel {
	public GridPane render(Stage stage) {
		VBox seasonSelection = new VBox();

		seasonSelection.getChildren().addAll(ButtonHistory.render(stage), TextFieldSearch.render(stage), ListViewItens.render(stage));

		GridPane pane = new GridPane();
		pane.setHgap(10);
		pane.setVgap(5);
		pane.addColumn(0, seasonSelection);

		return pane;
	}
}
