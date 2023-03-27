
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartChangeTaxCalculationModeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartChangeTaxCalculationModeAction cartChangeTaxCalculationModeAction = CartChangeTaxCalculationModeAction.builder()
 *             .taxCalculationMode(TaxCalculationMode.LINE_ITEM_LEVEL)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartChangeTaxCalculationModeActionBuilder implements Builder<CartChangeTaxCalculationModeAction> {

    private com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode;

    /**
     *  <p>New value to set.</p>
     * @param taxCalculationMode value to be set
     * @return Builder
     */

    public CartChangeTaxCalculationModeActionBuilder taxCalculationMode(
            final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
        return this;
    }

    /**
     *  <p>New value to set.</p>
     * @return taxCalculationMode
     */

    public com.commercetools.api.models.cart.TaxCalculationMode getTaxCalculationMode() {
        return this.taxCalculationMode;
    }

    /**
     * builds CartChangeTaxCalculationModeAction with checking for non-null required values
     * @return CartChangeTaxCalculationModeAction
     */
    public CartChangeTaxCalculationModeAction build() {
        Objects.requireNonNull(taxCalculationMode,
            CartChangeTaxCalculationModeAction.class + ": taxCalculationMode is missing");
        return new CartChangeTaxCalculationModeActionImpl(taxCalculationMode);
    }

    /**
     * builds CartChangeTaxCalculationModeAction without checking for non-null required values
     * @return CartChangeTaxCalculationModeAction
     */
    public CartChangeTaxCalculationModeAction buildUnchecked() {
        return new CartChangeTaxCalculationModeActionImpl(taxCalculationMode);
    }

    /**
     * factory method for an instance of CartChangeTaxCalculationModeActionBuilder
     * @return builder
     */
    public static CartChangeTaxCalculationModeActionBuilder of() {
        return new CartChangeTaxCalculationModeActionBuilder();
    }

    /**
     * create builder for CartChangeTaxCalculationModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartChangeTaxCalculationModeActionBuilder of(final CartChangeTaxCalculationModeAction template) {
        CartChangeTaxCalculationModeActionBuilder builder = new CartChangeTaxCalculationModeActionBuilder();
        builder.taxCalculationMode = template.getTaxCalculationMode();
        return builder;
    }

}
