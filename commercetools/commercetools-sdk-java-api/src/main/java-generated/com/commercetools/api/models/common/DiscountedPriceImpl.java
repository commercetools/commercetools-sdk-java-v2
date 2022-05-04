
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DiscountedPriceImpl implements DiscountedPrice, ModelBase {

    private com.commercetools.api.models.common.TypedMoney value;

    private com.commercetools.api.models.product_discount.ProductDiscountReference discount;

    @JsonCreator
    DiscountedPriceImpl(@JsonProperty("value") final com.commercetools.api.models.common.TypedMoney value,
            @JsonProperty("discount") final com.commercetools.api.models.product_discount.ProductDiscountReference discount) {
        this.value = value;
        this.discount = discount;
    }

    public DiscountedPriceImpl() {
    }

    /**
    *  <p>Base polymorphic read-only Money type which is stored in cent precision or high precision. The actual type is determined by the <code>type</code> field.</p>
    */
    public com.commercetools.api.models.common.TypedMoney getValue() {
        return this.value;
    }

    /**
    *  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:ProductDiscount">ProductDiscount</a>.</p>
    */
    public com.commercetools.api.models.product_discount.ProductDiscountReference getDiscount() {
        return this.discount;
    }

    public void setValue(final com.commercetools.api.models.common.TypedMoney value) {
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

        DiscountedPriceImpl that = (DiscountedPriceImpl) o;

        return new EqualsBuilder().append(value, that.value).append(discount, that.discount).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(value).append(discount).toHashCode();
    }

}
