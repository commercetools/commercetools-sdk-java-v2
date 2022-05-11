
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
public class CartScoreTierImpl implements CartScoreTier, ModelBase {

    private com.commercetools.api.models.shipping_method.ShippingRateTierType type;

    private Double score;

    private com.commercetools.api.models.common.Money price;

    private com.commercetools.api.models.shipping_method.PriceFunction priceFunction;

    private Boolean isMatching;

    @JsonCreator
    CartScoreTierImpl(@JsonProperty("score") final Double score,
            @JsonProperty("price") final com.commercetools.api.models.common.Money price,
            @JsonProperty("priceFunction") final com.commercetools.api.models.shipping_method.PriceFunction priceFunction,
            @JsonProperty("isMatching") final Boolean isMatching) {
        this.score = score;
        this.price = price;
        this.priceFunction = priceFunction;
        this.isMatching = isMatching;
        this.type = ShippingRateTierType.findEnum("CartScore");
    }

    public CartScoreTierImpl() {
        this.type = ShippingRateTierType.findEnum("CartScore");
    }

    /**
    *  <p>Can be one of the following or absent.</p>
    */
    public com.commercetools.api.models.shipping_method.ShippingRateTierType getType() {
        return this.type;
    }

    public Double getScore() {
        return this.score;
    }

    /**
    *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
    *  <p>For storing money values in fractions of the minor unit in a currency, use <a href="ctp:api:type:HighPrecisionMoneyDraft">HighPrecisionMoneyDraft</a> instead.</p>
    */
    public com.commercetools.api.models.common.Money getPrice() {
        return this.price;
    }

    public com.commercetools.api.models.shipping_method.PriceFunction getPriceFunction() {
        return this.priceFunction;
    }

    public Boolean getIsMatching() {
        return this.isMatching;
    }

    public void setScore(final Double score) {
        this.score = score;
    }

    public void setPrice(final com.commercetools.api.models.common.Money price) {
        this.price = price;
    }

    public void setPriceFunction(final com.commercetools.api.models.shipping_method.PriceFunction priceFunction) {
        this.priceFunction = priceFunction;
    }

    public void setIsMatching(final Boolean isMatching) {
        this.isMatching = isMatching;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartScoreTierImpl that = (CartScoreTierImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(score, that.score)
                .append(price, that.price)
                .append(priceFunction, that.priceFunction)
                .append(isMatching, that.isMatching)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(score)
                .append(price)
                .append(priceFunction)
                .append(isMatching)
                .toHashCode();
    }

}
