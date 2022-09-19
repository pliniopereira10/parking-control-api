package edu.pliniopereira10.api.parkingcontrol.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pliniopereira10.api.parkingcontrol.models.ParkingSpotModel;
import edu.pliniopereira10.api.parkingcontrol.repositories.ParkingSpotRepository;

@Service
public class ParkingSpotService {

	@Autowired
	ParkingSpotRepository parkingSpotRepository;

	@Transactional
	public Object save(ParkingSpotModel parkingSpotModel) {
		return parkingSpotRepository.save(parkingSpotModel);
	}
	
}
