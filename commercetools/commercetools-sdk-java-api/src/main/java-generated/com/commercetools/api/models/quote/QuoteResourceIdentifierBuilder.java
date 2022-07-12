
package com.commercetools.api.models.quote;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteResourceIdentifierBuilder
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
public class QuoteResourceIdentifierBuilder implements Builder<QuoteResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced resource. Required if <code>key</code> is absent.</p>
     */

    public QuoteResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced resource. Required if <code>id</code> is absent.</p>
     */

    public QuoteResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public QuoteResourceIdentifier build() {
        return new QuoteResourceIdentifierImpl(id, key);
    }

    /**
     * builds QuoteResourceIdentifier without checking for non null required values
     */
    public QuoteResourceIdentifier buildUnchecked() {
        return new QuoteResourceIdentifierImpl(id, key);
    }

    public static QuoteResourceIdentifierBuilder of() {
        return new QuoteResourceIdentifierBuilder();
    }

    public static QuoteResourceIdentifierBuilder of(final QuoteResourceIdentifier template) {
        QuoteResourceIdentifierBuilder builder = new QuoteResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
