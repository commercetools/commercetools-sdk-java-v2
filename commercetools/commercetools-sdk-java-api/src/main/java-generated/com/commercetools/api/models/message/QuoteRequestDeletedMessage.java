
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestDeletedMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestDeletedMessage quoteRequestDeletedMessage = QuoteRequestDeletedMessage.builder()
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
@JsonDeserialize(as = QuoteRequestDeletedMessageImpl.class)
public interface QuoteRequestDeletedMessage extends Message {

    String QUOTE_REQUEST_DELETED = "QuoteRequestDeleted";

    public static QuoteRequestDeletedMessage of() {
        return new QuoteRequestDeletedMessageImpl();
    }

    public static QuoteRequestDeletedMessage of(final QuoteRequestDeletedMessage template) {
        QuoteRequestDeletedMessageImpl instance = new QuoteRequestDeletedMessageImpl();
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

    public static QuoteRequestDeletedMessageBuilder builder() {
        return QuoteRequestDeletedMessageBuilder.of();
    }

    public static QuoteRequestDeletedMessageBuilder builder(final QuoteRequestDeletedMessage template) {
        return QuoteRequestDeletedMessageBuilder.of(template);
    }

    default <T> T withQuoteRequestDeletedMessage(Function<QuoteRequestDeletedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestDeletedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestDeletedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestDeletedMessage>";
            }
        };
    }
}
