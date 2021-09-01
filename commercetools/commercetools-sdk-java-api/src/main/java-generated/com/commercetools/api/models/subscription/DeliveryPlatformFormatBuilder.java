
package com.commercetools.api.models.subscription;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DeliveryPlatformFormatBuilder implements Builder<DeliveryPlatformFormat> {

    public DeliveryPlatformFormat build() {
        return new DeliveryPlatformFormatImpl();
    }

    /**
     * builds DeliveryPlatformFormat without checking for non null required values
     */
    public DeliveryPlatformFormat buildUnchecked() {
        return new DeliveryPlatformFormatImpl();
    }

    public static DeliveryPlatformFormatBuilder of() {
        return new DeliveryPlatformFormatBuilder();
    }

    public static DeliveryPlatformFormatBuilder of(final DeliveryPlatformFormat template) {
        DeliveryPlatformFormatBuilder builder = new DeliveryPlatformFormatBuilder();
        return builder;
    }

}
