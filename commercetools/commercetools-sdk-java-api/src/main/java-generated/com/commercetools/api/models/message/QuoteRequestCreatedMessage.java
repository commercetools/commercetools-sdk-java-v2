
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestCreatedMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestCreatedMessage quoteRequestCreatedMessage = QuoteRequestCreatedMessage.builder()
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
@JsonDeserialize(as = QuoteRequestCreatedMessageImpl.class)
public interface QuoteRequestCreatedMessage extends Message {

    String QUOTE_REQUEST_CREATED = "QuoteRequestCreated";

    public static QuoteRequestCreatedMessage of() {
        return new QuoteRequestCreatedMessageImpl();
    }

    public static QuoteRequestCreatedMessage of(final QuoteRequestCreatedMessage template) {
        QuoteRequestCreatedMessageImpl instance = new QuoteRequestCreatedMessageImpl();
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

    public static QuoteRequestCreatedMessageBuilder builder() {
        return QuoteRequestCreatedMessageBuilder.of();
    }

    public static QuoteRequestCreatedMessageBuilder builder(final QuoteRequestCreatedMessage template) {
        return QuoteRequestCreatedMessageBuilder.of(template);
    }

    default <T> T withQuoteRequestCreatedMessage(Function<QuoteRequestCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestCreatedMessage>";
            }
        };
    }
}
