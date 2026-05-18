
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerRemoveShippingAddressIdAction" rel="nofollow">Remove Shipping Address ID</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerShippingAddressRemovedMessagePayload customerShippingAddressRemovedMessagePayload = CustomerShippingAddressRemovedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerShippingAddressRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerShippingAddressRemovedMessagePayloadImpl.class)
public interface CustomerShippingAddressRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerShippingAddressRemovedMessagePayload
     */
    String CUSTOMER_SHIPPING_ADDRESS_REMOVED = "CustomerShippingAddressRemoved";

    /**
     *  <p>The address that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>shippingAddressIds</code>.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>The address that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>shippingAddressIds</code>.</p>
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     * factory method
     * @return instance of CustomerShippingAddressRemovedMessagePayload
     */
    public static CustomerShippingAddressRemovedMessagePayload of() {
        return new CustomerShippingAddressRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerShippingAddressRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerShippingAddressRemovedMessagePayload of(
            final CustomerShippingAddressRemovedMessagePayload template) {
        CustomerShippingAddressRemovedMessagePayloadImpl instance = new CustomerShippingAddressRemovedMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public CustomerShippingAddressRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CustomerShippingAddressRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerShippingAddressRemovedMessagePayload deepCopy(
            @Nullable final CustomerShippingAddressRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerShippingAddressRemovedMessagePayloadImpl instance = new CustomerShippingAddressRemovedMessagePayloadImpl();
        instance.setAddress(com.commercetools.api.models.common.Address.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for CustomerShippingAddressRemovedMessagePayload
     * @return builder
     */
    public static CustomerShippingAddressRemovedMessagePayloadBuilder builder() {
        return CustomerShippingAddressRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerShippingAddressRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerShippingAddressRemovedMessagePayloadBuilder builder(
            final CustomerShippingAddressRemovedMessagePayload template) {
        return CustomerShippingAddressRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerShippingAddressRemovedMessagePayload(
            Function<CustomerShippingAddressRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerShippingAddressRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerShippingAddressRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerShippingAddressRemovedMessagePayload>";
            }
        };
    }
}
