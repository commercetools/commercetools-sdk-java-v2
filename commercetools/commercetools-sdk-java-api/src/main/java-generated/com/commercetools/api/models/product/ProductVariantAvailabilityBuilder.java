
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductVariantAvailabilityBuilder {

    @Nullable
    private Boolean isOnStock;

    @Nullable
    private Long restockableInDays;

    @Nullable
    private Long availableQuantity;

    @Nullable
    private com.commercetools.api.models.product.ProductVariantChannelAvailabilityMap channels;

    public ProductVariantAvailabilityBuilder isOnStock(@Nullable final Boolean isOnStock) {
        this.isOnStock = isOnStock;
        return this;
    }

    public ProductVariantAvailabilityBuilder restockableInDays(@Nullable final Long restockableInDays) {
        this.restockableInDays = restockableInDays;
        return this;
    }

    public ProductVariantAvailabilityBuilder availableQuantity(@Nullable final Long availableQuantity) {
        this.availableQuantity = availableQuantity;
        return this;
    }

    public ProductVariantAvailabilityBuilder channels(
            @Nullable final com.commercetools.api.models.product.ProductVariantChannelAvailabilityMap channels) {
        this.channels = channels;
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

    @Nullable
    public com.commercetools.api.models.product.ProductVariantChannelAvailabilityMap getChannels() {
        return this.channels;
    }

    public ProductVariantAvailability build() {
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
