
package com.commercetools.api.models.order_edit;

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
public class StagedOrderSetCustomLineItemShippingDetailsActionImpl
        implements StagedOrderSetCustomLineItemShippingDetailsAction, ModelBase {

    private String action;

    private String customLineItemId;

    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    @JsonCreator
    StagedOrderSetCustomLineItemShippingDetailsActionImpl(
            @JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("shippingDetails") final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.customLineItemId = customLineItemId;
        this.shippingDetails = shippingDetails;
        this.action = SET_CUSTOM_LINE_ITEM_SHIPPING_DETAILS;
    }

    public StagedOrderSetCustomLineItemShippingDetailsActionImpl() {
        this.action = SET_CUSTOM_LINE_ITEM_SHIPPING_DETAILS;
    }

    public String getAction() {
        return this.action;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
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

        StagedOrderSetCustomLineItemShippingDetailsActionImpl that = (StagedOrderSetCustomLineItemShippingDetailsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(customLineItemId, that.customLineItemId)
                .append(shippingDetails, that.shippingDetails)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(customLineItemId).append(shippingDetails).toHashCode();
    }

}
