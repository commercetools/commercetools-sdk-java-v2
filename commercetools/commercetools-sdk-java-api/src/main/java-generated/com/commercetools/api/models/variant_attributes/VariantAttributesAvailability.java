
package com.commercetools.api.models.variant_attributes;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Lightweight availability information for a Variant. Present only if <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntries</a> exist for the Variant's SKU.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantAttributesAvailability variantAttributesAvailability = VariantAttributesAvailability.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantAttributesAvailabilityImpl.class)
public interface VariantAttributesAvailability {

    /**
     *  <p>Indicates whether the Variant is in stock.</p>
     * @return isOnStock
     */

    @JsonProperty("isOnStock")
    public Boolean getIsOnStock();

    /**
     *  <p>Number of items of this Variant that are in stock.</p>
     * @return availableQuantity
     */

    @JsonProperty("availableQuantity")
    public Long getAvailableQuantity();

    /**
     *  <p>Per-channel availability for the requested supply <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channels</a>. Present only when the <code>filter[supplyChannels]</code> query parameter is provided.</p>
     * @return channels
     */
    @Valid
    @JsonProperty("channels")
    public VariantAttributesChannelAvailabilityMap getChannels();

    /**
     *  <p>Indicates whether the Variant is in stock.</p>
     * @param isOnStock value to be set
     */

    public void setIsOnStock(final Boolean isOnStock);

    /**
     *  <p>Number of items of this Variant that are in stock.</p>
     * @param availableQuantity value to be set
     */

    public void setAvailableQuantity(final Long availableQuantity);

    /**
     *  <p>Per-channel availability for the requested supply <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channels</a>. Present only when the <code>filter[supplyChannels]</code> query parameter is provided.</p>
     * @param channels value to be set
     */

    public void setChannels(final VariantAttributesChannelAvailabilityMap channels);

    /**
     * factory method
     * @return instance of VariantAttributesAvailability
     */
    public static VariantAttributesAvailability of() {
        return new VariantAttributesAvailabilityImpl();
    }

    /**
     * factory method to create a shallow copy VariantAttributesAvailability
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantAttributesAvailability of(final VariantAttributesAvailability template) {
        VariantAttributesAvailabilityImpl instance = new VariantAttributesAvailabilityImpl();
        instance.setIsOnStock(template.getIsOnStock());
        instance.setAvailableQuantity(template.getAvailableQuantity());
        instance.setChannels(template.getChannels());
        return instance;
    }

    public VariantAttributesAvailability copyDeep();

    /**
     * factory method to create a deep copy of VariantAttributesAvailability
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantAttributesAvailability deepCopy(@Nullable final VariantAttributesAvailability template) {
        if (template == null) {
            return null;
        }
        VariantAttributesAvailabilityImpl instance = new VariantAttributesAvailabilityImpl();
        instance.setIsOnStock(template.getIsOnStock());
        instance.setAvailableQuantity(template.getAvailableQuantity());
        instance.setChannels(com.commercetools.api.models.variant_attributes.VariantAttributesChannelAvailabilityMap
                .deepCopy(template.getChannels()));
        return instance;
    }

    /**
     * builder factory method for VariantAttributesAvailability
     * @return builder
     */
    public static VariantAttributesAvailabilityBuilder builder() {
        return VariantAttributesAvailabilityBuilder.of();
    }

    /**
     * create builder for VariantAttributesAvailability instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantAttributesAvailabilityBuilder builder(final VariantAttributesAvailability template) {
        return VariantAttributesAvailabilityBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantAttributesAvailability(Function<VariantAttributesAvailability, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantAttributesAvailability> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantAttributesAvailability>() {
            @Override
            public String toString() {
                return "TypeReference<VariantAttributesAvailability>";
            }
        };
    }
}
