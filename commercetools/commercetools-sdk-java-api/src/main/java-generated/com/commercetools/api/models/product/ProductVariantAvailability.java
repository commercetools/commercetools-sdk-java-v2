
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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
     */
    @Valid
    @JsonProperty("channels")
    public ProductVariantChannelAvailabilityMap getChannels();

    /**
     *  <p>Indicates whether a Product Variant is in stock.</p>
     */

    @JsonProperty("isOnStock")
    public Boolean getIsOnStock();

    /**
     *  <p>Number of days to restock a Product Variant once it is out of stock.</p>
     */

    @JsonProperty("restockableInDays")
    public Long getRestockableInDays();

    /**
     *  <p>Number of items of the Product Variant that are in stock.</p>
     */

    @JsonProperty("availableQuantity")
    public Long getAvailableQuantity();

    public void setChannels(final ProductVariantChannelAvailabilityMap channels);

    public void setIsOnStock(final Boolean isOnStock);

    public void setRestockableInDays(final Long restockableInDays);

    public void setAvailableQuantity(final Long availableQuantity);

    public static ProductVariantAvailability of() {
        return new ProductVariantAvailabilityImpl();
    }

    public static ProductVariantAvailability of(final ProductVariantAvailability template) {
        ProductVariantAvailabilityImpl instance = new ProductVariantAvailabilityImpl();
        instance.setChannels(template.getChannels());
        instance.setIsOnStock(template.getIsOnStock());
        instance.setRestockableInDays(template.getRestockableInDays());
        instance.setAvailableQuantity(template.getAvailableQuantity());
        return instance;
    }

    public static ProductVariantAvailabilityBuilder builder() {
        return ProductVariantAvailabilityBuilder.of();
    }

    public static ProductVariantAvailabilityBuilder builder(final ProductVariantAvailability template) {
        return ProductVariantAvailabilityBuilder.of(template);
    }

    default <T> T withProductVariantAvailability(Function<ProductVariantAvailability, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantAvailability> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantAvailability>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantAvailability>";
            }
        };
    }
}
