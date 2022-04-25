
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.CloudEventsFormatImpl.class, name = CloudEventsFormat.CLOUD_EVENTS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.PlatformFormatImpl.class, name = PlatformFormat.PLATFORM) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = DeliveryFormatImpl.class, visible = true)
@JsonDeserialize(as = DeliveryFormatImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface DeliveryFormat {

    @NotNull
    @JsonProperty("type")
    public String getType();

    public static com.commercetools.api.models.subscription.CloudEventsFormatBuilder cloudEventsBuilder() {
        return com.commercetools.api.models.subscription.CloudEventsFormatBuilder.of();
    }

    public static com.commercetools.api.models.subscription.PlatformFormatBuilder platformBuilder() {
        return com.commercetools.api.models.subscription.PlatformFormatBuilder.of();
    }

    default <T> T withDeliveryFormat(Function<DeliveryFormat, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryFormat> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryFormat>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryFormat>";
            }
        };
    }
}
