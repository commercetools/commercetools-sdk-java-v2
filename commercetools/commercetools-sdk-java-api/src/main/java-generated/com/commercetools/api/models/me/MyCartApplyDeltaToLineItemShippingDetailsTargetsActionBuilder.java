
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder {

    private String lineItemId;

    private java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targetsDelta;

    public MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder targetsDelta(
            final com.commercetools.api.models.cart.ItemShippingTarget... targetsDelta) {
        this.targetsDelta = new ArrayList<>(Arrays.asList(targetsDelta));
        return this;
    }

    public MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder targetsDelta(
            final java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targetsDelta) {
        this.targetsDelta = targetsDelta;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> getTargetsDelta() {
        return this.targetsDelta;
    }

    public MyCartApplyDeltaToLineItemShippingDetailsTargetsAction build() {
        return new MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl(lineItemId, targetsDelta);
    }

    public static MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder of() {
        return new MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder();
    }

    public static MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder of(
            final MyCartApplyDeltaToLineItemShippingDetailsTargetsAction template) {
        MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder builder = new MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.targetsDelta = template.getTargetsDelta();
        return builder;
    }

}
