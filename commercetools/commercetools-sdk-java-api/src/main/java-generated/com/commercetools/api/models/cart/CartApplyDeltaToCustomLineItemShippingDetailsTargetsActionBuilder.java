
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder
        implements Builder<CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction> {

    private String customLineItemId;

    private java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targetsDelta;

    public CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder customLineItemId(
            final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder targetsDelta(
            final com.commercetools.api.models.cart.ItemShippingTarget... targetsDelta) {
        this.targetsDelta = new ArrayList<>(Arrays.asList(targetsDelta));
        return this;
    }

    public CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder targetsDelta(
            final java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targetsDelta) {
        this.targetsDelta = targetsDelta;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> getTargetsDelta() {
        return this.targetsDelta;
    }

    public CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction build() {
        Objects.requireNonNull(customLineItemId);
        Objects.requireNonNull(targetsDelta);
        return new CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl(customLineItemId, targetsDelta);
    }

    /**
     * builds CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction without checking for non null required values
     */
    public CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction buildUnchecked() {
        return new CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl(customLineItemId, targetsDelta);
    }

    public static CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder of() {
        return new CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder();
    }

    public static CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder of(
            final CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction template) {
        CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder builder = new CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.targetsDelta = template.getTargetsDelta();
        return builder;
    }

}
