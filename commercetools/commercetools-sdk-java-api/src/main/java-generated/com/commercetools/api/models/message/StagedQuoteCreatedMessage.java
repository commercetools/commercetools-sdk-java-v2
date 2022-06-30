
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteCreatedMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteCreatedMessage stagedQuoteCreatedMessage = StagedQuoteCreatedMessage.builder()
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
@JsonDeserialize(as = StagedQuoteCreatedMessageImpl.class)
public interface StagedQuoteCreatedMessage extends Message {

    String STAGED_QUOTE_CREATED = "StagedQuoteCreated";

    public static StagedQuoteCreatedMessage of() {
        return new StagedQuoteCreatedMessageImpl();
    }

    public static StagedQuoteCreatedMessage of(final StagedQuoteCreatedMessage template) {
        StagedQuoteCreatedMessageImpl instance = new StagedQuoteCreatedMessageImpl();
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

    public static StagedQuoteCreatedMessageBuilder builder() {
        return StagedQuoteCreatedMessageBuilder.of();
    }

    public static StagedQuoteCreatedMessageBuilder builder(final StagedQuoteCreatedMessage template) {
        return StagedQuoteCreatedMessageBuilder.of(template);
    }

    default <T> T withStagedQuoteCreatedMessage(Function<StagedQuoteCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteCreatedMessage>";
            }
        };
    }
}
