
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

    String BUSINESS_UNIT_NAME_CHANGED = "BusinessUnitNameChanged";

    /**
     *  <p>Updated name of the Business Unit.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    public void setName(final String name);

    public static BusinessUnitNameChangedMessage of() {
        return new BusinessUnitNameChangedMessageImpl();
    }

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

    public static BusinessUnitNameChangedMessageBuilder builder() {
        return BusinessUnitNameChangedMessageBuilder.of();
    }

    public static BusinessUnitNameChangedMessageBuilder builder(final BusinessUnitNameChangedMessage template) {
        return BusinessUnitNameChangedMessageBuilder.of(template);
    }

    default <T> T withBusinessUnitNameChangedMessage(Function<BusinessUnitNameChangedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitNameChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitNameChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitNameChangedMessage>";
            }
        };
    }
}
