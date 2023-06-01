package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetCartPredicateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeSetCartPredicateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeSetCartPredicateAction discountCodeSetCartPredicateAction = DiscountCodeSetCartPredicateAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DiscountCodeSetCartPredicateActionBuilder implements Builder<DiscountCodeSetCartPredicateAction> {

    
    @Nullable
    private String cartPredicate;

    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param cartPredicate value to be set
     * @return Builder
     */
    
    public DiscountCodeSetCartPredicateActionBuilder cartPredicate(@Nullable final String cartPredicate) {
        this.cartPredicate = cartPredicate;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return cartPredicate
     */
    
    @Nullable
    public String getCartPredicate(){
        return this.cartPredicate;
    }

    /**
     * builds DiscountCodeSetCartPredicateAction with checking for non-null required values
     * @return DiscountCodeSetCartPredicateAction
     */
    public DiscountCodeSetCartPredicateAction build() {
        return new DiscountCodeSetCartPredicateActionImpl(cartPredicate);
    }
    
    /**
     * builds DiscountCodeSetCartPredicateAction without checking for non-null required values
     * @return DiscountCodeSetCartPredicateAction
     */
    public DiscountCodeSetCartPredicateAction buildUnchecked() {
        return new DiscountCodeSetCartPredicateActionImpl(cartPredicate);
    }

    /**
     * factory method for an instance of DiscountCodeSetCartPredicateActionBuilder
     * @return builder 
     */
    public static DiscountCodeSetCartPredicateActionBuilder of() {
        return new DiscountCodeSetCartPredicateActionBuilder();
    }

    /**
     * create builder for DiscountCodeSetCartPredicateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeSetCartPredicateActionBuilder of(final DiscountCodeSetCartPredicateAction template) {
        DiscountCodeSetCartPredicateActionBuilder builder = new DiscountCodeSetCartPredicateActionBuilder();
        builder.cartPredicate = template.getCartPredicate();
        return builder;
    }

}
