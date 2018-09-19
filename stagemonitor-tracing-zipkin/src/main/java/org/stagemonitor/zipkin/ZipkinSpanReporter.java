package org.stagemonitor.zipkin;

import org.stagemonitor.configuration.ConfigurationRegistry;
import org.stagemonitor.tracing.B3HeaderFormat;
import org.stagemonitor.tracing.SpanContextInformation;
import org.stagemonitor.tracing.reporter.SpanReporter;
import org.stagemonitor.tracing.wrapper.SpanWrapper;

import java.util.Map;


public class ZipkinSpanReporter extends SpanReporter {

	public ZipkinSpanReporter() {
		// TODO
	}

	@Override
	public void init(ConfigurationRegistry configurationRegistry) {
		// TODO
	}

	@Override
	public void report(SpanContextInformation spanContext, final SpanWrapper spanWrapper) {
		// TODO
	}

	@Override
	public boolean isActive(SpanContextInformation spanContext) {
		return true;
	}

	@Override
	public void updateSpan(B3HeaderFormat.B3Identifiers spanIdentifiers,
												 B3HeaderFormat.B3Identifiers newSpanIdentifiers,
												 Map<String, Object> tagsToUpdate) {
		// TODO
	}
}
