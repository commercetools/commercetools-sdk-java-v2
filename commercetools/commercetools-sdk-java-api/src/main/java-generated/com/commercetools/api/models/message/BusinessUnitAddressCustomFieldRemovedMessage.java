
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after removing a Custom Field from an address of a Business Unit using the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetAddressCustomFieldAction" rel="nofollow">Set Address CustomField</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddressCustomFieldRemovedMessage businessUnitAddressCustomFieldRemovedMessage = BusinessUnitAddressCustomFieldRemovedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitAddressCustomFieldRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAddressCustomFieldRemovedMessageImpl.class)
public interface BusinessUnitAddressCustomFieldRemovedMessage extends Message {

    /**
     * discriminator value for BusinessUnitAddressCustomFieldRemovedMessage
     */
    String BUSINESS_UNIT_ADDRESS_CUSTOM_FIELD_REMOVED = "BusinessUnitAddressCustomFieldRemoved";

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> from which the Custom Field was removed.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> from which the Custom Field was removed.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     * factory method
     * @return instance of BusinessUnitAddressCustomFieldRemovedMessage
     */
    public static BusinessUnitAddressCustomFieldRemovedMessage of() {
        return new BusinessUnitAddressCustomFieldRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitAddressCustomFieldRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitAddressCustomFieldRemovedMessage of(
            final BusinessUnitAddressCustomFieldRemovedMessage template) {
        BusinessUnitAddressCustomFieldRemovedMessageImpl instance = new BusinessUnitAddressCustomFieldRemovedMessageImpl();
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
        instance.setName(template.getName());
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    public BusinessUnitAddressCustomFieldRemovedMessage copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitAddressCustomFieldRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitAddressCustomFieldRemovedMessage deepCopy(
            @Nullable final BusinessUnitAddressCustomFieldRemovedMessage template) {
        if (template == null) {
            return null;
        }
        BusinessUnitAddressCustomFieldRemovedMessageImpl instance = new BusinessUnitAddressCustomFieldRemovedMessageImpl();
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
        instance.setName(template.getName());
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAddressCustomFieldRemovedMessage
     * @return builder
     */
    public static BusinessUnitAddressCustomFieldRemovedMessageBuilder builder() {
        return BusinessUnitAddressCustomFieldRemovedMessageBuilder.of();
    }

    /**
     * create builder for BusinessUnitAddressCustomFieldRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddressCustomFieldRemovedMessageBuilder builder(
            final BusinessUnitAddressCustomFieldRemovedMessage template) {
        return BusinessUnitAddressCustomFieldRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAddressCustomFieldRemovedMessage(
            Function<BusinessUnitAddressCustomFieldRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressCustomFieldRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressCustomFieldRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAddressCustomFieldRemovedMessage>";
            }
        };
    }
}
