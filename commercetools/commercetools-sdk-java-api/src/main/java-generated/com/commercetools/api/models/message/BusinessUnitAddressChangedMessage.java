
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
 *  <p>Generated after a successful Change Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddressChangedMessage businessUnitAddressChangedMessage = BusinessUnitAddressChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAddressChangedMessageImpl.class)
public interface BusinessUnitAddressChangedMessage extends Message {

    /**
     * discriminator value for BusinessUnitAddressChangedMessage
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
     *  <p>Updated address of the Business Unit.</p>
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     * factory method
     * @return instance of BusinessUnitAddressChangedMessage
     */
    public static BusinessUnitAddressChangedMessage of() {
        return new BusinessUnitAddressChangedMessageImpl();
    }

    /**
     * factory method to copy an instance of BusinessUnitAddressChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitAddressChangedMessage of(final BusinessUnitAddressChangedMessage template) {
        BusinessUnitAddressChangedMessageImpl instance = new BusinessUnitAddressChangedMessageImpl();
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
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAddressChangedMessage
     * @return builder
     */
    public static BusinessUnitAddressChangedMessageBuilder builder() {
        return BusinessUnitAddressChangedMessageBuilder.of();
    }

    /**
     * create builder for BusinessUnitAddressChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddressChangedMessageBuilder builder(final BusinessUnitAddressChangedMessage template) {
        return BusinessUnitAddressChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAddressChangedMessage(Function<BusinessUnitAddressChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAddressChangedMessage>";
            }
        };
    }
}
