
package com.commercetools.monitoring.dynatrace;

import io.vrap.rmf.base.client.SolutionInfo;

public class DynatraceSolutionInfo extends SolutionInfo {
    public DynatraceSolutionInfo() {
        setName("commercetools-monitoring-dynatrace");
        setVersion(BuildInfo.VERSION);
    }
}
