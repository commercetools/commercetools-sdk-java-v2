
package com.commercetools.api.models.staged_quote;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteReference stagedQuoteReference = StagedQuoteReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteReferenceBuilder implements Builder<StagedQuoteReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.staged_quote.StagedQuote obj;

    /**
     *  <p>Unique ID of the referenced resource.</p>
     */

    public StagedQuoteReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded StagedQuote. Only present in responses to requests with Reference Expansion for StagedQuote.</p>
     */

    public StagedQuoteReferenceBuilder obj(
            Function<com.commercetools.api.models.staged_quote.StagedQuoteBuilder, com.commercetools.api.models.staged_quote.StagedQuoteBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.staged_quote.StagedQuoteBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded StagedQuote. Only present in responses to requests with Reference Expansion for StagedQuote.</p>
     */

    public StagedQuoteReferenceBuilder obj(@Nullable final com.commercetools.api.models.staged_quote.StagedQuote obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.staged_quote.StagedQuote getObj() {
        return this.obj;
    }

    public StagedQuoteReference build() {
        Objects.requireNonNull(id, StagedQuoteReference.class + ": id is missing");
        return new StagedQuoteReferenceImpl(id, obj);
    }

    /**
     * builds StagedQuoteReference without checking for non null required values
     */
    public StagedQuoteReference buildUnchecked() {
        return new StagedQuoteReferenceImpl(id, obj);
    }

    public static StagedQuoteReferenceBuilder of() {
        return new StagedQuoteReferenceBuilder();
    }

    public static StagedQuoteReferenceBuilder of(final StagedQuoteReference template) {
        StagedQuoteReferenceBuilder builder = new StagedQuoteReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
