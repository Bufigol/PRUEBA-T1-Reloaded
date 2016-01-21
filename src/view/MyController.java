package view;

import javafx.fxml.FXML;
import application.MyMain;

public class MyController {
	private MyMain main;

	public void setMainApp(MyMain main) {
		this.main = main;
	}

	@FXML
	private void handleExit() {
		System.exit(0);
	}
}
