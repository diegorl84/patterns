package command.entity;

public class CeilingFan {
  public static final int HIGH = 3;
  public static final int MEDIUM = 2;
  public static final int LOW = 1;
  public static final int OFF = 0;
  private String description;
  private int speed;

  public CeilingFan(String description) {
    this.description = description;
    this.speed = OFF;
  }

  public void high() {
    System.out.println("High");
    this.speed = HIGH;
  }

  public void medium() {
    System.out.println("Medium");
    this.speed = MEDIUM;
  }

  public void low() {
    System.out.println("Low");
    this.speed = LOW;
  }

  public void off() {
    System.out.println("Off");
    this.speed = OFF;
  }

  public int getSpeed(){
    return this.speed;
  }

  public void on() {
    System.out.println("Ceiling On");
  }
}
