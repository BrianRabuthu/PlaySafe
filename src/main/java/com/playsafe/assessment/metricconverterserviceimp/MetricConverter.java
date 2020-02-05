package com.playsafe.assessment.metricconverterserviceimp;

import org.springframework.stereotype.Service;

import com.playsafe.assessment.service.MetricConverterService;

@Service
public class MetricConverter implements MetricConverterService{

	@Override
	public Double convertMetric(String type, double value) {
		Double result = 0.0;
		return result;
	}
}
