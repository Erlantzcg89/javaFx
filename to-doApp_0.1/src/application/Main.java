package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

	private Pane root;

	private Label labelTitulo01, labelParaHacer, labelHaciendo, labelAcabado;
	private TextArea areaParaHacer;
	private TextArea areaHaciendo;
	private TextArea areaAcabado;
	private Button botonGuardar;

	@Override
	public void start(Stage stage01) {

		try {
			onInit();

			stage01.setTitle("  To-Do APP (\u00a9 Erlantz Caballero 2019)");
//			stage01.getIcons().add(new Image("/icono.png"));
			stage01.setScene(new Scene(root, 800, 400));
			stage01.setResizable(false);
			stage01.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void onInit() {
		root = new Pane();
		root.setMaxSize(800, 400);

		Archivo archivo = new Archivo();

		labelTitulo01 = new Label("To-Do APP. Aumenta tu productividad");
//		labelTitulo01.setMinSize(200, 225);
//		labelTitulo01.setMaxSize(200, 225);
		labelTitulo01.setTranslateX(300);
		labelTitulo01.setTranslateY(25);

		labelParaHacer = new Label("Para Hacer");
//		labelParaHacer.setMinSize(200, 225);
//		labelParaHacer.setMaxSize(200, 225);
		labelParaHacer.setTranslateX(120);
		labelParaHacer.setTranslateY(75);

		labelHaciendo = new Label("Haciendo");
//		labelHaciendo.setMinSize(200, 225);
//		labelHaciendo.setMaxSize(200, 225);
		labelHaciendo.setTranslateX(370);
		labelHaciendo.setTranslateY(75);

		labelAcabado = new Label("Acabado");
//		labelAcabado.setMinSize(200, 225);
//		labelAcabado.setMaxSize(200, 225);
		labelAcabado.setTranslateX(620);
		labelAcabado.setTranslateY(75);

		areaParaHacer = new TextArea();
		areaParaHacer.setMinSize(200, 225);
		areaParaHacer.setMaxSize(200, 225);
		areaParaHacer.setTranslateX(50);
		areaParaHacer.setTranslateY(100);
		areaParaHacer.setText(archivo.leer("paraHacer.txt"));

		areaHaciendo = new TextArea();
		areaHaciendo.setMinSize(200, 225);
		areaHaciendo.setMaxSize(200, 225);
		areaHaciendo.setTranslateX(300);
		areaHaciendo.setTranslateY(100);
		areaHaciendo.setText(archivo.leer("haciendo.txt"));

		areaAcabado = new TextArea();
		areaAcabado.setMinSize(200, 225);
		areaAcabado.setMaxSize(200, 225);
		areaAcabado.setTranslateX(550);
		areaAcabado.setTranslateY(100);
		areaAcabado.setText(archivo.leer("Acabado.txt"));

		botonGuardar = new Button("Guardar");
		botonGuardar.setMaxSize(150, 100);
		botonGuardar.setTranslateX(380);
		botonGuardar.setTranslateY(350);
		botonGuardar.setOnAction(event -> {
			archivo.sobreescribir(areaParaHacer.getText(), "paraHacer.txt");
			archivo.sobreescribir(areaHaciendo.getText(), "haciendo.txt");
			archivo.sobreescribir(areaAcabado.getText(), "acabado.txt");
		});

		root.getChildren().addAll(labelTitulo01, labelParaHacer, labelHaciendo, labelAcabado, areaParaHacer,
				areaHaciendo, areaAcabado, botonGuardar);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
