package com.playsafe.assessment.aoplogger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StopWatch;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
@Configuration

public class EndPointExecutionTimer {

	Logger log = LoggerFactory.getLogger(this.getClass());

	@Around("execution(* com.playsafe.assessment.metriccontroller.MetricConverterController+.*(..))")
	public Object ExecutionTimeLoggingAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

		MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();

		// Get intercepted method details
		String className = methodSignature.getDeclaringType().getSimpleName();
		String methodName = methodSignature.getName();

		final StopWatch stopWatch = new StopWatch();

		// Measure method execution time
		stopWatch.start();
		Object proceed = proceedingJoinPoint.proceed();
		stopWatch.stop();

		// Log method execution time
		log.info("Execution time of " + className + "." + methodName + " " + ":: " + stopWatch.getTotalTimeMillis()
				+ " ms");

		return proceed;
	}

}
