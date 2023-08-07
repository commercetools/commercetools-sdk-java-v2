
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Delete QuoteRequest request.</p>
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

    /**
     * discriminator value for QuoteRequestDeletedMessagePayload
     */
    String QUOTE_REQUEST_DELETED = "QuoteRequestDeleted";

    /**
     * factory method
     * @return instance of QuoteRequestDeletedMessagePayload
     */
    public static QuoteRequestDeletedMessagePayload of() {
        return new QuoteRequestDeletedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy QuoteRequestDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteRequestDeletedMessagePayload of(final QuoteRequestDeletedMessagePayload template) {
        QuoteRequestDeletedMessagePayloadImpl instance = new QuoteRequestDeletedMessagePayloadImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of QuoteRequestDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteRequestDeletedMessagePayload deepCopy(
            @Nullable final QuoteRequestDeletedMessagePayload template) {
        if (template == null) {
            return null;
        }
        QuoteRequestDeletedMessagePayloadImpl instance = new QuoteRequestDeletedMessagePayloadImpl();
        return instance;
    }

    /**
     * builder factory method for QuoteRequestDeletedMessagePayload
     * @return builder
     */
    public static QuoteRequestDeletedMessagePayloadBuilder builder() {
        return QuoteRequestDeletedMessagePayloadBuilder.of();
    }

    /**
     * create builder for QuoteRequestDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestDeletedMessagePayloadBuilder builder(final QuoteRequestDeletedMessagePayload template) {
        return QuoteRequestDeletedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteRequestDeletedMessagePayload(Function<QuoteRequestDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestDeletedMessagePayload>";
            }
        };
    }
}
