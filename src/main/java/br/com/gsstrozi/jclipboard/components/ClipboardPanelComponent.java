package br.com.gsstrozi.jclipboard.components;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ClipboardPanelComponent {
	public GridPane render(Stage stage) {

		HistoryComponent historyButton = new HistoryComponent();
//		SearchComponent searchFieldText = new SearchComponent();
		ListViewComponent listViewItens = new ListViewComponent();
		
		VBox seasonSelection = new VBox();
//		seasonSelection.getChildren().addAll(historyButton.render(stage), searchFieldText.render(stage), listViewItens.render(stage));
		seasonSelection.getChildren().addAll(historyButton.render(stage), listViewItens.render(stage));

		GridPane pane = new GridPane();
		pane.setHgap(10);
		pane.setVgap(5);
		pane.addColumn(0, seasonSelection);

		return pane;
	}
}
