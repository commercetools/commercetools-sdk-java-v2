
package com.commercetools.importapi.models.common;

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
 * DiscountedPrice
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountedPriceImpl implements DiscountedPrice, ModelBase {

    private com.commercetools.importapi.models.common.TypedMoney value;

    private com.commercetools.importapi.models.common.ProductDiscountKeyReference discount;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountedPriceImpl(@JsonProperty("value") final com.commercetools.importapi.models.common.TypedMoney value,
            @JsonProperty("discount") final com.commercetools.importapi.models.common.ProductDiscountKeyReference discount) {
        this.value = value;
        this.discount = discount;
    }

    /**
     * create empty instance
     */
    public DiscountedPriceImpl() {
    }

    /**
     *  <p>Money value of the discounted price.</p>
     */

    public com.commercetools.importapi.models.common.TypedMoney getValue() {
        return this.value;
    }

    /**
     *  <p>Reference to a ProductDiscount. If the referenced ProductDiscount does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced ProductDiscount is created.</p>
     */

    public com.commercetools.importapi.models.common.ProductDiscountKeyReference getDiscount() {
        return this.discount;
    }

    public void setValue(final com.commercetools.importapi.models.common.TypedMoney value) {
        this.value = value;
    }

    public void setDiscount(final com.commercetools.importapi.models.common.ProductDiscountKeyReference discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountedPriceImpl that = (DiscountedPriceImpl) o;

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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("value", value)
                .append("discount", discount)
                .build();
    }

    @Override
    public DiscountedPrice copyDeep() {
        return DiscountedPrice.deepCopy(this);
    }
}
