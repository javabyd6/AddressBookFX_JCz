package pl.sda.addressbook;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.sda.addressbook.controller.RootViewController;
import pl.sda.addressbook.model.Person;

public class Main extends Application {

    private ObservableList<Person> personList = FXCollections.observableArrayList();

    public Main() {
        personList.add(new Person("Jan", "Kowalski", "adres", "123", "87-100", "Bdg"));
        personList.add(new Person("Jan", "Kowalski", "adres", "123", "87-100", "Bdg"));
    }

    public ObservableList<Person> getPersonList(){
        return personList;
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/root.fxml"));
        loader.load();

        Parent root = loader.getRoot();
        RootViewController rootViewController = loader.getController();
        rootViewController.setMain(this);
        rootViewController.loadPerson();

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
