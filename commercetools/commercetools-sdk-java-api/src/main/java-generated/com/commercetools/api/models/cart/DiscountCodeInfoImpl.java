
package com.commercetools.api.models.cart;

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
 * DiscountCodeInfo
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeInfoImpl implements DiscountCodeInfo, ModelBase {

    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

    private com.commercetools.api.models.cart.DiscountCodeState state;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountCodeInfoImpl(
            @JsonProperty("discountCode") final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode,
            @JsonProperty("state") final com.commercetools.api.models.cart.DiscountCodeState state) {
        this.discountCode = discountCode;
        this.state = state;
    }

    /**
     * create empty instance
     */
    public DiscountCodeInfoImpl() {
    }

    /**
     *  <p>Discount Code associated with the Cart or Order.</p>
     */

    public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode() {
        return this.discountCode;
    }

    /**
     *  <p>Indicates the state of the Discount Code applied to the Cart or Order.</p>
     */

    public com.commercetools.api.models.cart.DiscountCodeState getState() {
        return this.state;
    }

    public void setDiscountCode(final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
    }

    public void setState(final com.commercetools.api.models.cart.DiscountCodeState state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountCodeInfoImpl that = (DiscountCodeInfoImpl) o;

        return new EqualsBuilder().append(discountCode, that.discountCode)
                .append(state, that.state)
                .append(discountCode, that.discountCode)
                .append(state, that.state)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(discountCode).append(state).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("discountCode", discountCode)
                .append("state", state)
                .build();
    }

}
