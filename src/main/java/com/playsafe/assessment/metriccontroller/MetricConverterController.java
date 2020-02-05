package com.playsafe.assessment.metriccontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.playsafe.assessment.metricdto.MetricConverterDTO;

@RestController
@RequestMapping (value = "/converter")
public class MetricConverterController {

	//Receive kelvin return celcius	
	@RequestMapping(method = RequestMethod.POST, value="/ktoc")
	public ResponseEntity<?> KelvinToCelcius(@RequestBody MetricConverterDTO  value) {		
		 return new ResponseEntity( HttpStatus.OK);
	}

}
