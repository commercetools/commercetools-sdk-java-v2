
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetCustomLineItemTaxRateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetCustomLineItemTaxRateAction stagedOrderSetCustomLineItemTaxRateAction = StagedOrderSetCustomLineItemTaxRateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetCustomLineItemTaxRateActionBuilder
        implements Builder<StagedOrderSetCustomLineItemTaxRateAction> {

    @Nullable
    private String customLineItemId;

    @Nullable
    private String customLineItemKey;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    @Nullable
    private String shippingKey;

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public StagedOrderSetCustomLineItemTaxRateActionBuilder customLineItemId(@Nullable final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemKey value to be set
     * @return Builder
     */

    public StagedOrderSetCustomLineItemTaxRateActionBuilder customLineItemKey(
            @Nullable final String customLineItemKey) {
        this.customLineItemKey = customLineItemKey;
        return this;
    }

    /**
     *  <p>Value to set. If empty, an existing value is removed.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */

    public StagedOrderSetCustomLineItemTaxRateActionBuilder externalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, an existing value is removed.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */

    public StagedOrderSetCustomLineItemTaxRateActionBuilder withExternalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraft> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, an existing value is removed.</p>
     * @param externalTaxRate value to be set
     * @return Builder
     */

    public StagedOrderSetCustomLineItemTaxRateActionBuilder externalTaxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a> used for this Custom Line Item. This is required for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public StagedOrderSetCustomLineItemTaxRateActionBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
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
     *  <p>Value to set. If empty, an existing value is removed.</p>
     * @return externalTaxRate
     */

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a> used for this Custom Line Item. This is required for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @return shippingKey
     */

    @Nullable
    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     * builds StagedOrderSetCustomLineItemTaxRateAction with checking for non-null required values
     * @return StagedOrderSetCustomLineItemTaxRateAction
     */
    public StagedOrderSetCustomLineItemTaxRateAction build() {
        return new StagedOrderSetCustomLineItemTaxRateActionImpl(customLineItemId, customLineItemKey, externalTaxRate,
            shippingKey);
    }

    /**
     * builds StagedOrderSetCustomLineItemTaxRateAction without checking for non-null required values
     * @return StagedOrderSetCustomLineItemTaxRateAction
     */
    public StagedOrderSetCustomLineItemTaxRateAction buildUnchecked() {
        return new StagedOrderSetCustomLineItemTaxRateActionImpl(customLineItemId, customLineItemKey, externalTaxRate,
            shippingKey);
    }

    /**
     * factory method for an instance of StagedOrderSetCustomLineItemTaxRateActionBuilder
     * @return builder
     */
    public static StagedOrderSetCustomLineItemTaxRateActionBuilder of() {
        return new StagedOrderSetCustomLineItemTaxRateActionBuilder();
    }

    /**
     * create builder for StagedOrderSetCustomLineItemTaxRateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetCustomLineItemTaxRateActionBuilder of(
            final StagedOrderSetCustomLineItemTaxRateAction template) {
        StagedOrderSetCustomLineItemTaxRateActionBuilder builder = new StagedOrderSetCustomLineItemTaxRateActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.customLineItemKey = template.getCustomLineItemKey();
        builder.externalTaxRate = template.getExternalTaxRate();
        builder.shippingKey = template.getShippingKey();
        return builder;
    }

}
