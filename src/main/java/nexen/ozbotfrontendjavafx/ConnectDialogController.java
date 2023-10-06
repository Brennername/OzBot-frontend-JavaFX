/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nexen.ozbotfrontendjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author NeXeN
 */
public class ConnectDialogController {
    @FXML
    private TextField channelTextInput;
    @FXML
    private ListView channelListView;


    @FXML
    private void buttonCloseAction(ActionEvent evt)
    {
        System.out.println("buttonCloseAction");
        ((Stage) ((Node)evt.getSource()).getScene().getWindow()).close();
            
    }
    @FXML
    private void buttonConnectClicked(ActionEvent e)
    {
        System.out.println("buttonConnectClicked");
    }
    @FXML
    private void chanListButtonAddClicked(ActionEvent e)
    {
        System.out.println("chanlListButtonAddClicked");
        this.addItemToListView();
    }
    private void addItemToListView()
    {
        if (this.channelTextInput.getLength() == 0)
        {
        System.out.println("channelTextInput is empty!");    
        }
        else
        {
            if (this.channelTextInput.getText().startsWith("#"))
            {
                this.channelListView.getItems().add(this.channelTextInput.getText());
            }
            else
            {
            this.channelListView.getItems().add("#" + this.channelTextInput.getText());    
            }
        }
    }
    
    @FXML
    private void chanListButtonRemClicked(ActionEvent e)
    {
        System.out.println("chanListButtonRemClicked");
    }
}
