
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Delete Business Unit request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitDeletedMessage businessUnitDeletedMessage = BusinessUnitDeletedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitDeletedMessageImpl.class)
public interface BusinessUnitDeletedMessage extends Message {

    String BUSINESS_UNIT_DELETED = "BusinessUnitDeleted";

    public static BusinessUnitDeletedMessage of() {
        return new BusinessUnitDeletedMessageImpl();
    }

    public static BusinessUnitDeletedMessage of(final BusinessUnitDeletedMessage template) {
        BusinessUnitDeletedMessageImpl instance = new BusinessUnitDeletedMessageImpl();
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
        return instance;
    }

    public static BusinessUnitDeletedMessageBuilder builder() {
        return BusinessUnitDeletedMessageBuilder.of();
    }

    public static BusinessUnitDeletedMessageBuilder builder(final BusinessUnitDeletedMessage template) {
        return BusinessUnitDeletedMessageBuilder.of(template);
    }

    default <T> T withBusinessUnitDeletedMessage(Function<BusinessUnitDeletedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitDeletedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitDeletedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitDeletedMessage>";
            }
        };
    }
}
