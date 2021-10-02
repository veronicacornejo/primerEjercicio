package com.miEjercicio1;
/*
Put header here


 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FXMLController implements Initializable {
	
	final String nom = "Pablo";
	final String pass = "1234";
	@FXML
    private TextField txtUsuario;
    
    @FXML
    private TextField txtPasss;
    
    @FXML
    private Label lblVerificacion;
    
    @FXML
    private void btnClickAction(ActionEvent event) {
    	
    	String user = txtUsuario.getText();
    	String pas = txtPasss.getText();
    	if((user.equals(nom)) && (pas.equals(pass))) {
    		abrirVentana(event);
    	}else if((user.equals(nom) == false) && (pas.equals(pass) == true)){
    		lblVerificacion.setText("Usuario incorrecto.");
    	}else if((user.equals(nom) == true) && (pas.equals(pass) == false)){
    		lblVerificacion.setText("Password incorrecto.");
    	}else {
    		lblVerificacion.setText("Usuario y password son incorrectos!");
    	}
    		
    	
    }
    
    @FXML
    private void abrirVentana(ActionEvent event) {
    	try {
    		Stage escenario = new Stage();
			Scene escena = new Scene(loadFXML("primary"));//Crear el archivo
			escenario.setScene(escena);
			escenario.setTitle("Segunda ventana");
			escenario.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("/fxml/"+fxml + ".fxml"));
        return fxmlLoader.load();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
