package $package$

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class $name;format="Camel"$ extends Application {
  @Override
  def start(primaryStage: Stage) {
    primaryStage.setTitle("$name;format="Camel"$")
    primaryStage.setScene(new Scene(FXMLLoader.load(getClass.getResource("/$name;format="Camel"$.fxml"))))
    primaryStage.show
  }

  def launch(args: Array[String]) {
    Application.launch(args: _*)
  }
}

object $name;format="Camel"$ {
  def main(args: Array[String]) {
    new $name;format="Camel"$ launch args
  }
}

