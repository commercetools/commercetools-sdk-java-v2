
package com.commercetools.api.models.quote;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteResourceIdentifierImpl.class)
public interface QuoteResourceIdentifier extends ResourceIdentifier, com.commercetools.api.models.Identifiable<Quote> {

    String QUOTE = "quote";

    public static QuoteResourceIdentifier of() {
        return new QuoteResourceIdentifierImpl();
    }

    public static QuoteResourceIdentifier of(final QuoteResourceIdentifier template) {
        QuoteResourceIdentifierImpl instance = new QuoteResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static QuoteResourceIdentifierBuilder builder() {
        return QuoteResourceIdentifierBuilder.of();
    }

    public static QuoteResourceIdentifierBuilder builder(final QuoteResourceIdentifier template) {
        return QuoteResourceIdentifierBuilder.of(template);
    }

    default <T> T withQuoteResourceIdentifier(Function<QuoteResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteResourceIdentifier>";
            }
        };
    }
}
