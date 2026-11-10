
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartChangePriceRoundingModeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartChangePriceRoundingModeAction cartChangePriceRoundingModeAction = CartChangePriceRoundingModeAction.builder()
 *             .priceRoundingMode(RoundingMode.HALF_EVEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartChangePriceRoundingModeActionBuilder implements Builder<CartChangePriceRoundingModeAction> {

    private com.commercetools.api.models.cart.RoundingMode priceRoundingMode;

    /**
     *  <p>New value to set.</p>
     * @param priceRoundingMode value to be set
     * @return Builder
     */

    public CartChangePriceRoundingModeActionBuilder priceRoundingMode(
            final com.commercetools.api.models.cart.RoundingMode priceRoundingMode) {
        this.priceRoundingMode = priceRoundingMode;
        return this;
    }

    /**
     *  <p>New value to set.</p>
     * @return priceRoundingMode
     */

    public com.commercetools.api.models.cart.RoundingMode getPriceRoundingMode() {
        return this.priceRoundingMode;
    }

    /**
     * builds CartChangePriceRoundingModeAction with checking for non-null required values
     * @return CartChangePriceRoundingModeAction
     */
    public CartChangePriceRoundingModeAction build() {
        Objects.requireNonNull(priceRoundingMode,
            CartChangePriceRoundingModeAction.class + ": priceRoundingMode is missing");
        return new CartChangePriceRoundingModeActionImpl(priceRoundingMode);
    }

    /**
     * builds CartChangePriceRoundingModeAction without checking for non-null required values
     * @return CartChangePriceRoundingModeAction
     */
    public CartChangePriceRoundingModeAction buildUnchecked() {
        return new CartChangePriceRoundingModeActionImpl(priceRoundingMode);
    }

    /**
     * factory method for an instance of CartChangePriceRoundingModeActionBuilder
     * @return builder
     */
    public static CartChangePriceRoundingModeActionBuilder of() {
        return new CartChangePriceRoundingModeActionBuilder();
    }

    /**
     * create builder for CartChangePriceRoundingModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartChangePriceRoundingModeActionBuilder of(final CartChangePriceRoundingModeAction template) {
        CartChangePriceRoundingModeActionBuilder builder = new CartChangePriceRoundingModeActionBuilder();
        builder.priceRoundingMode = template.getPriceRoundingMode();
        return builder;
    }

}
