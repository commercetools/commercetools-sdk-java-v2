
package com.commercetools.api.models.me;

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
 * MyCartRemoveDiscountCodeAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartRemoveDiscountCodeActionImpl implements MyCartRemoveDiscountCodeAction, ModelBase {

    private String action;

    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyCartRemoveDiscountCodeActionImpl(
            @JsonProperty("discountCode") final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
        this.action = REMOVE_DISCOUNT_CODE;
    }

    /**
     * create empty instance
     */
    public MyCartRemoveDiscountCodeActionImpl() {
        this.action = REMOVE_DISCOUNT_CODE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Discount Code to remove from the Cart.</p>
     */

    public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode() {
        return this.discountCode;
    }

    public void setDiscountCode(final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyCartRemoveDiscountCodeActionImpl that = (MyCartRemoveDiscountCodeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(discountCode, that.discountCode)
                .append(action, that.action)
                .append(discountCode, that.discountCode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(discountCode).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("discountCode", discountCode)
                .build();
    }

    @Override
    public MyCartRemoveDiscountCodeAction copyDeep() {
        return MyCartRemoveDiscountCodeAction.deepCopy(this);
    }
}
