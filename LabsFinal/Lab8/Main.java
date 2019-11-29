package LabsFinal.Lab8;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main( String[] args ) {
        launch( args );
    }

    @Override
    public void start( Stage primaryStage ) throws Exception {
        primaryStage.setTitle( "Title of the Window" );
        TextField textField1= new TextField( "Label 1" );
        TextField textField2 = new TextField( "Label 2" );
        textField2.setOnAction( event -> {
            if(textField2.getText()=="13"){
                try {
                    throw new UnluckyException();
                } catch (UnluckyException e) {
                    AlertBox.display( "UnluckyException","Your result will be unlucky" );
                }
            }
        } );
        Label result = new Label( "Result" );

        Button button = new Button( "Divide");

        button.setOnAction( event -> {
          //  System.out.println(Integer.parseInt( "s" ));
            divideLabels( textField1,textField2, result);
        } );

        VBox layout = new VBox(  );
        layout.getChildren().add( textField1 );
        layout.getChildren().add( textField2 );
        layout.getChildren().add( result );
        layout.getChildren().add( button );
        layout.setAlignment( Pos.CENTER );

        Scene scene = new Scene(layout,300,250  );
        primaryStage.setScene( scene );
        primaryStage.show();
    }
    public static void divideLabels( TextField dividend,TextField divisor,Label result ){
        try {
            Double nr1 = Double.parseDouble( dividend.getText() );
            Double nr2 = Double.parseDouble( divisor.getText() );
            Double r = nr1/nr2;
            result.setText( r.toString() );
            if (nr2==13){
                throw new  UnluckyException();
            }
        }catch (ArithmeticException ae)
        {
            System.out.println("You cannot devide by 0");
        }catch (NumberFormatException ne){
            AlertBox.display( "Exception catched","Your input is invalid to be parsed!!!" );
        }catch(UnluckyException ue)
        {
            AlertBox.display("Unlucky Exception","You are so unlucky right now!");
        }catch (Exception e){
            System.out.println("This guy found an unexpected exception :)");
        }
    }

}
