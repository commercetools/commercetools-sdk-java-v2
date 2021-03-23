
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderDiscountCodeStateSetMessagePayloadImpl implements OrderDiscountCodeStateSetMessagePayload {

    private String type;

    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

    private com.commercetools.api.models.cart.DiscountCodeState state;

    private com.commercetools.api.models.cart.DiscountCodeState oldState;

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

    public OrderDiscountCodeStateSetMessagePayloadImpl() {
        this.type = ORDER_DISCOUNT_CODE_STATE_SET;
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode() {
        return this.discountCode;
    }

    public com.commercetools.api.models.cart.DiscountCodeState getState() {
        return this.state;
    }

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

}
