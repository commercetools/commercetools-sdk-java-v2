
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestCustomerChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestCustomerChangedMessagePayload quoteRequestCustomerChangedMessagePayload = QuoteRequestCustomerChangedMessagePayload.builder()
 *             .customer(customerBuilder -> customerBuilder)
 *             .previousCustomer(previousCustomerBuilder -> previousCustomerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRequestCustomerChangedMessagePayloadBuilder
        implements Builder<QuoteRequestCustomerChangedMessagePayload> {

    private com.commercetools.api.models.customer.CustomerReference customer;

    private com.commercetools.api.models.customer.CustomerReference previousCustomer;

    /**
     *  <p>The <span>Buyer</span> who now owns the Quote Request.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public QuoteRequestCustomerChangedMessagePayloadBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The <span>Buyer</span> who now owns the Quote Request.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public QuoteRequestCustomerChangedMessagePayloadBuilder withCustomer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReference> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The <span>Buyer</span> who now owns the Quote Request.</p>
     * @param customer value to be set
     * @return Builder
     */

    public QuoteRequestCustomerChangedMessagePayloadBuilder customer(
            final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>The previous <span>Buyer</span>.</p>
     * @param builder function to build the previousCustomer value
     * @return Builder
     */

    public QuoteRequestCustomerChangedMessagePayloadBuilder previousCustomer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.previousCustomer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The previous <span>Buyer</span>.</p>
     * @param builder function to build the previousCustomer value
     * @return Builder
     */

    public QuoteRequestCustomerChangedMessagePayloadBuilder withPreviousCustomer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReference> builder) {
        this.previousCustomer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The previous <span>Buyer</span>.</p>
     * @param previousCustomer value to be set
     * @return Builder
     */

    public QuoteRequestCustomerChangedMessagePayloadBuilder previousCustomer(
            final com.commercetools.api.models.customer.CustomerReference previousCustomer) {
        this.previousCustomer = previousCustomer;
        return this;
    }

    /**
     *  <p>The <span>Buyer</span> who now owns the Quote Request.</p>
     * @return customer
     */

    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>The previous <span>Buyer</span>.</p>
     * @return previousCustomer
     */

    public com.commercetools.api.models.customer.CustomerReference getPreviousCustomer() {
        return this.previousCustomer;
    }

    /**
     * builds QuoteRequestCustomerChangedMessagePayload with checking for non-null required values
     * @return QuoteRequestCustomerChangedMessagePayload
     */
    public QuoteRequestCustomerChangedMessagePayload build() {
        Objects.requireNonNull(customer, QuoteRequestCustomerChangedMessagePayload.class + ": customer is missing");
        Objects.requireNonNull(previousCustomer,
            QuoteRequestCustomerChangedMessagePayload.class + ": previousCustomer is missing");
        return new QuoteRequestCustomerChangedMessagePayloadImpl(customer, previousCustomer);
    }

    /**
     * builds QuoteRequestCustomerChangedMessagePayload without checking for non-null required values
     * @return QuoteRequestCustomerChangedMessagePayload
     */
    public QuoteRequestCustomerChangedMessagePayload buildUnchecked() {
        return new QuoteRequestCustomerChangedMessagePayloadImpl(customer, previousCustomer);
    }

    /**
     * factory method for an instance of QuoteRequestCustomerChangedMessagePayloadBuilder
     * @return builder
     */
    public static QuoteRequestCustomerChangedMessagePayloadBuilder of() {
        return new QuoteRequestCustomerChangedMessagePayloadBuilder();
    }

    /**
     * create builder for QuoteRequestCustomerChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestCustomerChangedMessagePayloadBuilder of(
            final QuoteRequestCustomerChangedMessagePayload template) {
        QuoteRequestCustomerChangedMessagePayloadBuilder builder = new QuoteRequestCustomerChangedMessagePayloadBuilder();
        builder.customer = template.getCustomer();
        builder.previousCustomer = template.getPreviousCustomer();
        return builder;
    }

}
