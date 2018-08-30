package view;

import java.util.Arrays;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class LoginView extends VBox {

	private Label labelTitulo = new Label("** SIGN IN **"); // criando no
	private Label labelUsuario = new Label("Usuário:");
	private Label labelSenha = new Label("Senha:");

	private TextField tfUsuario = new TextField();
	private TextField tfSenha = new TextField();

	public Button buttonLogin = new Button("Entrar");
	public Button buttonCancelar = new Button("Cancelar");

	public LoginView() {

		// alinha a esquerda do conteudo label
		tfUsuario.setAlignment(Pos.CENTER);
		labelSenha.setAlignment(Pos.CENTER_LEFT);

		// alinhar o titulo ao centro
		labelTitulo.setAlignment(Pos.CENTER);

		// formata o tamanho em largura aos label
		labelTitulo.setMaxWidth(220);
		labelUsuario.setMaxWidth(220);
		labelSenha.setMaxWidth(220);
		tfUsuario.setMaxWidth(220);
		// mensagem dentro dotext
		tfUsuario.setPromptText("Informe o usuario aqui.");

		// alinhando o texto

		tfSenha.setMaxWidth(220);
		tfSenha.setPromptText("Digite sua senha aqui.");
		tfSenha.setAlignment(Pos.CENTER);

		// alterando o tamanho do botao

		buttonLogin.setPrefWidth(80);
		buttonCancelar.setPrefWidth(80);

		// Hbox
		HBox hbox = new HBox();
		hbox.getChildren().add(buttonLogin);
		hbox.getChildren().add(buttonCancelar);
		hbox.setAlignment(Pos.CENTER);
		hbox.setSpacing(5);
		hbox.setPrefHeight(60);

		// Vbox
		this.setAlignment(Pos.CENTER);
		this.setSpacing(10);
		this.getChildren().addAll(Arrays.asList(labelTitulo, labelUsuario, tfUsuario, labelSenha, tfSenha, hbox));

	}

}
