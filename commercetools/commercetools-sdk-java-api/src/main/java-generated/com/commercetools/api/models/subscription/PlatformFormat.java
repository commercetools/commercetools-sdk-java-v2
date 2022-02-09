
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PlatformFormatImpl.class)
public interface PlatformFormat extends DeliveryFormat {

    String PLATFORM = "Platform";

    public static PlatformFormat of() {
        return new PlatformFormatImpl();
    }

    public static PlatformFormat of(final PlatformFormat template) {
        PlatformFormatImpl instance = new PlatformFormatImpl();
        return instance;
    }

    public static PlatformFormatBuilder builder() {
        return PlatformFormatBuilder.of();
    }

    public static PlatformFormatBuilder builder(final PlatformFormat template) {
        return PlatformFormatBuilder.of(template);
    }

    default <T> T withPlatformFormat(Function<PlatformFormat, T> helper) {
        return helper.apply(this);
    }
}
