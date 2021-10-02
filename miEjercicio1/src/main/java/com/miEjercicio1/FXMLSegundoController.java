package com.miEjercicio1;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
public class FXMLSegundoController {

	/*final String nom = "Pablo";
	final String pass = "1234";
	*/
	@FXML
	private Label lblMensaje;
	
	@FXML
	private void mostrarMensaje(ActionEvent event) {
		lblMensaje.setText("Bienvenido a la segunda ventana.");
	}
	
	
}
