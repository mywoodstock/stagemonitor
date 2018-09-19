package org.stagemonitor.tracing.zipkin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.stagemonitor.configuration.ConfigurationRegistry;
import org.stagemonitor.tracing.B3HeaderFormat;
import org.stagemonitor.tracing.SpanContextInformation;
import org.stagemonitor.tracing.reporter.SpanReporter;
import org.stagemonitor.tracing.wrapper.SpanWrapper;

import java.util.Map;


public class ZipkinSpanReporter extends SpanReporter {

	static final String ZIPKIN_SPAN_LOGGER = "ZipkinSpanReporter";
	private static final Logger logger = LoggerFactory.getLogger(ZipkinSpanReporter.class);
	private final Logger spanLogger;

	public ZipkinSpanReporter() {
		this(LoggerFactory.getLogger(ZIPKIN_SPAN_LOGGER));
		logger.info("ZipkinSpanReporter constructed.");
		System.out.println("ZipkinSpanReporter constructed.");
	}

	ZipkinSpanReporter(Logger spanLogger) {
		this.spanLogger = spanLogger;
	}

	@Override
	public void init(ConfigurationRegistry configurationRegistry) {
		// TODO
		logger.info("ZipkinSpanReporter initialized.");
		System.out.println("ZipkinSpanReporter initialized.");
	}

	@Override
	public void report(SpanContextInformation spanContext, final SpanWrapper spanWrapper) {
		// TODO
		logger.info("Calling report with: " + spanWrapper.toString());
		System.out.println("Calling report with: " + spanWrapper.toString());
	}

	@Override
	public boolean isActive(SpanContextInformation spanContext) {
		System.out.println("IS ACTIVE????????????????????????????????");
		logger.info("IS ACTIVE????????????????????????????????");
		return true;
	}

	@Override
	public void updateSpan(B3HeaderFormat.B3Identifiers spanIdentifiers,
												 B3HeaderFormat.B3Identifiers newSpanIdentifiers,
												 Map<String, Object> tagsToUpdate) {
		// TODO
		logger.info("Update span!!!");
		System.out.println("Update span!!!");
	}
}
