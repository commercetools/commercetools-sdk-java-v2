
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerAddShippingAddressIdAction" rel="nofollow">Add Shipping Address ID</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerShippingAddressAddedMessagePayload customerShippingAddressAddedMessagePayload = CustomerShippingAddressAddedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerShippingAddressAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerShippingAddressAddedMessagePayloadImpl.class)
public interface CustomerShippingAddressAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerShippingAddressAddedMessagePayload
     */
    String CUSTOMER_SHIPPING_ADDRESS_ADDED = "CustomerShippingAddressAdded";

    /**
     *  <p>The address that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>shippingAddressIds</code>.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>The address that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>shippingAddressIds</code>.</p>
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     * factory method
     * @return instance of CustomerShippingAddressAddedMessagePayload
     */
    public static CustomerShippingAddressAddedMessagePayload of() {
        return new CustomerShippingAddressAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerShippingAddressAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerShippingAddressAddedMessagePayload of(
            final CustomerShippingAddressAddedMessagePayload template) {
        CustomerShippingAddressAddedMessagePayloadImpl instance = new CustomerShippingAddressAddedMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public CustomerShippingAddressAddedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CustomerShippingAddressAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerShippingAddressAddedMessagePayload deepCopy(
            @Nullable final CustomerShippingAddressAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerShippingAddressAddedMessagePayloadImpl instance = new CustomerShippingAddressAddedMessagePayloadImpl();
        instance.setAddress(com.commercetools.api.models.common.Address.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for CustomerShippingAddressAddedMessagePayload
     * @return builder
     */
    public static CustomerShippingAddressAddedMessagePayloadBuilder builder() {
        return CustomerShippingAddressAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerShippingAddressAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerShippingAddressAddedMessagePayloadBuilder builder(
            final CustomerShippingAddressAddedMessagePayload template) {
        return CustomerShippingAddressAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerShippingAddressAddedMessagePayload(
            Function<CustomerShippingAddressAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerShippingAddressAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerShippingAddressAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerShippingAddressAddedMessagePayload>";
            }
        };
    }
}
