package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.models.cart_discount.CartDiscountSetValidFromAndUntilAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountSetValidFromAndUntilActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountSetValidFromAndUntilAction cartDiscountSetValidFromAndUntilAction = CartDiscountSetValidFromAndUntilAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartDiscountSetValidFromAndUntilActionBuilder implements Builder<CartDiscountSetValidFromAndUntilAction> {

    
    @Nullable
    private java.time.ZonedDateTime validFrom;
    
    
    @Nullable
    private java.time.ZonedDateTime validUntil;

    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param validFrom value to be set
     * @return Builder
     */
    
    public CartDiscountSetValidFromAndUntilActionBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }
    
    
    
    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param validUntil value to be set
     * @return Builder
     */
    
    public CartDiscountSetValidFromAndUntilActionBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
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
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return validUntil
     */
    
    @Nullable
    public java.time.ZonedDateTime getValidUntil(){
        return this.validUntil;
    }

    /**
     * builds CartDiscountSetValidFromAndUntilAction with checking for non-null required values
     * @return CartDiscountSetValidFromAndUntilAction
     */
    public CartDiscountSetValidFromAndUntilAction build() {
        return new CartDiscountSetValidFromAndUntilActionImpl(validFrom, validUntil);
    }
    
    /**
     * builds CartDiscountSetValidFromAndUntilAction without checking for non-null required values
     * @return CartDiscountSetValidFromAndUntilAction
     */
    public CartDiscountSetValidFromAndUntilAction buildUnchecked() {
        return new CartDiscountSetValidFromAndUntilActionImpl(validFrom, validUntil);
    }

    /**
     * factory method for an instance of CartDiscountSetValidFromAndUntilActionBuilder
     * @return builder 
     */
    public static CartDiscountSetValidFromAndUntilActionBuilder of() {
        return new CartDiscountSetValidFromAndUntilActionBuilder();
    }

    /**
     * create builder for CartDiscountSetValidFromAndUntilAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountSetValidFromAndUntilActionBuilder of(final CartDiscountSetValidFromAndUntilAction template) {
        CartDiscountSetValidFromAndUntilActionBuilder builder = new CartDiscountSetValidFromAndUntilActionBuilder();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        return builder;
    }

}
