
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder
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

    public CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder plusTargetsDelta(
            final com.commercetools.api.models.cart.ItemShippingTarget... targetsDelta) {
        if (this.targetsDelta == null) {
            this.targetsDelta = new ArrayList<>();
        }
        this.targetsDelta.addAll(Arrays.asList(targetsDelta));
        return this;
    }

    public CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder plusTargetsDelta(
            Function<com.commercetools.api.models.cart.ItemShippingTargetBuilder, com.commercetools.api.models.cart.ItemShippingTargetBuilder> builder) {
        if (this.targetsDelta == null) {
            this.targetsDelta = new ArrayList<>();
        }
        this.targetsDelta.add(builder.apply(com.commercetools.api.models.cart.ItemShippingTargetBuilder.of()).build());
        return this;
    }

    public CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder withTargetsDelta(
            Function<com.commercetools.api.models.cart.ItemShippingTargetBuilder, com.commercetools.api.models.cart.ItemShippingTargetBuilder> builder) {
        this.targetsDelta = new ArrayList<>();
        this.targetsDelta.add(builder.apply(com.commercetools.api.models.cart.ItemShippingTargetBuilder.of()).build());
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> getTargetsDelta() {
        return this.targetsDelta;
    }

    public CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction build() {
        Objects.requireNonNull(customLineItemId,
            CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction.class + ": customLineItemId is missing");
        Objects.requireNonNull(targetsDelta,
            CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction.class + ": targetsDelta is missing");
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
