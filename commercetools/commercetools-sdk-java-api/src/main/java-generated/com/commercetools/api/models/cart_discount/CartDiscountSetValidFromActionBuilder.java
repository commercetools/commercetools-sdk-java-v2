package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.models.cart_discount.CartDiscountSetValidFromAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountSetValidFromActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountSetValidFromAction cartDiscountSetValidFromAction = CartDiscountSetValidFromAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartDiscountSetValidFromActionBuilder implements Builder<CartDiscountSetValidFromAction> {

    
    @Nullable
    private java.time.ZonedDateTime validFrom;

    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param validFrom value to be set
     * @return Builder
     */
    
    public CartDiscountSetValidFromActionBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return validFrom
     */
    
    @Nullable
    public java.time.ZonedDateTime getValidFrom(){
        return this.validFrom;
    }

    /**
     * builds CartDiscountSetValidFromAction with checking for non-null required values
     * @return CartDiscountSetValidFromAction
     */
    public CartDiscountSetValidFromAction build() {
        return new CartDiscountSetValidFromActionImpl(validFrom);
    }
    
    /**
     * builds CartDiscountSetValidFromAction without checking for non-null required values
     * @return CartDiscountSetValidFromAction
     */
    public CartDiscountSetValidFromAction buildUnchecked() {
        return new CartDiscountSetValidFromActionImpl(validFrom);
    }

    /**
     * factory method for an instance of CartDiscountSetValidFromActionBuilder
     * @return builder 
     */
    public static CartDiscountSetValidFromActionBuilder of() {
        return new CartDiscountSetValidFromActionBuilder();
    }

    /**
     * create builder for CartDiscountSetValidFromAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountSetValidFromActionBuilder of(final CartDiscountSetValidFromAction template) {
        CartDiscountSetValidFromActionBuilder builder = new CartDiscountSetValidFromActionBuilder();
        builder.validFrom = template.getValidFrom();
        return builder;
    }

}
