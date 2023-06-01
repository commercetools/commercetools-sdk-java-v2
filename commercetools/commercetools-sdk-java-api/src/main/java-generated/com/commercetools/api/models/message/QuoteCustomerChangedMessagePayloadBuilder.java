package com.commercetools.api.models.message;

import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.QuoteCustomerChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteCustomerChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteCustomerChangedMessagePayload quoteCustomerChangedMessagePayload = QuoteCustomerChangedMessagePayload.builder()
 *             .customer(customerBuilder -> customerBuilder)
 *             .previousCustomer(previousCustomerBuilder -> previousCustomerBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class QuoteCustomerChangedMessagePayloadBuilder implements Builder<QuoteCustomerChangedMessagePayload> {

    
    
    private com.commercetools.api.models.customer.CustomerReference customer;
    
    
    
    private com.commercetools.api.models.customer.CustomerReference previousCustomer;

    
    /**
     *  <p>The Buyer who now owns the Quote.</p>
     * @param builder function to build the customer value
     * @return Builder
     */
    
    public QuoteCustomerChangedMessagePayloadBuilder customer(Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>The Buyer who now owns the Quote.</p>
     * @param builder function to build the customer value
     * @return Builder
     */
    
    public QuoteCustomerChangedMessagePayloadBuilder withCustomer(Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReference> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>The Buyer who now owns the Quote.</p>
     * @param customer value to be set
     * @return Builder
     */
    
    public QuoteCustomerChangedMessagePayloadBuilder customer( final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }
    
    
    
    
    /**
     *  <p>The previous Buyer.</p>
     * @param builder function to build the previousCustomer value
     * @return Builder
     */
    
    public QuoteCustomerChangedMessagePayloadBuilder previousCustomer(Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.previousCustomer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>The previous Buyer.</p>
     * @param builder function to build the previousCustomer value
     * @return Builder
     */
    
    public QuoteCustomerChangedMessagePayloadBuilder withPreviousCustomer(Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReference> builder) {
        this.previousCustomer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>The previous Buyer.</p>
     * @param previousCustomer value to be set
     * @return Builder
     */
    
    public QuoteCustomerChangedMessagePayloadBuilder previousCustomer( final com.commercetools.api.models.customer.CustomerReference previousCustomer) {
        this.previousCustomer = previousCustomer;
        return this;
    }
    
    

    /**
     *  <p>The Buyer who now owns the Quote.</p>
     * @return customer
     */
    
    
    public com.commercetools.api.models.customer.CustomerReference getCustomer(){
        return this.customer;
    }
    
    /**
     *  <p>The previous Buyer.</p>
     * @return previousCustomer
     */
    
    
    public com.commercetools.api.models.customer.CustomerReference getPreviousCustomer(){
        return this.previousCustomer;
    }

    /**
     * builds QuoteCustomerChangedMessagePayload with checking for non-null required values
     * @return QuoteCustomerChangedMessagePayload
     */
    public QuoteCustomerChangedMessagePayload build() {
        Objects.requireNonNull(customer, QuoteCustomerChangedMessagePayload.class + ": customer is missing");
        Objects.requireNonNull(previousCustomer, QuoteCustomerChangedMessagePayload.class + ": previousCustomer is missing");
        return new QuoteCustomerChangedMessagePayloadImpl(customer, previousCustomer);
    }
    
    /**
     * builds QuoteCustomerChangedMessagePayload without checking for non-null required values
     * @return QuoteCustomerChangedMessagePayload
     */
    public QuoteCustomerChangedMessagePayload buildUnchecked() {
        return new QuoteCustomerChangedMessagePayloadImpl(customer, previousCustomer);
    }

    /**
     * factory method for an instance of QuoteCustomerChangedMessagePayloadBuilder
     * @return builder 
     */
    public static QuoteCustomerChangedMessagePayloadBuilder of() {
        return new QuoteCustomerChangedMessagePayloadBuilder();
    }

    /**
     * create builder for QuoteCustomerChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteCustomerChangedMessagePayloadBuilder of(final QuoteCustomerChangedMessagePayload template) {
        QuoteCustomerChangedMessagePayloadBuilder builder = new QuoteCustomerChangedMessagePayloadBuilder();
        builder.customer = template.getCustomer();
        builder.previousCustomer = template.getPreviousCustomer();
        return builder;
    }

}
