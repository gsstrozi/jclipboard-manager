package br.com.gsstrozi.jclipboard.components;

import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TextFieldSearch {
	private static final String PROMP_TEXT_SEARCH = "Search here !";

	public static TextField render(Stage stage) {
		TextField searchTextField = new TextField();
		searchTextField.setPromptText(PROMP_TEXT_SEARCH);
        
		return searchTextField;
	}
}
