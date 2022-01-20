
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderShippingRateInputSetMessagePayloadImpl implements OrderShippingRateInputSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.cart.ShippingRateInput shippingRateInput;

    private com.commercetools.api.models.cart.ShippingRateInput oldShippingRateInput;

    @JsonCreator
    OrderShippingRateInputSetMessagePayloadImpl(
            @JsonProperty("shippingRateInput") final com.commercetools.api.models.cart.ShippingRateInput shippingRateInput,
            @JsonProperty("oldShippingRateInput") final com.commercetools.api.models.cart.ShippingRateInput oldShippingRateInput) {
        this.shippingRateInput = shippingRateInput;
        this.oldShippingRateInput = oldShippingRateInput;
        this.type = ORDER_SHIPPING_RATE_INPUT_SET;
    }

    public OrderShippingRateInputSetMessagePayloadImpl() {
        this.type = ORDER_SHIPPING_RATE_INPUT_SET;
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.api.models.cart.ShippingRateInput getShippingRateInput() {
        return this.shippingRateInput;
    }

    public com.commercetools.api.models.cart.ShippingRateInput getOldShippingRateInput() {
        return this.oldShippingRateInput;
    }

    public void setShippingRateInput(final com.commercetools.api.models.cart.ShippingRateInput shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
    }

    public void setOldShippingRateInput(
            final com.commercetools.api.models.cart.ShippingRateInput oldShippingRateInput) {
        this.oldShippingRateInput = oldShippingRateInput;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderShippingRateInputSetMessagePayloadImpl that = (OrderShippingRateInputSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(shippingRateInput, that.shippingRateInput)
                .append(oldShippingRateInput, that.oldShippingRateInput)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(shippingRateInput)
                .append(oldShippingRateInput)
                .toHashCode();
    }

}
