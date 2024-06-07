
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The InventoryEntry information of the Product Variant. If there is a supply Channel for the InventoryEntry, then <code>channels</code> is returned. If not, then <code>isOnStock</code>, <code>restockableInDays</code>, and <code>quantityOnStock</code> are returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantAvailability productVariantAvailability = ProductVariantAvailability.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantAvailabilityImpl.class)
public interface ProductVariantAvailability {

    /**
     *  <p>For each InventoryEntry with a supply Channel, an entry is added to <code>channels</code>.</p>
     * @return channels
     */
    @Valid
    @JsonProperty("channels")
    public ProductVariantChannelAvailabilityMap getChannels();

    /**
     *  <p>Indicates whether a Product Variant is in stock.</p>
     * @return isOnStock
     */

    @JsonProperty("isOnStock")
    public Boolean getIsOnStock();

    /**
     *  <p>Number of days to restock a Product Variant once it is out of stock.</p>
     * @return restockableInDays
     */

    @JsonProperty("restockableInDays")
    public Long getRestockableInDays();

    /**
     *  <p>Number of items of the Product Variant that are in stock.</p>
     * @return availableQuantity
     */

    @JsonProperty("availableQuantity")
    public Long getAvailableQuantity();

    /**
     *  <p>Unique identifier of the InventoryEntry.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the InventoryEntry.</p>
     * @return version
     */

    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>For each InventoryEntry with a supply Channel, an entry is added to <code>channels</code>.</p>
     * @param channels value to be set
     */

    public void setChannels(final ProductVariantChannelAvailabilityMap channels);

    /**
     *  <p>Indicates whether a Product Variant is in stock.</p>
     * @param isOnStock value to be set
     */

    public void setIsOnStock(final Boolean isOnStock);

    /**
     *  <p>Number of days to restock a Product Variant once it is out of stock.</p>
     * @param restockableInDays value to be set
     */

    public void setRestockableInDays(final Long restockableInDays);

    /**
     *  <p>Number of items of the Product Variant that are in stock.</p>
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
        instance.setChannels(template.getChannels());
        instance.setIsOnStock(template.getIsOnStock());
        instance.setRestockableInDays(template.getRestockableInDays());
        instance.setAvailableQuantity(template.getAvailableQuantity());
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        return instance;
    }

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
        instance.setChannels(
            com.commercetools.api.models.product.ProductVariantChannelAvailabilityMap.deepCopy(template.getChannels()));
        instance.setIsOnStock(template.getIsOnStock());
        instance.setRestockableInDays(template.getRestockableInDays());
        instance.setAvailableQuantity(template.getAvailableQuantity());
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
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
