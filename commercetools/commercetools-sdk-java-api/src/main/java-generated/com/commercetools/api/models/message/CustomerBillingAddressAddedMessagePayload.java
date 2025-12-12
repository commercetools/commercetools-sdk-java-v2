
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerAddBillingAddressIdAction" rel="nofollow">Add Billing Address ID</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerBillingAddressAddedMessagePayload customerBillingAddressAddedMessagePayload = CustomerBillingAddressAddedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerBillingAddressAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerBillingAddressAddedMessagePayloadImpl.class)
public interface CustomerBillingAddressAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerBillingAddressAddedMessagePayload
     */
    String CUSTOMER_BILLING_ADDRESS_ADDED = "CustomerBillingAddressAdded";

    /**
     *  <p>The address that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>billingAddressIds</code>.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>The address that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>billingAddressIds</code>.</p>
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     * factory method
     * @return instance of CustomerBillingAddressAddedMessagePayload
     */
    public static CustomerBillingAddressAddedMessagePayload of() {
        return new CustomerBillingAddressAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerBillingAddressAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerBillingAddressAddedMessagePayload of(
            final CustomerBillingAddressAddedMessagePayload template) {
        CustomerBillingAddressAddedMessagePayloadImpl instance = new CustomerBillingAddressAddedMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public CustomerBillingAddressAddedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CustomerBillingAddressAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerBillingAddressAddedMessagePayload deepCopy(
            @Nullable final CustomerBillingAddressAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerBillingAddressAddedMessagePayloadImpl instance = new CustomerBillingAddressAddedMessagePayloadImpl();
        instance.setAddress(com.commercetools.api.models.common.Address.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for CustomerBillingAddressAddedMessagePayload
     * @return builder
     */
    public static CustomerBillingAddressAddedMessagePayloadBuilder builder() {
        return CustomerBillingAddressAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerBillingAddressAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerBillingAddressAddedMessagePayloadBuilder builder(
            final CustomerBillingAddressAddedMessagePayload template) {
        return CustomerBillingAddressAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerBillingAddressAddedMessagePayload(
            Function<CustomerBillingAddressAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerBillingAddressAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerBillingAddressAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerBillingAddressAddedMessagePayload>";
            }
        };
    }
}
