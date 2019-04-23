package br.com.gsstrozi.jclipboard.components;

import br.com.gsstrozi.jclipboard.event.ButtonHistoryEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HistoryComponent {
	private final String HISTORY_BUTTON_LABEL = "Delete History";

	public Button render(Stage stage) {
		Button historyButton = new Button();
		historyButton.setText(HISTORY_BUTTON_LABEL);
		historyButton.setMaxWidth(Double.MAX_VALUE);
		
		ButtonHistoryEvent event = new ButtonHistoryEvent();
		historyButton.setOnAction(event);
		
		return historyButton;
	}
}
