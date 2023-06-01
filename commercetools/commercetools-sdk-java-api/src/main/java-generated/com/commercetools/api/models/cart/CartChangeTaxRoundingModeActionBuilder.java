package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.RoundingMode;
import com.commercetools.api.models.cart.CartChangeTaxRoundingModeAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartChangeTaxRoundingModeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartChangeTaxRoundingModeAction cartChangeTaxRoundingModeAction = CartChangeTaxRoundingModeAction.builder()
 *             .taxRoundingMode(RoundingMode.HALF_EVEN)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartChangeTaxRoundingModeActionBuilder implements Builder<CartChangeTaxRoundingModeAction> {

    
    
    private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

    
    /**
     *  <p>New value to set.</p>
     * @param taxRoundingMode value to be set
     * @return Builder
     */
    
    public CartChangeTaxRoundingModeActionBuilder taxRoundingMode( final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
        return this;
    }
    
    

    /**
     *  <p>New value to set.</p>
     * @return taxRoundingMode
     */
    
    
    public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode(){
        return this.taxRoundingMode;
    }

    /**
     * builds CartChangeTaxRoundingModeAction with checking for non-null required values
     * @return CartChangeTaxRoundingModeAction
     */
    public CartChangeTaxRoundingModeAction build() {
        Objects.requireNonNull(taxRoundingMode, CartChangeTaxRoundingModeAction.class + ": taxRoundingMode is missing");
        return new CartChangeTaxRoundingModeActionImpl(taxRoundingMode);
    }
    
    /**
     * builds CartChangeTaxRoundingModeAction without checking for non-null required values
     * @return CartChangeTaxRoundingModeAction
     */
    public CartChangeTaxRoundingModeAction buildUnchecked() {
        return new CartChangeTaxRoundingModeActionImpl(taxRoundingMode);
    }

    /**
     * factory method for an instance of CartChangeTaxRoundingModeActionBuilder
     * @return builder 
     */
    public static CartChangeTaxRoundingModeActionBuilder of() {
        return new CartChangeTaxRoundingModeActionBuilder();
    }

    /**
     * create builder for CartChangeTaxRoundingModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartChangeTaxRoundingModeActionBuilder of(final CartChangeTaxRoundingModeAction template) {
        CartChangeTaxRoundingModeActionBuilder builder = new CartChangeTaxRoundingModeActionBuilder();
        builder.taxRoundingMode = template.getTaxRoundingMode();
        return builder;
    }

}
