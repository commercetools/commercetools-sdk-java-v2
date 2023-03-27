
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantChannelAvailabilityBuilder
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
public class ProductVariantChannelAvailabilityBuilder implements Builder<ProductVariantChannelAvailability> {

    private Boolean isOnStock;

    private Integer restockableInDays;

    private Integer availableQuantity;

    /**
     * set the value to the isOnStock
     * @param isOnStock value to be set
     * @return Builder
     */

    public ProductVariantChannelAvailabilityBuilder isOnStock(final Boolean isOnStock) {
        this.isOnStock = isOnStock;
        return this;
    }

    /**
     * set the value to the restockableInDays
     * @param restockableInDays value to be set
     * @return Builder
     */

    public ProductVariantChannelAvailabilityBuilder restockableInDays(final Integer restockableInDays) {
        this.restockableInDays = restockableInDays;
        return this;
    }

    /**
     * set the value to the availableQuantity
     * @param availableQuantity value to be set
     * @return Builder
     */

    public ProductVariantChannelAvailabilityBuilder availableQuantity(final Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
        return this;
    }

    /**
     * value of isOnStock}
     * @return isOnStock
     */

    public Boolean getIsOnStock() {
        return this.isOnStock;
    }

    /**
     * value of restockableInDays}
     * @return restockableInDays
     */

    public Integer getRestockableInDays() {
        return this.restockableInDays;
    }

    /**
     * value of availableQuantity}
     * @return availableQuantity
     */

    public Integer getAvailableQuantity() {
        return this.availableQuantity;
    }

    /**
     * builds ProductVariantChannelAvailability with checking for non-null required values
     * @return ProductVariantChannelAvailability
     */
    public ProductVariantChannelAvailability build() {
        Objects.requireNonNull(isOnStock, ProductVariantChannelAvailability.class + ": isOnStock is missing");
        Objects.requireNonNull(restockableInDays,
            ProductVariantChannelAvailability.class + ": restockableInDays is missing");
        Objects.requireNonNull(availableQuantity,
            ProductVariantChannelAvailability.class + ": availableQuantity is missing");
        return new ProductVariantChannelAvailabilityImpl(isOnStock, restockableInDays, availableQuantity);
    }

    /**
     * builds ProductVariantChannelAvailability without checking for non-null required values
     * @return ProductVariantChannelAvailability
     */
    public ProductVariantChannelAvailability buildUnchecked() {
        return new ProductVariantChannelAvailabilityImpl(isOnStock, restockableInDays, availableQuantity);
    }

    /**
     * factory method for an instance of ProductVariantChannelAvailabilityBuilder
     * @return builder
     */
    public static ProductVariantChannelAvailabilityBuilder of() {
        return new ProductVariantChannelAvailabilityBuilder();
    }

    /**
     * create builder for ProductVariantChannelAvailability instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantChannelAvailabilityBuilder of(final ProductVariantChannelAvailability template) {
        ProductVariantChannelAvailabilityBuilder builder = new ProductVariantChannelAvailabilityBuilder();
        builder.isOnStock = template.getIsOnStock();
        builder.restockableInDays = template.getRestockableInDays();
        builder.availableQuantity = template.getAvailableQuantity();
        return builder;
    }

}
