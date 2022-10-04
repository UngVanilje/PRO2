package JavaFxObserverExample.classexample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ClassExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("JavaFx Observer Ecample");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private void initContent(GridPane pane) {
        Button btn = new Button("Should I do it?");
        pane.add(btn, 0, 0);
        btn.setPrefSize(200,200);
        btn.addEventHandler(ActionEvent.ACTION, new AngelHandler());
        btn.addEventFilter(ActionEvent.ACTION, new DevilHandler());
    }
}

class AngelHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Angel: Don't do it, you might regret it!");
    }
}

class DevilHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Devil: Come on, do it!");
    }
}
