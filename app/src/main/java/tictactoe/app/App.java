/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tictactoe.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import tictactoe.components.FxBoard;
import tictactoe.eventHandlers.RectangleClickHandler;
import tictactoe.game.GameController;
import tictactoe.panes.BoardPane;


public class App extends Application {
    private final static int BOARD_LENGTH = 3;
    @Override
    public void start(Stage primaryStage) throws Exception {
        GameController gameController = new GameController(new int[BOARD_LENGTH][BOARD_LENGTH], BOARD_LENGTH);
        FxBoard fxBoard = new FxBoard();
        Pane pane = new BoardPane(gameController, fxBoard).getPane();

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
