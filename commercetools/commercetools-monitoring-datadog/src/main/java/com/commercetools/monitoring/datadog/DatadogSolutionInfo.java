
package com.commercetools.monitoring.datadog;

import io.vrap.rmf.base.client.SolutionInfo;

public class DatadogSolutionInfo extends SolutionInfo {
    public DatadogSolutionInfo() {
        setName("commercetools-monitoring-datadog");
        setVersion(BuildInfo.VERSION);
    }
}
