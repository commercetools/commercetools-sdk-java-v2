
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

    String QUOTE_CREATED = "QuoteCreated";

    /**
     *  <p>Quote that was created.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("quote")
    public Quote getQuote();

    public void setQuote(final Quote quote);

    public static QuoteCreatedMessagePayload of() {
        return new QuoteCreatedMessagePayloadImpl();
    }

    public static QuoteCreatedMessagePayload of(final QuoteCreatedMessagePayload template) {
        QuoteCreatedMessagePayloadImpl instance = new QuoteCreatedMessagePayloadImpl();
        instance.setQuote(template.getQuote());
        return instance;
    }

    public static QuoteCreatedMessagePayloadBuilder builder() {
        return QuoteCreatedMessagePayloadBuilder.of();
    }

    public static QuoteCreatedMessagePayloadBuilder builder(final QuoteCreatedMessagePayload template) {
        return QuoteCreatedMessagePayloadBuilder.of(template);
    }

    default <T> T withQuoteCreatedMessagePayload(Function<QuoteCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteCreatedMessagePayload>";
            }
        };
    }
}
