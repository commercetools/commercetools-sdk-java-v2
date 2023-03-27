
package com.commercetools.api.models.quote_request;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Reference to a QuoteRequest.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestReference quoteRequestReference = QuoteRequestReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteRequestReferenceImpl.class)
public interface QuoteRequestReference extends Reference, com.commercetools.api.models.Identifiable<QuoteRequest> {

    /**
     * discriminator value for QuoteRequestReference
     */
    String QUOTE_REQUEST = "quote-request";

    /**
     *  <p>Contains the representation of the expanded QuoteRequest. Only present in responses to requests with Reference Expansion for QuoteRequest.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public QuoteRequest getObj();

    /**
     *  <p>Contains the representation of the expanded QuoteRequest. Only present in responses to requests with Reference Expansion for QuoteRequest.</p>
     * @param obj value to be set
     */

    public void setObj(final QuoteRequest obj);

    /**
     * factory method
     * @return instance of QuoteRequestReference
     */
    public static QuoteRequestReference of() {
        return new QuoteRequestReferenceImpl();
    }

    /**
     * factory method to copy an instance of QuoteRequestReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteRequestReference of(final QuoteRequestReference template) {
        QuoteRequestReferenceImpl instance = new QuoteRequestReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    /**
     * builder factory method for QuoteRequestReference
     * @return builder
     */
    public static QuoteRequestReferenceBuilder builder() {
        return QuoteRequestReferenceBuilder.of();
    }

    /**
     * create builder for QuoteRequestReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestReferenceBuilder builder(final QuoteRequestReference template) {
        return QuoteRequestReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteRequestReference(Function<QuoteRequestReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestReference>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestReference>";
            }
        };
    }
}
