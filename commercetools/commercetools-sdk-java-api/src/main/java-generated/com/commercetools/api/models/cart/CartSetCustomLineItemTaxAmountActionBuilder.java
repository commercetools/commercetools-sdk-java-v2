
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetCustomLineItemTaxAmountActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomLineItemTaxAmountAction cartSetCustomLineItemTaxAmountAction = CartSetCustomLineItemTaxAmountAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetCustomLineItemTaxAmountActionBuilder implements Builder<CartSetCustomLineItemTaxAmountAction> {

    private String customLineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount;

    /**
     *  <p><code>id</code> of the CustomLineItem to update.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public CartSetCustomLineItemTaxAmountActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the externalTaxAmount value
     * @return Builder
     */

    public CartSetCustomLineItemTaxAmountActionBuilder externalTaxAmount(
            Function<com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder, com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder> builder) {
        this.externalTaxAmount = builder.apply(com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param externalTaxAmount value to be set
     * @return Builder
     */

    public CartSetCustomLineItemTaxAmountActionBuilder externalTaxAmount(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
        this.externalTaxAmount = externalTaxAmount;
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
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return externalTaxAmount
     */

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxAmountDraft getExternalTaxAmount() {
        return this.externalTaxAmount;
    }

    /**
     * builds CartSetCustomLineItemTaxAmountAction with checking for non-null required values
     * @return CartSetCustomLineItemTaxAmountAction
     */
    public CartSetCustomLineItemTaxAmountAction build() {
        Objects.requireNonNull(customLineItemId,
            CartSetCustomLineItemTaxAmountAction.class + ": customLineItemId is missing");
        return new CartSetCustomLineItemTaxAmountActionImpl(customLineItemId, externalTaxAmount);
    }

    /**
     * builds CartSetCustomLineItemTaxAmountAction without checking for non-null required values
     * @return CartSetCustomLineItemTaxAmountAction
     */
    public CartSetCustomLineItemTaxAmountAction buildUnchecked() {
        return new CartSetCustomLineItemTaxAmountActionImpl(customLineItemId, externalTaxAmount);
    }

    /**
     * factory method for an instance of CartSetCustomLineItemTaxAmountActionBuilder
     * @return builder
     */
    public static CartSetCustomLineItemTaxAmountActionBuilder of() {
        return new CartSetCustomLineItemTaxAmountActionBuilder();
    }

    /**
     * create builder for CartSetCustomLineItemTaxAmountAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetCustomLineItemTaxAmountActionBuilder of(final CartSetCustomLineItemTaxAmountAction template) {
        CartSetCustomLineItemTaxAmountActionBuilder builder = new CartSetCustomLineItemTaxAmountActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.externalTaxAmount = template.getExternalTaxAmount();
        return builder;
    }

}
