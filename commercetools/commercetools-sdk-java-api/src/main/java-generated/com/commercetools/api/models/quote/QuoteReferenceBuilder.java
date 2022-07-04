
package com.commercetools.api.models.quote;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteReferenceBuilder
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
public class QuoteReferenceBuilder implements Builder<QuoteReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.quote.Quote obj;

    /**
     *  <p>Unique ID of the referenced resource.</p>
     */

    public QuoteReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Quote. Only present in responses to requests with Reference Expansion for Quote.</p>
     */

    public QuoteReferenceBuilder obj(
            Function<com.commercetools.api.models.quote.QuoteBuilder, com.commercetools.api.models.quote.QuoteBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.quote.QuoteBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Quote. Only present in responses to requests with Reference Expansion for Quote.</p>
     */

    public QuoteReferenceBuilder obj(@Nullable final com.commercetools.api.models.quote.Quote obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.quote.Quote getObj() {
        return this.obj;
    }

    public QuoteReference build() {
        Objects.requireNonNull(id, QuoteReference.class + ": id is missing");
        return new QuoteReferenceImpl(id, obj);
    }

    /**
     * builds QuoteReference without checking for non null required values
     */
    public QuoteReference buildUnchecked() {
        return new QuoteReferenceImpl(id, obj);
    }

    public static QuoteReferenceBuilder of() {
        return new QuoteReferenceBuilder();
    }

    public static QuoteReferenceBuilder of(final QuoteReference template) {
        QuoteReferenceBuilder builder = new QuoteReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
