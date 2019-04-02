package pl.zzpj2019.solid.dip.weathertracker.solution;


import java.util.ArrayList;
import java.util.List;

public class WeatherTracker {
    String currentConditions;
    List<AlertGenerator> alertGenerators;

    public WeatherTracker(AlertGenerator alertGenerator) {
        this.alertGenerators = new ArrayList<>();
    }

    public void addAlertGenerator(AlertGenerator alertGenerator) {
        alertGenerators.add(alertGenerator);
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        for(AlertGenerator alertGenerator : alertGenerators)
        {
            String alert = alertGenerator.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}
