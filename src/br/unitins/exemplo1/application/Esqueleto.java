package br.unitins.exemplo1.application;

	import javafx.application.Application;
	import javafx.stage.Stage;

	public class Esqueleto extends Application{

		@Override
		public void start(Stage primaryStage) throws Exception {
			System.out.println("Start");
			primaryStage.show();
		}

		@Override
		public void init() throws Exception {
			// TODO Auto-generated method stub
			super.init();
			System.out.println("Init");
		}
		
		@Override
		public void stop() throws Exception {
			// TODO Auto-generated method stub
			super.stop();
			System.out.println("Stop");
		}
		
		public static void main(String[] args) {
			System.out.println("main");
			launch(args);
		}
	}


