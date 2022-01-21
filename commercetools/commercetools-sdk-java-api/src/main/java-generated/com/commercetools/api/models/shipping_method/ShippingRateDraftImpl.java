
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ShippingRateDraftImpl implements ShippingRateDraft, ModelBase {

    private com.commercetools.api.models.common.Money price;

    private com.commercetools.api.models.common.Money freeAbove;

    private java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> tiers;

    @JsonCreator
    ShippingRateDraftImpl(@JsonProperty("price") final com.commercetools.api.models.common.Money price,
            @JsonProperty("freeAbove") final com.commercetools.api.models.common.Money freeAbove,
            @JsonProperty("tiers") final java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> tiers) {
        this.price = price;
        this.freeAbove = freeAbove;
        this.tiers = tiers;
    }

    public ShippingRateDraftImpl() {
    }

    public com.commercetools.api.models.common.Money getPrice() {
        return this.price;
    }

    /**
    *  <p>The shipping is free if the order total (the sum of line item prices) exceeds the freeAbove value.
    *  Note: <code>freeAbove</code> applies before any Cart or Product discounts, and can cause discounts to apply in invalid scenarios.
    *  Use a Cart Discount to set the shipping price to 0 to avoid providing free shipping in invalid discount scenarios.</p>
    */
    public com.commercetools.api.models.common.Money getFreeAbove() {
        return this.freeAbove;
    }

    /**
    *  <p>A list of shipping rate price tiers.</p>
    */
    public java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> getTiers() {
        return this.tiers;
    }

    public void setPrice(final com.commercetools.api.models.common.Money price) {
        this.price = price;
    }

    public void setFreeAbove(final com.commercetools.api.models.common.Money freeAbove) {
        this.freeAbove = freeAbove;
    }

    public void setTiers(final com.commercetools.api.models.shipping_method.ShippingRatePriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
    }

    public void setTiers(
            final java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> tiers) {
        this.tiers = tiers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingRateDraftImpl that = (ShippingRateDraftImpl) o;

        return new EqualsBuilder().append(price, that.price)
                .append(freeAbove, that.freeAbove)
                .append(tiers, that.tiers)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(price).append(freeAbove).append(tiers).toHashCode();
    }

}
