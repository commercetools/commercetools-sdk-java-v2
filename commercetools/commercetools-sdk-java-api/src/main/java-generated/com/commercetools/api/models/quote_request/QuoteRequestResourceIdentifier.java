
package com.commercetools.api.models.quote_request;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestResourceIdentifier quoteRequestResourceIdentifier = QuoteRequestResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("quote-request")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteRequestResourceIdentifierImpl.class)
public interface QuoteRequestResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<QuoteRequest> {

    /**
     * discriminator value for QuoteRequestResourceIdentifier
     */
    String QUOTE_REQUEST = "quote-request";

    /**
     * factory method
     * @return instance of QuoteRequestResourceIdentifier
     */
    public static QuoteRequestResourceIdentifier of() {
        return new QuoteRequestResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy QuoteRequestResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteRequestResourceIdentifier of(final QuoteRequestResourceIdentifier template) {
        QuoteRequestResourceIdentifierImpl instance = new QuoteRequestResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public QuoteRequestResourceIdentifier copyDeep();

    /**
     * factory method to create a deep copy of QuoteRequestResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteRequestResourceIdentifier deepCopy(@Nullable final QuoteRequestResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        QuoteRequestResourceIdentifierImpl instance = new QuoteRequestResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for QuoteRequestResourceIdentifier
     * @return builder
     */
    public static QuoteRequestResourceIdentifierBuilder builder() {
        return QuoteRequestResourceIdentifierBuilder.of();
    }

    /**
     * create builder for QuoteRequestResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestResourceIdentifierBuilder builder(final QuoteRequestResourceIdentifier template) {
        return QuoteRequestResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteRequestResourceIdentifier(Function<QuoteRequestResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestResourceIdentifier>";
            }
        };
    }
}
