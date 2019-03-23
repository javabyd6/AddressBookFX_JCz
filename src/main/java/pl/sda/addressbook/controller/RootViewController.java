package pl.sda.addressbook.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import pl.sda.addressbook.Main;
import pl.sda.addressbook.model.Person;

import java.net.URL;
import java.util.ResourceBundle;


public class RootViewController implements Initializable {

    @FXML
    private TableView<Person> personTableView;
    @FXML
    private TableColumn<Person, String> nameCol;
    @FXML
    private TableColumn<Person, String> lastnameCol;

    @FXML
    private Label nameLabel;
    @FXML
    private Label lastnameLabel;
    @FXML
    private Label addressLabel;
    @FXML
    private Label postcodeLabel;
    @FXML
    private Label telephoneLabel;
    @FXML
    private Label cityLabel;

    @FXML
    private Button newButton;
    @FXML
    private Button editButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button saveButton;

    private Main main;

    private Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public void loadPerson(){
        System.out.println(getMain().getPersonList());
        personTableView.setItems(getMain().getPersonList());
        nameCol.setCellValueFactory(c -> c.getValue().nameProperty());
        lastnameCol.setCellValueFactory(c -> c.getValue().lastnameProperty());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        System.out.println(this.main.getPersonList());
    }
}
