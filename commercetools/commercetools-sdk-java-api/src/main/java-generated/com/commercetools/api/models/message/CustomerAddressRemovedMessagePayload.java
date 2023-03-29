
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Remove Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddressRemovedMessagePayload customerAddressRemovedMessagePayload = CustomerAddressRemovedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerAddressRemovedMessagePayloadImpl.class)
public interface CustomerAddressRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerAddressRemovedMessagePayload
     */
    String CUSTOMER_ADDRESS_REMOVED = "CustomerAddressRemoved";

    /**
     *  <p>Address that was removed during the Remove Address update action.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>Address that was removed during the Remove Address update action.</p>
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     * factory method
     * @return instance of CustomerAddressRemovedMessagePayload
     */
    public static CustomerAddressRemovedMessagePayload of() {
        return new CustomerAddressRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerAddressRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerAddressRemovedMessagePayload of(final CustomerAddressRemovedMessagePayload template) {
        CustomerAddressRemovedMessagePayloadImpl instance = new CustomerAddressRemovedMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerAddressRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerAddressRemovedMessagePayload deepCopy(
            @Nullable final CustomerAddressRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerAddressRemovedMessagePayloadImpl instance = new CustomerAddressRemovedMessagePayloadImpl();
        instance.setAddress(Optional.ofNullable(template.getAddress())
                .map(com.commercetools.api.models.common.Address::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CustomerAddressRemovedMessagePayload
     * @return builder
     */
    public static CustomerAddressRemovedMessagePayloadBuilder builder() {
        return CustomerAddressRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerAddressRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddressRemovedMessagePayloadBuilder builder(
            final CustomerAddressRemovedMessagePayload template) {
        return CustomerAddressRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerAddressRemovedMessagePayload(Function<CustomerAddressRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerAddressRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerAddressRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerAddressRemovedMessagePayload>";
            }
        };
    }
}
