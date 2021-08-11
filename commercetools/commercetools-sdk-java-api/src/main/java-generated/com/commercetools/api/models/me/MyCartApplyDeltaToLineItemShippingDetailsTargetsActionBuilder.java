
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder
        implements Builder<MyCartApplyDeltaToLineItemShippingDetailsTargetsAction> {

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

    public MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder withTargetsDelta(
            Function<com.commercetools.api.models.cart.ItemShippingTargetBuilder, com.commercetools.api.models.cart.ItemShippingTargetBuilder> builder) {
        this.targetsDelta = new ArrayList<>();
        this.targetsDelta.add(builder.apply(com.commercetools.api.models.cart.ItemShippingTargetBuilder.of()).build());
        return this;
    }

    public MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder plusTargetsDelta(
            Function<com.commercetools.api.models.cart.ItemShippingTargetBuilder, com.commercetools.api.models.cart.ItemShippingTargetBuilder> builder) {
        if (this.targetsDelta == null) {
            this.targetsDelta = new ArrayList<>();
        }
        this.targetsDelta.add(builder.apply(com.commercetools.api.models.cart.ItemShippingTargetBuilder.of()).build());
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
        Objects.requireNonNull(lineItemId,
            MyCartApplyDeltaToLineItemShippingDetailsTargetsAction.class + ": lineItemId is missing");
        Objects.requireNonNull(targetsDelta,
            MyCartApplyDeltaToLineItemShippingDetailsTargetsAction.class + ": targetsDelta is missing");
        return new MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl(lineItemId, targetsDelta);
    }

    /**
     * builds MyCartApplyDeltaToLineItemShippingDetailsTargetsAction without checking for non null required values
     */
    public MyCartApplyDeltaToLineItemShippingDetailsTargetsAction buildUnchecked() {
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
