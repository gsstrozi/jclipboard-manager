package br.com.gsstrozi.jclipboard.components;

import br.com.gsstrozi.jclipboard.event.TextSearchEvent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SearchComponent {
	private final String PROMP_TEXT_SEARCH = "Search here !";

	public TextField render(Stage stage) {
		TextField searchTextField = new TextField();
		searchTextField.setPromptText(PROMP_TEXT_SEARCH);
		
		TextSearchEvent event = new TextSearchEvent();
		searchTextField.textProperty().addListener(event);
		
		return searchTextField;
	}
}
