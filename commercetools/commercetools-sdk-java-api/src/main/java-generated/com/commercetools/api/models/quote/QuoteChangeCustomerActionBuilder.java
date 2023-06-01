
package com.commercetools.api.models.quote;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteChangeCustomerActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteChangeCustomerAction quoteChangeCustomerAction = QuoteChangeCustomerAction.builder()
 *             .customer(customerBuilder -> customerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteChangeCustomerActionBuilder implements Builder<QuoteChangeCustomerAction> {

    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    /**
     *  <p>New Customer to own the Quote.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public QuoteChangeCustomerActionBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>New Customer to own the Quote.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public QuoteChangeCustomerActionBuilder withCustomer(
            Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifier> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>New Customer to own the Quote.</p>
     * @param customer value to be set
     * @return Builder
     */

    public QuoteChangeCustomerActionBuilder customer(
            final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>New Customer to own the Quote.</p>
     * @return customer
     */

    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer() {
        return this.customer;
    }

    /**
     * builds QuoteChangeCustomerAction with checking for non-null required values
     * @return QuoteChangeCustomerAction
     */
    public QuoteChangeCustomerAction build() {
        Objects.requireNonNull(customer, QuoteChangeCustomerAction.class + ": customer is missing");
        return new QuoteChangeCustomerActionImpl(customer);
    }

    /**
     * builds QuoteChangeCustomerAction without checking for non-null required values
     * @return QuoteChangeCustomerAction
     */
    public QuoteChangeCustomerAction buildUnchecked() {
        return new QuoteChangeCustomerActionImpl(customer);
    }

    /**
     * factory method for an instance of QuoteChangeCustomerActionBuilder
     * @return builder
     */
    public static QuoteChangeCustomerActionBuilder of() {
        return new QuoteChangeCustomerActionBuilder();
    }

    /**
     * create builder for QuoteChangeCustomerAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteChangeCustomerActionBuilder of(final QuoteChangeCustomerAction template) {
        QuoteChangeCustomerActionBuilder builder = new QuoteChangeCustomerActionBuilder();
        builder.customer = template.getCustomer();
        return builder;
    }

}
