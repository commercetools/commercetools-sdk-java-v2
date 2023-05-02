
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.business_unit.BusinessUnitAssociateMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Change Associate Mode update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAssociateModeChangedMessage businessUnitAssociateModeChangedMessage = BusinessUnitAssociateModeChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .associateMode(BusinessUnitAssociateMode.EXPLICIT)
 *             .oldAssociateMode(BusinessUnitAssociateMode.EXPLICIT)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAssociateModeChangedMessageImpl.class)
public interface BusinessUnitAssociateModeChangedMessage extends Message {

    /**
     * discriminator value for BusinessUnitAssociateModeChangedMessage
     */
    String BUSINESS_UNIT_ASSOCIATE_MODE_CHANGED = "BusinessUnitAssociateModeChanged";

    /**
     *  <p>BusinessUnitAssociateMode of the Business Unit after the Change Associate Mode update action.</p>
     * @return associateMode
     */
    @NotNull
    @JsonProperty("associateMode")
    public BusinessUnitAssociateMode getAssociateMode();

    /**
     *  <p>BusinessUnitAssociateMode of the Business Unit before the Change Associate Mode update action.</p>
     * @return oldAssociateMode
     */
    @NotNull
    @JsonProperty("oldAssociateMode")
    public BusinessUnitAssociateMode getOldAssociateMode();

    /**
     *  <p>BusinessUnitAssociateMode of the Business Unit after the Change Associate Mode update action.</p>
     * @param associateMode value to be set
     */

    public void setAssociateMode(final BusinessUnitAssociateMode associateMode);

    /**
     *  <p>BusinessUnitAssociateMode of the Business Unit before the Change Associate Mode update action.</p>
     * @param oldAssociateMode value to be set
     */

    public void setOldAssociateMode(final BusinessUnitAssociateMode oldAssociateMode);

    /**
     * factory method
     * @return instance of BusinessUnitAssociateModeChangedMessage
     */
    public static BusinessUnitAssociateModeChangedMessage of() {
        return new BusinessUnitAssociateModeChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitAssociateModeChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitAssociateModeChangedMessage of(final BusinessUnitAssociateModeChangedMessage template) {
        BusinessUnitAssociateModeChangedMessageImpl instance = new BusinessUnitAssociateModeChangedMessageImpl();
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
        instance.setAssociateMode(template.getAssociateMode());
        instance.setOldAssociateMode(template.getOldAssociateMode());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitAssociateModeChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitAssociateModeChangedMessage deepCopy(
            @Nullable final BusinessUnitAssociateModeChangedMessage template) {
        if (template == null) {
            return null;
        }
        BusinessUnitAssociateModeChangedMessageImpl instance = new BusinessUnitAssociateModeChangedMessageImpl();
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
        instance.setAssociateMode(template.getAssociateMode());
        instance.setOldAssociateMode(template.getOldAssociateMode());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAssociateModeChangedMessage
     * @return builder
     */
    public static BusinessUnitAssociateModeChangedMessageBuilder builder() {
        return BusinessUnitAssociateModeChangedMessageBuilder.of();
    }

    /**
     * create builder for BusinessUnitAssociateModeChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAssociateModeChangedMessageBuilder builder(
            final BusinessUnitAssociateModeChangedMessage template) {
        return BusinessUnitAssociateModeChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAssociateModeChangedMessage(
            Function<BusinessUnitAssociateModeChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociateModeChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociateModeChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAssociateModeChangedMessage>";
            }
        };
    }
}
