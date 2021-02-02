
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetShippingRateInputActionImpl implements StagedOrderSetShippingRateInputAction {

    private String action;

    private com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput;

    @JsonCreator
    StagedOrderSetShippingRateInputActionImpl(
            @JsonProperty("shippingRateInput") final com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
        this.action = SET_SHIPPING_RATE_INPUT;
    }

    public StagedOrderSetShippingRateInputActionImpl() {
        this.action = SET_SHIPPING_RATE_INPUT;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.cart.ShippingRateInputDraft getShippingRateInput() {
        return this.shippingRateInput;
    }

    public void setShippingRateInput(final com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderSetShippingRateInputActionImpl that = (StagedOrderSetShippingRateInputActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(shippingRateInput,
            that.shippingRateInput).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(shippingRateInput).toHashCode();
    }

}
