package br.com.gsstrozi.jclipboard.listener;

import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

import br.com.gsstrozi.jclipboard.components.ListViewComponent;
import br.com.gsstrozi.jclipboard.interaction.ClipboardInteractions;
import javafx.application.Platform;
import javafx.scene.input.Clipboard;
import javafx.stage.Stage;

public class NativeGlobalKeyListener implements NativeKeyListener {

	private Stage stage;

	private boolean keyCTRL = false, keyC = false;

	public NativeGlobalKeyListener(Stage stage) {
		super();
		this.stage = stage;
	}

	@Override
	public void nativeKeyPressed(NativeKeyEvent e) {
		Platform.runLater(() -> {
			if (e.getKeyCode() == NativeKeyEvent.VC_F9) {
				ListViewComponent.update();
				stage.setIconified(false);
				
			} else if (e.getKeyCode() == NativeKeyEvent.VC_CONTROL_L) {
				keyCTRL = true;
				if (keyC) {
					upadeClipboard();
				}
			} else if (e.getKeyCode() == NativeKeyEvent.VC_C) {
				keyC = true;
				if (keyCTRL) {
					upadeClipboard();
				}
			}
		});
	}

	private void upadeClipboard() {
		ClipboardInteractions.updateClipboardStack(Clipboard.getSystemClipboard().getString());
	}

	@Override
	public void nativeKeyReleased(NativeKeyEvent e) {
		if (e.getKeyCode() == NativeKeyEvent.VC_CONTROL_L) {

		} else if (e.getKeyCode() == NativeKeyEvent.VC_CONTROL_L) {
			keyCTRL = false;
		} else if (e.getKeyCode() == NativeKeyEvent.VC_C) {
			keyC = false;
		}
	}

	@Override
	public void nativeKeyTyped(NativeKeyEvent e) {
	}
}
