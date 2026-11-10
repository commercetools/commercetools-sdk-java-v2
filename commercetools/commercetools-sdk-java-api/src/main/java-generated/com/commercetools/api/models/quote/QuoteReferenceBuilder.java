
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
     * @param id value to be set
     * @return Builder
     */

    public QuoteReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Quote. Only present in responses to requests with <span>Reference Expansion</span> for Quote.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public QuoteReferenceBuilder obj(
            Function<com.commercetools.api.models.quote.QuoteBuilder, com.commercetools.api.models.quote.QuoteBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.quote.QuoteBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Quote. Only present in responses to requests with <span>Reference Expansion</span> for Quote.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public QuoteReferenceBuilder withObj(
            Function<com.commercetools.api.models.quote.QuoteBuilder, com.commercetools.api.models.quote.Quote> builder) {
        this.obj = builder.apply(com.commercetools.api.models.quote.QuoteBuilder.of());
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Quote. Only present in responses to requests with <span>Reference Expansion</span> for Quote.</p>
     * @param obj value to be set
     * @return Builder
     */

    public QuoteReferenceBuilder obj(@Nullable final com.commercetools.api.models.quote.Quote obj) {
        this.obj = obj;
        return this;
    }

    /**
     *  <p>Unique ID of the referenced resource.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Contains the representation of the expanded Quote. Only present in responses to requests with <span>Reference Expansion</span> for Quote.</p>
     * @return obj
     */

    @Nullable
    public com.commercetools.api.models.quote.Quote getObj() {
        return this.obj;
    }

    /**
     * builds QuoteReference with checking for non-null required values
     * @return QuoteReference
     */
    public QuoteReference build() {
        Objects.requireNonNull(id, QuoteReference.class + ": id is missing");
        return new QuoteReferenceImpl(id, obj);
    }

    /**
     * builds QuoteReference without checking for non-null required values
     * @return QuoteReference
     */
    public QuoteReference buildUnchecked() {
        return new QuoteReferenceImpl(id, obj);
    }

    /**
     * factory method for an instance of QuoteReferenceBuilder
     * @return builder
     */
    public static QuoteReferenceBuilder of() {
        return new QuoteReferenceBuilder();
    }

    /**
     * create builder for QuoteReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteReferenceBuilder of(final QuoteReference template) {
        QuoteReferenceBuilder builder = new QuoteReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
