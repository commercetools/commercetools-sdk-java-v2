package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.models.cart_discount.CartDiscountValueDraft;
import com.commercetools.api.models.cart_discount.CartDiscountChangeValueAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountChangeValueActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountChangeValueAction cartDiscountChangeValueAction = CartDiscountChangeValueAction.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartDiscountChangeValueActionBuilder implements Builder<CartDiscountChangeValueAction> {

    
    
    private com.commercetools.api.models.cart_discount.CartDiscountValueDraft value;

    
    /**
     *  <p>New value to set.</p>
     * @param value value to be set
     * @return Builder
     */
    
    public CartDiscountChangeValueActionBuilder value( final com.commercetools.api.models.cart_discount.CartDiscountValueDraft value) {
        this.value = value;
        return this;
    }
    
    
    /**
     *  <p>New value to set.</p>
     * @param builder function to build the value value
     * @return Builder
     */
    
    public CartDiscountChangeValueActionBuilder value(Function<com.commercetools.api.models.cart_discount.CartDiscountValueDraftBuilder, Builder<? extends com.commercetools.api.models.cart_discount.CartDiscountValueDraft>> builder) {
        this.value = builder.apply(com.commercetools.api.models.cart_discount.CartDiscountValueDraftBuilder.of()).build();
        return this;
    }
                    

    /**
     *  <p>New value to set.</p>
     * @return value
     */
    
    
    public com.commercetools.api.models.cart_discount.CartDiscountValueDraft getValue(){
        return this.value;
    }

    /**
     * builds CartDiscountChangeValueAction with checking for non-null required values
     * @return CartDiscountChangeValueAction
     */
    public CartDiscountChangeValueAction build() {
        Objects.requireNonNull(value, CartDiscountChangeValueAction.class + ": value is missing");
        return new CartDiscountChangeValueActionImpl(value);
    }
    
    /**
     * builds CartDiscountChangeValueAction without checking for non-null required values
     * @return CartDiscountChangeValueAction
     */
    public CartDiscountChangeValueAction buildUnchecked() {
        return new CartDiscountChangeValueActionImpl(value);
    }

    /**
     * factory method for an instance of CartDiscountChangeValueActionBuilder
     * @return builder 
     */
    public static CartDiscountChangeValueActionBuilder of() {
        return new CartDiscountChangeValueActionBuilder();
    }

    /**
     * create builder for CartDiscountChangeValueAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountChangeValueActionBuilder of(final CartDiscountChangeValueAction template) {
        CartDiscountChangeValueActionBuilder builder = new CartDiscountChangeValueActionBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
