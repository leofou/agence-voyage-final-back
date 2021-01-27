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
import com.clientui.beans.LocationBean;
import com.clientui.beans.OperatingCompanyBean;
import com.clientui.beans.VolBean;
import com.clientui.beans.VoyageurBean;
import com.clientui.proxy.MicroServiceCustomerProxy;
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
	
	
	
	
	
}
