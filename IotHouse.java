import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
//creating a child class to the Application class and that implements RoomDoors interface
public class IotHouse extends Application implements RoomsDoors {
  //overriding the start method in the application class
  @Override
  public void start(Stage PrimaryStage) {
//setting values of rectangles
    rectangleOne.setStyle("-fx-stroke-width:4; -fx-stroke:BLACK; -fx-fill:GREY");
    rectangleTwo.setStyle("-fx-stroke-width:4; -fx-stroke:BLACK; -fx-fill:GREY");
    rectangleThree.setStyle("-fx-stroke-width:4; -fx-stroke:BLACK; -fx-fill:GREY");
    rectangleFour.setStyle("-fx-stroke-width:4; -fx-stroke:BLACK; -fx-fill:GREY");
    rectangleFive.setStyle("-fx-stroke-width:4; -fx-stroke:BLACK; -fx-fill:GREY");
    rectangleSix.setStyle("-fx-stroke-width:4; -fx-stroke:BLACK; -fx-fill:GREY");
    rectangleSeven.setStyle("-fx-stroke-width:4; -fx-stroke:BLACK; -fx-fill:GREY");
//assign function to button that controls all bulbs
    button1.setOnAction(e -> {
      if (rectangleOne.getStyle().contains("GREY") && rectangleTwo.getStyle().contains("GREY") &&
          rectangleThree.getStyle().contains("GREY") && rectangleFour.getStyle().contains("GREY") &&
          rectangleFive.getStyle().contains("GREY") && rectangleSix.getStyle().contains("GREY") &&
          rectangleSeven.getStyle().contains("GREY")) {
        rectangleOne.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:YELLOW");
        rectangleTwo.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:GREEN");
        rectangleThree.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:ORANGE");
        rectangleFour.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:ORANGE");
        rectangleFive.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:YELLOW");
        rectangleSix.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:RED");
        rectangleSeven.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:YELLOW");
      } else {
        rectangleOne.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:GREY");
        rectangleTwo.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:GREY");
        rectangleThree.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:GREY");
        rectangleFour.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:GREY");
        rectangleFive.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:GREY");
        rectangleSix.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:GREY");
        rectangleSeven.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:GREY");
      }
    });
    //set an action event to rooms 1 and 2
    button2.setOnAction(e -> {
      if (rectangleOne.getStyle().contains("GREY") ||rectangleTwo.getStyle().contains("GREY")) {
        rectangleOne.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:YELLOW");
        rectangleTwo.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:GREEN");
      } else {
        rectangleOne.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:GREY");
        rectangleTwo.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:GREY");
      }
    });
    //assign actions to buttons that are to control the switching on or off of bulbs in rooms
    button3.setOnAction(e -> {
      if (rectangleOne.getStyle().contains("GREY")) {
        rectangleOne.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:YELLOW");
      } else {
        rectangleOne.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:GREY");
      }
    });
    button4.setOnAction(e -> {
      if (rectangleTwo.getStyle().contains("GREY")) {
        rectangleTwo.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:GREEN");
      } else {
        rectangleTwo.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:GREY");
      }
    });
    button5.setOnAction(e -> {
      if (rectangleThree.getStyle().contains("GREY")) {
        rectangleThree.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:ORANGE");
      } else {
        rectangleThree.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:GREY");
      }
    });
    button6.setOnAction(e -> {
      if (rectangleFour.getStyle().contains("GREY")) {
        rectangleFour.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:ORANGE");
      } else {
        rectangleFour.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:GREY");
      }
    });
    button7.setOnAction(e -> {
      if (rectangleFive.getStyle().contains("GREY")) {
        rectangleFive.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:YELLOW");
      } else {
        rectangleFive.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:GREY");
      }
    });
    button8.setOnAction(e -> {
      if (rectangleSix.getStyle().contains("GREY")) {
        rectangleSix.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:RED");
      } else {
        rectangleSix.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:GREY");
      }
    });
    button9.setOnAction(e -> {
      if (rectangleSeven.getStyle().contains("GREY")) {
        rectangleSeven.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:YELLOW");
      } else {
        rectangleSeven.setStyle("-fx-stroke-width:4;-fx-stroke:black; -fx-fill:GREY");
      }
    });
//creating objects of the names of the rooms
    Text RoomName1 = new Text(120, 290, "ROOM1");
    Text RoomName2 = new Text(400, 240, "ROOM2");
    Text RoomName3 = new Text(400, 195, "ROOM3");
    Text RoomName4 = new Text(495, 195, "ROOM4");
    Text RoomName5 = new Text(610, 250, "ROOM5");
    Text RoomName6 = new Text(405, 450, "ROOM6");
    Text RoomName7 = new Text(510, 450, "ROOM7");

    //setting the width of the lines that represent the doors of the rooms
    doorOne.setStrokeWidth(8);
    doorTwo.setStrokeWidth(8);
    doorThree.setStrokeWidth(8);
    doorFour.setStrokeWidth(8);
    doorFive.setStrokeWidth(8);
    doorSix.setStrokeWidth(8);
    doorSeven.setStrokeWidth(8);
    //added a pane object to contain the room names as well as objects of the lines representing the doors
    Pane doorsTexts = new Pane();
    //adding nodes to the pane created
    doorsTexts.getChildren().addAll(RoomName1, RoomName2,
        RoomName3, RoomName4, RoomName5, RoomName6, RoomName7,
        doorOne, doorTwo, doorThree, doorFour, doorFive, doorSix, doorSeven);

    // creating VBoxs that contain buttons
    VBox vBox1 = new VBox(15, button1, button2, button3);
    vBox1.setPadding(new Insets(500, 0, 0, 150));
    VBox vBox2 = new VBox(15, button4, button5, button6);
    vBox2.setPadding(new Insets(500, 0, 0, 350));
    VBox vBox3 = new VBox(15, button7, button8, button9);
    vBox3.setPadding(new Insets(500, 0, 0, 550));

    // group to contain VBoxs that hold buttons
    Group vItems = new Group(vBox3, vBox2, vBox1);
    // group to contain rectangles that represent rooms
    Group rectangleNodes = new Group(rectangleOne, rectangleTwo,
        rectangleThree, rectangleFour,
        rectangleFive, rectangleSix,
        rectangleSeven);
    // group to contain groups of rectangles and VBoxes
    Group items = new Group(rectangleNodes, vItems,doorsTexts);
//creating a scene to contain all nodes that are in groups or panes that are to be displayed
    Scene scene = new Scene(items, 900, 650);
    //setting title of the stage
    PrimaryStage.setTitle("MyHouse");
//adding scene to the stage
    PrimaryStage.setScene(scene);
    //display contents on the stage
    PrimaryStage.show();
  }
//main method
  public static void main(String[] args) {
    Application.launch(args);
  }
}
