/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 *
 * @author 02977022201
 */
public class Aula2_8Controller implements Initializable {
    
    @FXML
    private TextField txtNum1, txtNum2, txtResult;
    
    @FXML
    private Button btnCalc;
    @FXML
    private Label lblNum1;
    @FXML
    private Label lblNum2;
    @FXML
    private Label lblResult;
    
    @FXML
    private void soma(ActionEvent a ){
        Double num1= Double.parseDouble(txtNum1.getText());
        Double num2= Double.parseDouble(txtNum2.getText());
        Double result= num1+num2;
        
      
        txtResult.setText(result.toString());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void abrirCadastroAluno(ActionEvent event) {

try{
    FXMLLoader fxmlLoader = new FXMLLoader();
    fxmlLoader.setLocation(getClass().getResource("aluno.fxml"));
    Scene scene = new Scene(fxmlLoader.load(),900,682);
    Stage stage = new Stage();
    stage.setTitle("Cadastrar Aluno");
    stage.setScene(scene);
    stage.show();
}
catch(IOException e){

}
    }

    @FXML
    private void fecharProjeto(ActionEvent event) {
    }
    
}
