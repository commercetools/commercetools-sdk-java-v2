
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Change Name update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitNameChangedMessage businessUnitNameChangedMessage = BusinessUnitNameChangedMessage.builder()
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitNameChangedMessageImpl.class)
public interface BusinessUnitNameChangedMessage extends Message {

    /**
     * discriminator value for BusinessUnitNameChangedMessage
     */
    String BUSINESS_UNIT_NAME_CHANGED = "BusinessUnitNameChanged";

    /**
     *  <p>Updated name of the Business Unit.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Updated name of the Business Unit.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of BusinessUnitNameChangedMessage
     */
    public static BusinessUnitNameChangedMessage of() {
        return new BusinessUnitNameChangedMessageImpl();
    }

    /**
     * factory method to copy an instance of BusinessUnitNameChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitNameChangedMessage of(final BusinessUnitNameChangedMessage template) {
        BusinessUnitNameChangedMessageImpl instance = new BusinessUnitNameChangedMessageImpl();
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
        return instance;
    }

    /**
     * builder factory method for BusinessUnitNameChangedMessage
     * @return builder
     */
    public static BusinessUnitNameChangedMessageBuilder builder() {
        return BusinessUnitNameChangedMessageBuilder.of();
    }

    /**
     * create builder for BusinessUnitNameChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitNameChangedMessageBuilder builder(final BusinessUnitNameChangedMessage template) {
        return BusinessUnitNameChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitNameChangedMessage(Function<BusinessUnitNameChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitNameChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitNameChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitNameChangedMessage>";
            }
        };
    }
}
