package br.com.gsstrozi.jclipboard.interaction;

import javafx.scene.control.ListView;

public class ListViewInteractions {

	public static String getSelectionItemValue(ListView<String> viewItens) {
		return viewItens.getSelectionModel().getSelectedItem();
	}
}
