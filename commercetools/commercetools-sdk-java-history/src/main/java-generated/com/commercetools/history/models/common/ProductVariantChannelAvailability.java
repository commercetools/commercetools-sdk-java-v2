
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantChannelAvailability
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantChannelAvailability productVariantChannelAvailability = ProductVariantChannelAvailability.builder()
 *             .isOnStock(true)
 *             .restockableInDays(1)
 *             .availableQuantity(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantChannelAvailabilityImpl.class)
public interface ProductVariantChannelAvailability {

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
     * factory method
     * @return instance of ProductVariantChannelAvailability
     */
    public static ProductVariantChannelAvailability of() {
        return new ProductVariantChannelAvailabilityImpl();
    }

    /**
     * factory method to copy an instance of ProductVariantChannelAvailability
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantChannelAvailability of(final ProductVariantChannelAvailability template) {
        ProductVariantChannelAvailabilityImpl instance = new ProductVariantChannelAvailabilityImpl();
        instance.setIsOnStock(template.getIsOnStock());
        instance.setRestockableInDays(template.getRestockableInDays());
        instance.setAvailableQuantity(template.getAvailableQuantity());
        return instance;
    }

    /**
     * builder factory method for ProductVariantChannelAvailability
     * @return builder
     */
    public static ProductVariantChannelAvailabilityBuilder builder() {
        return ProductVariantChannelAvailabilityBuilder.of();
    }

    /**
     * create builder for ProductVariantChannelAvailability instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantChannelAvailabilityBuilder builder(final ProductVariantChannelAvailability template) {
        return ProductVariantChannelAvailabilityBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantChannelAvailability(Function<ProductVariantChannelAvailability, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantChannelAvailability> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantChannelAvailability>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantChannelAvailability>";
            }
        };
    }
}
