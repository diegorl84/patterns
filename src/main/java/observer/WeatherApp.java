package observer;

public class WeatherApp {
  public static void main(String[] args) {
    WeatherDataSubject weatherDataSubject = new WeatherDataSubject();
    CurrentConditionDisplay currentConditionDisplay =
        new CurrentConditionDisplay(weatherDataSubject);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherDataSubject);

    weatherDataSubject.setMeasurements(80, 65, 30f);
    weatherDataSubject.setMeasurements(82, 20, 40f);
    weatherDataSubject.setMeasurements(5, 10, 20f);
  }
}
