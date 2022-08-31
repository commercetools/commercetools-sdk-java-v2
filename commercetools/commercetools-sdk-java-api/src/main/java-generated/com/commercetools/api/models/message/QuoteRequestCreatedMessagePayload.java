
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.quote_request.QuoteRequest;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Create Quote Request request.</p>
 *
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
@JsonDeserialize(as = QuoteRequestCreatedMessagePayloadImpl.class)
public interface QuoteRequestCreatedMessagePayload extends MessagePayload {

    String QUOTE_REQUEST_CREATED = "QuoteRequestCreated";

    /**
     *  <p>Quote Request that was created.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("quoteRequest")
    public QuoteRequest getQuoteRequest();

    public void setQuoteRequest(final QuoteRequest quoteRequest);

    public static QuoteRequestCreatedMessagePayload of() {
        return new QuoteRequestCreatedMessagePayloadImpl();
    }

    public static QuoteRequestCreatedMessagePayload of(final QuoteRequestCreatedMessagePayload template) {
        QuoteRequestCreatedMessagePayloadImpl instance = new QuoteRequestCreatedMessagePayloadImpl();
        instance.setQuoteRequest(template.getQuoteRequest());
        return instance;
    }

    public static QuoteRequestCreatedMessagePayloadBuilder builder() {
        return QuoteRequestCreatedMessagePayloadBuilder.of();
    }

    public static QuoteRequestCreatedMessagePayloadBuilder builder(final QuoteRequestCreatedMessagePayload template) {
        return QuoteRequestCreatedMessagePayloadBuilder.of(template);
    }

    default <T> T withQuoteRequestCreatedMessagePayload(Function<QuoteRequestCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestCreatedMessagePayload>";
            }
        };
    }
}
