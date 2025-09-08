
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerAddAddressAction" rel="nofollow">Add Address</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddressAddedMessagePayload customerAddressAddedMessagePayload = CustomerAddressAddedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerAddressAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerAddressAddedMessagePayloadImpl.class)
public interface CustomerAddressAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerAddressAddedMessagePayload
     */
    String CUSTOMER_ADDRESS_ADDED = "CustomerAddressAdded";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> that was added during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerAddAddressAction" rel="nofollow">Add Address</a> update action.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> that was added during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerAddAddressAction" rel="nofollow">Add Address</a> update action.</p>
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     * factory method
     * @return instance of CustomerAddressAddedMessagePayload
     */
    public static CustomerAddressAddedMessagePayload of() {
        return new CustomerAddressAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerAddressAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerAddressAddedMessagePayload of(final CustomerAddressAddedMessagePayload template) {
        CustomerAddressAddedMessagePayloadImpl instance = new CustomerAddressAddedMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public CustomerAddressAddedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CustomerAddressAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerAddressAddedMessagePayload deepCopy(
            @Nullable final CustomerAddressAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerAddressAddedMessagePayloadImpl instance = new CustomerAddressAddedMessagePayloadImpl();
        instance.setAddress(com.commercetools.api.models.common.Address.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for CustomerAddressAddedMessagePayload
     * @return builder
     */
    public static CustomerAddressAddedMessagePayloadBuilder builder() {
        return CustomerAddressAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerAddressAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddressAddedMessagePayloadBuilder builder(final CustomerAddressAddedMessagePayload template) {
        return CustomerAddressAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerAddressAddedMessagePayload(Function<CustomerAddressAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerAddressAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerAddressAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerAddressAddedMessagePayload>";
            }
        };
    }
}
