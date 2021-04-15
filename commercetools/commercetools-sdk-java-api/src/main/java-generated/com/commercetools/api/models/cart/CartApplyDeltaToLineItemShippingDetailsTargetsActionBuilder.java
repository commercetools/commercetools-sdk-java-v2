
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder {

    private String lineItemId;

    private java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targetsDelta;

    public CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder targetsDelta(
            final com.commercetools.api.models.cart.ItemShippingTarget... targetsDelta) {
        this.targetsDelta = new ArrayList<>(Arrays.asList(targetsDelta));
        return this;
    }

    public CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder targetsDelta(
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

    public CartApplyDeltaToLineItemShippingDetailsTargetsAction build() {
        return new CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl(lineItemId, targetsDelta);
    }

    public static CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder of() {
        return new CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder();
    }

    public static CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder of(
            final CartApplyDeltaToLineItemShippingDetailsTargetsAction template) {
        CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder builder = new CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.targetsDelta = template.getTargetsDelta();
        return builder;
    }

}
