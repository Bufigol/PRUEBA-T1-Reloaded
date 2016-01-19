package application;

import java.io.File;
import java.io.IOException;

import view.Controlador_OneStage;
import view.Controlador_root_layout;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	private Stage OneStage;
	private Stage OtherStage;
	private BorderPane rootLayout;

	@Override
	public void start(Stage primaryStage) {
		try {
			this.OneStage = primaryStage;
			this.OneStage.setTitle("My Reload");
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
			loader.setLocation(Main.class
					.getResource("../view/root_layot.fxml"));
			rootLayout =  loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout);
			OneStage.setScene(scene);

			// Give the controller access to the main app.
			Controlador_root_layout controller = loader.getController();
			controller.setMainApp(this);

			OneStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void showOneStage() {
		try {

			// Load person overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("../view/OneStage.fxml"));
			AnchorPane OneStage = (AnchorPane) loader.load();
			// personOverview.getStylesheets().add("");

			// Set person overview into the center of root layout.
			rootLayout.setCenter(OneStage);

			// Give the controller access to the main app.
			Controlador_OneStage controller = loader.getController();
			controller.setMain(this);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void showOtherStage() {
		try {

			// Load person overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class
					.getResource("../view/OtherStage.fxml"));
			AnchorPane OneStage = loader.load();
			// personOverview.getStylesheets().add("");

			// Set person overview into the center of root layout.
			rootLayout.setCenter(OneStage);

			// Give the controller access to the main app.
			Controlador_OneStage controller = loader.getController();
			controller.setMain(this);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	public Stage getOneStage() {
		return OneStage;
	}

	public void setOneStage(Stage oneStage) {
		OneStage = oneStage;
	}

	public Stage getOtherStage() {
		return OtherStage;
	}

	public void setOtherStage(Stage otherStage) {
		OtherStage = otherStage;
	}

	public BorderPane getRootLayout() {
		return rootLayout;
	}

	public void setRootLayout(BorderPane rootLayout) {
		this.rootLayout = rootLayout;
	}

}
