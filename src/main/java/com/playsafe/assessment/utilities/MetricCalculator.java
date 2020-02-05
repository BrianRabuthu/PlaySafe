package com.playsafe.assessment.utilities;

import java.util.function.Function;

public class MetricCalculator {


    public static final Function<Double, Double> KTOC = k -> k + 273.15;
    public static final Function<Double, Double> CTOK = c -> c - 273.15;
    public static final Function<Double, Double> MTOK = m -> m * 1.609344;
    public static final Function<Double, Double> KTOM = kl -> kl * 0.621;
}
