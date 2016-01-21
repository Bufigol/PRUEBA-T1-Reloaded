package view;

import javafx.stage.Stage;
import application.MyMain;

public class MyController {
	private MyMain mainApp;

	public void setMainApp(MyMain mainApp) {
		this.mainApp = mainApp;
	}

	public void cambiar_otherstage() {
		this.mainApp.mostrar_OtherStage();
	}

	public void cambiar_OneStage() {
		this.mainApp.mostrar_OneStage();
	}

	public MyMain getMainApp() {
		return mainApp;
	}
}
