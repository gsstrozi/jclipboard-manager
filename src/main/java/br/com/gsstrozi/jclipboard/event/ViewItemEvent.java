package br.com.gsstrozi.jclipboard.event;

import br.com.gsstrozi.jclipboard.components.ListViewComponent;
import br.com.gsstrozi.jclipboard.interaction.ClipboardInteractions;
import br.com.gsstrozi.jclipboard.interaction.ListViewInteractions;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class ViewItemEvent implements EventHandler<KeyEvent> {
	private Stage stage;

	public ViewItemEvent(Stage stage) {
		this.stage = stage;
	}

	public void handle(KeyEvent event) {
		if (event.getCode() == KeyCode.ENTER) {
			String selectionValue = ListViewInteractions.getSelectionItemValue(ListViewComponent.viewItens);
			ClipboardInteractions.writeTextToClipboard(selectionValue);

			event.consume();

			updateComponent();

			stage.setIconified(true);
		}
	}

	private void updateComponent() {	
		ListViewComponent.update();
	}
}