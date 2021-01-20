
package com.commercetools.api.models.subscription;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.subscription.DeliveryFormat;
import com.commercetools.api.models.subscription.DeliveryPlatformFormat;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DeliveryPlatformFormatBuilder {

    public DeliveryPlatformFormat build() {
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
