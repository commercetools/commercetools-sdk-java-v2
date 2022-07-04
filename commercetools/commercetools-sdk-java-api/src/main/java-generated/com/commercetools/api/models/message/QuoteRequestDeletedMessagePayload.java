
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestDeletedMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestDeletedMessagePayload quoteRequestDeletedMessagePayload = QuoteRequestDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteRequestDeletedMessagePayloadImpl.class)
public interface QuoteRequestDeletedMessagePayload extends MessagePayload {

    String QUOTE_REQUEST_DELETED = "QuoteRequestDeleted";

    public static QuoteRequestDeletedMessagePayload of() {
        return new QuoteRequestDeletedMessagePayloadImpl();
    }

    public static QuoteRequestDeletedMessagePayload of(final QuoteRequestDeletedMessagePayload template) {
        QuoteRequestDeletedMessagePayloadImpl instance = new QuoteRequestDeletedMessagePayloadImpl();
        return instance;
    }

    public static QuoteRequestDeletedMessagePayloadBuilder builder() {
        return QuoteRequestDeletedMessagePayloadBuilder.of();
    }

    public static QuoteRequestDeletedMessagePayloadBuilder builder(final QuoteRequestDeletedMessagePayload template) {
        return QuoteRequestDeletedMessagePayloadBuilder.of(template);
    }

    default <T> T withQuoteRequestDeletedMessagePayload(Function<QuoteRequestDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestDeletedMessagePayload>";
            }
        };
    }
}
