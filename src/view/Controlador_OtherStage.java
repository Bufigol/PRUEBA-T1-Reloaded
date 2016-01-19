package view;


import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import application.Main;

public class Controlador_OtherStage {

	private Main main;

	public void setMain(Main main) {
		this.main = main;
	}

	public void mostrar_OneStage() {
		this.main.showOneStage();
	}

}
