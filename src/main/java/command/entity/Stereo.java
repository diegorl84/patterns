package command.entity;

public class Stereo {

  private String description;

  public Stereo(String description) {
    this.description = description;
  }

  public void on() {
    System.out.println(description + ": Stereo on");
  }

  public void off() {
    System.out.println(description + ": Stereo off");
  }

  public void setCD() {
    System.out.println(description + ": Setting CD");
  }

  void setDVD() {
    System.out.println(description + ": Setting DVD");
  }

  void setRadio() {
    System.out.println(description + ": Setting Radio");
  }

  public void setVolumen(int level) {
    System.out.println(description + ": Setting volume:" + level);
  }
}
