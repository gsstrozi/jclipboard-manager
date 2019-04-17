package br.com.gsstrozi.jclipboard;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.gsstrozi.jclipboard.listener.NativeGlobalKeyListener;

@SpringBootApplication
public class JNatieHookApplication {

	public static void main(String[] args) throws NativeHookException {
		GlobalScreen.registerNativeHook();
		NativeGlobalKeyListener listener = new NativeGlobalKeyListener(null);
		
		GlobalScreen.addNativeKeyListener(listener);
	}
}
