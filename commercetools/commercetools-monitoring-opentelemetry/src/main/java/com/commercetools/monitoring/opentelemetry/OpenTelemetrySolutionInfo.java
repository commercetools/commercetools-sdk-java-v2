
package com.commercetools.monitoring.opentelemetry;

import io.vrap.rmf.base.client.SolutionInfo;

public class OpenTelemetrySolutionInfo extends SolutionInfo {
    public OpenTelemetrySolutionInfo() {
        setName("commercetools-monitoring-opentelemetry");
        setVersion(BuildInfo.VERSION);
    }
}
