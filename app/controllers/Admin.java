package controllers;

import java.util.List;
import models.Reading;
import models.Station;
import play.mvc.Controller;

public class Admin extends Controller
{
  public static void index()
  {
    List<Station> stations = Station.findAll();
    render("admin.html", stations);
  }
}
