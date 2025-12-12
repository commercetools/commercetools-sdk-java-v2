
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerChangeAddressAction" rel="nofollow">Change Address</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddressChangedMessagePayload customerAddressChangedMessagePayload = CustomerAddressChangedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .plusAddressRoles(addressRolesBuilder -> addressRolesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerAddressChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerAddressChangedMessagePayloadImpl.class)
public interface CustomerAddressChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerAddressChangedMessagePayload
     */
    String CUSTOMER_ADDRESS_CHANGED = "CustomerAddressChanged";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> that was set during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerChangeAddressAction" rel="nofollow">Change Address</a> update action.</p>
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> that was set during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerChangeAddressAction" rel="nofollow">Change Address</a> update action.</p>
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
     * @return instance of CustomerAddressChangedMessagePayload
     */
    public static CustomerAddressChangedMessagePayload of() {
        return new CustomerAddressChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerAddressChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerAddressChangedMessagePayload of(final CustomerAddressChangedMessagePayload template) {
        CustomerAddressChangedMessagePayloadImpl instance = new CustomerAddressChangedMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        instance.setAddressRoles(template.getAddressRoles());
        return instance;
    }

    public CustomerAddressChangedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CustomerAddressChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerAddressChangedMessagePayload deepCopy(
            @Nullable final CustomerAddressChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerAddressChangedMessagePayloadImpl instance = new CustomerAddressChangedMessagePayloadImpl();
        instance.setAddress(com.commercetools.api.models.common.Address.deepCopy(template.getAddress()));
        instance.setAddressRoles(Optional.ofNullable(template.getAddressRoles()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for CustomerAddressChangedMessagePayload
     * @return builder
     */
    public static CustomerAddressChangedMessagePayloadBuilder builder() {
        return CustomerAddressChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerAddressChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddressChangedMessagePayloadBuilder builder(
            final CustomerAddressChangedMessagePayload template) {
        return CustomerAddressChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerAddressChangedMessagePayload(Function<CustomerAddressChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerAddressChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerAddressChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerAddressChangedMessagePayload>";
            }
        };
    }
}
