
package com.commercetools.api.models.quote_request;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestReferenceBuilder
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
public class QuoteRequestReferenceBuilder implements Builder<QuoteRequestReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.quote_request.QuoteRequest obj;

    /**
     *  <p>Unique ID of the referenced resource.</p>
     * @param id value to be set
     * @return Builder
     */

    public QuoteRequestReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded QuoteRequest. Only present in responses to requests with Reference Expansion for QuoteRequest.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public QuoteRequestReferenceBuilder obj(
            Function<com.commercetools.api.models.quote_request.QuoteRequestBuilder, com.commercetools.api.models.quote_request.QuoteRequestBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.quote_request.QuoteRequestBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded QuoteRequest. Only present in responses to requests with Reference Expansion for QuoteRequest.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public QuoteRequestReferenceBuilder withObj(
            Function<com.commercetools.api.models.quote_request.QuoteRequestBuilder, com.commercetools.api.models.quote_request.QuoteRequest> builder) {
        this.obj = builder.apply(com.commercetools.api.models.quote_request.QuoteRequestBuilder.of());
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded QuoteRequest. Only present in responses to requests with Reference Expansion for QuoteRequest.</p>
     * @param obj value to be set
     * @return Builder
     */

    public QuoteRequestReferenceBuilder obj(
            @Nullable final com.commercetools.api.models.quote_request.QuoteRequest obj) {
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
     *  <p>Contains the representation of the expanded QuoteRequest. Only present in responses to requests with Reference Expansion for QuoteRequest.</p>
     * @return obj
     */

    @Nullable
    public com.commercetools.api.models.quote_request.QuoteRequest getObj() {
        return this.obj;
    }

    /**
     * builds QuoteRequestReference with checking for non-null required values
     * @return QuoteRequestReference
     */
    public QuoteRequestReference build() {
        Objects.requireNonNull(id, QuoteRequestReference.class + ": id is missing");
        return new QuoteRequestReferenceImpl(id, obj);
    }

    /**
     * builds QuoteRequestReference without checking for non-null required values
     * @return QuoteRequestReference
     */
    public QuoteRequestReference buildUnchecked() {
        return new QuoteRequestReferenceImpl(id, obj);
    }

    /**
     * factory method for an instance of QuoteRequestReferenceBuilder
     * @return builder
     */
    public static QuoteRequestReferenceBuilder of() {
        return new QuoteRequestReferenceBuilder();
    }

    /**
     * create builder for QuoteRequestReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestReferenceBuilder of(final QuoteRequestReference template) {
        QuoteRequestReferenceBuilder builder = new QuoteRequestReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
