package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.DeliveryFormat;
import com.commercetools.api.models.subscription.DeliveryPlatformFormat;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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
