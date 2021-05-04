package models;

import javax.persistence.Entity;
import play.db.jpa.Model;

@Entity
public class Reading extends Model
{
    public String date;
    public int code;
    public float temperature;
    public float windSpeed;
    public int windDirection;
    public int pressure;

    public Reading(int code, float temperature, float windSpeed, int windDirection, int pressure){
        this.code = code;
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
        this.pressure = pressure;
    }

//    public Reading(String date, int code, float temperature, float windSpeed, int windDirection, int pressure){
//        this.date = date;
//        this.code = code;
//        this.temperature = temperature;
//        this.windSpeed = windSpeed;
//        this.windDirection = windDirection;
//        this.pressure = pressure;
//    }
}
