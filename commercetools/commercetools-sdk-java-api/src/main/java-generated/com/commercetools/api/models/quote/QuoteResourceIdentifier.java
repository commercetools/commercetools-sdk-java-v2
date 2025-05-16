
package com.commercetools.api.models.quote;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to a Quote.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteResourceIdentifier quoteResourceIdentifier = QuoteResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("quote")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteResourceIdentifierImpl.class)
public interface QuoteResourceIdentifier extends ResourceIdentifier, com.commercetools.api.models.Identifiable<Quote> {

    /**
     * discriminator value for QuoteResourceIdentifier
     */
    String QUOTE = "quote";

    /**
     * factory method
     * @return instance of QuoteResourceIdentifier
     */
    public static QuoteResourceIdentifier of() {
        return new QuoteResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy QuoteResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteResourceIdentifier of(final QuoteResourceIdentifier template) {
        QuoteResourceIdentifierImpl instance = new QuoteResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public QuoteResourceIdentifier copyDeep();

    /**
     * factory method to create a deep copy of QuoteResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteResourceIdentifier deepCopy(@Nullable final QuoteResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        QuoteResourceIdentifierImpl instance = new QuoteResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for QuoteResourceIdentifier
     * @return builder
     */
    public static QuoteResourceIdentifierBuilder builder() {
        return QuoteResourceIdentifierBuilder.of();
    }

    /**
     * create builder for QuoteResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteResourceIdentifierBuilder builder(final QuoteResourceIdentifier template) {
        return QuoteResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteResourceIdentifier(Function<QuoteResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteResourceIdentifier>";
            }
        };
    }
}
