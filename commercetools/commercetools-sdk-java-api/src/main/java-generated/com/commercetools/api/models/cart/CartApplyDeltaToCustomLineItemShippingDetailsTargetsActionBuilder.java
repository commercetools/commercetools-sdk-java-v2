
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction cartApplyDeltaToCustomLineItemShippingDetailsTargetsAction = CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction.builder()
 *             .plusTargetsDelta(targetsDeltaBuilder -> targetsDeltaBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder
        implements Builder<CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction> {

    @Nullable
    private String customLineItemId;

    @Nullable
    private String customLineItemKey;

    private java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targetsDelta;

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder customLineItemId(
            @Nullable final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemKey value to be set
     * @return Builder
     */

    public CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder customLineItemKey(
            @Nullable final String customLineItemKey) {
        this.customLineItemKey = customLineItemKey;
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
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @param builder function to build the targetsDelta value
     * @return Builder
     */

    public CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder addTargetsDelta(
            Function<com.commercetools.api.models.cart.ItemShippingTargetBuilder, com.commercetools.api.models.cart.ItemShippingTarget> builder) {
        return plusTargetsDelta(builder.apply(com.commercetools.api.models.cart.ItemShippingTargetBuilder.of()));
    }

    /**
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @param builder function to build the targetsDelta value
     * @return Builder
     */

    public CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder setTargetsDelta(
            Function<com.commercetools.api.models.cart.ItemShippingTargetBuilder, com.commercetools.api.models.cart.ItemShippingTarget> builder) {
        return targetsDelta(builder.apply(com.commercetools.api.models.cart.ItemShippingTargetBuilder.of()));
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemId
     */

    @Nullable
    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemKey
     */

    @Nullable
    public String getCustomLineItemKey() {
        return this.customLineItemKey;
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
        Objects.requireNonNull(targetsDelta,
            CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction.class + ": targetsDelta is missing");
        return new CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl(customLineItemId, customLineItemKey,
            targetsDelta);
    }

    /**
     * builds CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction without checking for non-null required values
     * @return CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction
     */
    public CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction buildUnchecked() {
        return new CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl(customLineItemId, customLineItemKey,
            targetsDelta);
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
        builder.customLineItemKey = template.getCustomLineItemKey();
        builder.targetsDelta = template.getTargetsDelta();
        return builder;
    }

}
