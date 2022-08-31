
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestCreatedMessagePayload quoteRequestCreatedMessagePayload = QuoteRequestCreatedMessagePayload.builder()
 *             .quoteRequest(quoteRequestBuilder -> quoteRequestBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRequestCreatedMessagePayloadBuilder implements Builder<QuoteRequestCreatedMessagePayload> {

    private com.commercetools.api.models.quote_request.QuoteRequest quoteRequest;

    /**
     *  <p>Quote Request that was created.</p>
     */

    public QuoteRequestCreatedMessagePayloadBuilder quoteRequest(
            Function<com.commercetools.api.models.quote_request.QuoteRequestBuilder, com.commercetools.api.models.quote_request.QuoteRequestBuilder> builder) {
        this.quoteRequest = builder.apply(com.commercetools.api.models.quote_request.QuoteRequestBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Quote Request that was created.</p>
     */

    public QuoteRequestCreatedMessagePayloadBuilder quoteRequest(
            final com.commercetools.api.models.quote_request.QuoteRequest quoteRequest) {
        this.quoteRequest = quoteRequest;
        return this;
    }

    public com.commercetools.api.models.quote_request.QuoteRequest getQuoteRequest() {
        return this.quoteRequest;
    }

    public QuoteRequestCreatedMessagePayload build() {
        Objects.requireNonNull(quoteRequest, QuoteRequestCreatedMessagePayload.class + ": quoteRequest is missing");
        return new QuoteRequestCreatedMessagePayloadImpl(quoteRequest);
    }

    /**
     * builds QuoteRequestCreatedMessagePayload without checking for non null required values
     */
    public QuoteRequestCreatedMessagePayload buildUnchecked() {
        return new QuoteRequestCreatedMessagePayloadImpl(quoteRequest);
    }

    public static QuoteRequestCreatedMessagePayloadBuilder of() {
        return new QuoteRequestCreatedMessagePayloadBuilder();
    }

    public static QuoteRequestCreatedMessagePayloadBuilder of(final QuoteRequestCreatedMessagePayload template) {
        QuoteRequestCreatedMessagePayloadBuilder builder = new QuoteRequestCreatedMessagePayloadBuilder();
        builder.quoteRequest = template.getQuoteRequest();
        return builder;
    }

}
