
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.quote.Quote;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/quotes:POST" rel="nofollow">Create Quote</a> request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteCreatedMessage quoteCreatedMessage = QuoteCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .quote(quoteBuilder -> quoteBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("QuoteCreated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteCreatedMessageImpl.class)
public interface QuoteCreatedMessage extends Message {

    /**
     * discriminator value for QuoteCreatedMessage
     */
    String QUOTE_CREATED = "QuoteCreated";

    /**
     *  <p><span>Quote</span> that was created.</p>
     * @return quote
     */
    @NotNull
    @Valid
    @JsonProperty("quote")
    public Quote getQuote();

    /**
     *  <p><span>Quote</span> that was created.</p>
     * @param quote value to be set
     */

    public void setQuote(final Quote quote);

    /**
     * factory method
     * @return instance of QuoteCreatedMessage
     */
    public static QuoteCreatedMessage of() {
        return new QuoteCreatedMessageImpl();
    }

    /**
     * factory method to create a shallow copy QuoteCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteCreatedMessage of(final QuoteCreatedMessage template) {
        QuoteCreatedMessageImpl instance = new QuoteCreatedMessageImpl();
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
        instance.setQuote(template.getQuote());
        return instance;
    }

    public QuoteCreatedMessage copyDeep();

    /**
     * factory method to create a deep copy of QuoteCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteCreatedMessage deepCopy(@Nullable final QuoteCreatedMessage template) {
        if (template == null) {
            return null;
        }
        QuoteCreatedMessageImpl instance = new QuoteCreatedMessageImpl();
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
        instance.setQuote(com.commercetools.api.models.quote.Quote.deepCopy(template.getQuote()));
        return instance;
    }

    /**
     * builder factory method for QuoteCreatedMessage
     * @return builder
     */
    public static QuoteCreatedMessageBuilder builder() {
        return QuoteCreatedMessageBuilder.of();
    }

    /**
     * create builder for QuoteCreatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteCreatedMessageBuilder builder(final QuoteCreatedMessage template) {
        return QuoteCreatedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteCreatedMessage(Function<QuoteCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteCreatedMessage>";
            }
        };
    }
}
