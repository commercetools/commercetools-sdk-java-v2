
package com.commercetools.api.models.subscription;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DeliveryCloudEventsFormatBuilder implements Builder<DeliveryCloudEventsFormat> {

    private String cloudEventsVersion;

    public DeliveryCloudEventsFormatBuilder cloudEventsVersion(final String cloudEventsVersion) {
        this.cloudEventsVersion = cloudEventsVersion;
        return this;
    }

    public String getCloudEventsVersion() {
        return this.cloudEventsVersion;
    }

    public DeliveryCloudEventsFormat build() {
        Objects.requireNonNull(cloudEventsVersion, DeliveryCloudEventsFormat.class + ": cloudEventsVersion is missing");
        return new DeliveryCloudEventsFormatImpl(cloudEventsVersion);
    }

    /**
     * builds DeliveryCloudEventsFormat without checking for non null required values
     */
    public DeliveryCloudEventsFormat buildUnchecked() {
        return new DeliveryCloudEventsFormatImpl(cloudEventsVersion);
    }

    public static DeliveryCloudEventsFormatBuilder of() {
        return new DeliveryCloudEventsFormatBuilder();
    }

    public static DeliveryCloudEventsFormatBuilder of(final DeliveryCloudEventsFormat template) {
        DeliveryCloudEventsFormatBuilder builder = new DeliveryCloudEventsFormatBuilder();
        builder.cloudEventsVersion = template.getCloudEventsVersion();
        return builder;
    }

}
