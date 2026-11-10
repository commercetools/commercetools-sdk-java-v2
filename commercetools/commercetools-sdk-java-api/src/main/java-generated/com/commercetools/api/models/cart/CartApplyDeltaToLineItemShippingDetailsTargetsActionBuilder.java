
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartApplyDeltaToLineItemShippingDetailsTargetsAction cartApplyDeltaToLineItemShippingDetailsTargetsAction = CartApplyDeltaToLineItemShippingDetailsTargetsAction.builder()
 *             .plusTargetsDelta(targetsDeltaBuilder -> targetsDeltaBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder
        implements Builder<CartApplyDeltaToLineItemShippingDetailsTargetsAction> {

    @Nullable
    private String lineItemId;

    @Nullable
    private String lineItemKey;

    private java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targetsDelta;

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder lineItemId(@Nullable final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     * @return Builder
     */

    public CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder lineItemKey(@Nullable final String lineItemKey) {
        this.lineItemKey = lineItemKey;
        return this;
    }

    /**
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @param targetsDelta value to be set
     * @return Builder
     */

    public CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder targetsDelta(
            final com.commercetools.api.models.cart.ItemShippingTarget... targetsDelta) {
        this.targetsDelta = new ArrayList<>(Arrays.asList(targetsDelta));
        return this;
    }

    /**
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @param targetsDelta value to be set
     * @return Builder
     */

    public CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder targetsDelta(
            final java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targetsDelta) {
        this.targetsDelta = targetsDelta;
        return this;
    }

    /**
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @param targetsDelta value to be set
     * @return Builder
     */

    public CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder plusTargetsDelta(
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

    public CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder plusTargetsDelta(
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

    public CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder withTargetsDelta(
            Function<com.commercetools.api.models.cart.ItemShippingTargetBuilder, com.commercetools.api.models.cart.ItemShippingTargetBuilder> builder) {
        this.targetsDelta = new ArrayList<>();
        this.targetsDelta.add(builder.apply(com.commercetools.api.models.cart.ItemShippingTargetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @param builder function to build the targetsDelta value
     * @return Builder
     */

    public CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder addTargetsDelta(
            Function<com.commercetools.api.models.cart.ItemShippingTargetBuilder, com.commercetools.api.models.cart.ItemShippingTarget> builder) {
        return plusTargetsDelta(builder.apply(com.commercetools.api.models.cart.ItemShippingTargetBuilder.of()));
    }

    /**
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @param builder function to build the targetsDelta value
     * @return Builder
     */

    public CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder setTargetsDelta(
            Function<com.commercetools.api.models.cart.ItemShippingTargetBuilder, com.commercetools.api.models.cart.ItemShippingTarget> builder) {
        return targetsDelta(builder.apply(com.commercetools.api.models.cart.ItemShippingTargetBuilder.of()));
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @Nullable
    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @Nullable
    public String getLineItemKey() {
        return this.lineItemKey;
    }

    /**
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @return targetsDelta
     */

    public java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> getTargetsDelta() {
        return this.targetsDelta;
    }

    /**
     * builds CartApplyDeltaToLineItemShippingDetailsTargetsAction with checking for non-null required values
     * @return CartApplyDeltaToLineItemShippingDetailsTargetsAction
     */
    public CartApplyDeltaToLineItemShippingDetailsTargetsAction build() {
        Objects.requireNonNull(targetsDelta,
            CartApplyDeltaToLineItemShippingDetailsTargetsAction.class + ": targetsDelta is missing");
        return new CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl(lineItemId, lineItemKey, targetsDelta);
    }

    /**
     * builds CartApplyDeltaToLineItemShippingDetailsTargetsAction without checking for non-null required values
     * @return CartApplyDeltaToLineItemShippingDetailsTargetsAction
     */
    public CartApplyDeltaToLineItemShippingDetailsTargetsAction buildUnchecked() {
        return new CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl(lineItemId, lineItemKey, targetsDelta);
    }

    /**
     * factory method for an instance of CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder
     * @return builder
     */
    public static CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder of() {
        return new CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder();
    }

    /**
     * create builder for CartApplyDeltaToLineItemShippingDetailsTargetsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder of(
            final CartApplyDeltaToLineItemShippingDetailsTargetsAction template) {
        CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder builder = new CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.lineItemKey = template.getLineItemKey();
        builder.targetsDelta = template.getTargetsDelta();
        return builder;
    }

}
