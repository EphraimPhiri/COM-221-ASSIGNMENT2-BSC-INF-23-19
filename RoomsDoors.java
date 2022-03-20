import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
//rooms and doors interface that accesses buttons by extending the switch interface
public interface RoomsDoors extends Switch{
    //Generating rectangle shapes used to represent rooms
    Rectangle rectangleOne = new Rectangle(100, 50, 250, 270);
    Rectangle rectangleTwo = new Rectangle(350, 210, 240, 60);
    Rectangle rectangleThree = new Rectangle(350, 50, 120, 160);
    Rectangle rectangleFour = new Rectangle(470, 50, 120, 160);
    Rectangle rectangleFive = new Rectangle(590, 50, 110, 220);
    Rectangle rectangleSix = new Rectangle(350, 270, 150, 200);
    Rectangle rectangleSeven = new Rectangle(500, 270, 200, 200);

    //Declaring Lines used to indicate doors
    Line doorOne = new Line(280, 320, 195, 320);
    Line doorTwo = new Line(350, 250, 350, 220);
    Line doorThree = new Line(400, 210, 370, 210);
    Line doorFour = new Line(520, 210, 490, 210);
    Line doorFive = new Line(590, 250, 590, 220);
    Line doorSix = new Line(400, 270, 370, 270);
    Line doorSeven = new Line(535, 270, 510, 270);
}