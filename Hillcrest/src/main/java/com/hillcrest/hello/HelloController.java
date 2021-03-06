package com.hillcrest.hello;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.hillcrest.objects.NurcingRoom;

@Controller
public class HelloController {

	@RequestMapping(value = "/toys", method = RequestMethod.GET)
	@ResponseBody
	String toys() throws JsonParseException, IOException {

		String tempString = "";
		
		UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		String userName = userDetails.getUsername();
		tempString = tempString  + "User:" + userName;
		
		
		NurcingRoom nr = new NurcingRoom("this", "that", "Address", "phone Number", 0, 0);

		Map<String, NurcingRoom> nrDataMap = new HashMap<String, NurcingRoom>();

		JsonFactory factory = new JsonFactory();
		ObjectMapper mapper = new ObjectMapper(factory);
		JsonParser parser = factory.createParser(new File("C:\\workplacemars\\Assets\\Temp.json"));

		JsonNode nrData = parser.readValueAsTree();
		JsonNode nrdata1 = mapper.readValue(new File("C:\\workplacemars\\Assets\\Temp.json"), JsonNode.class);

		// nrDataMap = (Map<String, NurcingRoom>) mapper.convertValue(nrData,
		// NurcingRoom.class);

		// ObjectMapper mapper = new ObjectMapper();
		// NurcingRoom nRooms = mapper.readValue(new
		// File("C:\\workplacemars\\Assets\\Temp.json"), NurcingRoom.class);

		Iterator<JsonNode> iterator = nrData.iterator();

		while (iterator.hasNext()) {

			JsonNode js = iterator.next();
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			NurcingRoom room = (NurcingRoom) mapper.readValue(js.toString(), NurcingRoom.class);
			// tempString = tempString +"<P>"+ js.findValuesAsText("Name") +
			// js.findValuesAsText("Address");
			tempString = tempString + "<p>" + mapper.writeValueAsString(js) + "<p>" + room.toString();
		}

		// return "Hello World!\n" + nr.toString() + "<P>" + tempString;
		return tempString;

	}

	// get Near By Toys Locations
	@RequestMapping(value = "/toys", method = RequestMethod.GET, params = { "latitude", "longitude" })
	@ResponseBody
	String getNearbyToys(@RequestParam(value = "latitude") double lat,
			@RequestParam(value = "longitude") double longi) {
		String tempString1 = "this is only sample nothing returned: lat:" + lat;

		return tempString1;

	}

}
