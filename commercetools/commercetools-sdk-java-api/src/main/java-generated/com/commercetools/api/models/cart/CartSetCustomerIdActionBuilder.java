
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   CartSetCustomerIdAction cartSetCustomerIdAction = CartSetCustomerIdAction.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetCustomerIdActionBuilder implements Builder<CartSetCustomerIdAction> {

    @Nullable
    private String customerId;

    /**
     *  <p>If set, a customer with the given ID must exist in the project.</p>
     */

    public CartSetCustomerIdActionBuilder customerId(@Nullable final String customerId) {
        this.customerId = customerId;
        return this;
    }

    @Nullable
    public String getCustomerId() {
        return this.customerId;
    }

    public CartSetCustomerIdAction build() {
        return new CartSetCustomerIdActionImpl(customerId);
    }

    /**
     * builds CartSetCustomerIdAction without checking for non null required values
     */
    public CartSetCustomerIdAction buildUnchecked() {
        return new CartSetCustomerIdActionImpl(customerId);
    }

    public static CartSetCustomerIdActionBuilder of() {
        return new CartSetCustomerIdActionBuilder();
    }

    public static CartSetCustomerIdActionBuilder of(final CartSetCustomerIdAction template) {
        CartSetCustomerIdActionBuilder builder = new CartSetCustomerIdActionBuilder();
        builder.customerId = template.getCustomerId();
        return builder;
    }

}
