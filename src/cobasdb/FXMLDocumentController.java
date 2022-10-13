/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package cobasdb;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author Yudi Tan
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TableView<ModelTable> table;
    @FXML
    private TableColumn<ModelTable,String> col_nama;
    @FXML
    private TableColumn<ModelTable,String> col_umur;
    @FXML
    private TableColumn<ModelTable,String> col_gender;
    
   ObservableList<ModelTable> oblist = FXCollections.observableArrayList();
    @FXML
    private Button btn_detailokta;
    @FXML
    private Button btn_detailhusrul;
    @FXML
    private Button btn_detaillucy;
    @FXML
    private Button btn_detailgun;
    @FXML
    private Button btn_detailsiti;
    @FXML
    private Button btn_detailviona;
    @FXML
    private Button btn_detailprima;
    @FXML
    private Button btn_detailcintia;
    @FXML
    private Button btn_detailusama;
    @FXML
    private Button btn_detailbunga;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       try {
            Connection con = DbConnector.getConnection();
            
            ResultSet rs;
            rs = con.createStatement().executeQuery("select * from dbperson");
            
            while (rs.next()){
                oblist.add(new ModelTable(rs.getString("Nama"),rs.getString("Umur"),rs.getString("Gender")));
                
            }
        } catch (SQLException ex ){
        }
       
       col_nama.setCellValueFactory(new PropertyValueFactory<>("nama"));
       col_umur.setCellValueFactory(new PropertyValueFactory<>("umur"));
       col_gender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        
        table.setItems(oblist);
    }    
    // List Data Orang
    //Okta
    //Husrul
    //Lucy
    //Guntama
    //Siti
    //Viona
    //Prima
    //Cintia
    //Usama
    //Bunga
     @FXML
        private void oktadetailButtonAction(ActionEvent event) throws IOException{
        Parent FXMLDocumentParent = FXMLLoader.load(getClass().getResource("Okta.fxml"));
        Scene FXMLDocumentScene = new Scene (FXMLDocumentParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(FXMLDocumentScene);
        window.show();
    }
        
        @FXML
        private void husruldetailButtonAction(ActionEvent event) throws IOException{
        Parent FXMLDocumentParent = FXMLLoader.load(getClass().getResource("Husrul.fxml"));
        Scene FXMLDocumentScene = new Scene (FXMLDocumentParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(FXMLDocumentScene);
        window.show();
    }
        
        @FXML
        private void lucydetailButtonAction(ActionEvent event) throws IOException{
        Parent FXMLDocumentParent = FXMLLoader.load(getClass().getResource("Lucy.fxml"));
        Scene FXMLDocumentScene = new Scene (FXMLDocumentParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(FXMLDocumentScene);
        window.show();
    }
        
        @FXML
        private void guntamadetailButtonAction(ActionEvent event) throws IOException{
        Parent FXMLDocumentParent = FXMLLoader.load(getClass().getResource("Guntama.fxml"));
        Scene FXMLDocumentScene = new Scene (FXMLDocumentParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(FXMLDocumentScene);
        window.show();
    }
        
        @FXML
        private void sitidetailButtonAction(ActionEvent event) throws IOException{
        Parent FXMLDocumentParent = FXMLLoader.load(getClass().getResource("Siti.fxml"));
        Scene FXMLDocumentScene = new Scene (FXMLDocumentParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(FXMLDocumentScene);
        window.show();
    }
        
        @FXML
        private void vionadetailButtonAction(ActionEvent event) throws IOException{
        Parent FXMLDocumentParent = FXMLLoader.load(getClass().getResource("Viona.fxml"));
        Scene FXMLDocumentScene = new Scene (FXMLDocumentParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(FXMLDocumentScene);
        window.show();
    }
        
        @FXML
        private void primadetailButtonAction(ActionEvent event) throws IOException{
        Parent FXMLDocumentParent = FXMLLoader.load(getClass().getResource("Prima.fxml"));
        Scene FXMLDocumentScene = new Scene (FXMLDocumentParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(FXMLDocumentScene);
        window.show();
    }
        
        @FXML
        private void cintiadetailButtonAction(ActionEvent event) throws IOException{
        Parent FXMLDocumentParent = FXMLLoader.load(getClass().getResource("Cintia.fxml"));
        Scene FXMLDocumentScene = new Scene (FXMLDocumentParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(FXMLDocumentScene);
        window.show();
    }
        
        @FXML
        private void usamadetailButtonAction(ActionEvent event) throws IOException{
        Parent FXMLDocumentParent = FXMLLoader.load(getClass().getResource("Usama.fxml"));
        Scene FXMLDocumentScene = new Scene (FXMLDocumentParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(FXMLDocumentScene);
        window.show();
    }
        
        @FXML
        private void bungadetailButtonAction(ActionEvent event) throws IOException{
        Parent FXMLDocumentParent = FXMLLoader.load(getClass().getResource("Bunga.fxml"));
        Scene FXMLDocumentScene = new Scene (FXMLDocumentParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(FXMLDocumentScene);
        window.show();
    }

    @FXML
    private void oktadetailButtonAction(MouseEvent event) {
    }
}
