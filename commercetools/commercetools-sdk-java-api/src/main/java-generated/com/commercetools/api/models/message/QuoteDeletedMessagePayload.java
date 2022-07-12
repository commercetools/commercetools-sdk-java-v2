
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteDeletedMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteDeletedMessagePayload quoteDeletedMessagePayload = QuoteDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteDeletedMessagePayloadImpl.class)
public interface QuoteDeletedMessagePayload extends MessagePayload {

    String QUOTE_DELETED = "QuoteDeleted";

    public static QuoteDeletedMessagePayload of() {
        return new QuoteDeletedMessagePayloadImpl();
    }

    public static QuoteDeletedMessagePayload of(final QuoteDeletedMessagePayload template) {
        QuoteDeletedMessagePayloadImpl instance = new QuoteDeletedMessagePayloadImpl();
        return instance;
    }

    public static QuoteDeletedMessagePayloadBuilder builder() {
        return QuoteDeletedMessagePayloadBuilder.of();
    }

    public static QuoteDeletedMessagePayloadBuilder builder(final QuoteDeletedMessagePayload template) {
        return QuoteDeletedMessagePayloadBuilder.of(template);
    }

    default <T> T withQuoteDeletedMessagePayload(Function<QuoteDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteDeletedMessagePayload>";
            }
        };
    }
}
