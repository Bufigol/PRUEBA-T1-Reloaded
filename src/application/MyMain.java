package application;

import java.io.File;
import java.io.IOException;

import view.MyController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class MyMain extends Application {
	private Stage escenario;
	private AnchorPane layout;

	@Override
	public void start(Stage primaryStage) {
		try {
			this.escenario = primaryStage;
			this.escenario.setTitle("My Reload");
			initRootLayout();
			showOneStage();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void initRootLayout() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MyMain.class
					.getResource("../view/OneStage.fxml"));
			layout = loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(layout);
			escenario.setScene(scene);

			// Give the controller access to the main app.
			MyController controller = loader.getController();
			controller.setMainApp(this);

			escenario.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void showOneStage() {
		try {

			// Load person overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MyMain.class
					.getResource("../view/OneStage.fxml"));
			AnchorPane OneStage = (AnchorPane) loader.load();
			// personOverview.getStylesheets().add("");

			// Give the controller access to the main app.
			MyController controller = loader.getController();
			controller.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void mostrar_OtherStage() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MyMain.class
					.getResource("../view/OtherStage.fxml"));

			layout = loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(layout);
			escenario.setScene(scene);

			// Give the controller access to the main app.
			MyController controller = loader.getController();
			controller.setMainApp(this);

			escenario.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void mostrar_OneStage() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MyMain.class
					.getResource("../view/OneStage.fxml"));

			layout = loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(layout);
			escenario.setScene(scene);

			// Give the controller access to the main app.
			MyController controller = loader.getController();
			controller.setMainApp(this);

			escenario.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}

	public Stage getOneStage() {
		return escenario;
	}

	public void setOneStage(Stage oneStage) {
		escenario = oneStage;
	}

	public Stage getOtherStage() {
		return escenario;
	}

	public void setOtherStage(Stage otherStage) {
		escenario = otherStage;
	}

	public AnchorPane getRootLayout() {
		return layout;
	}

	public void setRootLayout(AnchorPane rootLayout) {
		this.layout = rootLayout;
	}

}
