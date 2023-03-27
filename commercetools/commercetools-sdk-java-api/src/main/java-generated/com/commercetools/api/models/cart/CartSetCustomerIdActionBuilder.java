
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetCustomerIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomerIdAction cartSetCustomerIdAction = CartSetCustomerIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetCustomerIdActionBuilder implements Builder<CartSetCustomerIdAction> {

    @Nullable
    private String customerId;

    /**
     *  <p><code>id</code> of an existing Customer. If empty, any value is removed.</p>
     * @param customerId value to be set
     * @return Builder
     */

    public CartSetCustomerIdActionBuilder customerId(@Nullable final String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     *  <p><code>id</code> of an existing Customer. If empty, any value is removed.</p>
     * @return customerId
     */

    @Nullable
    public String getCustomerId() {
        return this.customerId;
    }

    /**
     * builds CartSetCustomerIdAction with checking for non-null required values
     * @return CartSetCustomerIdAction
     */
    public CartSetCustomerIdAction build() {
        return new CartSetCustomerIdActionImpl(customerId);
    }

    /**
     * builds CartSetCustomerIdAction without checking for non-null required values
     * @return CartSetCustomerIdAction
     */
    public CartSetCustomerIdAction buildUnchecked() {
        return new CartSetCustomerIdActionImpl(customerId);
    }

    /**
     * factory method for an instance of CartSetCustomerIdActionBuilder
     * @return builder
     */
    public static CartSetCustomerIdActionBuilder of() {
        return new CartSetCustomerIdActionBuilder();
    }

    /**
     * create builder for CartSetCustomerIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetCustomerIdActionBuilder of(final CartSetCustomerIdAction template) {
        CartSetCustomerIdActionBuilder builder = new CartSetCustomerIdActionBuilder();
        builder.customerId = template.getCustomerId();
        return builder;
    }

}
