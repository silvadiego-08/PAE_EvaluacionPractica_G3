package uam.edu.ni.demo.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class RegistrarController {

    @FXML
    protected void registrar(ActionEvent event) {
        txt_nombre.getText();
        dp_fecha.getValue();
        tp_hora.getValue();
        cb_servicio.getValue();
        if ()

    }



    public void AlertaNull(){
        Alert alerta_null = new Alert(Alert.AlertType.ERROR);
        alerta_null.setTitle("Error");
        alerta_null.setHeaderText(null);
        alerta_null.setContentText("Por favor, complete todos los campos.");
        alerta_null.showAndWait();
    }
    public void AlertaNombre(){
        Alert alerta_nombre = new Alert(Alert.AlertType.ERROR);
        alerta_nombre.setTitle("Error");
        alerta_nombre.setHeaderText(null);
        alerta_nombre.setContentText("Ingrese un nombre válido.");
        alerta_nombre.showAndWait();
    }
    public void AlertaFecha(){
        Alert alerta_fecha = new Alert(Alert.AlertType.ERROR);
        alerta_fecha.setTitle("Error");
        alerta_fecha.setHeaderText(null);
        alerta_fecha.setContentText("Ingrese una fecha válida.");
        alerta_fecha.showAndWait();
    }
    public void AlertaHora(){
        Alert alerta_hora = new Alert(Alert.AlertType.ERROR);
        alerta_hora.setTitle("Error");
        alerta_hora.setHeaderText(null);
        alerta_hora.setContentText("Ingrese una hora válida.");
        alerta_hora.showAndWait();
    }
    public void AlertaServicio(){
        Alert alerta_servicio = new Alert(Alert.AlertType.ERROR);
        alerta_servicio.setTitle("Error");
        alerta_servicio.setHeaderText(null);
        alerta_servicio.setContentText("Ingrese un servicio válido.");
        alerta_servicio.showAndWait();
    }
}
