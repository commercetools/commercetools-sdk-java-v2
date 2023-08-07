
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetCustomLineItemTaxRateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomLineItemTaxRateAction cartSetCustomLineItemTaxRateAction = CartSetCustomLineItemTaxRateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetCustomLineItemTaxRateActionBuilder implements Builder<CartSetCustomLineItemTaxRateAction> {

    @Nullable
    private String customLineItemId;

    @Nullable
    private String customLineItemKey;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    @Nullable
    private String shippingKey;

    /**
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public CartSetCustomLineItemTaxRateActionBuilder customLineItemId(@Nullable final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemKey value to be set
     * @return Builder
     */

    public CartSetCustomLineItemTaxRateActionBuilder customLineItemKey(@Nullable final String customLineItemKey) {
        this.customLineItemKey = customLineItemKey;
        return this;
    }

    /**
     *  <p>Value to set. If empty, an existing value is removed.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */

    public CartSetCustomLineItemTaxRateActionBuilder externalTaxRate(
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

    public CartSetCustomLineItemTaxRateActionBuilder withExternalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraft> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, an existing value is removed.</p>
     * @param externalTaxRate value to be set
     * @return Builder
     */

    public CartSetCustomLineItemTaxRateActionBuilder externalTaxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    /**
     *  <p><code>key</code> of the ShippingMethod used for this Custom Line Item. This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public CartSetCustomLineItemTaxRateActionBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemId
     */

    @Nullable
    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
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
     *  <p><code>key</code> of the ShippingMethod used for this Custom Line Item. This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     * @return shippingKey
     */

    @Nullable
    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     * builds CartSetCustomLineItemTaxRateAction with checking for non-null required values
     * @return CartSetCustomLineItemTaxRateAction
     */
    public CartSetCustomLineItemTaxRateAction build() {
        return new CartSetCustomLineItemTaxRateActionImpl(customLineItemId, customLineItemKey, externalTaxRate,
            shippingKey);
    }

    /**
     * builds CartSetCustomLineItemTaxRateAction without checking for non-null required values
     * @return CartSetCustomLineItemTaxRateAction
     */
    public CartSetCustomLineItemTaxRateAction buildUnchecked() {
        return new CartSetCustomLineItemTaxRateActionImpl(customLineItemId, customLineItemKey, externalTaxRate,
            shippingKey);
    }

    /**
     * factory method for an instance of CartSetCustomLineItemTaxRateActionBuilder
     * @return builder
     */
    public static CartSetCustomLineItemTaxRateActionBuilder of() {
        return new CartSetCustomLineItemTaxRateActionBuilder();
    }

    /**
     * create builder for CartSetCustomLineItemTaxRateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetCustomLineItemTaxRateActionBuilder of(final CartSetCustomLineItemTaxRateAction template) {
        CartSetCustomLineItemTaxRateActionBuilder builder = new CartSetCustomLineItemTaxRateActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.customLineItemKey = template.getCustomLineItemKey();
        builder.externalTaxRate = template.getExternalTaxRate();
        builder.shippingKey = template.getShippingKey();
        return builder;
    }

}
