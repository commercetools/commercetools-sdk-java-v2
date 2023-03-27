
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetCustomerEmailActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomerEmailAction cartSetCustomerEmailAction = CartSetCustomerEmailAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetCustomerEmailActionBuilder implements Builder<CartSetCustomerEmailAction> {

    @Nullable
    private String email;

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param email value to be set
     * @return Builder
     */

    public CartSetCustomerEmailActionBuilder email(@Nullable final String email) {
        this.email = email;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return email
     */

    @Nullable
    public String getEmail() {
        return this.email;
    }

    /**
     * builds CartSetCustomerEmailAction with checking for non-null required values
     * @return CartSetCustomerEmailAction
     */
    public CartSetCustomerEmailAction build() {
        return new CartSetCustomerEmailActionImpl(email);
    }

    /**
     * builds CartSetCustomerEmailAction without checking for non-null required values
     * @return CartSetCustomerEmailAction
     */
    public CartSetCustomerEmailAction buildUnchecked() {
        return new CartSetCustomerEmailActionImpl(email);
    }

    /**
     * factory method for an instance of CartSetCustomerEmailActionBuilder
     * @return builder
     */
    public static CartSetCustomerEmailActionBuilder of() {
        return new CartSetCustomerEmailActionBuilder();
    }

    /**
     * create builder for CartSetCustomerEmailAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetCustomerEmailActionBuilder of(final CartSetCustomerEmailAction template) {
        CartSetCustomerEmailActionBuilder builder = new CartSetCustomerEmailActionBuilder();
        builder.email = template.getEmail();
        return builder;
    }

}
