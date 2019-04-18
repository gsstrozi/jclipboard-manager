package br.com.gsstrozi.jclipboard.interaction;

import br.com.gsstrozi.jclipboard.components.ListViewItens;
import br.com.gsstrozi.jclipboard.stack.Stack;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

public class ClipboardInteractions {

	public static void writeTextToClipboard(String value) {
		final Clipboard clipboard = Clipboard.getSystemClipboard();
		final ClipboardContent content = new ClipboardContent();
		content.putString(value);
		clipboard.setContent(content);
		
		updateClipboardStack(value);
	}
	
	public static void updateClipboardStack(String value) {
		if (value != null) {
			Stack.push(value);	
			ListViewItens.update();
		}
	}
}
