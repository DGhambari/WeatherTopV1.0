package controllers;

import models.Station;
import models.Reading;

import play.Logger;
import play.mvc.Controller;

public class StationCtrl extends Controller{
    public static void index(Long id)
    {
        Station station = Station.findById(id);
        Logger.info ("Station id = " + id);
        render("station.html", station);
    }

    public static void deleteReading (Long id, Long readingId)
    {
        Station station = Station.findById(id);
        Reading reading = Reading.findById(readingId);
        Logger.info ("Removing entry from" + reading.date);
        station.readings.remove(reading);
        station.save();
        reading.delete();
        render("station.html", station);
    }

    public static void addReading(Long id, int code, float temperature, float windSpeed, int windDirection, int pressure)
    {
        Station station = Station.findById(id);
        Reading reading = new Reading(code, temperature, windSpeed, windDirection, pressure);
        station.readings.add(reading);
        station.save();
        redirect ("/stations/" + id);
    }
}
