package view;

import javafx.fxml.FXML;
import application.Main;

public class Controlador_root_layout {
	private Main main;

	public void setMainApp(Main main) {
		this.main = main;
	}

	@FXML
	private void handleExit() {
		System.exit(0);
	}
}
