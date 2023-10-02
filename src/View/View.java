package View;

import java.util.Scanner;
import Controller.iGetView;

public class View implements iGetView {

  @Override
  public int start() {
    System.out.println("Начинаем розыгрыш игрушек!");
    System.out.println("=====================================");
    System.out.println("В розыгрыше участвуют следущие игрушки:\nConstructor\nRobot\nTeddy bear\nBarbi");
    System.out.println("=====================================");
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите количество игрушек для розыгрыша: ");
    String input = sc.nextLine();
    int num = 0;
    try {
      num = Integer.parseInt(input);
      if (num <= 0) {
        sc.close();
        throw new RuntimeException("ERROR: Количество игрушек не может быть меньше 1!");
      } else {
        sc.close();
        return num;
      }
    } catch (Exception e) {
      System.out.println("ERROR: Должно быть введено положительное целое число!");
    }
    sc.close();
    return num;

  }

}
