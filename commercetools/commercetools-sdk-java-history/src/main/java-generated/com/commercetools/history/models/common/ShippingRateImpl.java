
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
public final class ShippingRateImpl implements ShippingRate {

    private com.commercetools.history.models.common.Money price;

    private com.commercetools.history.models.common.Money freeAbove;

    private Boolean isMatching;

    private java.util.List<com.commercetools.history.models.common.ShippingRatePriceTier> tiers;

    @JsonCreator
    ShippingRateImpl(@JsonProperty("price") final com.commercetools.history.models.common.Money price,
            @JsonProperty("freeAbove") final com.commercetools.history.models.common.Money freeAbove,
            @JsonProperty("isMatching") final Boolean isMatching,
            @JsonProperty("tiers") final java.util.List<com.commercetools.history.models.common.ShippingRatePriceTier> tiers) {
        this.price = price;
        this.freeAbove = freeAbove;
        this.isMatching = isMatching;
        this.tiers = tiers;
    }

    public ShippingRateImpl() {
    }

    public com.commercetools.history.models.common.Money getPrice() {
        return this.price;
    }

    public com.commercetools.history.models.common.Money getFreeAbove() {
        return this.freeAbove;
    }

    /**
    *  <p>Only appears in response to requests for shipping methods by cart or location to mark this shipping rate as one that matches the cart or location.</p>
    */
    public Boolean getIsMatching() {
        return this.isMatching;
    }

    public java.util.List<com.commercetools.history.models.common.ShippingRatePriceTier> getTiers() {
        return this.tiers;
    }

    public void setPrice(final com.commercetools.history.models.common.Money price) {
        this.price = price;
    }

    public void setFreeAbove(final com.commercetools.history.models.common.Money freeAbove) {
        this.freeAbove = freeAbove;
    }

    public void setIsMatching(final Boolean isMatching) {
        this.isMatching = isMatching;
    }

    public void setTiers(final com.commercetools.history.models.common.ShippingRatePriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
    }

    public void setTiers(final java.util.List<com.commercetools.history.models.common.ShippingRatePriceTier> tiers) {
        this.tiers = tiers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingRateImpl that = (ShippingRateImpl) o;

        return new EqualsBuilder().append(price, that.price)
                .append(freeAbove, that.freeAbove)
                .append(isMatching, that.isMatching)
                .append(tiers, that.tiers)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(price)
                .append(freeAbove)
                .append(isMatching)
                .append(tiers)
                .toHashCode();
    }

}
