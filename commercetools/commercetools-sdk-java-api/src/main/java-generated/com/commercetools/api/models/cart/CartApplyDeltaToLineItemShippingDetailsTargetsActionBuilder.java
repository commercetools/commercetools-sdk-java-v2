
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder
        implements Builder<CartApplyDeltaToLineItemShippingDetailsTargetsAction> {

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

    public CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder plusTargetsDelta(
            final com.commercetools.api.models.cart.ItemShippingTarget... targetsDelta) {
        if (this.targetsDelta == null) {
            this.targetsDelta = new ArrayList<>();
        }
        this.targetsDelta.addAll(Arrays.asList(targetsDelta));
        return this;
    }

    public CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder plusTargetsDelta(
            Function<com.commercetools.api.models.cart.ItemShippingTargetBuilder, com.commercetools.api.models.cart.ItemShippingTargetBuilder> builder) {
        if (this.targetsDelta == null) {
            this.targetsDelta = new ArrayList<>();
        }
        this.targetsDelta.add(builder.apply(com.commercetools.api.models.cart.ItemShippingTargetBuilder.of()).build());
        return this;
    }

    public CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder withTargetsDelta(
            Function<com.commercetools.api.models.cart.ItemShippingTargetBuilder, com.commercetools.api.models.cart.ItemShippingTargetBuilder> builder) {
        this.targetsDelta = new ArrayList<>();
        this.targetsDelta.add(builder.apply(com.commercetools.api.models.cart.ItemShippingTargetBuilder.of()).build());
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> getTargetsDelta() {
        return this.targetsDelta;
    }

    public CartApplyDeltaToLineItemShippingDetailsTargetsAction build() {
        Objects.requireNonNull(lineItemId,
            CartApplyDeltaToLineItemShippingDetailsTargetsAction.class + ": lineItemId is missing");
        Objects.requireNonNull(targetsDelta,
            CartApplyDeltaToLineItemShippingDetailsTargetsAction.class + ": targetsDelta is missing");
        return new CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl(lineItemId, targetsDelta);
    }

    /**
     * builds CartApplyDeltaToLineItemShippingDetailsTargetsAction without checking for non null required values
     */
    public CartApplyDeltaToLineItemShippingDetailsTargetsAction buildUnchecked() {
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
