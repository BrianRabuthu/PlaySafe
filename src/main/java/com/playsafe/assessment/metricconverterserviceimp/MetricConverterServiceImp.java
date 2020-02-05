package com.playsafe.assessment.metricconverterserviceimp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.playsafe.assessment.service.MetricConverterService;
import com.playsafe.assessment.utilities.MetricCalculator;
import com.playsafe.assessment.utilities.MetricPairTypes;

@Service
public class MetricConverterServiceImp implements MetricConverterService {

	public Map<String, Double> MetricsConversion(MetricPairTypes type, double value) {

		Map<String, Double> map = new HashMap<>();
		Double result = convertMetric(type.name(), value);
		map.put("result", result);

		return map;
	}

	@Override
	public Double convertMetric(String type, double value) {

		Double result = 0.0;

		switch (type) {
		case "KTOC":
			result = MetricCalculator.KTOC.apply(value);
			break;
		case "CTOK":
			result = MetricCalculator.CTOK.apply(value);
			break;
		case "MTOK":
			result = MetricCalculator.MTOK.apply(value);
			break;
		case "KTOM":
			result = MetricCalculator.KTOM.apply(value);
			break;
		}
		return result;
	}
}
