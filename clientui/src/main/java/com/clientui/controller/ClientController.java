package com.clientui.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clientui.beans.CustomerBean;
import com.clientui.beans.FlightBean;
import com.clientui.beans.JourneyBean;
import com.clientui.beans.LocationBean;
import com.clientui.beans.OperatingCompanyBean;
import com.clientui.beans.RiverCruiseBean;
import com.clientui.beans.TrainRideBean;
import com.clientui.beans.VolBean;
import com.clientui.beans.VoyageurBean;
import com.clientui.proxy.MicroServiceCustomerProxy;
import com.clientui.proxy.MicroServiceJourneyProxy;
import com.clientui.proxy.MicroServiceLocationProxy;
import com.clientui.proxy.MicroServiceOperatingCompanyProxy;
import com.clientui.proxy.MicroServiceVolProxy;
import com.clientui.proxy.MicroServiceVoyageurProxy;

@CrossOrigin
@Controller
public class ClientController {
	
	@Autowired
	private MicroServiceVolProxy microServiceVolProxy;
	
	@Autowired
	private MicroServiceVoyageurProxy microServiceVoyageurProxy;
	
	@Autowired
	private MicroServiceOperatingCompanyProxy microServiceOperatingCompanyProxy;
	
	@Autowired
	private MicroServiceLocationProxy  microServiceLocationProxy;
	
	@Autowired
	private MicroServiceCustomerProxy  microServiceCustomerProxy;
	
	@Autowired
	private MicroServiceJourneyProxy microServiceJourneyProxy;
	
	@RequestMapping("/")
	public String acceuil(Model model) {
		List<VolBean> vols = microServiceVolProxy.findAll();
		model.addAttribute("vols", vols);
		return "Accueil";
	}
	
	@RequestMapping("/voyageurs")
	public String voyageurs(Model model) {
		List<VoyageurBean> voyageurs = microServiceVoyageurProxy.findAll();
		model.addAttribute("voyageurs", voyageurs);
		return "Voyageurs";
	}
	
	//	PARTIE OPERATING COMPANIES
	
	/*
	 * @RequestMapping("/operatingCompanies") public String operatingCompanies(Model
	 * model) { List<OperatingCompanyBean> operatingCompanies =
	 * microServiceOperatingCompanyProxy.findAll();
	 * model.addAttribute("operatingCompanies", operatingCompanies); return
	 * "OperatingCompanies"; }
	 */
	
	@GetMapping(value="/operatingCompanies")
	public List<OperatingCompanyBean> getOperatingCompany(){
		return microServiceOperatingCompanyProxy.findAllOperatingCompany();
	};
	
	@GetMapping(value="/operatingCompanies/{id}")
	public OperatingCompanyBean findOperatingCompany(@PathVariable("id") Long id) {
		return microServiceOperatingCompanyProxy.findOneOperatingCompany(id);
	}
	
	@PostMapping(value="/operatingCompanies")
	public OperatingCompanyBean saveOperatingCompany(@RequestBody OperatingCompanyBean operatingCompany) {
		 return microServiceOperatingCompanyProxy.saveOperatingCompany(operatingCompany);	 
			
	}
	
	@PutMapping(value="/operatingCompanies/{id}")
	public OperatingCompanyBean updateOperatingCompany(@PathVariable("id") long idOperatingCompany, @RequestBody OperatingCompanyBean operatingCompany) {
		OperatingCompanyBean currentOperatingCompany = microServiceOperatingCompanyProxy.findOneOperatingCompany(idOperatingCompany);
		currentOperatingCompany.setOperatingCompanyName(operatingCompany.getOperatingCompanyName());
		currentOperatingCompany.setIdOperatingComany(operatingCompany.getIdOperatingComany());
		currentOperatingCompany.setOperatingCompanyDetails(operatingCompany.getOperatingCompanyDetails());
		return microServiceOperatingCompanyProxy.saveOperatingCompany(currentOperatingCompany);

	}
	
	@DeleteMapping(value="/operatingCompanies/{id}")
	void deleteOperatingCompany(@PathVariable("id") Long id) {
		microServiceOperatingCompanyProxy.deleteOperatingCompany(id);
	
	}
	
	// 	---------------  PARTIE LOCATION ------------------------

	@RequestMapping("/locations")
	public List<LocationBean> locationAcceuil() {
		return microServiceLocationProxy.findAllLocations();
	}

	@GetMapping(value="/locations/{codeLocation}")
	public LocationBean findLocationBean(@PathVariable("codeLocation") Long codeLocation) {
			return microServiceLocationProxy.findOneLocation(codeLocation);
		}
	
	@PostMapping(value="/location")
	public LocationBean saveLocation(@RequestBody LocationBean location) {
		 return microServiceLocationProxy.saveLocation(location);}
		
	@DeleteMapping(value="/locations/{codeLocation}")
	void deleteLocation(@PathVariable("codeLocation") Long codeLocation) {
		microServiceLocationProxy.deleteLocation(codeLocation);
	}
		
		@PutMapping(value="/locations/{codeLocation}")
		public LocationBean updateLocation(@PathVariable("codeLocation") Long codeLocation, @RequestBody LocationBean location) {
			LocationBean currentLocation = microServiceLocationProxy.findOneLocation(codeLocation);
			currentLocation.setCodeLocation(location.getCodeLocation());
			currentLocation.setLocationName(location.getLocationName());
			currentLocation.setLocationType(location.getLocationType());
			return microServiceLocationProxy.saveLocation(currentLocation);

		}
	
	
	// 	PARTIE Customers

	@RequestMapping("/customers")
	public String customerAcceuil(Model model) {
		List<CustomerBean> customers = microServiceCustomerProxy.findAll();
		model.addAttribute("customers", customers);
		return "CustomerAccueil";
	}
	
	//****************************   Partie Journeys   *****************************
	
	@RequestMapping("/journeys")
	public List<JourneyBean> findJourneys() {
		return microServiceJourneyProxy.findJourneys();
	}

	@GetMapping(value="/journey/{idJourney}")
	public JourneyBean findJourney(@PathVariable("idJourney") Long idJourney) {
		return microServiceJourneyProxy.findJourney(idJourney);
	}
	
	@PostMapping(value="/journey")
	public JourneyBean saveJourney(@RequestBody JourneyBean journey) {
		 return microServiceJourneyProxy.saveJourney(journey);
	}
		
	@DeleteMapping(value="/journey/{idJourney}")
	void deleteJourney(@PathVariable("idJourney") Long idJourney) {
		microServiceJourneyProxy.deleteJourney(idJourney);
	}
	

	//****************************   Partie Flights   *****************************
	
	@RequestMapping("/flights")
	public List<FlightBean> findFlights() {
		return microServiceJourneyProxy.findFlights();
	}

	@GetMapping(value="/flight/{idJourney}")
	public FlightBean findFlight(@PathVariable("idJourney") Long idJourney) {
		return microServiceJourneyProxy.findFlight(idJourney);
	}
	
	@PostMapping(value="/flight")
	public FlightBean saveFlight(@RequestBody FlightBean flight) {
		 return microServiceJourneyProxy.saveFlight(flight);
	}
		
	@DeleteMapping(value="/flight/{idJourney}")
	void deleteFlight(@PathVariable("idJourney") Long idJourney) {
		microServiceJourneyProxy.deleteFlight(idJourney);
	}

	//****************************   Partie TrainRides   *****************************

	@RequestMapping("/trainRides")
	public List<TrainRideBean> findTrainRides() {
		return microServiceJourneyProxy.findTrainRides();
	}

	@GetMapping(value="/trainRide/{idJourney}")
	public TrainRideBean findTrainRide(@PathVariable("idJourney") Long idJourney) {
		return microServiceJourneyProxy.findTrainRide(idJourney);
	}
	
	@PostMapping(value="/trainRide")
	public TrainRideBean saveTrainRide(@RequestBody TrainRideBean trainRide) {
		 return microServiceJourneyProxy.saveTrainRide(trainRide);
	}
		
	@DeleteMapping(value="/trainRide/{idJourney}")
	void deleteTrainRide(@PathVariable("idJourney") Long idJourney) {
		microServiceJourneyProxy.deleteTrainRide(idJourney);
	}
	
	//****************************   Partie RiverCruises   *****************************

	@RequestMapping("/riverCruises")
	public List<RiverCruiseBean> findRiverCruises() {
		return microServiceJourneyProxy.findRiverCruises();
	}

	@GetMapping(value="/riverCruise/{idJourney}")
	public RiverCruiseBean findRiverCruise(@PathVariable("idJourney") Long idJourney) {
		return microServiceJourneyProxy.findRiverCruise(idJourney);
	}
	
	@PostMapping(value="/riverCruise")
	public RiverCruiseBean saveRiverCruise(@RequestBody RiverCruiseBean riverCruise) {
		 return microServiceJourneyProxy.saveRiverCruise(riverCruise);
	}
		
	@DeleteMapping(value="/riverCruise/{idJourney}")
	void deleteRiverCruise(@PathVariable("idJourney") Long idJourney) {
		microServiceJourneyProxy.deleteRiverCruise(idJourney);
	}

	
}
