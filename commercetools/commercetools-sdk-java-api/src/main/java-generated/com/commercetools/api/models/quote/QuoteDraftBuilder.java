
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

    @Nullable
    private String key;

    private com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifier stagedQuote;

    private Long stagedQuoteVersion;

    @Nullable
    private Boolean stagedQuoteStateToSent;

    @Nullable
    private com.commercetools.api.models.state.StateReference state;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p>User-defined unique identifier for the Quote.</p>
     * @param key value to be set
     * @return Builder
     */

    public QuoteDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>StagedQuote from which the Quote is created.</p>
     * @param builder function to build the stagedQuote value
     * @return Builder
     */

    public QuoteDraftBuilder stagedQuote(
            Function<com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifierBuilder, com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifierBuilder> builder) {
        this.stagedQuote = builder
                .apply(com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>StagedQuote from which the Quote is created.</p>
     * @param stagedQuote value to be set
     * @return Builder
     */

    public QuoteDraftBuilder stagedQuote(
            final com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifier stagedQuote) {
        this.stagedQuote = stagedQuote;
        return this;
    }

    /**
     *  <p>Current version of the StagedQuote.</p>
     * @param stagedQuoteVersion value to be set
     * @return Builder
     */

    public QuoteDraftBuilder stagedQuoteVersion(final Long stagedQuoteVersion) {
        this.stagedQuoteVersion = stagedQuoteVersion;
        return this;
    }

    /**
     *  <p>If <code>true</code>, the <code>stagedQuoteState</code> of the referenced StagedQuote will be set to <code>Sent</code>.</p>
     * @param stagedQuoteStateToSent value to be set
     * @return Builder
     */

    public QuoteDraftBuilder stagedQuoteStateToSent(@Nullable final Boolean stagedQuoteStateToSent) {
        this.stagedQuoteStateToSent = stagedQuoteStateToSent;
        return this;
    }

    /**
     *  <p>State of the Quote. This reference can point to a State in a custom workflow.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public QuoteDraftBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State of the Quote. This reference can point to a State in a custom workflow.</p>
     * @param state value to be set
     * @return Builder
     */

    public QuoteDraftBuilder state(@Nullable final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Custom Fields to be added to the Quote.</p>
     *  <ul>
     *   <li>If specified, the Custom Fields are merged with the Custom Fields on the referenced StagedQuote and added to the Quote.</li>
     *   <li>If empty, the Custom Fields on the referenced StagedQuote are added to the Quote automatically.</li>
     *  </ul>
     * @param builder function to build the custom value
     * @return Builder
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
     * @param custom value to be set
     * @return Builder
     */

    public QuoteDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifier getStagedQuote() {
        return this.stagedQuote;
    }

    public Long getStagedQuoteVersion() {
        return this.stagedQuoteVersion;
    }

    @Nullable
    public Boolean getStagedQuoteStateToSent() {
        return this.stagedQuoteStateToSent;
    }

    @Nullable
    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     * builds QuoteDraft with checking for non-null required values
     * @return QuoteDraft
     */
    public QuoteDraft build() {
        Objects.requireNonNull(stagedQuote, QuoteDraft.class + ": stagedQuote is missing");
        Objects.requireNonNull(stagedQuoteVersion, QuoteDraft.class + ": stagedQuoteVersion is missing");
        return new QuoteDraftImpl(key, stagedQuote, stagedQuoteVersion, stagedQuoteStateToSent, state, custom);
    }

    /**
     * builds QuoteDraft without checking for non-null required values
     * @return QuoteDraft
     */
    public QuoteDraft buildUnchecked() {
        return new QuoteDraftImpl(key, stagedQuote, stagedQuoteVersion, stagedQuoteStateToSent, state, custom);
    }

    public static QuoteDraftBuilder of() {
        return new QuoteDraftBuilder();
    }

    public static QuoteDraftBuilder of(final QuoteDraft template) {
        QuoteDraftBuilder builder = new QuoteDraftBuilder();
        builder.key = template.getKey();
        builder.stagedQuote = template.getStagedQuote();
        builder.stagedQuoteVersion = template.getStagedQuoteVersion();
        builder.stagedQuoteStateToSent = template.getStagedQuoteStateToSent();
        builder.state = template.getState();
        builder.custom = template.getCustom();
        return builder;
    }

}
