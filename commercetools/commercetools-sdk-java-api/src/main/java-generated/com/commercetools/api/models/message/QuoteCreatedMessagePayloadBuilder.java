
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteCreatedMessagePayloadBuilder
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
public class QuoteCreatedMessagePayloadBuilder implements Builder<QuoteCreatedMessagePayload> {

    private com.commercetools.api.models.quote.Quote quote;

    /**
     *  <p>Quote that was created.</p>
     * @return Builder
     */

    public QuoteCreatedMessagePayloadBuilder quote(
            Function<com.commercetools.api.models.quote.QuoteBuilder, com.commercetools.api.models.quote.QuoteBuilder> builder) {
        this.quote = builder.apply(com.commercetools.api.models.quote.QuoteBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Quote that was created.</p>
     * @param quote
     * @return Builder
     */

    public QuoteCreatedMessagePayloadBuilder quote(final com.commercetools.api.models.quote.Quote quote) {
        this.quote = quote;
        return this;
    }

    public com.commercetools.api.models.quote.Quote getQuote() {
        return this.quote;
    }

    public QuoteCreatedMessagePayload build() {
        Objects.requireNonNull(quote, QuoteCreatedMessagePayload.class + ": quote is missing");
        return new QuoteCreatedMessagePayloadImpl(quote);
    }

    /**
     * builds QuoteCreatedMessagePayload without checking for non null required values
     */
    public QuoteCreatedMessagePayload buildUnchecked() {
        return new QuoteCreatedMessagePayloadImpl(quote);
    }

    public static QuoteCreatedMessagePayloadBuilder of() {
        return new QuoteCreatedMessagePayloadBuilder();
    }

    public static QuoteCreatedMessagePayloadBuilder of(final QuoteCreatedMessagePayload template) {
        QuoteCreatedMessagePayloadBuilder builder = new QuoteCreatedMessagePayloadBuilder();
        builder.quote = template.getQuote();
        return builder;
    }

}
