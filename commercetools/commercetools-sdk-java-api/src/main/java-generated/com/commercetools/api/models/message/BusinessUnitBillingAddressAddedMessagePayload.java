
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
 *  <p>Generated after a successful Add Billing Address Identifier update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitBillingAddressAddedMessagePayload businessUnitBillingAddressAddedMessagePayload = BusinessUnitBillingAddressAddedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitBillingAddressAddedMessagePayloadImpl.class)
public interface BusinessUnitBillingAddressAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitBillingAddressAddedMessagePayload
     */
    String BUSINESS_UNIT_BILLING_ADDRESS_ADDED = "BusinessUnitBillingAddressAdded";

    /**
     *  <p>The address that was added to the Business Unit as billing address.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>The address that was added to the Business Unit as billing address.</p>
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     * factory method
     * @return instance of BusinessUnitBillingAddressAddedMessagePayload
     */
    public static BusinessUnitBillingAddressAddedMessagePayload of() {
        return new BusinessUnitBillingAddressAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitBillingAddressAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitBillingAddressAddedMessagePayload of(
            final BusinessUnitBillingAddressAddedMessagePayload template) {
        BusinessUnitBillingAddressAddedMessagePayloadImpl instance = new BusinessUnitBillingAddressAddedMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitBillingAddressAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitBillingAddressAddedMessagePayload deepCopy(
            @Nullable final BusinessUnitBillingAddressAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitBillingAddressAddedMessagePayloadImpl instance = new BusinessUnitBillingAddressAddedMessagePayloadImpl();
        instance.setAddress(com.commercetools.api.models.common.Address.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitBillingAddressAddedMessagePayload
     * @return builder
     */
    public static BusinessUnitBillingAddressAddedMessagePayloadBuilder builder() {
        return BusinessUnitBillingAddressAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitBillingAddressAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitBillingAddressAddedMessagePayloadBuilder builder(
            final BusinessUnitBillingAddressAddedMessagePayload template) {
        return BusinessUnitBillingAddressAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitBillingAddressAddedMessagePayload(
            Function<BusinessUnitBillingAddressAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitBillingAddressAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitBillingAddressAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitBillingAddressAddedMessagePayload>";
            }
        };
    }
}
