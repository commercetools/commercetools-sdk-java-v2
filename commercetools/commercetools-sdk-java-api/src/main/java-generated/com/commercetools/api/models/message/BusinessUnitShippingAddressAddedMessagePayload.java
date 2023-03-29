
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
 *  <p>Generated after a successful Add Shipping Address Identifier update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitShippingAddressAddedMessagePayload businessUnitShippingAddressAddedMessagePayload = BusinessUnitShippingAddressAddedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitShippingAddressAddedMessagePayloadImpl.class)
public interface BusinessUnitShippingAddressAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitShippingAddressAddedMessagePayload
     */
    String BUSINESS_UNIT_SHIPPING_ADDRESS_ADDED = "BusinessUnitShippingAddressAdded";

    /**
     *  <p>The address that was added to the Business Unit as shipping address.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>The address that was added to the Business Unit as shipping address.</p>
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     * factory method
     * @return instance of BusinessUnitShippingAddressAddedMessagePayload
     */
    public static BusinessUnitShippingAddressAddedMessagePayload of() {
        return new BusinessUnitShippingAddressAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitShippingAddressAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitShippingAddressAddedMessagePayload of(
            final BusinessUnitShippingAddressAddedMessagePayload template) {
        BusinessUnitShippingAddressAddedMessagePayloadImpl instance = new BusinessUnitShippingAddressAddedMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitShippingAddressAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitShippingAddressAddedMessagePayload deepCopy(
            @Nullable final BusinessUnitShippingAddressAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitShippingAddressAddedMessagePayloadImpl instance = new BusinessUnitShippingAddressAddedMessagePayloadImpl();
        instance.setAddress(com.commercetools.api.models.common.Address.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitShippingAddressAddedMessagePayload
     * @return builder
     */
    public static BusinessUnitShippingAddressAddedMessagePayloadBuilder builder() {
        return BusinessUnitShippingAddressAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitShippingAddressAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitShippingAddressAddedMessagePayloadBuilder builder(
            final BusinessUnitShippingAddressAddedMessagePayload template) {
        return BusinessUnitShippingAddressAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitShippingAddressAddedMessagePayload(
            Function<BusinessUnitShippingAddressAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitShippingAddressAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitShippingAddressAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitShippingAddressAddedMessagePayload>";
            }
        };
    }
}
