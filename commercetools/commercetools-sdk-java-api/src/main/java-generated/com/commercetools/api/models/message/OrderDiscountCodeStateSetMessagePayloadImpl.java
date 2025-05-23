
package com.commercetools.api.models.message;

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
 *  <p>Generated after the DiscountCodeState changes due to a recalculation.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderDiscountCodeStateSetMessagePayloadImpl implements OrderDiscountCodeStateSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

    private com.commercetools.api.models.cart.DiscountCodeState state;

    private com.commercetools.api.models.cart.DiscountCodeState oldState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderDiscountCodeStateSetMessagePayloadImpl(
            @JsonProperty("discountCode") final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode,
            @JsonProperty("state") final com.commercetools.api.models.cart.DiscountCodeState state,
            @JsonProperty("oldState") final com.commercetools.api.models.cart.DiscountCodeState oldState) {
        this.discountCode = discountCode;
        this.state = state;
        this.oldState = oldState;
        this.type = ORDER_DISCOUNT_CODE_STATE_SET;
    }

    /**
     * create empty instance
     */
    public OrderDiscountCodeStateSetMessagePayloadImpl() {
        this.type = ORDER_DISCOUNT_CODE_STATE_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>DiscountCode that changed due to the recalculation.</p>
     */

    public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode() {
        return this.discountCode;
    }

    /**
     *  <p>DiscountCodeState after the recalculation.</p>
     */

    public com.commercetools.api.models.cart.DiscountCodeState getState() {
        return this.state;
    }

    /**
     *  <p>DiscountCodeState before the recalculation.</p>
     */

    public com.commercetools.api.models.cart.DiscountCodeState getOldState() {
        return this.oldState;
    }

    public void setDiscountCode(final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
    }

    public void setState(final com.commercetools.api.models.cart.DiscountCodeState state) {
        this.state = state;
    }

    public void setOldState(final com.commercetools.api.models.cart.DiscountCodeState oldState) {
        this.oldState = oldState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderDiscountCodeStateSetMessagePayloadImpl that = (OrderDiscountCodeStateSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(discountCode, that.discountCode)
                .append(state, that.state)
                .append(oldState, that.oldState)
                .append(type, that.type)
                .append(discountCode, that.discountCode)
                .append(state, that.state)
                .append(oldState, that.oldState)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(discountCode)
                .append(state)
                .append(oldState)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("discountCode", discountCode)
                .append("state", state)
                .append("oldState", oldState)
                .build();
    }

    @Override
    public OrderDiscountCodeStateSetMessagePayload copyDeep() {
        return OrderDiscountCodeStateSetMessagePayload.deepCopy(this);
    }
}
