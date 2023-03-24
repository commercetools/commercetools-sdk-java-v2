
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetCustomerGroupActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomerGroupAction cartSetCustomerGroupAction = CartSetCustomerGroupAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetCustomerGroupActionBuilder implements Builder<CartSetCustomerGroupAction> {

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public CartSetCustomerGroupActionBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param customerGroup value to be set
     * @return Builder
     */

    public CartSetCustomerGroupActionBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     * builds CartSetCustomerGroupAction with checking for non-null required values
     * @return CartSetCustomerGroupAction
     */
    public CartSetCustomerGroupAction build() {
        return new CartSetCustomerGroupActionImpl(customerGroup);
    }

    /**
     * builds CartSetCustomerGroupAction without checking for non-null required values
     * @return CartSetCustomerGroupAction
     */
    public CartSetCustomerGroupAction buildUnchecked() {
        return new CartSetCustomerGroupActionImpl(customerGroup);
    }

    public static CartSetCustomerGroupActionBuilder of() {
        return new CartSetCustomerGroupActionBuilder();
    }

    public static CartSetCustomerGroupActionBuilder of(final CartSetCustomerGroupAction template) {
        CartSetCustomerGroupActionBuilder builder = new CartSetCustomerGroupActionBuilder();
        builder.customerGroup = template.getCustomerGroup();
        return builder;
    }

}
