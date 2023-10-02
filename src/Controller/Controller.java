package Controller;

import java.io.File;

public class Controller {
  private iGetToyList model;
  private iGetView view;

  public Controller(iGetToyList model, iGetView view) {
    this.model = model;
    this.view = view;
  }

  public void run() {
    model.getAllToys(view.start());
  }

  public void getToy() {
    model.getWin();
  }

  // очистка файла игрушек при перезапуске программы
  public void clearFile() {
    File file = new File("ToysWin");
    if (file.exists() && !file.isDirectory()) {
      file.delete();
    }
  }

}
