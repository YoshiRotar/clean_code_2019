package pl.zzpj2019.solid.dip.weathertracker.solution;

public class Phone implements AlertGenerator{
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "It is " + weatherConditions;
        return alert;
    }
}
