package br.unitins.exemplo1.application;

	import javafx.application.Application;
	import javafx.stage.Stage;
//classe esqueleto 
	public class Esqueleto extends Application{
//metodo que starta aplicacao e printa start
		@Override
		public void start(Stage primaryStage) throws Exception {
			System.out.println("Start");
			primaryStage.show();
		}

		//metodo que ... e printa init
		@Override
		public void init() throws Exception {
			// TODO Auto-generated method stub
			super.init();
			System.out.println("Init");
		}
		//metodo que para e printa stop
		@Override
		public void stop() throws Exception {
			// TODO Auto-generated method stub
			super.stop();
			System.out.println("Stop");
		}
		//metodo principal chama o lançador e printa mensagem main
		public static void main(String[] args) {
			System.out.println("main");
			launch(args);
		}
	}


