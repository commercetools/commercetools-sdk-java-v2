
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * DeliveryFormat
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryFormat deliveryFormat = DeliveryFormat.cloudEventsBuilder()
 *             cloudEventsVersion("{cloudEventsVersion}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.CloudEventsFormatImpl.class, name = CloudEventsFormat.CLOUD_EVENTS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.PlatformFormatImpl.class, name = PlatformFormat.PLATFORM) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = DeliveryFormatImpl.class, visible = true)
@JsonDeserialize(as = DeliveryFormatImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface DeliveryFormat {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     * factory method to create a deep copy of DeliveryFormat
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DeliveryFormat deepCopy(@Nullable final DeliveryFormat template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.subscription.CloudEventsFormat) {
            return com.commercetools.api.models.subscription.CloudEventsFormat
                    .deepCopy((com.commercetools.api.models.subscription.CloudEventsFormat) template);
        }
        if (template instanceof com.commercetools.api.models.subscription.PlatformFormat) {
            return com.commercetools.api.models.subscription.PlatformFormat
                    .deepCopy((com.commercetools.api.models.subscription.PlatformFormat) template);
        }
        DeliveryFormatImpl instance = new DeliveryFormatImpl();
        return instance;
    }

    /**
     * builder for cloudEvents subtype
     * @return builder
     */
    public static com.commercetools.api.models.subscription.CloudEventsFormatBuilder cloudEventsBuilder() {
        return com.commercetools.api.models.subscription.CloudEventsFormatBuilder.of();
    }

    /**
     * builder for platform subtype
     * @return builder
     */
    public static com.commercetools.api.models.subscription.PlatformFormatBuilder platformBuilder() {
        return com.commercetools.api.models.subscription.PlatformFormatBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDeliveryFormat(Function<DeliveryFormat, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryFormat> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryFormat>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryFormat>";
            }
        };
    }
}
