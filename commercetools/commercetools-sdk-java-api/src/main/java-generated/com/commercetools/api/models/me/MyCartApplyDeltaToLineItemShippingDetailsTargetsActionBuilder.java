
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartApplyDeltaToLineItemShippingDetailsTargetsAction myCartApplyDeltaToLineItemShippingDetailsTargetsAction = MyCartApplyDeltaToLineItemShippingDetailsTargetsAction.builder()
 *             .plusTargetsDelta(targetsDeltaBuilder -> targetsDeltaBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder
        implements Builder<MyCartApplyDeltaToLineItemShippingDetailsTargetsAction> {

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

    public MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder lineItemId(@Nullable final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     * @return Builder
     */

    public MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder lineItemKey(
            @Nullable final String lineItemKey) {
        this.lineItemKey = lineItemKey;
        return this;
    }

    /**
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @param targetsDelta value to be set
     * @return Builder
     */

    public MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder targetsDelta(
            final com.commercetools.api.models.cart.ItemShippingTarget... targetsDelta) {
        this.targetsDelta = new ArrayList<>(Arrays.asList(targetsDelta));
        return this;
    }

    /**
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @param targetsDelta value to be set
     * @return Builder
     */

    public MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder targetsDelta(
            final java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targetsDelta) {
        this.targetsDelta = targetsDelta;
        return this;
    }

    /**
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @param targetsDelta value to be set
     * @return Builder
     */

    public MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder plusTargetsDelta(
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

    public MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder plusTargetsDelta(
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

    public MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder withTargetsDelta(
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

    public MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder addTargetsDelta(
            Function<com.commercetools.api.models.cart.ItemShippingTargetBuilder, com.commercetools.api.models.cart.ItemShippingTarget> builder) {
        return plusTargetsDelta(builder.apply(com.commercetools.api.models.cart.ItemShippingTargetBuilder.of()));
    }

    /**
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @param builder function to build the targetsDelta value
     * @return Builder
     */

    public MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder setTargetsDelta(
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
     * builds MyCartApplyDeltaToLineItemShippingDetailsTargetsAction with checking for non-null required values
     * @return MyCartApplyDeltaToLineItemShippingDetailsTargetsAction
     */
    public MyCartApplyDeltaToLineItemShippingDetailsTargetsAction build() {
        Objects.requireNonNull(targetsDelta,
            MyCartApplyDeltaToLineItemShippingDetailsTargetsAction.class + ": targetsDelta is missing");
        return new MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl(lineItemId, lineItemKey, targetsDelta);
    }

    /**
     * builds MyCartApplyDeltaToLineItemShippingDetailsTargetsAction without checking for non-null required values
     * @return MyCartApplyDeltaToLineItemShippingDetailsTargetsAction
     */
    public MyCartApplyDeltaToLineItemShippingDetailsTargetsAction buildUnchecked() {
        return new MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl(lineItemId, lineItemKey, targetsDelta);
    }

    /**
     * factory method for an instance of MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder
     * @return builder
     */
    public static MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder of() {
        return new MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder();
    }

    /**
     * create builder for MyCartApplyDeltaToLineItemShippingDetailsTargetsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder of(
            final MyCartApplyDeltaToLineItemShippingDetailsTargetsAction template) {
        MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder builder = new MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.lineItemKey = template.getLineItemKey();
        builder.targetsDelta = template.getTargetsDelta();
        return builder;
    }

}
