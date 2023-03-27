
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.quote.Quote;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Create Quote request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteCreatedMessagePayload quoteCreatedMessagePayload = QuoteCreatedMessagePayload.builder()
 *             .quote(quoteBuilder -> quoteBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteCreatedMessagePayloadImpl.class)
public interface QuoteCreatedMessagePayload extends MessagePayload {

    /**
     * discriminator value for QuoteCreatedMessagePayload
     */
    String QUOTE_CREATED = "QuoteCreated";

    /**
     *  <p>Quote that was created.</p>
     * @return quote
     */
    @NotNull
    @Valid
    @JsonProperty("quote")
    public Quote getQuote();

    /**
     *  <p>Quote that was created.</p>
     * @param quote value to be set
     */

    public void setQuote(final Quote quote);

    /**
     * factory method
     * @return instance of QuoteCreatedMessagePayload
     */
    public static QuoteCreatedMessagePayload of() {
        return new QuoteCreatedMessagePayloadImpl();
    }

    /**
     * factory method to copy an instance of QuoteCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteCreatedMessagePayload of(final QuoteCreatedMessagePayload template) {
        QuoteCreatedMessagePayloadImpl instance = new QuoteCreatedMessagePayloadImpl();
        instance.setQuote(template.getQuote());
        return instance;
    }

    /**
     * builder factory method for QuoteCreatedMessagePayload
     * @return builder
     */
    public static QuoteCreatedMessagePayloadBuilder builder() {
        return QuoteCreatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for QuoteCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteCreatedMessagePayloadBuilder builder(final QuoteCreatedMessagePayload template) {
        return QuoteCreatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteCreatedMessagePayload(Function<QuoteCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteCreatedMessagePayload>";
            }
        };
    }
}
