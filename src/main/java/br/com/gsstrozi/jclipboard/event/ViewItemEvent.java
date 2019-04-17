package br.com.gsstrozi.jclipboard.event;

import br.com.gsstrozi.jclipboard.interaction.ListViewInteractions;
import br.com.gsstrozi.jclipboard.stack.ClipboardStack;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.control.ListView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class ViewItemEvent implements EventHandler<KeyEvent>
{
  private Stage stage;
  private ListView<String> viewItens;
  
  public ViewItemEvent(Stage stage, ListView<String> viewItens)
  {
    this.stage = stage;
    this.viewItens = viewItens;
  }
  
  public void handle(KeyEvent event)
  {
    if (event.getCode() == KeyCode.ENTER) {
      String selectionValue = ListViewInteractions.getSelectionItemValue(viewItens);
      br.com.gsstrozi.jclipboard.interaction.ClipboardInteractions.writeTextToClipboard(selectionValue);
      
      event.consume();
      
      ObservableList<String> observableList = FXCollections.observableArrayList(ClipboardStack.load());
      viewItens.setItems(observableList);
      viewItens.refresh();
      
      stage.setIconified(true);
    }
  }
}