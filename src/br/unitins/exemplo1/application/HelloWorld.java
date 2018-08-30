package br.unitins.exemplo1.application;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
//import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import view.LoginView;

public class HelloWorld extends Application implements EventHandler<ActionEvent> {

	public static void main(String[] args) {
		launch(args);// executa o programa

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		// criando um layout raiz (root) e adiciona un noh
		StackPane root = new StackPane();
		LoginView login = new LoginView();

		// classe
		login.buttonLogin.setOnAction(this);

		// classe anonima
		login.buttonCancelar.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Botão Cancelar");
			}

		});

		root.getChildren().add(login);

		// cria uma cena recebendo como parametros: Layout(root),
		// largura e altura
		Scene scene = new Scene(root, 400, 400);

		primaryStage.setTitle("Olá Mundo");
		primaryStage.setScene(scene);// adiciona a cena ao stage e mostra a aplicacao
		primaryStage.show();

		/*
		 * VBox vbox = new VBox(); vbox.getChildren().addAll(Arrays.asList(LabelTitulo,
		 * labelUsuario, tfUsuario, labelSenha, tfSenha));
		 * 
		 * // Vbox
		 * 
		 * VBox vbox = new VBox(); vbox.setAlignment(Pos.CENTER); vbox.setSpacing(10);
		 * vbox.getChildren().add(labelTitulo); vbox.getChildren().add(labelUsuario);
		 * vbox.getChildren().add(tfUsuario); vbox.getChildren().add(labelSenha);
		 * vbox.getChildren().add(tfSenha); vbox.getChildren().add(hbox);
		 */
	}

	@Override
	public void handle(ActionEvent event) {
		System.out.println("Ação do botão login.");
	}

}
