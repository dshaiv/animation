package animation;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.animation.AnimationTimer;
import javafx.animation.TranslateTransition;
import javafx.animation.Transition;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Иванова Дарья Валерьевна 
 */
public class Animation extends Application {
    
    public static void main(String[ ] args)
 {
   launch(args);
 }

@Override
public void start(Stage theStage)
{
 Image fon = new Image( "fon1.jpg" );
 Button startBtn = new Button();
 startBtn.setText("Старт");
 startBtn.setLayoutX(380);
 startBtn.setLayoutY(250);
 
 Button spravkaBtn = new Button();
 spravkaBtn.setText("Справка");
 spravkaBtn.setLayoutX(0);
 spravkaBtn.setLayoutY(474);
 
 Button backsBtn=new Button();
 backsBtn.setText("<< Вернуться в меню");
 backsBtn.setLayoutX(0);
 backsBtn.setLayoutY(475);
 
 theStage.setTitle("Анимация");
 Group root = new Group();
Scene theScene = new Scene( root );

theStage.setScene( theScene );

Image marry = new Image( "marry.png" );

Canvas canvasMarry = new Canvas(800, 500);

GraphicsContext gc3 = canvasMarry.getGraphicsContext2D(); 
gc3.drawImage( marry, 400, -25 );

TranslateTransition translate = 
        new TranslateTransition(Duration.millis(3000), canvasMarry); 
        translate.setToX(0);
        translate.setFromY(0);
        translate.setToY(25);
        translate.setAutoReverse(true);
        translate.setCycleCount(Timeline.INDEFINITE);
        translate.play();

startBtn.setOnAction (new EventHandler<ActionEvent>() {

 @Override
  public void handle (ActionEvent event1) {
      
    translate.jumpTo(Duration.ZERO);
    translate.stop();
      Group root3 = new Group();
      Scene sceneGame = new Scene( root3, 800, 500, Color.BLACK );
    theStage.setScene( sceneGame );
    Button bezUsckorBtn = new Button();
    bezUsckorBtn.setText("Без ускорения");
    bezUsckorBtn.setLayoutX(700);
    bezUsckorBtn.setLayoutY(50);
    
    Button Usckor1Btn = new Button();
    Usckor1Btn.setText("a=50");
    Usckor1Btn.setLayoutX(700);
    Usckor1Btn.setLayoutY(80);
    
    Button Usckor2Btn = new Button();
    Usckor2Btn.setText("a=100");
    Usckor2Btn.setLayoutX(700);
    Usckor2Btn.setLayoutY(110);
    
    Button Usckor3Btn = new Button();
    Usckor3Btn.setText("a=200");
    Usckor3Btn.setLayoutX(700);
    Usckor3Btn.setLayoutY(140);
    
    Button backsBtn=new Button();
    backsBtn.setText("<< Вернуться в меню");
    backsBtn.setLayoutX(0);
    backsBtn.setLayoutY(0);
    
    Canvas canvasSea = new Canvas (800, 500);
    Canvas canvasShip = new Canvas (800,500);
    root3.getChildren().add(canvasSea);
    root3.getChildren().add(canvasShip);
    root3.getChildren().add(bezUsckorBtn);
    root3.getChildren().add(Usckor1Btn);
    root3.getChildren().add(Usckor2Btn);
    root3.getChildren().add(Usckor3Btn);
    root3.getChildren().add(backsBtn);
    Image sea = new Image("sea.jpg");
    Image ship = new Image("ship.png");
    GraphicsContext gc4 = canvasSea.getGraphicsContext2D();
    gc4.drawImage(sea, 0, 0);
    GraphicsContext gc5 = canvasShip.getGraphicsContext2D();
    gc5.drawImage(ship, 0, 300);
    bezUsckorBtn.setOnAction (new EventHandler<ActionEvent>() {
    public void handle (ActionEvent event3) {
    final long startNanoTime = System.nanoTime();
    new AnimationTimer()
    {
        public void handle(long currentNanoTime)
        {
            
            double t = (currentNanoTime - startNanoTime) / 1000000000.0; 
            double x = 80*t;
            gc5.drawImage(sea, 0, 0);
            if (x<900 ) {
            gc5.drawImage(ship, x, 300);
            } else {gc5.drawImage(ship, 0, 300);}
        }
    }.start();
    
  } 
    } );
    
    Usckor1Btn.setOnAction (new EventHandler<ActionEvent>() {
    public void handle (ActionEvent event3) {
        final long startNanoTime = System.nanoTime();
    new AnimationTimer()
    {
        public void handle(long currentNanoTime)
        {
            double acl = 50.0;
            double t = (currentNanoTime - startNanoTime) / 1000000000.0; 
 
            double x = (acl*(t*t))/2;
            gc5.drawImage(sea, 0, 0);
            if (x<900 ) {
            gc5.drawImage(ship, x, 300);
            } else {gc5.drawImage(ship, 0, 300);}
        }
    }.start();
  } 
    } );
    
     Usckor2Btn.setOnAction (new EventHandler<ActionEvent>() {
    public void handle (ActionEvent event3) {
        final long startNanoTime = System.nanoTime();
    new AnimationTimer()
    {
        public void handle(long currentNanoTime)
        {
            double acl = 100.0;
            double t = (currentNanoTime - startNanoTime) / 1000000000.0; 
 
            double x = (acl*(t*t))/2;
            gc5.drawImage(sea, 0, 0);
            if (x<900 ) {
            gc5.drawImage(ship, x, 300);
            } else {gc5.drawImage(ship, 0, 300);}
        }
    }.start();
  } 
    } );
    
      Usckor3Btn.setOnAction (new EventHandler<ActionEvent>() {
    public void handle (ActionEvent event3) {
        final long startNanoTime = System.nanoTime();
    new AnimationTimer()
    {
        public void handle(long currentNanoTime)
        {
            double acl = 200.0;
            double t = (currentNanoTime - startNanoTime) / 1000000000.0; 
 
            double x = (acl*(t*t))/2;
            gc5.drawImage(sea, 0, 0);
            if (x<900 ) {
            gc5.drawImage(ship, x, 300);
            } else {gc5.drawImage(ship, 0, 300);}
        }
    }.start();
  } 
    } );
     backsBtn.setOnAction (new EventHandler<ActionEvent>() {
    @Override
    public void handle (ActionEvent event3) {
        theStage.setScene( theScene );
        translate.playFromStart();
    
}});
   }
 });

spravkaBtn.setOnAction (new EventHandler<ActionEvent>() {

 @Override
public void handle (ActionEvent event2) {
    translate.jumpTo(Duration.ZERO);
    translate.stop();
      Group root2 = new Group();
      Scene scene = new Scene( root2, 800, 500, Color.BLACK );
    theStage.setScene( scene );
 Canvas canvas2 = new Canvas( 800, 500 );
root2.getChildren() .add( canvas2 ); 
Image spravka = new Image( "fon1.jpg" ); 
GraphicsContext gc2 = canvas2.getGraphicsContext2D();
gc2.drawImage(spravka,0,0);


gc2.setFill(Color.BLACK );
Font theFont = Font.font( "Times New Roman", FontWeight.BOLD, 24);
gc2.setFont( theFont );
gc2.fillText( "Справка", 375, 50 );
Font font1 = Font.font( "Times New Roman", FontWeight.NORMAL, 14 );
gc2.setFont( font1 );
gc2.fillText( "Приложение, показывающее", 340, 100 );
gc2.fillText( "движение объекта с ускорением ", 330, 120 );
gc2.fillText( "на платформе Java.", 370, 140 );
gc2.fillText( "Автор - Дарья Иванова ФМФИ-б18ПИо", 5, 450 );
root2.getChildren() .add(backsBtn);
theStage.show();
backsBtn.setOnAction (new EventHandler<ActionEvent>() {
    @Override
    public void handle (ActionEvent event3) {
        theStage.setScene( theScene );
        translate.playFromStart();
    
}});

   }
 });

Canvas canvas = new Canvas( 800, 500 );
root.getChildren().add( canvas );
root.getChildren().add(canvasMarry);
root.getChildren().add(startBtn);
root.getChildren().add(spravkaBtn);


GraphicsContext gc = canvas.getGraphicsContext2D();

gc.drawImage( fon, 0, 0 );
gc.setFill(Color.BLACK );
Font theFont = Font.font( "Times New Roman", FontWeight.BOLD, 48);
gc.setFont( theFont );
gc.fillText( "Движение с ускорением", 170, 50 );
Font font1 = Font.font( "Times New Roman", FontWeight.NORMAL, 24 );
gc.setFont( font1 );
gc.fillText( "Нажмите старт", 320, 100 );


theStage.show();
}
}