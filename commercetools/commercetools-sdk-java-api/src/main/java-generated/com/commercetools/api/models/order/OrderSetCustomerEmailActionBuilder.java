
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetCustomerEmailActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetCustomerEmailAction orderSetCustomerEmailAction = OrderSetCustomerEmailAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetCustomerEmailActionBuilder implements Builder<OrderSetCustomerEmailAction> {

    @Nullable
    private String email;

    /**
     *
     * @param email
     * @return Builder
     */

    public OrderSetCustomerEmailActionBuilder email(@Nullable final String email) {
        this.email = email;
        return this;
    }

    @Nullable
    public String getEmail() {
        return this.email;
    }

    public OrderSetCustomerEmailAction build() {
        return new OrderSetCustomerEmailActionImpl(email);
    }

    /**
     * builds OrderSetCustomerEmailAction without checking for non null required values
     */
    public OrderSetCustomerEmailAction buildUnchecked() {
        return new OrderSetCustomerEmailActionImpl(email);
    }

    public static OrderSetCustomerEmailActionBuilder of() {
        return new OrderSetCustomerEmailActionBuilder();
    }

    public static OrderSetCustomerEmailActionBuilder of(final OrderSetCustomerEmailAction template) {
        OrderSetCustomerEmailActionBuilder builder = new OrderSetCustomerEmailActionBuilder();
        builder.email = template.getEmail();
        return builder;
    }

}
