package application;

import java.io.IOException;

import view.MyController;
import javafx.application.Application;
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

			// Load person overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MyMain.class
					.getResource("../view/OneStage.fxml"));
			AnchorPane OneStage = (AnchorPane) loader.load();
			MyController controller = loader.getController();
			controller.setMainApp(this);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void initRootLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MyMain.class
					.getResource("../view/OneStage.fxml"));
			layout = loader.load();
			Scene scene = new Scene(layout);
			escenario.setScene(scene);
			MyController controller = loader.getController();
			controller.setMainApp(this);
			escenario.show();
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
			Scene scene = new Scene(layout);
			escenario.setScene(scene);
			MyController controller = loader.getController();
			controller.setMainApp(this);

			escenario.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void mostrar_OneStage() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MyMain.class
					.getResource("../view/OneStage.fxml"));

			layout = loader.load();
			Scene scene = new Scene(layout);
			escenario.setScene(scene);
			MyController controller = loader.getController();
			controller.setMainApp(this);

			escenario.show();
		} catch (IOException e) {
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
