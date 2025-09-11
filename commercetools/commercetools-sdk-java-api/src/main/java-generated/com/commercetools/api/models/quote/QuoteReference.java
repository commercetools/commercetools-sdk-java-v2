
package com.commercetools.api.models.quote;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quote</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteReference quoteReference = QuoteReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("quote")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteReferenceImpl.class)
public interface QuoteReference extends Reference, com.commercetools.api.models.Identifiable<Quote>,
        com.commercetools.api.models.IdentifiableObjHolder<Quote> {

    /**
     * discriminator value for QuoteReference
     */
    String QUOTE = "quote";

    /**
     *  <p>Contains the representation of the expanded Quote. Only present in responses to requests with <span>Reference Expansion</span> for Quote.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public Quote getObj();

    /**
     *  <p>Contains the representation of the expanded Quote. Only present in responses to requests with <span>Reference Expansion</span> for Quote.</p>
     * @param obj value to be set
     */

    public void setObj(final Quote obj);

    /**
     * factory method
     * @return instance of QuoteReference
     */
    public static QuoteReference of() {
        return new QuoteReferenceImpl();
    }

    /**
     * factory method to create a shallow copy QuoteReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteReference of(final QuoteReference template) {
        QuoteReferenceImpl instance = new QuoteReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public QuoteReference copyDeep();

    /**
     * factory method to create a deep copy of QuoteReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteReference deepCopy(@Nullable final QuoteReference template) {
        if (template == null) {
            return null;
        }
        QuoteReferenceImpl instance = new QuoteReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(com.commercetools.api.models.quote.Quote.deepCopy(template.getObj()));
        return instance;
    }

    /**
     * builder factory method for QuoteReference
     * @return builder
     */
    public static QuoteReferenceBuilder builder() {
        return QuoteReferenceBuilder.of();
    }

    /**
     * create builder for QuoteReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteReferenceBuilder builder(final QuoteReference template) {
        return QuoteReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteReference(Function<QuoteReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteReference>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteReference>";
            }
        };
    }
}
