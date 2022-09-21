package com.example.vaccinationmanagementsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;
import java.io.IOException;

public class VCMgmtApplication extends Application {

    public static VaccinationCentre headVC;

    @Override

    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(VCMgmtApplication.class.getResource("ApplicationView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        //create vcs(
//        Scanner input = new Scanner(System.in);
//        System.out.println("$enter name");
//        String VCName = input.nextLine();
//        VaccinationCentre vc = new VaccinationCentre();
//        vc.name = VCName;
//        addElementVC(vc);
        launch();
    }

    public static void addElementVC(VaccinationCentre vc) {
        vc.nextVC = headVC;
        headVC = vc;
    }

    public static void removeElementVC(int pos){
        if (headVC == null){
            return;
        }
        VaccinationCentre temp = headVC;

        for (int i = 0; temp !=null && i<pos-1; i++)
            temp = temp.nextVC;

        if (temp == null || temp.nextVC == null){
            return;
        }

        VaccinationCentre next = temp.nextVC.nextVC;
        temp.nextVC = next;
    }

//    public static String printList() {
//        String list = "";
//        VaccinationCentre current = headVC;
//        while (current != null) {
//            list = list + current + "\n";
//            current = current.nextVC;
//        }
//        return list;
//    }

}