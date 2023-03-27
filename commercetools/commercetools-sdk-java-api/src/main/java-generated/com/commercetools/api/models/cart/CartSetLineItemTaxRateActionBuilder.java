
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetLineItemTaxRateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetLineItemTaxRateAction cartSetLineItemTaxRateAction = CartSetLineItemTaxRateAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetLineItemTaxRateActionBuilder implements Builder<CartSetLineItemTaxRateAction> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    @Nullable
    private String shippingKey;

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public CartSetLineItemTaxRateActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */

    public CartSetLineItemTaxRateActionBuilder externalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param externalTaxRate value to be set
     * @return Builder
     */

    public CartSetLineItemTaxRateActionBuilder externalTaxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    /**
     *  <p><code>key</code> of the ShippingMethod used for this Line Item. This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public CartSetLineItemTaxRateActionBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @return lineItemId
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return externalTaxRate
     */

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    /**
     *  <p><code>key</code> of the ShippingMethod used for this Line Item. This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     * @return shippingKey
     */

    @Nullable
    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     * builds CartSetLineItemTaxRateAction with checking for non-null required values
     * @return CartSetLineItemTaxRateAction
     */
    public CartSetLineItemTaxRateAction build() {
        Objects.requireNonNull(lineItemId, CartSetLineItemTaxRateAction.class + ": lineItemId is missing");
        return new CartSetLineItemTaxRateActionImpl(lineItemId, externalTaxRate, shippingKey);
    }

    /**
     * builds CartSetLineItemTaxRateAction without checking for non-null required values
     * @return CartSetLineItemTaxRateAction
     */
    public CartSetLineItemTaxRateAction buildUnchecked() {
        return new CartSetLineItemTaxRateActionImpl(lineItemId, externalTaxRate, shippingKey);
    }

    /**
     * factory method for an instance of CartSetLineItemTaxRateActionBuilder
     * @return builder
     */
    public static CartSetLineItemTaxRateActionBuilder of() {
        return new CartSetLineItemTaxRateActionBuilder();
    }

    /**
     * create builder for CartSetLineItemTaxRateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetLineItemTaxRateActionBuilder of(final CartSetLineItemTaxRateAction template) {
        CartSetLineItemTaxRateActionBuilder builder = new CartSetLineItemTaxRateActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.externalTaxRate = template.getExternalTaxRate();
        builder.shippingKey = template.getShippingKey();
        return builder;
    }

}
