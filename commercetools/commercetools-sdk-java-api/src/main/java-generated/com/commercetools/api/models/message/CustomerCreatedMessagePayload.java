
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.customer.Customer;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Create Customer request.</p>
 *
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerCreatedMessagePayloadImpl.class)
public interface CustomerCreatedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerCreatedMessagePayload
     */
    String CUSTOMER_CREATED = "CustomerCreated";

    /**
     *  <p>Customer that was created.</p>
     * @return customer
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public Customer getCustomer();

    /**
     *  <p>Customer that was created.</p>
     * @param customer value to be set
     */

    public void setCustomer(final Customer customer);

    /**
     * factory method
     * @return instance of CustomerCreatedMessagePayload
     */
    public static CustomerCreatedMessagePayload of() {
        return new CustomerCreatedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerCreatedMessagePayload of(final CustomerCreatedMessagePayload template) {
        CustomerCreatedMessagePayloadImpl instance = new CustomerCreatedMessagePayloadImpl();
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerCreatedMessagePayload deepCopy(@Nullable final CustomerCreatedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerCreatedMessagePayloadImpl instance = new CustomerCreatedMessagePayloadImpl();
        instance.setCustomer(com.commercetools.api.models.customer.Customer.deepCopy(template.getCustomer()));
        return instance;
    }

    /**
     * builder factory method for CustomerCreatedMessagePayload
     * @return builder
     */
    public static CustomerCreatedMessagePayloadBuilder builder() {
        return CustomerCreatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerCreatedMessagePayloadBuilder builder(final CustomerCreatedMessagePayload template) {
        return CustomerCreatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerCreatedMessagePayload(Function<CustomerCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerCreatedMessagePayload>";
            }
        };
    }
}
