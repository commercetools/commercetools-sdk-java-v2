
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartChangeTaxModeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartChangeTaxModeAction cartChangeTaxModeAction = CartChangeTaxModeAction.builder()
 *             .taxMode(TaxMode.PLATFORM)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartChangeTaxModeActionBuilder implements Builder<CartChangeTaxModeAction> {

    private com.commercetools.api.models.cart.TaxMode taxMode;

    /**
     *  <p>The new TaxMode.</p>
     * @param taxMode value to be set
     * @return Builder
     */

    public CartChangeTaxModeActionBuilder taxMode(final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    public com.commercetools.api.models.cart.TaxMode getTaxMode() {
        return this.taxMode;
    }

    /**
     * builds CartChangeTaxModeAction with checking for non-null required values
     * @return CartChangeTaxModeAction
     */
    public CartChangeTaxModeAction build() {
        Objects.requireNonNull(taxMode, CartChangeTaxModeAction.class + ": taxMode is missing");
        return new CartChangeTaxModeActionImpl(taxMode);
    }

    /**
     * builds CartChangeTaxModeAction without checking for non-null required values
     * @return CartChangeTaxModeAction
     */
    public CartChangeTaxModeAction buildUnchecked() {
        return new CartChangeTaxModeActionImpl(taxMode);
    }

    public static CartChangeTaxModeActionBuilder of() {
        return new CartChangeTaxModeActionBuilder();
    }

    public static CartChangeTaxModeActionBuilder of(final CartChangeTaxModeAction template) {
        CartChangeTaxModeActionBuilder builder = new CartChangeTaxModeActionBuilder();
        builder.taxMode = template.getTaxMode();
        return builder;
    }

}
