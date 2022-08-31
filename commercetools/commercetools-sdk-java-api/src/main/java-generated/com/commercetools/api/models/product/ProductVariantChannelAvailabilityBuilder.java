
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantChannelAvailabilityBuilder
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
public class ProductVariantChannelAvailabilityBuilder implements Builder<ProductVariantChannelAvailability> {

    @Nullable
    private Boolean isOnStock;

    @Nullable
    private Long restockableInDays;

    @Nullable
    private Long availableQuantity;

    private String id;

    private Long version;

    /**
     *  <p>Indicates whether a Product Variant is in stock in a specified Channel.</p>
     */

    public ProductVariantChannelAvailabilityBuilder isOnStock(@Nullable final Boolean isOnStock) {
        this.isOnStock = isOnStock;
        return this;
    }

    /**
     *  <p>Number of days to restock a Product Variant once it is out of stock in a specified Channel.</p>
     */

    public ProductVariantChannelAvailabilityBuilder restockableInDays(@Nullable final Long restockableInDays) {
        this.restockableInDays = restockableInDays;
        return this;
    }

    /**
     *  <p>Number of items of this Product Variant that are in stock in a specified Channel.</p>
     */

    public ProductVariantChannelAvailabilityBuilder availableQuantity(@Nullable final Long availableQuantity) {
        this.availableQuantity = availableQuantity;
        return this;
    }

    /**
     *  <p>Unique identifier of the InventoryEntry.</p>
     */

    public ProductVariantChannelAvailabilityBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the InventoryEntry.</p>
     */

    public ProductVariantChannelAvailabilityBuilder version(final Long version) {
        this.version = version;
        return this;
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

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public ProductVariantChannelAvailability build() {
        Objects.requireNonNull(id, ProductVariantChannelAvailability.class + ": id is missing");
        Objects.requireNonNull(version, ProductVariantChannelAvailability.class + ": version is missing");
        return new ProductVariantChannelAvailabilityImpl(isOnStock, restockableInDays, availableQuantity, id, version);
    }

    /**
     * builds ProductVariantChannelAvailability without checking for non null required values
     */
    public ProductVariantChannelAvailability buildUnchecked() {
        return new ProductVariantChannelAvailabilityImpl(isOnStock, restockableInDays, availableQuantity, id, version);
    }

    public static ProductVariantChannelAvailabilityBuilder of() {
        return new ProductVariantChannelAvailabilityBuilder();
    }

    public static ProductVariantChannelAvailabilityBuilder of(final ProductVariantChannelAvailability template) {
        ProductVariantChannelAvailabilityBuilder builder = new ProductVariantChannelAvailabilityBuilder();
        builder.isOnStock = template.getIsOnStock();
        builder.restockableInDays = template.getRestockableInDays();
        builder.availableQuantity = template.getAvailableQuantity();
        builder.id = template.getId();
        builder.version = template.getVersion();
        return builder;
    }

}
