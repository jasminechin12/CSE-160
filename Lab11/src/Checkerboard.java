import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;

public class Checkerboard extends Application {	
	@Override
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		
		int count = 0;
		int side = 100;
		for (int i = 0; i < 10; i++) {
			count++;
			for (int j = 0; j < 10; j++) {
				Rectangle rect = new Rectangle(side, side, side, side);
				if (count % 2 == 0) {
					rect.setFill(Color.WHITE);
				}
				pane.add(rect, j, i);
				count++;
			}
		}
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Checkerboard");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
