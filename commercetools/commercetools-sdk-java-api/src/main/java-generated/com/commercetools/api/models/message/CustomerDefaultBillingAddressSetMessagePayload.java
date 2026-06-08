
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetDefaultBillingAddressAction" rel="nofollow">Set Default Billing Address</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerDefaultBillingAddressSetMessagePayload customerDefaultBillingAddressSetMessagePayload = CustomerDefaultBillingAddressSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerDefaultBillingAddressSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerDefaultBillingAddressSetMessagePayloadImpl.class)
public interface CustomerDefaultBillingAddressSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerDefaultBillingAddressSetMessagePayload
     */
    String CUSTOMER_DEFAULT_BILLING_ADDRESS_SET = "CustomerDefaultBillingAddressSet";

    /**
     *  <p>The address that was set as the default billing address.</p>
     * @return address
     */
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>The address that was set as the default billing address.</p>
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     * factory method
     * @return instance of CustomerDefaultBillingAddressSetMessagePayload
     */
    public static CustomerDefaultBillingAddressSetMessagePayload of() {
        return new CustomerDefaultBillingAddressSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerDefaultBillingAddressSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerDefaultBillingAddressSetMessagePayload of(
            final CustomerDefaultBillingAddressSetMessagePayload template) {
        CustomerDefaultBillingAddressSetMessagePayloadImpl instance = new CustomerDefaultBillingAddressSetMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public CustomerDefaultBillingAddressSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CustomerDefaultBillingAddressSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerDefaultBillingAddressSetMessagePayload deepCopy(
            @Nullable final CustomerDefaultBillingAddressSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerDefaultBillingAddressSetMessagePayloadImpl instance = new CustomerDefaultBillingAddressSetMessagePayloadImpl();
        instance.setAddress(com.commercetools.api.models.common.Address.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for CustomerDefaultBillingAddressSetMessagePayload
     * @return builder
     */
    public static CustomerDefaultBillingAddressSetMessagePayloadBuilder builder() {
        return CustomerDefaultBillingAddressSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerDefaultBillingAddressSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerDefaultBillingAddressSetMessagePayloadBuilder builder(
            final CustomerDefaultBillingAddressSetMessagePayload template) {
        return CustomerDefaultBillingAddressSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerDefaultBillingAddressSetMessagePayload(
            Function<CustomerDefaultBillingAddressSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerDefaultBillingAddressSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerDefaultBillingAddressSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerDefaultBillingAddressSetMessagePayload>";
            }
        };
    }
}
