
package br.eti.nsv.airports.DTO;

import br.eti.nsv.airports.projection.AirportNearMeProjection;


public class AirportNearMeDTO {
   private long Id;
   private String Name;
   private String City;
   private String IataCode;
  private double Latitude;
  private double LongiTude;
  private double Altitude;
  private double DistanciaKM;

    public AirportNearMeDTO() {
    }

    public AirportNearMeDTO(long id, String name, String city, String iataCode, double latitude, double longiTude, double altitude, double distanciaKM) {
        this.Id = id;
        this.Name = name;
        this.City = city;
        this.IataCode = iataCode;
        this.Latitude = latitude;
        this.LongiTude = longiTude;
        this.Altitude = altitude;
        this.DistanciaKM = distanciaKM;
    }

    public long getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getCity() {
        return City;
    }

    public String getIataCode() {
        return IataCode;
    }

    public double getLatitude() {
        return Latitude;
    }

    public double getLongiTude() {
        return LongiTude;
    }

    public double getAltitude() {
        return Altitude;
    }

    public double getDistanciaKM() {
        return DistanciaKM;
    }
  public AirportNearMeDTO(AirportNearMeProjection airportProjection){
    
    this.Id = airportProjection.getId();
    this.Name = airportProjection.getName();
    this.City = airportProjection.getCity();
    this.IataCode = airportProjection.getIataCode();
    this.Latitude = airportProjection.getLatitude();
    this.LongiTude = airportProjection.getLongiTude();
    this.Altitude = airportProjection.getAltitude();
    this.DistanciaKM = airportProjection.getDistanciaKM();          
          
  }

}
