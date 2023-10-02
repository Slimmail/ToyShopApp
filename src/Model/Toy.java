package Model;

import java.util.concurrent.atomic.AtomicInteger;

public class Toy implements Comparable<Toy> {

  private static final AtomicInteger idGenerator = new AtomicInteger();
  private final Integer id;
  private String name;
  private int probability;

  public Toy(String name, int probability) {
    id = idGenerator.getAndIncrement() + 1;
    this.name = name;
    this.probability = probability;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // вероятность, "вес" игрушки в общем списке игрушек
  public int getProbability() {
    return probability;
  }

  public void setProbability(int probability) {
    this.probability = probability;
  }

  @Override
  public int compareTo(Toy o) {
    if (this.id == o.id)
      return 0;
    if (id > o.id)
      return 1;
    else
      return -1;
  }

  @Override
  public String toString() {
    return name + " [id=" + id + "]";
  }

}
