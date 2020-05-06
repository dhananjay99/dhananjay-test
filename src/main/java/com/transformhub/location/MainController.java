package com.transformhub.location;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/locaions")
	public List<Location> getLocations() {
		List<Location> loc=new ArrayList<Location>();
		
		Location l1=new Location("India", "Near Mumbai", 245.00);
		Location l2=new Location("India Well", "Near Delhi", 345.00);
		loc.add(l1);
		loc.add(l2);
		
		return loc;
		
	}
}
