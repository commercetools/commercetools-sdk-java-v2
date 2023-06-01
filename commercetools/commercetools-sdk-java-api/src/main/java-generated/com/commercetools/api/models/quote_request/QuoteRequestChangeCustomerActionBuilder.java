
package com.commercetools.api.models.quote_request;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestChangeCustomerActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestChangeCustomerAction quoteRequestChangeCustomerAction = QuoteRequestChangeCustomerAction.builder()
 *             .customer(customerBuilder -> customerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRequestChangeCustomerActionBuilder implements Builder<QuoteRequestChangeCustomerAction> {

    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    /**
     *  <p>New Customer to own the Quote Request.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public QuoteRequestChangeCustomerActionBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>New Customer to own the Quote Request.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public QuoteRequestChangeCustomerActionBuilder withCustomer(
            Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifier> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>New Customer to own the Quote Request.</p>
     * @param customer value to be set
     * @return Builder
     */

    public QuoteRequestChangeCustomerActionBuilder customer(
            final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>New Customer to own the Quote Request.</p>
     * @return customer
     */

    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer() {
        return this.customer;
    }

    /**
     * builds QuoteRequestChangeCustomerAction with checking for non-null required values
     * @return QuoteRequestChangeCustomerAction
     */
    public QuoteRequestChangeCustomerAction build() {
        Objects.requireNonNull(customer, QuoteRequestChangeCustomerAction.class + ": customer is missing");
        return new QuoteRequestChangeCustomerActionImpl(customer);
    }

    /**
     * builds QuoteRequestChangeCustomerAction without checking for non-null required values
     * @return QuoteRequestChangeCustomerAction
     */
    public QuoteRequestChangeCustomerAction buildUnchecked() {
        return new QuoteRequestChangeCustomerActionImpl(customer);
    }

    /**
     * factory method for an instance of QuoteRequestChangeCustomerActionBuilder
     * @return builder
     */
    public static QuoteRequestChangeCustomerActionBuilder of() {
        return new QuoteRequestChangeCustomerActionBuilder();
    }

    /**
     * create builder for QuoteRequestChangeCustomerAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestChangeCustomerActionBuilder of(final QuoteRequestChangeCustomerAction template) {
        QuoteRequestChangeCustomerActionBuilder builder = new QuoteRequestChangeCustomerActionBuilder();
        builder.customer = template.getCustomer();
        return builder;
    }

}
