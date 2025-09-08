
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * ShippingRate
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingRateImpl implements ShippingRate, ModelBase {

    private com.commercetools.api.models.common.CentPrecisionMoney price;

    private com.commercetools.api.models.common.CentPrecisionMoney freeAbove;

    private Boolean isMatching;

    private java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> tiers;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShippingRateImpl(@JsonProperty("price") final com.commercetools.api.models.common.CentPrecisionMoney price,
            @JsonProperty("freeAbove") final com.commercetools.api.models.common.CentPrecisionMoney freeAbove,
            @JsonProperty("isMatching") final Boolean isMatching,
            @JsonProperty("tiers") final java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> tiers) {
        this.price = price;
        this.freeAbove = freeAbove;
        this.isMatching = isMatching;
        this.tiers = tiers;
    }

    /**
     * create empty instance
     */
    public ShippingRateImpl() {
    }

    /**
     *  <p>Currency amount of the ShippingRate.</p>
     */

    public com.commercetools.api.models.common.CentPrecisionMoney getPrice() {
        return this.price;
    }

    /**
     *  <p><span>Free shipping</span> is applied if the sum of the (Custom) Line Item Prices reaches the specified value.</p>
     */

    public com.commercetools.api.models.common.CentPrecisionMoney getFreeAbove() {
        return this.freeAbove;
    }

    /**
     *  <p><code>true</code> if the ShippingRate matches given <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:Location" rel="nofollow">Location</a>. Only appears in response to requests for <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/shipping-methods/matching-cart:GET" rel="nofollow">Get ShippingMethods for a Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/shipping-methods/matching-location:GET" rel="nofollow">Get ShippingMethods for a Location</a>.</p>
     */

    public Boolean getIsMatching() {
        return this.isMatching;
    }

    /**
     *  <p>Price tiers for the ShippingRate.</p>
     */

    public java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> getTiers() {
        return this.tiers;
    }

    public void setPrice(final com.commercetools.api.models.common.CentPrecisionMoney price) {
        this.price = price;
    }

    public void setFreeAbove(final com.commercetools.api.models.common.CentPrecisionMoney freeAbove) {
        this.freeAbove = freeAbove;
    }

    public void setIsMatching(final Boolean isMatching) {
        this.isMatching = isMatching;
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

        ShippingRateImpl that = (ShippingRateImpl) o;

        return new EqualsBuilder().append(price, that.price)
                .append(freeAbove, that.freeAbove)
                .append(isMatching, that.isMatching)
                .append(tiers, that.tiers)
                .append(price, that.price)
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("price", price)
                .append("freeAbove", freeAbove)
                .append("isMatching", isMatching)
                .append("tiers", tiers)
                .build();
    }

    @Override
    public ShippingRate copyDeep() {
        return ShippingRate.deepCopy(this);
    }
}
