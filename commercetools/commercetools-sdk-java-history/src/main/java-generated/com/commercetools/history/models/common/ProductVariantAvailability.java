
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ProductVariantAvailability
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantAvailability productVariantAvailability = ProductVariantAvailability.builder()
 *             .isOnStock(true)
 *             .restockableInDays(1)
 *             .availableQuantity(1)
 *             .channels(channelsBuilder -> channelsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantAvailabilityImpl.class)
public interface ProductVariantAvailability {

    /**
     *
     * @return isOnStock
     */
    @NotNull
    @JsonProperty("isOnStock")
    public Boolean getIsOnStock();

    /**
     *
     * @return restockableInDays
     */
    @NotNull
    @JsonProperty("restockableInDays")
    public Integer getRestockableInDays();

    /**
     *
     * @return availableQuantity
     */
    @NotNull
    @JsonProperty("availableQuantity")
    public Integer getAvailableQuantity();

    /**
     *
     * @return channels
     */
    @NotNull
    @Valid
    @JsonProperty("channels")
    public ProductVariantChannelAvailabilityMap getChannels();

    /**
     * set isOnStock
     * @param isOnStock value to be set
     */

    public void setIsOnStock(final Boolean isOnStock);

    /**
     * set restockableInDays
     * @param restockableInDays value to be set
     */

    public void setRestockableInDays(final Integer restockableInDays);

    /**
     * set availableQuantity
     * @param availableQuantity value to be set
     */

    public void setAvailableQuantity(final Integer availableQuantity);

    /**
     * set channels
     * @param channels value to be set
     */

    public void setChannels(final ProductVariantChannelAvailabilityMap channels);

    /**
     * factory method
     * @return instance of ProductVariantAvailability
     */
    public static ProductVariantAvailability of() {
        return new ProductVariantAvailabilityImpl();
    }

    /**
     * factory method to create a shallow copy ProductVariantAvailability
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantAvailability of(final ProductVariantAvailability template) {
        ProductVariantAvailabilityImpl instance = new ProductVariantAvailabilityImpl();
        instance.setIsOnStock(template.getIsOnStock());
        instance.setRestockableInDays(template.getRestockableInDays());
        instance.setAvailableQuantity(template.getAvailableQuantity());
        instance.setChannels(template.getChannels());
        return instance;
    }

    public ProductVariantAvailability copyDeep();

    /**
     * factory method to create a deep copy of ProductVariantAvailability
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariantAvailability deepCopy(@Nullable final ProductVariantAvailability template) {
        if (template == null) {
            return null;
        }
        ProductVariantAvailabilityImpl instance = new ProductVariantAvailabilityImpl();
        instance.setIsOnStock(template.getIsOnStock());
        instance.setRestockableInDays(template.getRestockableInDays());
        instance.setAvailableQuantity(template.getAvailableQuantity());
        instance.setChannels(com.commercetools.history.models.common.ProductVariantChannelAvailabilityMap
                .deepCopy(template.getChannels()));
        return instance;
    }

    /**
     * builder factory method for ProductVariantAvailability
     * @return builder
     */
    public static ProductVariantAvailabilityBuilder builder() {
        return ProductVariantAvailabilityBuilder.of();
    }

    /**
     * create builder for ProductVariantAvailability instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantAvailabilityBuilder builder(final ProductVariantAvailability template) {
        return ProductVariantAvailabilityBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantAvailability(Function<ProductVariantAvailability, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantAvailability> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantAvailability>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantAvailability>";
            }
        };
    }
}
