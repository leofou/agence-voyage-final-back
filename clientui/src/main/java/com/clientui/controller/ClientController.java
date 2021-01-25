package com.clientui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clientui.beans.VolBean;
import com.clientui.beans.VoyageurBean;
import com.clientui.proxy.MicroServiceVolProxy;
import com.clientui.proxy.MicroServiceVoyageurProxy;

@Controller
public class ClientController {
	
	@Autowired
	private MicroServiceVolProxy microServiceVolProxy;
	
	@Autowired
	private MicroServiceVoyageurProxy microServiceVoyageurProxy;
	
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

}
