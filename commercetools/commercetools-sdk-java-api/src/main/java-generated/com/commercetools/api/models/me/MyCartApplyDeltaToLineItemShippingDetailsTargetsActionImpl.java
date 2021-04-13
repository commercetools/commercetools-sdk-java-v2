
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
public final class MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl
        implements MyCartApplyDeltaToLineItemShippingDetailsTargetsAction {

    private String action;

    private String lineItemId;

    private java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targetsDelta;

    @JsonCreator
    MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl(@JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("targetsDelta") final java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targetsDelta) {
        this.lineItemId = lineItemId;
        this.targetsDelta = targetsDelta;
        this.action = APPLY_DELTA_TO_LINE_ITEM_SHIPPING_DETAILS_TARGETS;
    }

    public MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl() {
        this.action = APPLY_DELTA_TO_LINE_ITEM_SHIPPING_DETAILS_TARGETS;
    }

    public String getAction() {
        return this.action;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> getTargetsDelta() {
        return this.targetsDelta;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setTargetsDelta(final com.commercetools.api.models.cart.ItemShippingTarget... targetsDelta) {
        this.targetsDelta = new ArrayList<>(Arrays.asList(targetsDelta));
    }

    public void setTargetsDelta(
            final java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targetsDelta) {
        this.targetsDelta = targetsDelta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl that = (MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(targetsDelta, that.targetsDelta)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(lineItemId).append(targetsDelta).toHashCode();
    }

}
