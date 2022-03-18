import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

public class IotHouse extends Application implements RoomsDoors {
  @Override
    public void start(Stage PrimaryStage){
      

      rectangleOne.setStyle("-fx-stroke-width:5; -fx-stroke:BLACK; -fx-fill:grey");
      rectangleTwo.setStyle("-fx-stroke-width:5; -fx-stroke:BLACK; -fx-fill:grey");
      rectangleThree.setStyle("-fx-stroke-width:5; -fx-stroke:BLACK; -fx-fill:grey");
      rectangleFour.setStyle("-fx-stroke-width:5; -fx-stroke:BLACK; -fx-fill:grey");
      rectangleFive.setStyle("-fx-stroke-width:5; -fx-stroke:BLACK; -fx-fill:grey");
      rectangleSix.setStyle("-fx-stroke-width:5; -fx-stroke:BLACK; -fx-fill:grey");
      rectangleSeven.setStyle("-fx-stroke-width:5; -fx-stroke:BLACK; -fx-fill:grey");

      button1.setOnAction(e -> {
        if(rectangleOne.getStyle().contains("GREY")||rectangleTwo.getStyle().contains("GREY")||
        rectangleThree.getStyle().contains("GREY")||rectangleFour.getStyle().contains("GREY")||
        rectangleFive.getStyle().contains("GREY")||rectangleSix.getStyle().contains("GREY")||
        rectangleSeven.getStyle().contains("GREY")){
          rectangleOne.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:YELLOW");
          rectangleTwo.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:GREEN");
          rectangleThree.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:ORANGE");
          rectangleFour.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:ORANGE");
          rectangleFive.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:YELLOW");
          rectangleSix.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:RED");
          rectangleSeven.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:YELLOW"); 
        }
        else{
        rectangleOne.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:GREY");
        rectangleTwo.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:GREY");
        rectangleThree.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:GREY");
        rectangleFour.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:GREY");
        rectangleFive.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:GREY");
        rectangleSix.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:GREY");
        rectangleSeven.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:GREY"); 
          
        }
      });

        //creating VBoxs that contain buttons
         VBox vBox1 = new VBox(15,button1,button2, button3);
         vBox1.setPadding(new Insets(500, 0, 0, 150));
         VBox vBox2 = new VBox(15,button4,button5, button6);
         vBox2.setPadding(new Insets(500, 0, 0, 350));
         VBox vBox3 = new VBox(15,button7,button8,button9);
         vBox3.setPadding(new Insets(500, 0, 0, 550));

         //group to contain VBoxs that hold buttons
      Group vItems = new Group(vBox3,vBox2,vBox1);
      //group to contain rectangles that represent rooms
      Group rectangleNodes = new Group(rectangleOne,rectangleTwo,
      rectangleThree,rectangleFour,
      rectangleFive,rectangleSix,
      rectangleSeven);
      //group to contain groups of rectangles and VBoxes
      Group items = new Group (rectangleNodes,vItems);

      Scene scene = new Scene(items, 900, 650);
      PrimaryStage.setTitle("MyHouse");
      PrimaryStage.setScene(scene);
      PrimaryStage.show();
    }

  public static void main(String[] args) {
    Application.launch(args);
  }
}
