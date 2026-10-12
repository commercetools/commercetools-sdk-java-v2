
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartRemoveRecurringPaymentAllocationActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartRemoveRecurringPaymentAllocationAction cartRemoveRecurringPaymentAllocationAction = CartRemoveRecurringPaymentAllocationAction.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartRemoveRecurringPaymentAllocationActionBuilder
        implements Builder<CartRemoveRecurringPaymentAllocationAction> {

    private String id;

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentAllocation" rel="nofollow">RecurringPaymentAllocation</a> to remove.</p>
     * @param id value to be set
     * @return Builder
     */

    public CartRemoveRecurringPaymentAllocationActionBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentAllocation" rel="nofollow">RecurringPaymentAllocation</a> to remove.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * builds CartRemoveRecurringPaymentAllocationAction with checking for non-null required values
     * @return CartRemoveRecurringPaymentAllocationAction
     */
    public CartRemoveRecurringPaymentAllocationAction build() {
        Objects.requireNonNull(id, CartRemoveRecurringPaymentAllocationAction.class + ": id is missing");
        return new CartRemoveRecurringPaymentAllocationActionImpl(id);
    }

    /**
     * builds CartRemoveRecurringPaymentAllocationAction without checking for non-null required values
     * @return CartRemoveRecurringPaymentAllocationAction
     */
    public CartRemoveRecurringPaymentAllocationAction buildUnchecked() {
        return new CartRemoveRecurringPaymentAllocationActionImpl(id);
    }

    /**
     * factory method for an instance of CartRemoveRecurringPaymentAllocationActionBuilder
     * @return builder
     */
    public static CartRemoveRecurringPaymentAllocationActionBuilder of() {
        return new CartRemoveRecurringPaymentAllocationActionBuilder();
    }

    /**
     * create builder for CartRemoveRecurringPaymentAllocationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartRemoveRecurringPaymentAllocationActionBuilder of(
            final CartRemoveRecurringPaymentAllocationAction template) {
        CartRemoveRecurringPaymentAllocationActionBuilder builder = new CartRemoveRecurringPaymentAllocationActionBuilder();
        builder.id = template.getId();
        return builder;
    }

}
