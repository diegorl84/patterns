package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Subject
 */
public class WeatherDataSubject implements Subject{

  private List<Observer> observers;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherDataSubject() {
    this.observers = new ArrayList<>();
  }

  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    int i = observers.indexOf(o);
    if (i >= 0) {
      observers.remove(i);
    }
  }

  @Override
  public void notifyObservers() {
    for (int i = 0; i < observers.size(); i++){
      Observer observer = observers.get(i);
      observer.update(temperature, humidity, pressure);
    }
  }

  public void measurementsChanged() {
    notifyObservers();
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

  public void getTemperature(){

  }
  public void getHumidity(){

  }
  public void getPressure(){

  }

}
