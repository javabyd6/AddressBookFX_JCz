package pl.sda.addressbook.controller;
import  javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import pl.sda.addressbook.Main;
import pl.sda.addressbook.model.Person;

/**
 * @author Jarek Czaplicki
 */
public class NowaOsobaController {
//
    private Main main;
//
//    public NowaOsobaController(Main main) {
//        this.main = main;
//    }
//
    public Main getMain() {
        return main;
    }
//
    public void setMain(Main main) {
        this.main = main;
    }

    //1 textfield
    @FXML
    TextField imieTextFild;

    @FXML
    TextField nazwiskoTextFild;

    @FXML
    TextField ulicaTextFild;

    @FXML
    TextField miastoTextFild;

    @FXML
    TextField kodPocztowyTextFild;

    @FXML
    TextField numerTelefonuTextFild;

    @FXML
    Button saveButton;

    @FXML
    Button cancelButton;


    public void createNewPerson() {
        Person newPerson = new Person(imieTextFild.getText(), nazwiskoTextFild.getText(),
                ulicaTextFild.getText(), numerTelefonuTextFild.getText(), kodPocztowyTextFild.getText(),
                miastoTextFild.getText());

        System.out.println(newPerson);
        getMain().getPersonList().add(newPerson);
        clearNewPerson();

    }
//    public void addPerson(){
//        getMain().getPersonList().add(new Person())
//    }

    public void clearNewPerson(){
        imieTextFild.clear();
        nazwiskoTextFild.clear();
        ulicaTextFild.clear();
        imieTextFild.clear();
        numerTelefonuTextFild.clear();
        kodPocztowyTextFild.clear();
        miastoTextFild.clear();
    }
}
