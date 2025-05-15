
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
 *  <p>Generated after adding a Custom Type to a Business Unit using the Set Custom Type update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitCustomTypeSetMessage businessUnitCustomTypeSetMessage = BusinessUnitCustomTypeSetMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitCustomTypeSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitCustomTypeSetMessageImpl.class)
public interface BusinessUnitCustomTypeSetMessage extends Message {

    /**
     * discriminator value for BusinessUnitCustomTypeSetMessage
     */
    String BUSINESS_UNIT_CUSTOM_TYPE_SET = "BusinessUnitCustomTypeSet";

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
     * @return instance of BusinessUnitCustomTypeSetMessage
     */
    public static BusinessUnitCustomTypeSetMessage of() {
        return new BusinessUnitCustomTypeSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitCustomTypeSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitCustomTypeSetMessage of(final BusinessUnitCustomTypeSetMessage template) {
        BusinessUnitCustomTypeSetMessageImpl instance = new BusinessUnitCustomTypeSetMessageImpl();
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

    public BusinessUnitCustomTypeSetMessage copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitCustomTypeSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitCustomTypeSetMessage deepCopy(@Nullable final BusinessUnitCustomTypeSetMessage template) {
        if (template == null) {
            return null;
        }
        BusinessUnitCustomTypeSetMessageImpl instance = new BusinessUnitCustomTypeSetMessageImpl();
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
     * builder factory method for BusinessUnitCustomTypeSetMessage
     * @return builder
     */
    public static BusinessUnitCustomTypeSetMessageBuilder builder() {
        return BusinessUnitCustomTypeSetMessageBuilder.of();
    }

    /**
     * create builder for BusinessUnitCustomTypeSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitCustomTypeSetMessageBuilder builder(final BusinessUnitCustomTypeSetMessage template) {
        return BusinessUnitCustomTypeSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitCustomTypeSetMessage(Function<BusinessUnitCustomTypeSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCustomTypeSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCustomTypeSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitCustomTypeSetMessage>";
            }
        };
    }
}
