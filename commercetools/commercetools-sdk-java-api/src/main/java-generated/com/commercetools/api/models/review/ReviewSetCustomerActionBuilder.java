
package com.commercetools.api.models.review;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewSetCustomerActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewSetCustomerAction reviewSetCustomerAction = ReviewSetCustomerAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReviewSetCustomerActionBuilder implements Builder<ReviewSetCustomerAction> {

    @Nullable
    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    /**
     <*  <p>The customer who created the review. If <code>customer</code> is absent or <code>null</code>, this field will be removed if it exists.</p>>
     */

    public ReviewSetCustomerActionBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     <*  <p>The customer who created the review. If <code>customer</code> is absent or <code>null</code>, this field will be removed if it exists.</p>>
     */

    public ReviewSetCustomerActionBuilder customer(
            @Nullable final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer() {
        return this.customer;
    }

    public ReviewSetCustomerAction build() {
        return new ReviewSetCustomerActionImpl(customer);
    }

    /**
     * builds ReviewSetCustomerAction without checking for non null required values
     */
    public ReviewSetCustomerAction buildUnchecked() {
        return new ReviewSetCustomerActionImpl(customer);
    }

    public static ReviewSetCustomerActionBuilder of() {
        return new ReviewSetCustomerActionBuilder();
    }

    public static ReviewSetCustomerActionBuilder of(final ReviewSetCustomerAction template) {
        ReviewSetCustomerActionBuilder builder = new ReviewSetCustomerActionBuilder();
        builder.customer = template.getCustomer();
        return builder;
    }

}
