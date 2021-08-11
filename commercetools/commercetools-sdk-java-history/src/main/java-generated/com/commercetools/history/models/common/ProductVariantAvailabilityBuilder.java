
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductVariantAvailabilityBuilder implements Builder<ProductVariantAvailability> {

    private Boolean isOnStock;

    private Integer restockableInDays;

    private Integer availableQuantity;

    private com.commercetools.history.models.common.ProductVariantChannelAvailabilityMap channels;

    public ProductVariantAvailabilityBuilder isOnStock(final Boolean isOnStock) {
        this.isOnStock = isOnStock;
        return this;
    }

    public ProductVariantAvailabilityBuilder restockableInDays(final Integer restockableInDays) {
        this.restockableInDays = restockableInDays;
        return this;
    }

    public ProductVariantAvailabilityBuilder availableQuantity(final Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
        return this;
    }

    public ProductVariantAvailabilityBuilder channels(
            Function<com.commercetools.history.models.common.ProductVariantChannelAvailabilityMapBuilder, com.commercetools.history.models.common.ProductVariantChannelAvailabilityMapBuilder> builder) {
        this.channels = builder
                .apply(com.commercetools.history.models.common.ProductVariantChannelAvailabilityMapBuilder.of())
                .build();
        return this;
    }

    public ProductVariantAvailabilityBuilder channels(
            final com.commercetools.history.models.common.ProductVariantChannelAvailabilityMap channels) {
        this.channels = channels;
        return this;
    }

    public Boolean getIsOnStock() {
        return this.isOnStock;
    }

    public Integer getRestockableInDays() {
        return this.restockableInDays;
    }

    public Integer getAvailableQuantity() {
        return this.availableQuantity;
    }

    public com.commercetools.history.models.common.ProductVariantChannelAvailabilityMap getChannels() {
        return this.channels;
    }

    public ProductVariantAvailability build() {
        Objects.requireNonNull(isOnStock, ProductVariantAvailability.class + ": isOnStock is missing");
        Objects.requireNonNull(restockableInDays, ProductVariantAvailability.class + ": restockableInDays is missing");
        Objects.requireNonNull(availableQuantity, ProductVariantAvailability.class + ": availableQuantity is missing");
        Objects.requireNonNull(channels, ProductVariantAvailability.class + ": channels is missing");
        return new ProductVariantAvailabilityImpl(isOnStock, restockableInDays, availableQuantity, channels);
    }

    /**
     * builds ProductVariantAvailability without checking for non null required values
     */
    public ProductVariantAvailability buildUnchecked() {
        return new ProductVariantAvailabilityImpl(isOnStock, restockableInDays, availableQuantity, channels);
    }

    public static ProductVariantAvailabilityBuilder of() {
        return new ProductVariantAvailabilityBuilder();
    }

    public static ProductVariantAvailabilityBuilder of(final ProductVariantAvailability template) {
        ProductVariantAvailabilityBuilder builder = new ProductVariantAvailabilityBuilder();
        builder.isOnStock = template.getIsOnStock();
        builder.restockableInDays = template.getRestockableInDays();
        builder.availableQuantity = template.getAvailableQuantity();
        builder.channels = template.getChannels();
        return builder;
    }

}
