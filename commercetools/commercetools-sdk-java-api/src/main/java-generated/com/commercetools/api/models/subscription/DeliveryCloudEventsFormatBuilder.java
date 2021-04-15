
package com.commercetools.api.models.subscription;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DeliveryCloudEventsFormatBuilder {

    private String cloudEventsVersion;

    public DeliveryCloudEventsFormatBuilder cloudEventsVersion(final String cloudEventsVersion) {
        this.cloudEventsVersion = cloudEventsVersion;
        return this;
    }

    public String getCloudEventsVersion() {
        return this.cloudEventsVersion;
    }

    public DeliveryCloudEventsFormat build() {
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
