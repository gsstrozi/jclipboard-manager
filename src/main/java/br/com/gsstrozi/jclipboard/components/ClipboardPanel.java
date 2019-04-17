package br.com.gsstrozi.jclipboard.components;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ClipboardPanel {
	public GridPane render(Stage stage) {
		ListViewItens listViewItens = new ListViewItens();

		VBox seasonSelection = new VBox();
		seasonSelection.getChildren().addAll(listViewItens.render(stage));

		GridPane pane = new GridPane();
		pane.setHgap(10);
		pane.setVgap(5);
		pane.addColumn(0, seasonSelection);

		return pane;
	}
}
