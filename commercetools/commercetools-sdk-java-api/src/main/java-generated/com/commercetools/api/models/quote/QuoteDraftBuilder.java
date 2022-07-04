
package com.commercetools.api.models.quote;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteDraft quoteDraft = QuoteDraft.builder()
 *             .stagedQuote(stagedQuoteBuilder -> stagedQuoteBuilder)
 *             .stagedQuoteVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteDraftBuilder implements Builder<QuoteDraft> {

    private com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifier stagedQuote;

    private Long stagedQuoteVersion;

    @Nullable
    private String key;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p>The StagedQuote from which this Quote is created.</p>
     */

    public QuoteDraftBuilder stagedQuote(
            Function<com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifierBuilder, com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifierBuilder> builder) {
        this.stagedQuote = builder
                .apply(com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The StagedQuote from which this Quote is created.</p>
     */

    public QuoteDraftBuilder stagedQuote(
            final com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifier stagedQuote) {
        this.stagedQuote = stagedQuote;
        return this;
    }

    /**
     *  <p>Current version of the StagedQuote.</p>
     */

    public QuoteDraftBuilder stagedQuoteVersion(final Long stagedQuoteVersion) {
        this.stagedQuoteVersion = stagedQuoteVersion;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the Quote.</p>
     */

    public QuoteDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Custom Fields to be added to the Quote.</p>
     *  <ul>
     *   <li>If specified, the Custom Fields are merged with the Custom Fields on the referenced StagedQuote and added to the Quote.</li>
     *   <li>If empty, the Custom Fields on the referenced StagedQuote are added to the Quote automatically.</li>
     *  </ul>
     */

    public QuoteDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields to be added to the Quote.</p>
     *  <ul>
     *   <li>If specified, the Custom Fields are merged with the Custom Fields on the referenced StagedQuote and added to the Quote.</li>
     *   <li>If empty, the Custom Fields on the referenced StagedQuote are added to the Quote automatically.</li>
     *  </ul>
     */

    public QuoteDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    public com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifier getStagedQuote() {
        return this.stagedQuote;
    }

    public Long getStagedQuoteVersion() {
        return this.stagedQuoteVersion;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public QuoteDraft build() {
        Objects.requireNonNull(stagedQuote, QuoteDraft.class + ": stagedQuote is missing");
        Objects.requireNonNull(stagedQuoteVersion, QuoteDraft.class + ": stagedQuoteVersion is missing");
        return new QuoteDraftImpl(stagedQuote, stagedQuoteVersion, key, custom);
    }

    /**
     * builds QuoteDraft without checking for non null required values
     */
    public QuoteDraft buildUnchecked() {
        return new QuoteDraftImpl(stagedQuote, stagedQuoteVersion, key, custom);
    }

    public static QuoteDraftBuilder of() {
        return new QuoteDraftBuilder();
    }

    public static QuoteDraftBuilder of(final QuoteDraft template) {
        QuoteDraftBuilder builder = new QuoteDraftBuilder();
        builder.stagedQuote = template.getStagedQuote();
        builder.stagedQuoteVersion = template.getStagedQuoteVersion();
        builder.key = template.getKey();
        builder.custom = template.getCustom();
        return builder;
    }

}
