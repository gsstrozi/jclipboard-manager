package br.com.gsstrozi.jclipboard.listener;

import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

import javafx.stage.Stage;

public class NativeGlobalKeyListener implements NativeKeyListener {
	
	private Stage stage;
	
	public NativeGlobalKeyListener(Stage stage) {
		super();
		this.stage = stage;
	}
	
	@Override
	public void nativeKeyPressed(NativeKeyEvent e) {
		if (e.getKeyCode() == NativeKeyEvent.VC_F9) {
			stage.show();
		}
	}
	
	@Override
	public void nativeKeyReleased(NativeKeyEvent e) {
		System.out.println("RELEASED -> " + e.getKeyCode());
	}

	@Override
	public void nativeKeyTyped(NativeKeyEvent e) {
		System.out.println("NATIVE KEY TYPED -> " + e.getKeyCode());
	}
}
