package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.models.cart_discount.CartDiscountChangeIsActiveAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountChangeIsActiveActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountChangeIsActiveAction cartDiscountChangeIsActiveAction = CartDiscountChangeIsActiveAction.builder()
 *             .isActive(true)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartDiscountChangeIsActiveActionBuilder implements Builder<CartDiscountChangeIsActiveAction> {

    
    
    private Boolean isActive;

    
    /**
     *  <p>New value to set. If set to <code>true</code>, the Discount will be applied to the Cart.</p>
     * @param isActive value to be set
     * @return Builder
     */
    
    public CartDiscountChangeIsActiveActionBuilder isActive( final Boolean isActive) {
        this.isActive = isActive;
        return this;
    }
    
    

    /**
     *  <p>New value to set. If set to <code>true</code>, the Discount will be applied to the Cart.</p>
     * @return isActive
     */
    
    
    public Boolean getIsActive(){
        return this.isActive;
    }

    /**
     * builds CartDiscountChangeIsActiveAction with checking for non-null required values
     * @return CartDiscountChangeIsActiveAction
     */
    public CartDiscountChangeIsActiveAction build() {
        Objects.requireNonNull(isActive, CartDiscountChangeIsActiveAction.class + ": isActive is missing");
        return new CartDiscountChangeIsActiveActionImpl(isActive);
    }
    
    /**
     * builds CartDiscountChangeIsActiveAction without checking for non-null required values
     * @return CartDiscountChangeIsActiveAction
     */
    public CartDiscountChangeIsActiveAction buildUnchecked() {
        return new CartDiscountChangeIsActiveActionImpl(isActive);
    }

    /**
     * factory method for an instance of CartDiscountChangeIsActiveActionBuilder
     * @return builder 
     */
    public static CartDiscountChangeIsActiveActionBuilder of() {
        return new CartDiscountChangeIsActiveActionBuilder();
    }

    /**
     * create builder for CartDiscountChangeIsActiveAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountChangeIsActiveActionBuilder of(final CartDiscountChangeIsActiveAction template) {
        CartDiscountChangeIsActiveActionBuilder builder = new CartDiscountChangeIsActiveActionBuilder();
        builder.isActive = template.getIsActive();
        return builder;
    }

}
