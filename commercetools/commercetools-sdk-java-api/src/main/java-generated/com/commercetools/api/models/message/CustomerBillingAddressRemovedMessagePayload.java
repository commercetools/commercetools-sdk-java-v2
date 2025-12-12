
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerRemoveBillingAddressIdAction" rel="nofollow">Remove Billing Address ID</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerBillingAddressRemovedMessagePayload customerBillingAddressRemovedMessagePayload = CustomerBillingAddressRemovedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerBillingAddressRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerBillingAddressRemovedMessagePayloadImpl.class)
public interface CustomerBillingAddressRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerBillingAddressRemovedMessagePayload
     */
    String CUSTOMER_BILLING_ADDRESS_REMOVED = "CustomerBillingAddressRemoved";

    /**
     *  <p>The address that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>billingAddressIds</code>.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>The address that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>billingAddressIds</code>.</p>
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     * factory method
     * @return instance of CustomerBillingAddressRemovedMessagePayload
     */
    public static CustomerBillingAddressRemovedMessagePayload of() {
        return new CustomerBillingAddressRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerBillingAddressRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerBillingAddressRemovedMessagePayload of(
            final CustomerBillingAddressRemovedMessagePayload template) {
        CustomerBillingAddressRemovedMessagePayloadImpl instance = new CustomerBillingAddressRemovedMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public CustomerBillingAddressRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CustomerBillingAddressRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerBillingAddressRemovedMessagePayload deepCopy(
            @Nullable final CustomerBillingAddressRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerBillingAddressRemovedMessagePayloadImpl instance = new CustomerBillingAddressRemovedMessagePayloadImpl();
        instance.setAddress(com.commercetools.api.models.common.Address.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for CustomerBillingAddressRemovedMessagePayload
     * @return builder
     */
    public static CustomerBillingAddressRemovedMessagePayloadBuilder builder() {
        return CustomerBillingAddressRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerBillingAddressRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerBillingAddressRemovedMessagePayloadBuilder builder(
            final CustomerBillingAddressRemovedMessagePayload template) {
        return CustomerBillingAddressRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerBillingAddressRemovedMessagePayload(
            Function<CustomerBillingAddressRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerBillingAddressRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerBillingAddressRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerBillingAddressRemovedMessagePayload>";
            }
        };
    }
}
