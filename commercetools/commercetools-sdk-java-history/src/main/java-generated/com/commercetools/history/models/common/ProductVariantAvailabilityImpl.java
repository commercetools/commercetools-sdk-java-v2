
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductVariantAvailabilityImpl implements ProductVariantAvailability {

    private Boolean isOnStock;

    private Integer restockableInDays;

    private Integer availableQuantity;

    private com.commercetools.history.models.common.ProductVariantChannelAvailabilityMap channels;

    @JsonCreator
    ProductVariantAvailabilityImpl(@JsonProperty("isOnStock") final Boolean isOnStock,
            @JsonProperty("restockableInDays") final Integer restockableInDays,
            @JsonProperty("availableQuantity") final Integer availableQuantity,
            @JsonProperty("channels") final com.commercetools.history.models.common.ProductVariantChannelAvailabilityMap channels) {
        this.isOnStock = isOnStock;
        this.restockableInDays = restockableInDays;
        this.availableQuantity = availableQuantity;
        this.channels = channels;
    }

    public ProductVariantAvailabilityImpl() {
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

    public void setIsOnStock(final Boolean isOnStock) {
        this.isOnStock = isOnStock;
    }

    public void setRestockableInDays(final Integer restockableInDays) {
        this.restockableInDays = restockableInDays;
    }

    public void setAvailableQuantity(final Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public void setChannels(
            final com.commercetools.history.models.common.ProductVariantChannelAvailabilityMap channels) {
        this.channels = channels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductVariantAvailabilityImpl that = (ProductVariantAvailabilityImpl) o;

        return new EqualsBuilder().append(isOnStock, that.isOnStock)
                .append(restockableInDays, that.restockableInDays)
                .append(availableQuantity, that.availableQuantity)
                .append(channels, that.channels)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(isOnStock)
                .append(restockableInDays)
                .append(availableQuantity)
                .append(channels)
                .toHashCode();
    }

}
