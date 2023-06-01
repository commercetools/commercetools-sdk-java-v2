package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.models.cart_discount.StackingMode;
import com.commercetools.api.models.cart_discount.CartDiscountChangeStackingModeAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountChangeStackingModeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountChangeStackingModeAction cartDiscountChangeStackingModeAction = CartDiscountChangeStackingModeAction.builder()
 *             .stackingMode(StackingMode.STACKING)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartDiscountChangeStackingModeActionBuilder implements Builder<CartDiscountChangeStackingModeAction> {

    
    
    private com.commercetools.api.models.cart_discount.StackingMode stackingMode;

    
    /**
     *  <p>New value to set.</p>
     * @param stackingMode value to be set
     * @return Builder
     */
    
    public CartDiscountChangeStackingModeActionBuilder stackingMode( final com.commercetools.api.models.cart_discount.StackingMode stackingMode) {
        this.stackingMode = stackingMode;
        return this;
    }
    
    

    /**
     *  <p>New value to set.</p>
     * @return stackingMode
     */
    
    
    public com.commercetools.api.models.cart_discount.StackingMode getStackingMode(){
        return this.stackingMode;
    }

    /**
     * builds CartDiscountChangeStackingModeAction with checking for non-null required values
     * @return CartDiscountChangeStackingModeAction
     */
    public CartDiscountChangeStackingModeAction build() {
        Objects.requireNonNull(stackingMode, CartDiscountChangeStackingModeAction.class + ": stackingMode is missing");
        return new CartDiscountChangeStackingModeActionImpl(stackingMode);
    }
    
    /**
     * builds CartDiscountChangeStackingModeAction without checking for non-null required values
     * @return CartDiscountChangeStackingModeAction
     */
    public CartDiscountChangeStackingModeAction buildUnchecked() {
        return new CartDiscountChangeStackingModeActionImpl(stackingMode);
    }

    /**
     * factory method for an instance of CartDiscountChangeStackingModeActionBuilder
     * @return builder 
     */
    public static CartDiscountChangeStackingModeActionBuilder of() {
        return new CartDiscountChangeStackingModeActionBuilder();
    }

    /**
     * create builder for CartDiscountChangeStackingModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountChangeStackingModeActionBuilder of(final CartDiscountChangeStackingModeAction template) {
        CartDiscountChangeStackingModeActionBuilder builder = new CartDiscountChangeStackingModeActionBuilder();
        builder.stackingMode = template.getStackingMode();
        return builder;
    }

}
