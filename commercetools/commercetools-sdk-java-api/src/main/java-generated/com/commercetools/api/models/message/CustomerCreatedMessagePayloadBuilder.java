package com.commercetools.api.models.message;

import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.CustomerCreatedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerCreatedMessagePayload customerCreatedMessagePayload = CustomerCreatedMessagePayload.builder()
 *             .customer(customerBuilder -> customerBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerCreatedMessagePayloadBuilder implements Builder<CustomerCreatedMessagePayload> {

    
    
    private com.commercetools.api.models.customer.Customer customer;

    
    /**
     *  <p>Customer that was created.</p>
     * @param builder function to build the customer value
     * @return Builder
     */
    
    public CustomerCreatedMessagePayloadBuilder customer(Function<com.commercetools.api.models.customer.CustomerBuilder, com.commercetools.api.models.customer.CustomerBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Customer that was created.</p>
     * @param builder function to build the customer value
     * @return Builder
     */
    
    public CustomerCreatedMessagePayloadBuilder withCustomer(Function<com.commercetools.api.models.customer.CustomerBuilder, com.commercetools.api.models.customer.Customer> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Customer that was created.</p>
     * @param customer value to be set
     * @return Builder
     */
    
    public CustomerCreatedMessagePayloadBuilder customer( final com.commercetools.api.models.customer.Customer customer) {
        this.customer = customer;
        return this;
    }
    
    

    /**
     *  <p>Customer that was created.</p>
     * @return customer
     */
    
    
    public com.commercetools.api.models.customer.Customer getCustomer(){
        return this.customer;
    }

    /**
     * builds CustomerCreatedMessagePayload with checking for non-null required values
     * @return CustomerCreatedMessagePayload
     */
    public CustomerCreatedMessagePayload build() {
        Objects.requireNonNull(customer, CustomerCreatedMessagePayload.class + ": customer is missing");
        return new CustomerCreatedMessagePayloadImpl(customer);
    }
    
    /**
     * builds CustomerCreatedMessagePayload without checking for non-null required values
     * @return CustomerCreatedMessagePayload
     */
    public CustomerCreatedMessagePayload buildUnchecked() {
        return new CustomerCreatedMessagePayloadImpl(customer);
    }

    /**
     * factory method for an instance of CustomerCreatedMessagePayloadBuilder
     * @return builder 
     */
    public static CustomerCreatedMessagePayloadBuilder of() {
        return new CustomerCreatedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerCreatedMessagePayloadBuilder of(final CustomerCreatedMessagePayload template) {
        CustomerCreatedMessagePayloadBuilder builder = new CustomerCreatedMessagePayloadBuilder();
        builder.customer = template.getCustomer();
        return builder;
    }

}
