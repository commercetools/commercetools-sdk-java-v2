
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
public final class OrderDiscountCodeRemovedMessagePayloadImpl implements OrderDiscountCodeRemovedMessagePayload {

    private String type;

    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

    @JsonCreator
    OrderDiscountCodeRemovedMessagePayloadImpl(
            @JsonProperty("discountCode") final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
        this.type = ORDER_DISCOUNT_CODE_REMOVED;
    }

    public OrderDiscountCodeRemovedMessagePayloadImpl() {
        this.type = ORDER_DISCOUNT_CODE_REMOVED;
    }

    public String getType() {
        return this.type;
    }

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

        OrderDiscountCodeRemovedMessagePayloadImpl that = (OrderDiscountCodeRemovedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(discountCode, that.discountCode).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(discountCode).toHashCode();
    }

}
