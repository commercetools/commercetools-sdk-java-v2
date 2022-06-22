
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

/**
 *  <p>Used when the ShippingRate maps to an abstract Cart categorization expressed by integers (such as shipping scores or weight ranges). Either <code>price</code> or <code>priceFunction</code> is required.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartScoreTierImpl implements CartScoreTier, ModelBase {

    private com.commercetools.api.models.shipping_method.ShippingRateTierType type;

    private Integer score;

    private com.commercetools.api.models.common.Money price;

    private com.commercetools.api.models.shipping_method.PriceFunction priceFunction;

    private Boolean isMatching;

    @JsonCreator
    CartScoreTierImpl(@JsonProperty("score") final Integer score,
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
     *
     */

    public com.commercetools.api.models.shipping_method.ShippingRateTierType getType() {
        return this.type;
    }

    /**
     *  <p>Abstract value for categorizing a Cart. The range starts at <code>0</code>. The default price covers <code>0</code>, tiers start at <code>1</code>. See Using Tiered Shipping Rates for details and examples.</p>
     */

    public Integer getScore() {
        return this.score;
    }

    /**
     *  <p>Defines a fixed price for the <code>score</code>.</p>
     */

    public com.commercetools.api.models.common.Money getPrice() {
        return this.price;
    }

    /**
     *  <p>Dynamically calculates a Price for a range of scores.</p>
     */

    public com.commercetools.api.models.shipping_method.PriceFunction getPriceFunction() {
        return this.priceFunction;
    }

    /**
     *  <p>Appears in response to Get ShippingMethods for a Cart if the shipping rate matches the search query.</p>
     */

    public Boolean getIsMatching() {
        return this.isMatching;
    }

    public void setScore(final Integer score) {
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
