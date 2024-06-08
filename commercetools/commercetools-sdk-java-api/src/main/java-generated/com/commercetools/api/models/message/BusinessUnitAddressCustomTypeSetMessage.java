
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after adding a Custom Type to an address of a Business Unit using the Set Custom Type in Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddressCustomTypeSetMessage businessUnitAddressCustomTypeSetMessage = BusinessUnitAddressCustomTypeSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .customFields(customFieldsBuilder -> customFieldsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAddressCustomTypeSetMessageImpl.class)
public interface BusinessUnitAddressCustomTypeSetMessage extends Message {

    /**
     * discriminator value for BusinessUnitAddressCustomTypeSetMessage
     */
    String BUSINESS_UNIT_ADDRESS_CUSTOM_TYPE_SET = "BusinessUnitAddressCustomTypeSet";

    /**
     *  <p>The Custom Fields that were set.</p>
     * @return customFields
     */
    @NotNull
    @Valid
    @JsonProperty("customFields")
    public CustomFields getCustomFields();

    /**
     *  <p><code>id</code> of the previous Custom Type. Absent if there was no previous Custom Type present.</p>
     * @return oldTypeId
     */

    @JsonProperty("oldTypeId")
    public String getOldTypeId();

    /**
     *  <p>The Custom Fields that were set.</p>
     * @param customFields value to be set
     */

    public void setCustomFields(final CustomFields customFields);

    /**
     *  <p><code>id</code> of the previous Custom Type. Absent if there was no previous Custom Type present.</p>
     * @param oldTypeId value to be set
     */

    public void setOldTypeId(final String oldTypeId);

    /**
     * factory method
     * @return instance of BusinessUnitAddressCustomTypeSetMessage
     */
    public static BusinessUnitAddressCustomTypeSetMessage of() {
        return new BusinessUnitAddressCustomTypeSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitAddressCustomTypeSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitAddressCustomTypeSetMessage of(final BusinessUnitAddressCustomTypeSetMessage template) {
        BusinessUnitAddressCustomTypeSetMessageImpl instance = new BusinessUnitAddressCustomTypeSetMessageImpl();
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
        instance.setCustomFields(template.getCustomFields());
        instance.setOldTypeId(template.getOldTypeId());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitAddressCustomTypeSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitAddressCustomTypeSetMessage deepCopy(
            @Nullable final BusinessUnitAddressCustomTypeSetMessage template) {
        if (template == null) {
            return null;
        }
        BusinessUnitAddressCustomTypeSetMessageImpl instance = new BusinessUnitAddressCustomTypeSetMessageImpl();
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
        instance.setCustomFields(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustomFields()));
        instance.setOldTypeId(template.getOldTypeId());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAddressCustomTypeSetMessage
     * @return builder
     */
    public static BusinessUnitAddressCustomTypeSetMessageBuilder builder() {
        return BusinessUnitAddressCustomTypeSetMessageBuilder.of();
    }

    /**
     * create builder for BusinessUnitAddressCustomTypeSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddressCustomTypeSetMessageBuilder builder(
            final BusinessUnitAddressCustomTypeSetMessage template) {
        return BusinessUnitAddressCustomTypeSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAddressCustomTypeSetMessage(
            Function<BusinessUnitAddressCustomTypeSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressCustomTypeSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressCustomTypeSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAddressCustomTypeSetMessage>";
            }
        };
    }
}
