
package com.commercetools.api.models.quote_request;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestResourceIdentifierBuilder
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
public class QuoteRequestResourceIdentifierBuilder implements Builder<QuoteRequestResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced resource. Required if <code>key</code> is absent.</p>
     */

    public QuoteRequestResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced resource. Required if <code>id</code> is absent.</p>
     */

    public QuoteRequestResourceIdentifierBuilder key(@Nullable final String key) {
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

    public QuoteRequestResourceIdentifier build() {
        return new QuoteRequestResourceIdentifierImpl(id, key);
    }

    /**
     * builds QuoteRequestResourceIdentifier without checking for non null required values
     */
    public QuoteRequestResourceIdentifier buildUnchecked() {
        return new QuoteRequestResourceIdentifierImpl(id, key);
    }

    public static QuoteRequestResourceIdentifierBuilder of() {
        return new QuoteRequestResourceIdentifierBuilder();
    }

    public static QuoteRequestResourceIdentifierBuilder of(final QuoteRequestResourceIdentifier template) {
        QuoteRequestResourceIdentifierBuilder builder = new QuoteRequestResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
