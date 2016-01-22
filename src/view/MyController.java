package view;

import application.MyMain;

public class MyController {
	private MyMain mainApp;

	public void setMainApp(MyMain mainApp) {
		this.mainApp = mainApp;
	}

	/**
	 * Metodo con el objetivo de cambiar desde OneStage a OtherStage. 
	 * Es utilizado en el boton correspondiente a "Cambiar de escenario" existente en OneStage.
	 * 
	 * @author Felipe Vásquez Tort
	 * 
	 */
	public void cambiar_otherstage() {
		this.mainApp.mostrar_OtherStage();
	}
	/**
	 * Metodo con el objetivo de cambiar desde OtherStage a OneStage. 
	 * Es utilizado en el boton correspondiente a "Volver" existente en OtherStage.
	 * 
	 * @author Felipe Vásquez Tort
	 * 
	 */
	public void cambiar_OneStage() {
		this.mainApp.mostrar_OneStage();
	}

	public MyMain getMainApp() {
		return mainApp;
	}
}
