
import java.util.PriorityQueue;
import Controller.Controller;
import Controller.iGetToyList;
import Controller.iGetView;
import Model.Toy;
import Model.ToyList;
import View.View;

public class App {
    public static void main(String[] args) {

        PriorityQueue<Toy> toys = new PriorityQueue<>();
        System.out.println();

        iGetToyList model = new ToyList(toys);
        iGetView view = new View();

        Controller controller = new Controller(model, view);
        controller.run();

        System.out.println("=====================================");

        if (toys.isEmpty()) {
            System.err.println("Введены некорретный данные, необходимо перезапустить программу!");
        } else {
            controller.clearFile();
            for (int i = toys.size(); i > 0; i--) {
                controller.getToy();
            }
            System.out.println("Файл с выпавшими случайно призами создан");
        }

    }
}
