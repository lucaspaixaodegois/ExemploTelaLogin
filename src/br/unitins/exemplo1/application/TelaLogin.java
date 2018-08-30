package br.unitins.exemplo1.application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import view.LoginView;

public class TelaLogin extends Application implements EventHandler<ActionEvent>{

	@Override
	public void init() throws Exception {
		super.init();
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		LoginView login = new LoginView();
		login.buttonLogin.setOnAction(this);
		login.buttonCancelar.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("Botão cancelar");
			}
		});
		
		StackPane root = new StackPane();
		root.getChildren().add(login);
		Scene scene = new Scene(root, 400, 600);
		
		// Adiciona a cena no palco
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void handle(ActionEvent event) {
		System.out.println("Ação do botão entrar");		
	}
}
