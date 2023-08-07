
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
 *  <p>Generated after a successful Create QuoteRequest request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestCreatedMessage quoteRequestCreatedMessage = QuoteRequestCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .quoteRequest(quoteRequestBuilder -> quoteRequestBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteRequestCreatedMessageImpl.class)
public interface QuoteRequestCreatedMessage extends Message {

    /**
     * discriminator value for QuoteRequestCreatedMessage
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
     * @return instance of QuoteRequestCreatedMessage
     */
    public static QuoteRequestCreatedMessage of() {
        return new QuoteRequestCreatedMessageImpl();
    }

    /**
     * factory method to create a shallow copy QuoteRequestCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteRequestCreatedMessage of(final QuoteRequestCreatedMessage template) {
        QuoteRequestCreatedMessageImpl instance = new QuoteRequestCreatedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setQuoteRequest(template.getQuoteRequest());
        return instance;
    }

    /**
     * factory method to create a deep copy of QuoteRequestCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteRequestCreatedMessage deepCopy(@Nullable final QuoteRequestCreatedMessage template) {
        if (template == null) {
            return null;
        }
        QuoteRequestCreatedMessageImpl instance = new QuoteRequestCreatedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setQuoteRequest(
            com.commercetools.api.models.quote_request.QuoteRequest.deepCopy(template.getQuoteRequest()));
        return instance;
    }

    /**
     * builder factory method for QuoteRequestCreatedMessage
     * @return builder
     */
    public static QuoteRequestCreatedMessageBuilder builder() {
        return QuoteRequestCreatedMessageBuilder.of();
    }

    /**
     * create builder for QuoteRequestCreatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestCreatedMessageBuilder builder(final QuoteRequestCreatedMessage template) {
        return QuoteRequestCreatedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteRequestCreatedMessage(Function<QuoteRequestCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestCreatedMessage>";
            }
        };
    }
}
