
package com.commercetools.api.models.discount_code;

import java.util.*;

import javax.annotation.Nullable;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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

    @Nullable
    public String getCartPredicate() {
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

    public static DiscountCodeSetCartPredicateActionBuilder of() {
        return new DiscountCodeSetCartPredicateActionBuilder();
    }

    public static DiscountCodeSetCartPredicateActionBuilder of(final DiscountCodeSetCartPredicateAction template) {
        DiscountCodeSetCartPredicateActionBuilder builder = new DiscountCodeSetCartPredicateActionBuilder();
        builder.cartPredicate = template.getCartPredicate();
        return builder;
    }

}
