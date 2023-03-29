
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Delete Quote request.</p>
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

    /**
     * discriminator value for QuoteDeletedMessagePayload
     */
    String QUOTE_DELETED = "QuoteDeleted";

    /**
     * factory method
     * @return instance of QuoteDeletedMessagePayload
     */
    public static QuoteDeletedMessagePayload of() {
        return new QuoteDeletedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy QuoteDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteDeletedMessagePayload of(final QuoteDeletedMessagePayload template) {
        QuoteDeletedMessagePayloadImpl instance = new QuoteDeletedMessagePayloadImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of QuoteDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteDeletedMessagePayload deepCopy(@Nullable final QuoteDeletedMessagePayload template) {
        if (template == null) {
            return null;
        }
        QuoteDeletedMessagePayloadImpl instance = new QuoteDeletedMessagePayloadImpl();
        return instance;
    }

    /**
     * builder factory method for QuoteDeletedMessagePayload
     * @return builder
     */
    public static QuoteDeletedMessagePayloadBuilder builder() {
        return QuoteDeletedMessagePayloadBuilder.of();
    }

    /**
     * create builder for QuoteDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteDeletedMessagePayloadBuilder builder(final QuoteDeletedMessagePayload template) {
        return QuoteDeletedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteDeletedMessagePayload(Function<QuoteDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteDeletedMessagePayload>";
            }
        };
    }
}
