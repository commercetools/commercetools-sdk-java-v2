package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountTarget;
import com.commercetools.api.models.cart_discount.CartDiscountCustomLineItemsTarget;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountCustomLineItemsTargetBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountCustomLineItemsTarget cartDiscountCustomLineItemsTarget = CartDiscountCustomLineItemsTarget.builder()
 *             .predicate("{predicate}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartDiscountCustomLineItemsTargetBuilder implements Builder<CartDiscountCustomLineItemsTarget> {

    
    
    private String predicate;

    
    /**
     *  <p>Valid CustomLineItem target predicate.</p>
     * @param predicate value to be set
     * @return Builder
     */
    
    public CartDiscountCustomLineItemsTargetBuilder predicate( final String predicate) {
        this.predicate = predicate;
        return this;
    }
    
    

    /**
     *  <p>Valid CustomLineItem target predicate.</p>
     * @return predicate
     */
    
    
    public String getPredicate(){
        return this.predicate;
    }

    /**
     * builds CartDiscountCustomLineItemsTarget with checking for non-null required values
     * @return CartDiscountCustomLineItemsTarget
     */
    public CartDiscountCustomLineItemsTarget build() {
        Objects.requireNonNull(predicate, CartDiscountCustomLineItemsTarget.class + ": predicate is missing");
        return new CartDiscountCustomLineItemsTargetImpl(predicate);
    }
    
    /**
     * builds CartDiscountCustomLineItemsTarget without checking for non-null required values
     * @return CartDiscountCustomLineItemsTarget
     */
    public CartDiscountCustomLineItemsTarget buildUnchecked() {
        return new CartDiscountCustomLineItemsTargetImpl(predicate);
    }

    /**
     * factory method for an instance of CartDiscountCustomLineItemsTargetBuilder
     * @return builder 
     */
    public static CartDiscountCustomLineItemsTargetBuilder of() {
        return new CartDiscountCustomLineItemsTargetBuilder();
    }

    /**
     * create builder for CartDiscountCustomLineItemsTarget instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountCustomLineItemsTargetBuilder of(final CartDiscountCustomLineItemsTarget template) {
        CartDiscountCustomLineItemsTargetBuilder builder = new CartDiscountCustomLineItemsTargetBuilder();
        builder.predicate = template.getPredicate();
        return builder;
    }

}
