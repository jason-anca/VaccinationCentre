package com.example.vaccinationmanagementsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class AppController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField VCPhone;

    @FXML
    private TextField Parking;

    @FXML
    private TextField VCAddress;

    @FXML
    private TextField VCName;

    @FXML
    private TextField Eircode;

    @FXML
    private ListView<String> list;

    @FXML
    private Button add, delete, update;

    @FXML
    protected void addVCList() {

        // welcomeText.setText("Welcome to JavaFX Application!");
        //list vcs
        VaccinationCentre temp = VCMgmtApplication.headVC;
        while (temp != null) {
            System.out.println(temp.name);
            temp = temp.nextVC;
        }


        //todo Add text boxes for adding eircode, parking spaces etc //DONE
        //todo ParseInt parking space. Change int to string //DONE
        //todo Add remove and delete function for the linked list. https://moodle.wit.ie/pluginfile.php/5759637/mod_resource/content/0/Lists%20and%20List%20Processing.pdf
    }


    @FXML
    public void addVC(ActionEvent actionEvent) {
        VaccinationCentre vc = new VaccinationCentre();
        vc.name = VCName.getText();
        vc.eircode = Eircode.getText();
        vc.phone = VCPhone.getText();
        String parkingString = Parking.getText();           //Assigns a string(parkingString) to text input in textfield
        vc.parkingSpaces = Integer.parseInt(parkingString); //Int is parsed. All characters in the string must be a digit.
        vc.address = VCAddress.getText();

        VCMgmtApplication.addElementVC(vc);
        populateList();

        // list.getItems().add(text.getText());

    }

    @FXML
    public void deleteVC(ActionEvent actionEvent){
        VCMgmtApplication.removeElementVC(list.getSelectionModel().getSelectedIndex());
        populateList();
    }

    @FXML
    public void updateVC(ActionEvent actionEvent){

    }

    public void populateList() {
        list.getItems().clear();
        //Assigns the VaccinationCentre class to temp variable.
        //Runs while temp is not null(Gone past the last item in the list)
        //Temp points to next element in list. Moves temp to be the next element.
        for(VaccinationCentre temp = VCMgmtApplication.headVC; temp != null ; temp = temp.nextVC){
            list.getItems().add(temp.getName() + ", " + temp.getEircode() + ", " + temp.getPhone() + ", " + temp.getAddress() + ", " + temp.getParkingSpaces());
        }

    }

    public void addBooth(ActionEvent actionEvent) {
//        Booth booth = new Booth();
//        booth.name = text.getText();
//        VaccinationCentre.addElementBooth(booth);
//        populateList();

        // list.getItems().add(text.getText());

    }
}