
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Add Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddressAddedMessagePayload businessUnitAddressAddedMessagePayload = BusinessUnitAddressAddedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAddressAddedMessagePayloadImpl.class)
public interface BusinessUnitAddressAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitAddressAddedMessagePayload
     */
    String BUSINESS_UNIT_ADDRESS_ADDED = "BusinessUnitAddressAdded";

    /**
     *  <p>The address that was added to the Business Unit.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>The address that was added to the Business Unit.</p>
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     * factory method
     * @return instance of BusinessUnitAddressAddedMessagePayload
     */
    public static BusinessUnitAddressAddedMessagePayload of() {
        return new BusinessUnitAddressAddedMessagePayloadImpl();
    }

    /**
     * factory method to copy an instance of BusinessUnitAddressAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitAddressAddedMessagePayload of(final BusinessUnitAddressAddedMessagePayload template) {
        BusinessUnitAddressAddedMessagePayloadImpl instance = new BusinessUnitAddressAddedMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAddressAddedMessagePayload
     * @return builder
     */
    public static BusinessUnitAddressAddedMessagePayloadBuilder builder() {
        return BusinessUnitAddressAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitAddressAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddressAddedMessagePayloadBuilder builder(
            final BusinessUnitAddressAddedMessagePayload template) {
        return BusinessUnitAddressAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAddressAddedMessagePayload(
            Function<BusinessUnitAddressAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAddressAddedMessagePayload>";
            }
        };
    }
}
