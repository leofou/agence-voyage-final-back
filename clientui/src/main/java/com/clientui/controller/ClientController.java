package com.clientui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	
	@RequestMapping("/operatingCompanies")
	public String operatingCompanies(Model model) {
		List<OperatingCompanyBean> operatingCompanies = microServiceOperatingCompanyProxy.findAll();
		model.addAttribute("operatingCompanies", operatingCompanies);
		return "OperatingCompanies";
	}
	
	// 	PARTIE LOCATION

	@RequestMapping("/locations")
	public String locationAcceuil(Model model) {
		List<LocationBean> locations = microServiceLocationProxy.findAll();
		model.addAttribute("locations", locations);
		return "locationAccueil";
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
	public String journeysAccueil(Model model) {
		List<JourneyBean> journeys = microServiceJourneyProxy.findJourneys();
		model.addAttribute("journeys", journeys);
		return "JourneysAccueil";
	}

	//****************************   Partie Flights   *****************************
	
	@RequestMapping("/flights")
	public String flightsAccueil(Model model) {
		List<FlightBean> flights = microServiceJourneyProxy.findFlights();
		model.addAttribute("flights", flights);
		return "FlightAccueil";
	}

	//****************************   Partie TrainRides   *****************************

//	@RequestMapping("/trainRides")
//	public String trainRidesAccueil(Model model) {
//		List<TrainRideBean> trainRides = microServiceJourneyProxy.findTrainRides();
//		model.addAttribute("trainRides", trainRides);
//		return "TrainRidesAccueil";
//	}
//	
//	//****************************   Partie RiverCruises   *****************************
//
//	@RequestMapping("/riverCruises")
//	public String riverCruisesAccueil(Model model) {
//		List<RiverCruiseBean> riverCruises = microServiceJourneyProxy.findRiverCruises();
//		model.addAttribute("riverCruises", riverCruises);
//		return "RiverCruisesAccueil";
//	}
	
}
