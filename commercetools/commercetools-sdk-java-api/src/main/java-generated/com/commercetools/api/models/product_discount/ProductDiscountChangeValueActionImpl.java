
package com.commercetools.api.models.product_discount;

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
 * ProductDiscountChangeValueAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountChangeValueActionImpl implements ProductDiscountChangeValueAction, ModelBase {

    private String action;

    private com.commercetools.api.models.product_discount.ProductDiscountValueDraft value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductDiscountChangeValueActionImpl(
            @JsonProperty("value") final com.commercetools.api.models.product_discount.ProductDiscountValueDraft value) {
        this.value = value;
        this.action = CHANGE_VALUE;
    }

    /**
     * create empty instance
     */
    public ProductDiscountChangeValueActionImpl() {
        this.action = CHANGE_VALUE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public com.commercetools.api.models.product_discount.ProductDiscountValueDraft getValue() {
        return this.value;
    }

    public void setValue(final com.commercetools.api.models.product_discount.ProductDiscountValueDraft value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductDiscountChangeValueActionImpl that = (ProductDiscountChangeValueActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(value, that.value)
                .append(action, that.action)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(value).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("value", value)
                .build();
    }

    @Override
    public ProductDiscountChangeValueAction copyDeep() {
        return ProductDiscountChangeValueAction.deepCopy(this);
    }
}
