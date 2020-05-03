package Model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "Weather")
public class Weather implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private int weatherId;

    @Column(name = "Temp")
    private int temp;
    @Column(name = "Clouds")
    private String clouds;
    @Column(name = "Pressure")
    private int pressure;
    @Column(name = "Humidity")
    private int humidity;
    @Column(name = "Sunrise")
    private String sunrise;
    @Column(name = "Sunset")
    private String sunset;
    @Column(name = "Date")
    private LocalDateTime time;

    public Weather() {
    }

    public Weather(int weatherId, int temp, String clouds, int pressure, int humidity, String sunrise, String sunset, LocalDateTime time){
        this.weatherId = weatherId;
        this.temp = temp;
        this.clouds = clouds;
        this.pressure = pressure;
        this.humidity = humidity;
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.time = time;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getClouds() {
        return clouds;
    }

    public void setClouds(String clouds) {
        this.clouds = clouds;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
