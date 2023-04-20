
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantAvailabilityBuilder
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
public class ProductVariantAvailabilityBuilder implements Builder<ProductVariantAvailability> {

    private Boolean isOnStock;

    private Integer restockableInDays;

    private Integer availableQuantity;

    private com.commercetools.history.models.common.ProductVariantChannelAvailabilityMap channels;

    /**
     * set the value to the isOnStock
     * @param isOnStock value to be set
     * @return Builder
     */

    public ProductVariantAvailabilityBuilder isOnStock(final Boolean isOnStock) {
        this.isOnStock = isOnStock;
        return this;
    }

    /**
     * set the value to the restockableInDays
     * @param restockableInDays value to be set
     * @return Builder
     */

    public ProductVariantAvailabilityBuilder restockableInDays(final Integer restockableInDays) {
        this.restockableInDays = restockableInDays;
        return this;
    }

    /**
     * set the value to the availableQuantity
     * @param availableQuantity value to be set
     * @return Builder
     */

    public ProductVariantAvailabilityBuilder availableQuantity(final Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
        return this;
    }

    /**
     * set the value to the channels using the builder function
     * @param builder function to build the channels value
     * @return Builder
     */

    public ProductVariantAvailabilityBuilder channels(
            Function<com.commercetools.history.models.common.ProductVariantChannelAvailabilityMapBuilder, com.commercetools.history.models.common.ProductVariantChannelAvailabilityMapBuilder> builder) {
        this.channels = builder
                .apply(com.commercetools.history.models.common.ProductVariantChannelAvailabilityMapBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the channels using the builder function
     * @param builder function to build the channels value
     * @return Builder
     */

    public ProductVariantAvailabilityBuilder withChannels(
            Function<com.commercetools.history.models.common.ProductVariantChannelAvailabilityMapBuilder, com.commercetools.history.models.common.ProductVariantChannelAvailabilityMap> builder) {
        this.channels = builder
                .apply(com.commercetools.history.models.common.ProductVariantChannelAvailabilityMapBuilder.of());
        return this;
    }

    /**
     * set the value to the channels
     * @param channels value to be set
     * @return Builder
     */

    public ProductVariantAvailabilityBuilder channels(
            final com.commercetools.history.models.common.ProductVariantChannelAvailabilityMap channels) {
        this.channels = channels;
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
     * value of channels}
     * @return channels
     */

    public com.commercetools.history.models.common.ProductVariantChannelAvailabilityMap getChannels() {
        return this.channels;
    }

    /**
     * builds ProductVariantAvailability with checking for non-null required values
     * @return ProductVariantAvailability
     */
    public ProductVariantAvailability build() {
        Objects.requireNonNull(isOnStock, ProductVariantAvailability.class + ": isOnStock is missing");
        Objects.requireNonNull(restockableInDays, ProductVariantAvailability.class + ": restockableInDays is missing");
        Objects.requireNonNull(availableQuantity, ProductVariantAvailability.class + ": availableQuantity is missing");
        Objects.requireNonNull(channels, ProductVariantAvailability.class + ": channels is missing");
        return new ProductVariantAvailabilityImpl(isOnStock, restockableInDays, availableQuantity, channels);
    }

    /**
     * builds ProductVariantAvailability without checking for non-null required values
     * @return ProductVariantAvailability
     */
    public ProductVariantAvailability buildUnchecked() {
        return new ProductVariantAvailabilityImpl(isOnStock, restockableInDays, availableQuantity, channels);
    }

    /**
     * factory method for an instance of ProductVariantAvailabilityBuilder
     * @return builder
     */
    public static ProductVariantAvailabilityBuilder of() {
        return new ProductVariantAvailabilityBuilder();
    }

    /**
     * create builder for ProductVariantAvailability instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantAvailabilityBuilder of(final ProductVariantAvailability template) {
        ProductVariantAvailabilityBuilder builder = new ProductVariantAvailabilityBuilder();
        builder.isOnStock = template.getIsOnStock();
        builder.restockableInDays = template.getRestockableInDays();
        builder.availableQuantity = template.getAvailableQuantity();
        builder.channels = template.getChannels();
        return builder;
    }

}
