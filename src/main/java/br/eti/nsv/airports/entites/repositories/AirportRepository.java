
package br.eti.nsv.airports.entites.repositories;

import br.eti.nsv.airports.entites.Airport;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AirportRepository extends JpaRepository<Airport, Long>
{
    
}
