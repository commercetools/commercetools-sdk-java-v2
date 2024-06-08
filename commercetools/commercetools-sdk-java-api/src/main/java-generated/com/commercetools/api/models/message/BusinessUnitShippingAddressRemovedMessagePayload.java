
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
 *  <p>Generated after a successful Remove Shipping Address Identifier update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitShippingAddressRemovedMessagePayload businessUnitShippingAddressRemovedMessagePayload = BusinessUnitShippingAddressRemovedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitShippingAddressRemovedMessagePayloadImpl.class)
public interface BusinessUnitShippingAddressRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitShippingAddressRemovedMessagePayload
     */
    String BUSINESS_UNIT_SHIPPING_ADDRESS_REMOVED = "BusinessUnitShippingAddressRemoved";

    /**
     *  <p>The address that was removed from shipping addresses of the Business Unit.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>The address that was removed from shipping addresses of the Business Unit.</p>
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     * factory method
     * @return instance of BusinessUnitShippingAddressRemovedMessagePayload
     */
    public static BusinessUnitShippingAddressRemovedMessagePayload of() {
        return new BusinessUnitShippingAddressRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitShippingAddressRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitShippingAddressRemovedMessagePayload of(
            final BusinessUnitShippingAddressRemovedMessagePayload template) {
        BusinessUnitShippingAddressRemovedMessagePayloadImpl instance = new BusinessUnitShippingAddressRemovedMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitShippingAddressRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitShippingAddressRemovedMessagePayload deepCopy(
            @Nullable final BusinessUnitShippingAddressRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitShippingAddressRemovedMessagePayloadImpl instance = new BusinessUnitShippingAddressRemovedMessagePayloadImpl();
        instance.setAddress(com.commercetools.api.models.common.Address.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitShippingAddressRemovedMessagePayload
     * @return builder
     */
    public static BusinessUnitShippingAddressRemovedMessagePayloadBuilder builder() {
        return BusinessUnitShippingAddressRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitShippingAddressRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitShippingAddressRemovedMessagePayloadBuilder builder(
            final BusinessUnitShippingAddressRemovedMessagePayload template) {
        return BusinessUnitShippingAddressRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitShippingAddressRemovedMessagePayload(
            Function<BusinessUnitShippingAddressRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitShippingAddressRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitShippingAddressRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitShippingAddressRemovedMessagePayload>";
            }
        };
    }
}
