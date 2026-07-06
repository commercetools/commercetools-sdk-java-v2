
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetLineItemTaxAmountActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetLineItemTaxAmountAction stagedOrderSetLineItemTaxAmountAction = StagedOrderSetLineItemTaxAmountAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetLineItemTaxAmountActionBuilder implements Builder<StagedOrderSetLineItemTaxAmountAction> {

    @Nullable
    private String lineItemId;

    @Nullable
    private String lineItemKey;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount;

    @Nullable
    private String shippingKey;

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public StagedOrderSetLineItemTaxAmountActionBuilder lineItemId(@Nullable final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     * @return Builder
     */

    public StagedOrderSetLineItemTaxAmountActionBuilder lineItemKey(@Nullable final String lineItemKey) {
        this.lineItemKey = lineItemKey;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the externalTaxAmount value
     * @return Builder
     */

    public StagedOrderSetLineItemTaxAmountActionBuilder externalTaxAmount(
            Function<com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder, com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder> builder) {
        this.externalTaxAmount = builder.apply(com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the externalTaxAmount value
     * @return Builder
     */

    public StagedOrderSetLineItemTaxAmountActionBuilder withExternalTaxAmount(
            Function<com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder, com.commercetools.api.models.cart.ExternalTaxAmountDraft> builder) {
        this.externalTaxAmount = builder.apply(com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param externalTaxAmount value to be set
     * @return Builder
     */

    public StagedOrderSetLineItemTaxAmountActionBuilder externalTaxAmount(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
        this.externalTaxAmount = externalTaxAmount;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a> used for this Line Item. This is required for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public StagedOrderSetLineItemTaxAmountActionBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
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
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return externalTaxAmount
     */

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxAmountDraft getExternalTaxAmount() {
        return this.externalTaxAmount;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a> used for this Line Item. This is required for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @return shippingKey
     */

    @Nullable
    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     * builds StagedOrderSetLineItemTaxAmountAction with checking for non-null required values
     * @return StagedOrderSetLineItemTaxAmountAction
     */
    public StagedOrderSetLineItemTaxAmountAction build() {
        return new StagedOrderSetLineItemTaxAmountActionImpl(lineItemId, lineItemKey, externalTaxAmount, shippingKey);
    }

    /**
     * builds StagedOrderSetLineItemTaxAmountAction without checking for non-null required values
     * @return StagedOrderSetLineItemTaxAmountAction
     */
    public StagedOrderSetLineItemTaxAmountAction buildUnchecked() {
        return new StagedOrderSetLineItemTaxAmountActionImpl(lineItemId, lineItemKey, externalTaxAmount, shippingKey);
    }

    /**
     * factory method for an instance of StagedOrderSetLineItemTaxAmountActionBuilder
     * @return builder
     */
    public static StagedOrderSetLineItemTaxAmountActionBuilder of() {
        return new StagedOrderSetLineItemTaxAmountActionBuilder();
    }

    /**
     * create builder for StagedOrderSetLineItemTaxAmountAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetLineItemTaxAmountActionBuilder of(
            final StagedOrderSetLineItemTaxAmountAction template) {
        StagedOrderSetLineItemTaxAmountActionBuilder builder = new StagedOrderSetLineItemTaxAmountActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.lineItemKey = template.getLineItemKey();
        builder.externalTaxAmount = template.getExternalTaxAmount();
        builder.shippingKey = template.getShippingKey();
        return builder;
    }

}
