
package com.commercetools.api.models.common;

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
 * DiscountedPriceDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountedPriceDraftImpl implements DiscountedPriceDraft, ModelBase {

    private com.commercetools.api.models.common.Money value;

    private com.commercetools.api.models.product_discount.ProductDiscountReference discount;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountedPriceDraftImpl(@JsonProperty("value") final com.commercetools.api.models.common.Money value,
            @JsonProperty("discount") final com.commercetools.api.models.product_discount.ProductDiscountReference discount) {
        this.value = value;
        this.discount = discount;
    }

    /**
     * create empty instance
     */
    public DiscountedPriceDraftImpl() {
    }

    /**
     *  <p>Sets the money value for the discounted price.</p>
     */

    public com.commercetools.api.models.common.Money getValue() {
        return this.value;
    }

    /**
     *  <p>Relates the referenced ProductDiscount to the discounted price.</p>
     */

    public com.commercetools.api.models.product_discount.ProductDiscountReference getDiscount() {
        return this.discount;
    }

    public void setValue(final com.commercetools.api.models.common.Money value) {
        this.value = value;
    }

    public void setDiscount(final com.commercetools.api.models.product_discount.ProductDiscountReference discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountedPriceDraftImpl that = (DiscountedPriceDraftImpl) o;

        return new EqualsBuilder().append(value, that.value)
                .append(discount, that.discount)
                .append(value, that.value)
                .append(discount, that.discount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(value).append(discount).toHashCode();
    }

}
