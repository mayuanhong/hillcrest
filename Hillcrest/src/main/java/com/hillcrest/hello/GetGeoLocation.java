package com.hillcrest.hello;

import javax.swing.Spring;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.hillcrest.objects.bingmaps.Address;
import com.hillcrest.objects.bingmaps.Bingmaps;
import com.hillcrest.objects.bingmaps.Resource;
import com.hillcrest.objects.bingmaps.ResourceSet;

@Controller
public class GetGeoLocation {

	
	@RequestMapping(value = "/geo", method = RequestMethod.GET, params = { "address" })
	@ResponseBody
	String geolocation(@RequestParam(value = "address") String address){
		
		
		RestTemplate restTemplate = new RestTemplate();
		
		String baseurl = "http://dev.virtualearth.net/REST/v1/Locations?query=";
			String myKey ="key=AkMU1z4eFSb0edCI_mk9v8NKNI8NnUzlqyjGKd-SOLYBUP1prBJh3O054A60rW1X" ;
		String QueryUrl = baseurl +address +  "&" + myKey;
		
		//restTemplate.get
		//ResponseEntity<String> response = restTemplate.getForEntity(QueryUrl, String.class);
		
		String returnString ="";
		Bingmaps mapObj = restTemplate.getForObject(QueryUrl, Bingmaps.class);
		
		
		
		ResourceSet resourceSet = (ResourceSet) (mapObj.getResourceSets().get(0));
		
		for (Resource res : resourceSet.getResources()){
			Address addressObj = res.getAddress();
			returnString += addressObj.getFormattedAddress() + "\n";
			Double latitude =res.getPoint().getCoordinates().get(0);
			Double Longitude = res.getPoint().getCoordinates().get(1);
			
			returnString += "latitude: " + latitude + "\n";
			returnString += "Longitude: " + Longitude + "\n";
			
			
		}
		
		
		return returnString;
		//return mapObj.toString();
		//return response.toString();
	}
}
