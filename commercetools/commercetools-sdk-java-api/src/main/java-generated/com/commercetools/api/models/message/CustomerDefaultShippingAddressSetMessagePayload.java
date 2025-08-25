
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

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetDefaultShippingAddressAction" rel="nofollow">Set Default Shipping Address</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerDefaultShippingAddressSetMessagePayload customerDefaultShippingAddressSetMessagePayload = CustomerDefaultShippingAddressSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerDefaultShippingAddressSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerDefaultShippingAddressSetMessagePayloadImpl.class)
public interface CustomerDefaultShippingAddressSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerDefaultShippingAddressSetMessagePayload
     */
    String CUSTOMER_DEFAULT_SHIPPING_ADDRESS_SET = "CustomerDefaultShippingAddressSet";

    /**
     *  <p>The address that was set as the default shipping address.</p>
     * @return address
     */
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>The address that was set as the default shipping address.</p>
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     * factory method
     * @return instance of CustomerDefaultShippingAddressSetMessagePayload
     */
    public static CustomerDefaultShippingAddressSetMessagePayload of() {
        return new CustomerDefaultShippingAddressSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerDefaultShippingAddressSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerDefaultShippingAddressSetMessagePayload of(
            final CustomerDefaultShippingAddressSetMessagePayload template) {
        CustomerDefaultShippingAddressSetMessagePayloadImpl instance = new CustomerDefaultShippingAddressSetMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public CustomerDefaultShippingAddressSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CustomerDefaultShippingAddressSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerDefaultShippingAddressSetMessagePayload deepCopy(
            @Nullable final CustomerDefaultShippingAddressSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerDefaultShippingAddressSetMessagePayloadImpl instance = new CustomerDefaultShippingAddressSetMessagePayloadImpl();
        instance.setAddress(com.commercetools.api.models.common.Address.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for CustomerDefaultShippingAddressSetMessagePayload
     * @return builder
     */
    public static CustomerDefaultShippingAddressSetMessagePayloadBuilder builder() {
        return CustomerDefaultShippingAddressSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerDefaultShippingAddressSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerDefaultShippingAddressSetMessagePayloadBuilder builder(
            final CustomerDefaultShippingAddressSetMessagePayload template) {
        return CustomerDefaultShippingAddressSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerDefaultShippingAddressSetMessagePayload(
            Function<CustomerDefaultShippingAddressSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerDefaultShippingAddressSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerDefaultShippingAddressSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerDefaultShippingAddressSetMessagePayload>";
            }
        };
    }
}
