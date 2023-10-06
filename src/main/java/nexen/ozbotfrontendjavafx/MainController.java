package nexen.ozbotfrontendjavafx;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static nexen.ozbotfrontendjavafx.Main.loadFXML;
public class MainController {
    @FXML
    public Stage ConnectDialog;
    java.util.Properties props = new java.util.Properties();
    
    public MainController () throws IOException
    {
        
    
    
    }
  
    @FXML
    private void exit()
    {
     
        System.exit(0);
    }
    @FXML
    private void openConnectDialog() throws IOException
    {
    //.props.setProperty("botname", "OzBot");
      Stage connectDialog = new Stage();
      //Scene scene = new Scene(loadFXML("ConnectDialog"), 260, 320);
      Scene scene = new Scene(loadFXML("ConnectDialog"));
      connectDialog.setScene(scene);
      connectDialog.show();
      
    
    }
    
    
}
