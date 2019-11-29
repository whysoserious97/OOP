package LabsFinal.Lab8;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
        textField2.focusedProperty().addListener( new ChangeListener<Boolean>(){
            @Override
            public void changed( ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue ) {
                if(!newValue){
                    if(textField2.getText().equals( "13" ))
                        try {
                            throw new UnluckyException();
                        } catch (UnluckyException e) {
                            AlertBox.display("Unlucky Exception","Unlucky number!");
                        }
                }
            }
        } );
        Label result = new Label( "Result" );

        Button button = new Button( "Divide");

        button.setOnAction( event -> {
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
            Integer nr1 = Integer.parseInt( dividend.getText() );
            Integer nr2 = Integer.parseInt( divisor.getText() );
            Integer r = nr1/nr2;
            result.setText( r.toString() );

        }catch (ArithmeticException ae)
        {
            AlertBox.display("Division to 0","You cannot devide by 0");
        }catch (NumberFormatException ne){
            AlertBox.display( "Exception catched","Your input is invalid !!!" );
        }catch (Exception e){
            AlertBox.display("Hmmmmm....","Something that I didn't expect :)");
        }
    }

}
