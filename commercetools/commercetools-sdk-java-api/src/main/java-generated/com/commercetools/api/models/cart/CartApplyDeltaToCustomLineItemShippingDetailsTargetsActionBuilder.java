
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction cartApplyDeltaToCustomLineItemShippingDetailsTargetsAction = CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .plusTargetsDelta(targetsDeltaBuilder -> targetsDeltaBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder
        implements Builder<CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction> {

    private String customLineItemId;

    private java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targetsDelta;

    /**
     *  <p><code>id</code> of the CustomLineItem to update.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder customLineItemId(
            final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @param targetsDelta value to be set
     * @return Builder
     */

    public CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder targetsDelta(
            final com.commercetools.api.models.cart.ItemShippingTarget... targetsDelta) {
        this.targetsDelta = new ArrayList<>(Arrays.asList(targetsDelta));
        return this;
    }

    /**
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @param targetsDelta value to be set
     * @return Builder
     */

    public CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder targetsDelta(
            final java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targetsDelta) {
        this.targetsDelta = targetsDelta;
        return this;
    }

    /**
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @param targetsDelta value to be set
     * @return Builder
     */

    public CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder plusTargetsDelta(
            final com.commercetools.api.models.cart.ItemShippingTarget... targetsDelta) {
        if (this.targetsDelta == null) {
            this.targetsDelta = new ArrayList<>();
        }
        this.targetsDelta.addAll(Arrays.asList(targetsDelta));
        return this;
    }

    /**
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @param builder function to build the targetsDelta value
     * @return Builder
     */

    public CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder plusTargetsDelta(
            Function<com.commercetools.api.models.cart.ItemShippingTargetBuilder, com.commercetools.api.models.cart.ItemShippingTargetBuilder> builder) {
        if (this.targetsDelta == null) {
            this.targetsDelta = new ArrayList<>();
        }
        this.targetsDelta.add(builder.apply(com.commercetools.api.models.cart.ItemShippingTargetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @param builder function to build the targetsDelta value
     * @return Builder
     */

    public CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder withTargetsDelta(
            Function<com.commercetools.api.models.cart.ItemShippingTargetBuilder, com.commercetools.api.models.cart.ItemShippingTargetBuilder> builder) {
        this.targetsDelta = new ArrayList<>();
        this.targetsDelta.add(builder.apply(com.commercetools.api.models.cart.ItemShippingTargetBuilder.of()).build());
        return this;
    }

    /**
     *  <p><code>id</code> of the CustomLineItem to update.</p>
     * @return customLineItemId
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @return targetsDelta
     */

    public java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> getTargetsDelta() {
        return this.targetsDelta;
    }

    /**
     * builds CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction with checking for non-null required values
     * @return CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction
     */
    public CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction build() {
        Objects.requireNonNull(customLineItemId,
            CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction.class + ": customLineItemId is missing");
        Objects.requireNonNull(targetsDelta,
            CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction.class + ": targetsDelta is missing");
        return new CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl(customLineItemId, targetsDelta);
    }

    /**
     * builds CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction without checking for non-null required values
     * @return CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction
     */
    public CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction buildUnchecked() {
        return new CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl(customLineItemId, targetsDelta);
    }

    /**
     * factory method for an instance of CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder
     * @return builder
     */
    public static CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder of() {
        return new CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder();
    }

    /**
     * create builder for CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder of(
            final CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction template) {
        CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder builder = new CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.targetsDelta = template.getTargetsDelta();
        return builder;
    }

}
