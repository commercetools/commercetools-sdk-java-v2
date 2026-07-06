
package com.commercetools.api.models.variant_attributes;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Availability of a Variant in a specific supply <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantAttributesChannelAvailability variantAttributesChannelAvailability = VariantAttributesChannelAvailability.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantAttributesChannelAvailabilityImpl.class)
public interface VariantAttributesChannelAvailability {

    /**
     *  <p>Indicates whether the Variant is in stock in the specified <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p>
     * @return isOnStock
     */

    @JsonProperty("isOnStock")
    public Boolean getIsOnStock();

    /**
     *  <p>Number of items of this Variant that are in stock in the specified <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p>
     * @return availableQuantity
     */

    @JsonProperty("availableQuantity")
    public Long getAvailableQuantity();

    /**
     *  <p>Indicates whether the Variant is in stock in the specified <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p>
     * @param isOnStock value to be set
     */

    public void setIsOnStock(final Boolean isOnStock);

    /**
     *  <p>Number of items of this Variant that are in stock in the specified <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p>
     * @param availableQuantity value to be set
     */

    public void setAvailableQuantity(final Long availableQuantity);

    /**
     * factory method
     * @return instance of VariantAttributesChannelAvailability
     */
    public static VariantAttributesChannelAvailability of() {
        return new VariantAttributesChannelAvailabilityImpl();
    }

    /**
     * factory method to create a shallow copy VariantAttributesChannelAvailability
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantAttributesChannelAvailability of(final VariantAttributesChannelAvailability template) {
        VariantAttributesChannelAvailabilityImpl instance = new VariantAttributesChannelAvailabilityImpl();
        instance.setIsOnStock(template.getIsOnStock());
        instance.setAvailableQuantity(template.getAvailableQuantity());
        return instance;
    }

    public VariantAttributesChannelAvailability copyDeep();

    /**
     * factory method to create a deep copy of VariantAttributesChannelAvailability
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantAttributesChannelAvailability deepCopy(
            @Nullable final VariantAttributesChannelAvailability template) {
        if (template == null) {
            return null;
        }
        VariantAttributesChannelAvailabilityImpl instance = new VariantAttributesChannelAvailabilityImpl();
        instance.setIsOnStock(template.getIsOnStock());
        instance.setAvailableQuantity(template.getAvailableQuantity());
        return instance;
    }

    /**
     * builder factory method for VariantAttributesChannelAvailability
     * @return builder
     */
    public static VariantAttributesChannelAvailabilityBuilder builder() {
        return VariantAttributesChannelAvailabilityBuilder.of();
    }

    /**
     * create builder for VariantAttributesChannelAvailability instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantAttributesChannelAvailabilityBuilder builder(
            final VariantAttributesChannelAvailability template) {
        return VariantAttributesChannelAvailabilityBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantAttributesChannelAvailability(Function<VariantAttributesChannelAvailability, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantAttributesChannelAvailability> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantAttributesChannelAvailability>() {
            @Override
            public String toString() {
                return "TypeReference<VariantAttributesChannelAvailability>";
            }
        };
    }
}
