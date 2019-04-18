package br.com.gsstrozi.jclipboard;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.gsstrozi.jclipboard.components.ClipboardPanel;
import br.com.gsstrozi.jclipboard.listener.NativeGlobalKeyListener;
import br.com.gsstrozi.jclipboard.stack.Stack;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

@SpringBootApplication
public class JclipboardApplication extends Application {

	public static void main(String[] args) {
		
		try {
			GlobalScreen.registerNativeHook();
		} catch (NativeHookException e) {
			e.printStackTrace();
		}
		
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Stack.load();
		
		ClipboardPanel pane = new ClipboardPanel();
		Scene scene = new Scene(pane.render(stage));
		stage.setScene(scene);
		stage.initStyle(StageStyle.UNDECORATED);
		stage.show();
		
		NativeGlobalKeyListener listener = new NativeGlobalKeyListener(stage);
		
		GlobalScreen.addNativeKeyListener(listener);
	}

}
