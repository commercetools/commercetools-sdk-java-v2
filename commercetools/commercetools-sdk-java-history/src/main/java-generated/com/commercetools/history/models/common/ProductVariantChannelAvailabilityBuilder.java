
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductVariantChannelAvailabilityBuilder {

    private Boolean isOnStock;

    private Integer restockableInDays;

    private Integer availableQuantity;

    public ProductVariantChannelAvailabilityBuilder isOnStock(final Boolean isOnStock) {
        this.isOnStock = isOnStock;
        return this;
    }

    public ProductVariantChannelAvailabilityBuilder restockableInDays(final Integer restockableInDays) {
        this.restockableInDays = restockableInDays;
        return this;
    }

    public ProductVariantChannelAvailabilityBuilder availableQuantity(final Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
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

    public ProductVariantChannelAvailability build() {
        return new ProductVariantChannelAvailabilityImpl(isOnStock, restockableInDays, availableQuantity);
    }

    public static ProductVariantChannelAvailabilityBuilder of() {
        return new ProductVariantChannelAvailabilityBuilder();
    }

    public static ProductVariantChannelAvailabilityBuilder of(final ProductVariantChannelAvailability template) {
        ProductVariantChannelAvailabilityBuilder builder = new ProductVariantChannelAvailabilityBuilder();
        builder.isOnStock = template.getIsOnStock();
        builder.restockableInDays = template.getRestockableInDays();
        builder.availableQuantity = template.getAvailableQuantity();
        return builder;
    }

}
