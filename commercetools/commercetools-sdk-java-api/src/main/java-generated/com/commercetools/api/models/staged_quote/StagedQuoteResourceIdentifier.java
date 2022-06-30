
package com.commercetools.api.models.staged_quote;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to a StagedQuote.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteResourceIdentifier stagedQuoteResourceIdentifier = StagedQuoteResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedQuoteResourceIdentifierImpl.class)
public interface StagedQuoteResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<StagedQuote> {

    String STAGED_QUOTE = "staged-quote";

    public static StagedQuoteResourceIdentifier of() {
        return new StagedQuoteResourceIdentifierImpl();
    }

    public static StagedQuoteResourceIdentifier of(final StagedQuoteResourceIdentifier template) {
        StagedQuoteResourceIdentifierImpl instance = new StagedQuoteResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static StagedQuoteResourceIdentifierBuilder builder() {
        return StagedQuoteResourceIdentifierBuilder.of();
    }

    public static StagedQuoteResourceIdentifierBuilder builder(final StagedQuoteResourceIdentifier template) {
        return StagedQuoteResourceIdentifierBuilder.of(template);
    }

    default <T> T withStagedQuoteResourceIdentifier(Function<StagedQuoteResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteResourceIdentifier>";
            }
        };
    }
}
