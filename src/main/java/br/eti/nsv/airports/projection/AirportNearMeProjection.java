package br.eti.nsv.airports.projection;

public interface AirportNearMeProjection {

    long getId();
    String getName();
    String getCity();
    String getIataCode();
    double getLatitude();
    double getLongiTude();
    double getAltitude();
    double getDistanciaKM();
    
}
