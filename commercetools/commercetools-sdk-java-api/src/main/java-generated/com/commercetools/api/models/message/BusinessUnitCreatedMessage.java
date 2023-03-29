
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.business_unit.BusinessUnit;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Create Business Unit request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitCreatedMessage businessUnitCreatedMessage = BusinessUnitCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .businessUnit(businessUnitBuilder -> businessUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitCreatedMessageImpl.class)
public interface BusinessUnitCreatedMessage extends Message {

    /**
     * discriminator value for BusinessUnitCreatedMessage
     */
    String BUSINESS_UNIT_CREATED = "BusinessUnitCreated";

    /**
     *  <p>The Business Unit that was created.</p>
     * @return businessUnit
     */
    @NotNull
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnit getBusinessUnit();

    /**
     *  <p>The Business Unit that was created.</p>
     * @param businessUnit value to be set
     */

    public void setBusinessUnit(final BusinessUnit businessUnit);

    /**
     * factory method
     * @return instance of BusinessUnitCreatedMessage
     */
    public static BusinessUnitCreatedMessage of() {
        return new BusinessUnitCreatedMessageImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitCreatedMessage of(final BusinessUnitCreatedMessage template) {
        BusinessUnitCreatedMessageImpl instance = new BusinessUnitCreatedMessageImpl();
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
        instance.setBusinessUnit(template.getBusinessUnit());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitCreatedMessage deepCopy(@Nullable final BusinessUnitCreatedMessage template) {
        if (template == null) {
            return null;
        }
        BusinessUnitCreatedMessageImpl instance = new BusinessUnitCreatedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(Optional.ofNullable(template.getLastModifiedBy())
                .map(com.commercetools.api.models.common.LastModifiedBy::deepCopy)
                .orElse(null));
        instance.setCreatedBy(Optional.ofNullable(template.getCreatedBy())
                .map(com.commercetools.api.models.common.CreatedBy::deepCopy)
                .orElse(null));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(Optional.ofNullable(template.getResource())
                .map(com.commercetools.api.models.common.Reference::deepCopy)
                .orElse(null));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(Optional.ofNullable(template.getResourceUserProvidedIdentifiers())
                .map(com.commercetools.api.models.message.UserProvidedIdentifiers::deepCopy)
                .orElse(null));
        instance.setBusinessUnit(Optional.ofNullable(template.getBusinessUnit())
                .map(com.commercetools.api.models.business_unit.BusinessUnit::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitCreatedMessage
     * @return builder
     */
    public static BusinessUnitCreatedMessageBuilder builder() {
        return BusinessUnitCreatedMessageBuilder.of();
    }

    /**
     * create builder for BusinessUnitCreatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitCreatedMessageBuilder builder(final BusinessUnitCreatedMessage template) {
        return BusinessUnitCreatedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitCreatedMessage(Function<BusinessUnitCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitCreatedMessage>";
            }
        };
    }
}
