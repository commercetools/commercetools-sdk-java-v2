
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCartSetLineItemShippingDetailsActionImpl implements MyCartSetLineItemShippingDetailsAction {

    private String action;

    private String lineItemId;

    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    @JsonCreator
    MyCartSetLineItemShippingDetailsActionImpl(@JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("shippingDetails") final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.lineItemId = lineItemId;
        this.shippingDetails = shippingDetails;
        this.action = SET_LINE_ITEM_SHIPPING_DETAILS;
    }

    public MyCartSetLineItemShippingDetailsActionImpl() {
        this.action = SET_LINE_ITEM_SHIPPING_DETAILS;
    }

    public String getAction() {
        return this.action;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setShippingDetails(final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyCartSetLineItemShippingDetailsActionImpl that = (MyCartSetLineItemShippingDetailsActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(lineItemId, that.lineItemId).append(
            shippingDetails, that.shippingDetails).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(lineItemId).append(shippingDetails).toHashCode();
    }

}
