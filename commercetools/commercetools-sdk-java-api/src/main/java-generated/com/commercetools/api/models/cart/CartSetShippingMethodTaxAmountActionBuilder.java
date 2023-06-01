
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetShippingMethodTaxAmountActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetShippingMethodTaxAmountAction cartSetShippingMethodTaxAmountAction = CartSetShippingMethodTaxAmountAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetShippingMethodTaxAmountActionBuilder implements Builder<CartSetShippingMethodTaxAmountAction> {

    @Nullable
    private String shippingKey;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount;

    /**
     *  <p><code>key</code> of the ShippingMethod to update. This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public CartSetShippingMethodTaxAmountActionBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the externalTaxAmount value
     * @return Builder
     */

    public CartSetShippingMethodTaxAmountActionBuilder externalTaxAmount(
            Function<com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder, com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder> builder) {
        this.externalTaxAmount = builder.apply(com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the externalTaxAmount value
     * @return Builder
     */

    public CartSetShippingMethodTaxAmountActionBuilder withExternalTaxAmount(
            Function<com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder, com.commercetools.api.models.cart.ExternalTaxAmountDraft> builder) {
        this.externalTaxAmount = builder.apply(com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param externalTaxAmount value to be set
     * @return Builder
     */

    public CartSetShippingMethodTaxAmountActionBuilder externalTaxAmount(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
        this.externalTaxAmount = externalTaxAmount;
        return this;
    }

    /**
     *  <p><code>key</code> of the ShippingMethod to update. This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     * @return shippingKey
     */

    @Nullable
    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return externalTaxAmount
     */

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxAmountDraft getExternalTaxAmount() {
        return this.externalTaxAmount;
    }

    /**
     * builds CartSetShippingMethodTaxAmountAction with checking for non-null required values
     * @return CartSetShippingMethodTaxAmountAction
     */
    public CartSetShippingMethodTaxAmountAction build() {
        return new CartSetShippingMethodTaxAmountActionImpl(shippingKey, externalTaxAmount);
    }

    /**
     * builds CartSetShippingMethodTaxAmountAction without checking for non-null required values
     * @return CartSetShippingMethodTaxAmountAction
     */
    public CartSetShippingMethodTaxAmountAction buildUnchecked() {
        return new CartSetShippingMethodTaxAmountActionImpl(shippingKey, externalTaxAmount);
    }

    /**
     * factory method for an instance of CartSetShippingMethodTaxAmountActionBuilder
     * @return builder
     */
    public static CartSetShippingMethodTaxAmountActionBuilder of() {
        return new CartSetShippingMethodTaxAmountActionBuilder();
    }

    /**
     * create builder for CartSetShippingMethodTaxAmountAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetShippingMethodTaxAmountActionBuilder of(final CartSetShippingMethodTaxAmountAction template) {
        CartSetShippingMethodTaxAmountActionBuilder builder = new CartSetShippingMethodTaxAmountActionBuilder();
        builder.shippingKey = template.getShippingKey();
        builder.externalTaxAmount = template.getExternalTaxAmount();
        return builder;
    }

}
