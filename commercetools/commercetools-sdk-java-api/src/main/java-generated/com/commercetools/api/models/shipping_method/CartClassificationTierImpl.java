
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
 *  <p>Used when the ShippingRate maps to an abstract Cart categorization expressed by strings (for example, <code>Light</code>, <code>Medium</code>, or <code>Heavy</code>).</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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
     *
     */

    public com.commercetools.api.models.shipping_method.ShippingRateTierType getType() {
        return this.type;
    }

    /**
     *  <p><code>key</code> selected from the <code>values</code> of the CartClassificationType configured in the Project.</p>
     */

    public String getValue() {
        return this.value;
    }

    /**
     *  <p>Fixed shipping rate for the selected classification.</p>
     */

    public com.commercetools.api.models.common.Money getPrice() {
        return this.price;
    }

    /**
     *  <p>Appears in response to Get ShippingMethods for a Cart if the shipping rate matches the search query.</p>
     */

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
