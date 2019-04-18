package br.com.gsstrozi.jclipboard.components;

import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ButtonHistory {
	private static final String HISTORY_BUTTON_LABEL = "Delete History";

	public static Button render(Stage stage) {
		Button historyButton = new Button();
		historyButton.setText(HISTORY_BUTTON_LABEL);
		historyButton.setMaxWidth(Double.MAX_VALUE);
		return historyButton;
	}
}
