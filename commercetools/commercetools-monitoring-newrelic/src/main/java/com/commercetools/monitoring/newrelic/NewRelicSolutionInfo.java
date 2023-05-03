
package com.commercetools.monitoring.newrelic;

import io.vrap.rmf.base.client.BuildInfo;
import io.vrap.rmf.base.client.SolutionInfo;

public class NewRelicSolutionInfo extends SolutionInfo {
    public NewRelicSolutionInfo() {
        setName("commercetools-monitoring-newrelic");
        setVersion(BuildInfo.VERSION);
    }
}
