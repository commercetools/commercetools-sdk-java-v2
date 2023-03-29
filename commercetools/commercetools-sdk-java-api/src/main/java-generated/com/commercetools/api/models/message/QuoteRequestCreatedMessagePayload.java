
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
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

    /**
     * discriminator value for QuoteRequestCreatedMessagePayload
     */
    String QUOTE_REQUEST_CREATED = "QuoteRequestCreated";

    /**
     *  <p>Quote Request that was created.</p>
     * @return quoteRequest
     */
    @NotNull
    @Valid
    @JsonProperty("quoteRequest")
    public QuoteRequest getQuoteRequest();

    /**
     *  <p>Quote Request that was created.</p>
     * @param quoteRequest value to be set
     */

    public void setQuoteRequest(final QuoteRequest quoteRequest);

    /**
     * factory method
     * @return instance of QuoteRequestCreatedMessagePayload
     */
    public static QuoteRequestCreatedMessagePayload of() {
        return new QuoteRequestCreatedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy QuoteRequestCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteRequestCreatedMessagePayload of(final QuoteRequestCreatedMessagePayload template) {
        QuoteRequestCreatedMessagePayloadImpl instance = new QuoteRequestCreatedMessagePayloadImpl();
        instance.setQuoteRequest(template.getQuoteRequest());
        return instance;
    }

    /**
     * factory method to create a deep copy of QuoteRequestCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteRequestCreatedMessagePayload deepCopy(
            @Nullable final QuoteRequestCreatedMessagePayload template) {
        if (template == null) {
            return null;
        }
        QuoteRequestCreatedMessagePayloadImpl instance = new QuoteRequestCreatedMessagePayloadImpl();
        instance.setQuoteRequest(Optional.ofNullable(template.getQuoteRequest())
                .map(com.commercetools.api.models.quote_request.QuoteRequest::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for QuoteRequestCreatedMessagePayload
     * @return builder
     */
    public static QuoteRequestCreatedMessagePayloadBuilder builder() {
        return QuoteRequestCreatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for QuoteRequestCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestCreatedMessagePayloadBuilder builder(final QuoteRequestCreatedMessagePayload template) {
        return QuoteRequestCreatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteRequestCreatedMessagePayload(Function<QuoteRequestCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestCreatedMessagePayload>";
            }
        };
    }
}
