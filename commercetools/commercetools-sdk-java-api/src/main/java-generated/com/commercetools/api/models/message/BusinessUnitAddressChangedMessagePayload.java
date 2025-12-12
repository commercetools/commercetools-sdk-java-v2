
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.common.AddressRole;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeAddressAction" rel="nofollow">Change Address</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddressChangedMessagePayload businessUnitAddressChangedMessagePayload = BusinessUnitAddressChangedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .plusAddressRoles(addressRolesBuilder -> addressRolesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitAddressChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAddressChangedMessagePayloadImpl.class)
public interface BusinessUnitAddressChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitAddressChangedMessagePayload
     */
    String BUSINESS_UNIT_ADDRESS_CHANGED = "BusinessUnitAddressChanged";

    /**
     *  <p>Updated address of the Business Unit.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>Indicates if the address was used for shipping or billing purposes.</p>
     * @return addressRoles
     */
    @NotNull
    @JsonProperty("addressRoles")
    public List<AddressRole> getAddressRoles();

    /**
     *  <p>Updated address of the Business Unit.</p>
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     *  <p>Indicates if the address was used for shipping or billing purposes.</p>
     * @param addressRoles values to be set
     */

    @JsonIgnore
    public void setAddressRoles(final AddressRole... addressRoles);

    /**
     *  <p>Indicates if the address was used for shipping or billing purposes.</p>
     * @param addressRoles values to be set
     */

    public void setAddressRoles(final List<AddressRole> addressRoles);

    /**
     * factory method
     * @return instance of BusinessUnitAddressChangedMessagePayload
     */
    public static BusinessUnitAddressChangedMessagePayload of() {
        return new BusinessUnitAddressChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitAddressChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitAddressChangedMessagePayload of(final BusinessUnitAddressChangedMessagePayload template) {
        BusinessUnitAddressChangedMessagePayloadImpl instance = new BusinessUnitAddressChangedMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        instance.setAddressRoles(template.getAddressRoles());
        return instance;
    }

    public BusinessUnitAddressChangedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitAddressChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitAddressChangedMessagePayload deepCopy(
            @Nullable final BusinessUnitAddressChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitAddressChangedMessagePayloadImpl instance = new BusinessUnitAddressChangedMessagePayloadImpl();
        instance.setAddress(com.commercetools.api.models.common.Address.deepCopy(template.getAddress()));
        instance.setAddressRoles(Optional.ofNullable(template.getAddressRoles()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAddressChangedMessagePayload
     * @return builder
     */
    public static BusinessUnitAddressChangedMessagePayloadBuilder builder() {
        return BusinessUnitAddressChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitAddressChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddressChangedMessagePayloadBuilder builder(
            final BusinessUnitAddressChangedMessagePayload template) {
        return BusinessUnitAddressChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAddressChangedMessagePayload(
            Function<BusinessUnitAddressChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAddressChangedMessagePayload>";
            }
        };
    }
}
