package Model;

import java.io.FileWriter;
import java.util.PriorityQueue;
import java.util.Random;

import Controller.iGetToyList;

public class ToyList implements iGetToyList {
  private PriorityQueue<Toy> toys;

  public ToyList(PriorityQueue<Toy> toys) {
    this.toys = toys;
  }

  @Override
  public PriorityQueue<Toy> getAllToys(int quantity) {
    Random rand = new Random();
    int num;
    int probability1 = 15;
    int probability2 = 5;
    int probability3 = 60;
    int probability4 = 20;
    int sumProbability = probability1 + probability2 + probability3 + probability4; // собираем общую сумму "весов"
                                                                                    // игрушек, чтобы организовать
                                                                                    // вероятность выпадения согласно
                                                                                    // весу каждой. Вес задается в коде
    // в зависимости от желаемого количества игрушек формируется список
    for (int i = 0; i < quantity; i++) {
      num = rand.nextInt(sumProbability);
      if (num >= 0 && num <= probability1 - 1) { // организация вероятностного выбора
        Toy toy = new Toy("Constructor", probability1);
        toys.offer(toy);
      }
      if (num >= probability1 && num <= (probability1 + probability2 - 1)) {
        Toy toy = new Toy("Robot", probability2);
        toys.offer(toy);
      }
      if (num >= (probability1 + probability2)
          && num <= (sumProbability - probability4 - 1)) {
        Toy toy = new Toy("Teddy bear", probability3);
        toys.offer(toy);
      }
      if (num >= (sumProbability - probability4) && num <= (sumProbability - 1)) {
        Toy toy = new Toy("Barbi", probability4);
        toys.offer(toy);
      }
    }
    return toys;
  }

  @Override
  public void getWin() {
    try (FileWriter fw = new FileWriter("ToysWin", true)) {
      fw.append(toys.poll().toString() + '\n');
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

}
