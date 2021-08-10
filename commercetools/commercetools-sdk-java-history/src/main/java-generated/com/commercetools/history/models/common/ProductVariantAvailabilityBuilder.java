
package com.commercetools.history.models.common;

import java.util.*;

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
        Objects.requireNonNull(isOnStock);
        Objects.requireNonNull(restockableInDays);
        Objects.requireNonNull(availableQuantity);
        Objects.requireNonNull(channels);
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
