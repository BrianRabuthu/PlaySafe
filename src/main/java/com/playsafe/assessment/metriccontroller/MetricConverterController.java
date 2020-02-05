package com.playsafe.assessment.metriccontroller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.playsafe.assessment.metricconverterserviceimp.MetricConverterServiceImp;
import com.playsafe.assessment.metricdto.MetricConverterDTO;
import com.playsafe.assessment.utilities.MetricPairTypes;

@RestController
@RequestMapping (value = "/converter")
public class MetricConverterController {
	
	@Autowired
	MetricConverterServiceImp convertMetric;

	//Receive kelvin return celcius	
	@RequestMapping(method = RequestMethod.POST, value="/ktoc")
	public ResponseEntity<Map<String, Double>> KelvinToCelcius(@RequestBody MetricConverterDTO  value) {		
		 return ResponseEntity.ok(convertMetric.MetricsConversion(MetricPairTypes.KTOC, value.getValue()));
}
	//Receive celcius return kelvin	
	@RequestMapping(method = RequestMethod.POST, value="/ctok")
	public ResponseEntity<?> CelciusToKelvin(@RequestBody MetricConverterDTO  value) {		
		return new ResponseEntity( HttpStatus.OK);
		}
	
	//Receive miles return kilometers	
	@RequestMapping(method = RequestMethod.POST, value="/mtok")
	public ResponseEntity<?> MilesToKilos(@RequestBody MetricConverterDTO  value) {
		return new ResponseEntity( HttpStatus.OK);
		}
	
	//Receive kilometers return miles	
	@RequestMapping(method = RequestMethod.POST, value="/ktom")
	public ResponseEntity<?> KilosToMiles(@RequestBody MetricConverterDTO  value) {		
	//	return ResponseEntity.ok(convert.ConvertMetrics(MetricType.KTOM, value.getValue()));
		return new ResponseEntity( HttpStatus.OK);
		}	

}
