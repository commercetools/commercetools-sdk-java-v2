
package com.commercetools.api.models.subscription;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryFormatBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryFormatBuilder {

    public com.commercetools.api.models.subscription.CloudEventsFormatBuilder cloudEventsBuilder() {
        return com.commercetools.api.models.subscription.CloudEventsFormatBuilder.of();
    }

    public com.commercetools.api.models.subscription.PlatformFormatBuilder platformBuilder() {
        return com.commercetools.api.models.subscription.PlatformFormatBuilder.of();
    }

    /**
     * factory method for an instance of DeliveryFormatBuilder
     * @return builder
     */
    public static DeliveryFormatBuilder of() {
        return new DeliveryFormatBuilder();
    }
}
