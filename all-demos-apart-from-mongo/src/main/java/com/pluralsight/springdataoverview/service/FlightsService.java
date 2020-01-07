package com.pluralsight.springdataoverview.service;

import com.pluralsight.springdataoverview.entity.Flight;
import com.pluralsight.springdataoverview.repository.FlightRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class FlightsService {
    private final FlightRepository flightRepository;

    public FlightsService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public void saveFlight(Flight flight){
        flightRepository.save(flight);
        // some other queries and method calls here maybe
        throw new RuntimeException("I failed");
    }

    @Transactional
    public void saveFlightTransactional(Flight flight) {
        flightRepository.save(flight);
        // some other queries and method calls here maybe
        throw new RuntimeException("I failed");
    }
}
