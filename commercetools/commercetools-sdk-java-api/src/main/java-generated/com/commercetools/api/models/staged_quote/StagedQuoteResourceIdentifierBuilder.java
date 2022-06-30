
package com.commercetools.api.models.staged_quote;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteResourceIdentifierBuilder
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
public class StagedQuoteResourceIdentifierBuilder implements Builder<StagedQuoteResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced resource. Required if <code>key</code> is absent.</p>
     */

    public StagedQuoteResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced resource. Required if <code>id</code> is absent.</p>
     */

    public StagedQuoteResourceIdentifierBuilder key(@Nullable final String key) {
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

    public StagedQuoteResourceIdentifier build() {
        return new StagedQuoteResourceIdentifierImpl(id, key);
    }

    /**
     * builds StagedQuoteResourceIdentifier without checking for non null required values
     */
    public StagedQuoteResourceIdentifier buildUnchecked() {
        return new StagedQuoteResourceIdentifierImpl(id, key);
    }

    public static StagedQuoteResourceIdentifierBuilder of() {
        return new StagedQuoteResourceIdentifierBuilder();
    }

    public static StagedQuoteResourceIdentifierBuilder of(final StagedQuoteResourceIdentifier template) {
        StagedQuoteResourceIdentifierBuilder builder = new StagedQuoteResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
