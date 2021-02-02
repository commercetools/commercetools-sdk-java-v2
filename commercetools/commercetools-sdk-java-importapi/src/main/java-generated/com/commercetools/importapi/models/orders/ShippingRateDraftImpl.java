
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingRateDraftImpl implements ShippingRateDraft {

    private com.commercetools.importapi.models.common.Money price;

    private com.commercetools.importapi.models.common.Money freeAbove;

    private java.util.List<com.commercetools.importapi.models.orders.ShippingRatePriceTier> tiers;

    @JsonCreator
    ShippingRateDraftImpl(@JsonProperty("price") final com.commercetools.importapi.models.common.Money price,
            @JsonProperty("freeAbove") final com.commercetools.importapi.models.common.Money freeAbove,
            @JsonProperty("tiers") final java.util.List<com.commercetools.importapi.models.orders.ShippingRatePriceTier> tiers) {
        this.price = price;
        this.freeAbove = freeAbove;
        this.tiers = tiers;
    }

    public ShippingRateDraftImpl() {
    }

    public com.commercetools.importapi.models.common.Money getPrice() {
        return this.price;
    }

    public com.commercetools.importapi.models.common.Money getFreeAbove() {
        return this.freeAbove;
    }

    public java.util.List<com.commercetools.importapi.models.orders.ShippingRatePriceTier> getTiers() {
        return this.tiers;
    }

    public void setPrice(final com.commercetools.importapi.models.common.Money price) {
        this.price = price;
    }

    public void setFreeAbove(final com.commercetools.importapi.models.common.Money freeAbove) {
        this.freeAbove = freeAbove;
    }

    public void setTiers(final com.commercetools.importapi.models.orders.ShippingRatePriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
    }

    public void setTiers(final java.util.List<com.commercetools.importapi.models.orders.ShippingRatePriceTier> tiers) {
        this.tiers = tiers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingRateDraftImpl that = (ShippingRateDraftImpl) o;

        return new EqualsBuilder().append(price, that.price).append(freeAbove, that.freeAbove).append(tiers,
            that.tiers).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(price).append(freeAbove).append(tiers).toHashCode();
    }

}
