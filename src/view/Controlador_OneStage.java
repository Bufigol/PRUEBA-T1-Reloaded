package view;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import application.Main;

public class Controlador_OneStage {
	private Main main;

	public void setMain(Main main) {
		this.main = main;
	}

	public void cambiar_stage() {
		main.showOtherStage();
	}

}
