
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ProductVariantChannelAvailability
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantChannelAvailability productVariantChannelAvailability = ProductVariantChannelAvailability.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantChannelAvailabilityImpl.class)
public interface ProductVariantChannelAvailability {

    /**
     *  <p>Indicates whether a Product Variant is in stock in a specified Channel.</p>
     * @return isOnStock
     */

    @JsonProperty("isOnStock")
    public Boolean getIsOnStock();

    /**
     *  <p>Number of days to restock a Product Variant once it is out of stock in a specified Channel.</p>
     * @return restockableInDays
     */

    @JsonProperty("restockableInDays")
    public Long getRestockableInDays();

    /**
     *  <p>Number of items of this Product Variant that are in stock in a specified Channel.</p>
     * @return availableQuantity
     */

    @JsonProperty("availableQuantity")
    public Long getAvailableQuantity();

    /**
     *  <p>Unique identifier of the InventoryEntry.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the InventoryEntry.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Indicates whether a Product Variant is in stock in a specified Channel.</p>
     * @param isOnStock value to be set
     */

    public void setIsOnStock(final Boolean isOnStock);

    /**
     *  <p>Number of days to restock a Product Variant once it is out of stock in a specified Channel.</p>
     * @param restockableInDays value to be set
     */

    public void setRestockableInDays(final Long restockableInDays);

    /**
     *  <p>Number of items of this Product Variant that are in stock in a specified Channel.</p>
     * @param availableQuantity value to be set
     */

    public void setAvailableQuantity(final Long availableQuantity);

    /**
     *  <p>Unique identifier of the InventoryEntry.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the InventoryEntry.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     * factory method
     * @return instance of ProductVariantChannelAvailability
     */
    public static ProductVariantChannelAvailability of() {
        return new ProductVariantChannelAvailabilityImpl();
    }

    /**
     * factory method to create a shallow copy ProductVariantChannelAvailability
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantChannelAvailability of(final ProductVariantChannelAvailability template) {
        ProductVariantChannelAvailabilityImpl instance = new ProductVariantChannelAvailabilityImpl();
        instance.setIsOnStock(template.getIsOnStock());
        instance.setRestockableInDays(template.getRestockableInDays());
        instance.setAvailableQuantity(template.getAvailableQuantity());
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductVariantChannelAvailability
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariantChannelAvailability deepCopy(
            @Nullable final ProductVariantChannelAvailability template) {
        if (template == null) {
            return null;
        }
        ProductVariantChannelAvailabilityImpl instance = new ProductVariantChannelAvailabilityImpl();
        instance.setIsOnStock(template.getIsOnStock());
        instance.setRestockableInDays(template.getRestockableInDays());
        instance.setAvailableQuantity(template.getAvailableQuantity());
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
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
