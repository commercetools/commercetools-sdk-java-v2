
package com.commercetools.api.models.quote;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Reference to a Quote.</p>
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteReferenceImpl.class)
public interface QuoteReference extends Reference, com.commercetools.api.models.Identifiable<Quote> {

    String QUOTE = "quote";

    /**
     *  <p>Contains the representation of the expanded Quote. Only present in responses to requests with Reference Expansion for Quote.</p>
     */
    @Valid
    @JsonProperty("obj")
    public Quote getObj();

    public void setObj(final Quote obj);

    public static QuoteReference of() {
        return new QuoteReferenceImpl();
    }

    public static QuoteReference of(final QuoteReference template) {
        QuoteReferenceImpl instance = new QuoteReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static QuoteReferenceBuilder builder() {
        return QuoteReferenceBuilder.of();
    }

    public static QuoteReferenceBuilder builder(final QuoteReference template) {
        return QuoteReferenceBuilder.of(template);
    }

    default <T> T withQuoteReference(Function<QuoteReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteReference>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteReference>";
            }
        };
    }
}
