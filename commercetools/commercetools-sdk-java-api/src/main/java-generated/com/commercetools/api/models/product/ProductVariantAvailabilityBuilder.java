
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantAvailabilityBuilder
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
public class ProductVariantAvailabilityBuilder implements Builder<ProductVariantAvailability> {

    @Nullable
    private com.commercetools.api.models.product.ProductVariantChannelAvailabilityMap channels;

    @Nullable
    private Boolean isOnStock;

    @Nullable
    private Long restockableInDays;

    @Nullable
    private Long availableQuantity;

    /**
     *  <p>For each InventoryEntry with a supply Channel, an entry is added to <code>channels</code>.</p>
     * @return Builder
     */

    public ProductVariantAvailabilityBuilder channels(
            Function<com.commercetools.api.models.product.ProductVariantChannelAvailabilityMapBuilder, com.commercetools.api.models.product.ProductVariantChannelAvailabilityMapBuilder> builder) {
        this.channels = builder
                .apply(com.commercetools.api.models.product.ProductVariantChannelAvailabilityMapBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>For each InventoryEntry with a supply Channel, an entry is added to <code>channels</code>.</p>
     * @param channels
     * @return Builder
     */

    public ProductVariantAvailabilityBuilder channels(
            @Nullable final com.commercetools.api.models.product.ProductVariantChannelAvailabilityMap channels) {
        this.channels = channels;
        return this;
    }

    /**
     *  <p>Indicates whether a Product Variant is in stock.</p>
     * @param isOnStock
     * @return Builder
     */

    public ProductVariantAvailabilityBuilder isOnStock(@Nullable final Boolean isOnStock) {
        this.isOnStock = isOnStock;
        return this;
    }

    /**
     *  <p>Number of days to restock a Product Variant once it is out of stock.</p>
     * @param restockableInDays
     * @return Builder
     */

    public ProductVariantAvailabilityBuilder restockableInDays(@Nullable final Long restockableInDays) {
        this.restockableInDays = restockableInDays;
        return this;
    }

    /**
     *  <p>Number of items of the Product Variant that are in stock.</p>
     * @param availableQuantity
     * @return Builder
     */

    public ProductVariantAvailabilityBuilder availableQuantity(@Nullable final Long availableQuantity) {
        this.availableQuantity = availableQuantity;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.product.ProductVariantChannelAvailabilityMap getChannels() {
        return this.channels;
    }

    @Nullable
    public Boolean getIsOnStock() {
        return this.isOnStock;
    }

    @Nullable
    public Long getRestockableInDays() {
        return this.restockableInDays;
    }

    @Nullable
    public Long getAvailableQuantity() {
        return this.availableQuantity;
    }

    public ProductVariantAvailability build() {
        return new ProductVariantAvailabilityImpl(channels, isOnStock, restockableInDays, availableQuantity);
    }

    /**
     * builds ProductVariantAvailability without checking for non null required values
     */
    public ProductVariantAvailability buildUnchecked() {
        return new ProductVariantAvailabilityImpl(channels, isOnStock, restockableInDays, availableQuantity);
    }

    public static ProductVariantAvailabilityBuilder of() {
        return new ProductVariantAvailabilityBuilder();
    }

    public static ProductVariantAvailabilityBuilder of(final ProductVariantAvailability template) {
        ProductVariantAvailabilityBuilder builder = new ProductVariantAvailabilityBuilder();
        builder.channels = template.getChannels();
        builder.isOnStock = template.getIsOnStock();
        builder.restockableInDays = template.getRestockableInDays();
        builder.availableQuantity = template.getAvailableQuantity();
        return builder;
    }

}
