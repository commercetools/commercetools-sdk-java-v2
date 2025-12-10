
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerRemoveAddressAction" rel="nofollow">Remove Address</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddressRemovedMessage customerAddressRemovedMessage = CustomerAddressRemovedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .address(addressBuilder -> addressBuilder)
 *             .plusAddressRoles(addressRolesBuilder -> addressRolesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerAddressRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerAddressRemovedMessageImpl.class)
public interface CustomerAddressRemovedMessage extends Message {

    /**
     * discriminator value for CustomerAddressRemovedMessage
     */
    String CUSTOMER_ADDRESS_REMOVED = "CustomerAddressRemoved";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> that was removed during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerRemoveAddressAction" rel="nofollow">Remove Address</a> update action.</p>
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> that was removed during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerRemoveAddressAction" rel="nofollow">Remove Address</a> update action.</p>
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
     * @return instance of CustomerAddressRemovedMessage
     */
    public static CustomerAddressRemovedMessage of() {
        return new CustomerAddressRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy CustomerAddressRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerAddressRemovedMessage of(final CustomerAddressRemovedMessage template) {
        CustomerAddressRemovedMessageImpl instance = new CustomerAddressRemovedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setAddress(template.getAddress());
        instance.setAddressRoles(template.getAddressRoles());
        return instance;
    }

    public CustomerAddressRemovedMessage copyDeep();

    /**
     * factory method to create a deep copy of CustomerAddressRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerAddressRemovedMessage deepCopy(@Nullable final CustomerAddressRemovedMessage template) {
        if (template == null) {
            return null;
        }
        CustomerAddressRemovedMessageImpl instance = new CustomerAddressRemovedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setAddress(com.commercetools.api.models.common.Address.deepCopy(template.getAddress()));
        instance.setAddressRoles(Optional.ofNullable(template.getAddressRoles()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for CustomerAddressRemovedMessage
     * @return builder
     */
    public static CustomerAddressRemovedMessageBuilder builder() {
        return CustomerAddressRemovedMessageBuilder.of();
    }

    /**
     * create builder for CustomerAddressRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddressRemovedMessageBuilder builder(final CustomerAddressRemovedMessage template) {
        return CustomerAddressRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerAddressRemovedMessage(Function<CustomerAddressRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerAddressRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerAddressRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerAddressRemovedMessage>";
            }
        };
    }
}
