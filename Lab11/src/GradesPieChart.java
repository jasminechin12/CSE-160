import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.Group;

public class GradesPieChart extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		Scene scene = new Scene(new Group());
		primaryStage.setTitle("Grades");
		primaryStage.setWidth(500);
		primaryStage.setHeight(450);
		
		ObservableList<PieChart.Data> pieChartData =
				FXCollections.observableArrayList(
						new PieChart.Data("Projects", 20),
						new PieChart.Data("Quizzes", 10),
						new PieChart.Data("Midterm Exams", 30),
						new PieChart.Data("Final exam", 40)
						);
		
		final PieChart chart = new PieChart(pieChartData);
		chart.setLegendVisible(false);
		chart.setTitle("Grading Schema");
		
		((Group)scene.getRoot()).getChildren().add(chart);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		applyCustomColorSequence(pieChartData, "red", "blue", "green", "orange");
	}
	
	private void applyCustomColorSequence(ObservableList<PieChart.Data> pieChartData1, String... pieColors) {
		int i = 0;
		for (PieChart.Data data: pieChartData1) {
			data.getNode().setStyle("-fx-pie-color: " + pieColors[i % pieColors.length] + ";");
			i++;
		}
	}

	public static void main(String[] args) {
		launch(args);

	}

}
