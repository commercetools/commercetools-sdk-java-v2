
package com.commercetools.api.models.quote_request;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to a QuoteRequest.</p>
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteRequestResourceIdentifierImpl.class)
public interface QuoteRequestResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<QuoteRequest> {

    String QUOTE_REQUEST = "quote-request";

    public static QuoteRequestResourceIdentifier of() {
        return new QuoteRequestResourceIdentifierImpl();
    }

    public static QuoteRequestResourceIdentifier of(final QuoteRequestResourceIdentifier template) {
        QuoteRequestResourceIdentifierImpl instance = new QuoteRequestResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static QuoteRequestResourceIdentifierBuilder builder() {
        return QuoteRequestResourceIdentifierBuilder.of();
    }

    public static QuoteRequestResourceIdentifierBuilder builder(final QuoteRequestResourceIdentifier template) {
        return QuoteRequestResourceIdentifierBuilder.of(template);
    }

    default <T> T withQuoteRequestResourceIdentifier(Function<QuoteRequestResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestResourceIdentifier>";
            }
        };
    }
}
