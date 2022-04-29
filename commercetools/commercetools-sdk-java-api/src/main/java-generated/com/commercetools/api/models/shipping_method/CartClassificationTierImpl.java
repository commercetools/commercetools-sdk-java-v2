
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
public class CartClassificationTierImpl implements CartClassificationTier, ModelBase {

    private com.commercetools.api.models.shipping_method.ShippingRateTierType type;

    private String value;

    private com.commercetools.api.models.common.Money price;

    private Boolean isMatching;

    @JsonCreator
    CartClassificationTierImpl(@JsonProperty("value") final String value,
            @JsonProperty("price") final com.commercetools.api.models.common.Money price,
            @JsonProperty("isMatching") final Boolean isMatching) {
        this.value = value;
        this.price = price;
        this.isMatching = isMatching;
        this.type = ShippingRateTierType.findEnum("CartClassification");
    }

    public CartClassificationTierImpl() {
        this.type = ShippingRateTierType.findEnum("CartClassification");
    }

    /**
    *  <p>Can be one of the following or absent.</p>
    */
    public com.commercetools.api.models.shipping_method.ShippingRateTierType getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    /**
    *  <p>Draft type that stores amounts in cent precision for the specified currency.
    *  For storing money values in fractions of the minor unit in a currency, use <a href="ctp:api:type:HighPrecisionMoneyDraft">HighPrecisionMoneyDraft</a> instead.</p>
    */
    public com.commercetools.api.models.common.Money getPrice() {
        return this.price;
    }

    public Boolean getIsMatching() {
        return this.isMatching;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    public void setPrice(final com.commercetools.api.models.common.Money price) {
        this.price = price;
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

        CartClassificationTierImpl that = (CartClassificationTierImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(value, that.value)
                .append(price, that.price)
                .append(isMatching, that.isMatching)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(value).append(price).append(isMatching).toHashCode();
    }

}
