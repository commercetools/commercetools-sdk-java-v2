
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
 *  <p>Generated after a successful Remove Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddressRemovedMessagePayload businessUnitAddressRemovedMessagePayload = BusinessUnitAddressRemovedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitAddressRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAddressRemovedMessagePayloadImpl.class)
public interface BusinessUnitAddressRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitAddressRemovedMessagePayload
     */
    String BUSINESS_UNIT_ADDRESS_REMOVED = "BusinessUnitAddressRemoved";

    /**
     *  <p>The address that was removed from the Business Unit.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>The address that was removed from the Business Unit.</p>
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     * factory method
     * @return instance of BusinessUnitAddressRemovedMessagePayload
     */
    public static BusinessUnitAddressRemovedMessagePayload of() {
        return new BusinessUnitAddressRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitAddressRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitAddressRemovedMessagePayload of(final BusinessUnitAddressRemovedMessagePayload template) {
        BusinessUnitAddressRemovedMessagePayloadImpl instance = new BusinessUnitAddressRemovedMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public BusinessUnitAddressRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitAddressRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitAddressRemovedMessagePayload deepCopy(
            @Nullable final BusinessUnitAddressRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitAddressRemovedMessagePayloadImpl instance = new BusinessUnitAddressRemovedMessagePayloadImpl();
        instance.setAddress(com.commercetools.api.models.common.Address.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAddressRemovedMessagePayload
     * @return builder
     */
    public static BusinessUnitAddressRemovedMessagePayloadBuilder builder() {
        return BusinessUnitAddressRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitAddressRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddressRemovedMessagePayloadBuilder builder(
            final BusinessUnitAddressRemovedMessagePayload template) {
        return BusinessUnitAddressRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAddressRemovedMessagePayload(
            Function<BusinessUnitAddressRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAddressRemovedMessagePayload>";
            }
        };
    }
}
