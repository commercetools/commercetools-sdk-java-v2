
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.BusinessUnitStatus;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Change Status update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitStatusChangedMessage businessUnitStatusChangedMessage = BusinessUnitStatusChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .active(BusinessUnitStatus.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitStatusChangedMessageImpl.class)
public interface BusinessUnitStatusChangedMessage extends Message {

    /**
     * discriminator value for BusinessUnitStatusChangedMessage
     */
    String BUSINESS_UNIT_STATUS_CHANGED = "BusinessUnitStatusChanged";

    /**
     *  <p>Updated status of the Business Unit.</p>
     * @return active
     */
    @NotNull
    @JsonProperty("active")
    public BusinessUnitStatus getActive();

    /**
     *  <p>Updated status of the Business Unit.</p>
     * @param active value to be set
     */

    public void setActive(final BusinessUnitStatus active);

    /**
     * factory method
     * @return instance of BusinessUnitStatusChangedMessage
     */
    public static BusinessUnitStatusChangedMessage of() {
        return new BusinessUnitStatusChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitStatusChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitStatusChangedMessage of(final BusinessUnitStatusChangedMessage template) {
        BusinessUnitStatusChangedMessageImpl instance = new BusinessUnitStatusChangedMessageImpl();
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
        instance.setActive(template.getActive());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitStatusChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitStatusChangedMessage deepCopy(@Nullable final BusinessUnitStatusChangedMessage template) {
        if (template == null) {
            return null;
        }
        BusinessUnitStatusChangedMessageImpl instance = new BusinessUnitStatusChangedMessageImpl();
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
        instance.setActive(template.getActive());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitStatusChangedMessage
     * @return builder
     */
    public static BusinessUnitStatusChangedMessageBuilder builder() {
        return BusinessUnitStatusChangedMessageBuilder.of();
    }

    /**
     * create builder for BusinessUnitStatusChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitStatusChangedMessageBuilder builder(final BusinessUnitStatusChangedMessage template) {
        return BusinessUnitStatusChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitStatusChangedMessage(Function<BusinessUnitStatusChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStatusChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStatusChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitStatusChangedMessage>";
            }
        };
    }
}
