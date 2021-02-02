
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DeliveryPlatformFormatImpl.class)
public interface DeliveryPlatformFormat extends DeliveryFormat {

    String PLATFORM = "Platform";

    public static DeliveryPlatformFormat of() {
        return new DeliveryPlatformFormatImpl();
    }

    public static DeliveryPlatformFormat of(final DeliveryPlatformFormat template) {
        DeliveryPlatformFormatImpl instance = new DeliveryPlatformFormatImpl();
        return instance;
    }

    public static DeliveryPlatformFormatBuilder builder() {
        return DeliveryPlatformFormatBuilder.of();
    }

    public static DeliveryPlatformFormatBuilder builder(final DeliveryPlatformFormat template) {
        return DeliveryPlatformFormatBuilder.of(template);
    }

    default <T> T withDeliveryPlatformFormat(Function<DeliveryPlatformFormat, T> helper) {
        return helper.apply(this);
    }
}
