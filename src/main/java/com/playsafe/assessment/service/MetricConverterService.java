package com.playsafe.assessment.service;

import org.springframework.stereotype.Service;

@Service
@FunctionalInterface
public interface MetricConverterService {
    public Double convertMetric(String type, double value);
}
