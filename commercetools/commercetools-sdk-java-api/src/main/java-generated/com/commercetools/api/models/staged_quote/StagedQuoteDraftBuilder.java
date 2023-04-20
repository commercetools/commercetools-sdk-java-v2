
package com.commercetools.api.models.staged_quote;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteDraft stagedQuoteDraft = StagedQuoteDraft.builder()
 *             .quoteRequest(quoteRequestBuilder -> quoteRequestBuilder)
 *             .quoteRequestVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteDraftBuilder implements Builder<StagedQuoteDraft> {

    private com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifier quoteRequest;

    private Long quoteRequestVersion;

    @Nullable
    private Boolean quoteRequestStateToAccepted;

    @Nullable
    private String key;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private com.commercetools.api.models.state.StateReference state;

    /**
     *  <p>QuoteRequest from which the StagedQuote is created.</p>
     * @param builder function to build the quoteRequest value
     * @return Builder
     */

    public StagedQuoteDraftBuilder quoteRequest(
            Function<com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifierBuilder, com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifierBuilder> builder) {
        this.quoteRequest = builder
                .apply(com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>QuoteRequest from which the StagedQuote is created.</p>
     * @param builder function to build the quoteRequest value
     * @return Builder
     */

    public StagedQuoteDraftBuilder withQuoteRequest(
            Function<com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifierBuilder, com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifier> builder) {
        this.quoteRequest = builder
                .apply(com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>QuoteRequest from which the StagedQuote is created.</p>
     * @param quoteRequest value to be set
     * @return Builder
     */

    public StagedQuoteDraftBuilder quoteRequest(
            final com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifier quoteRequest) {
        this.quoteRequest = quoteRequest;
        return this;
    }

    /**
     *  <p>Current version of the QuoteRequest.</p>
     * @param quoteRequestVersion value to be set
     * @return Builder
     */

    public StagedQuoteDraftBuilder quoteRequestVersion(final Long quoteRequestVersion) {
        this.quoteRequestVersion = quoteRequestVersion;
        return this;
    }

    /**
     *  <p>If <code>true</code>, the <code>quoteRequestState</code> of the referenced QuoteRequest will be set to <code>Accepted</code>.</p>
     * @param quoteRequestStateToAccepted value to be set
     * @return Builder
     */

    public StagedQuoteDraftBuilder quoteRequestStateToAccepted(@Nullable final Boolean quoteRequestStateToAccepted) {
        this.quoteRequestStateToAccepted = quoteRequestStateToAccepted;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the StagedQuote.</p>
     * @param key value to be set
     * @return Builder
     */

    public StagedQuoteDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Custom Fields to be added to the StagedQuote.</p>
     *  <ul>
     *   <li>If specified, the Custom Fields are merged with the Custom Fields on the referenced QuoteRequest and added to the StagedQuote.</li>
     *   <li>If empty, the Custom Fields on the referenced QuoteRequest are added to the StagedQuote automatically.</li>
     *  </ul>
     * @param builder function to build the custom value
     * @return Builder
     */

    public StagedQuoteDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields to be added to the StagedQuote.</p>
     *  <ul>
     *   <li>If specified, the Custom Fields are merged with the Custom Fields on the referenced QuoteRequest and added to the StagedQuote.</li>
     *   <li>If empty, the Custom Fields on the referenced QuoteRequest are added to the StagedQuote automatically.</li>
     *  </ul>
     * @param builder function to build the custom value
     * @return Builder
     */

    public StagedQuoteDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields to be added to the StagedQuote.</p>
     *  <ul>
     *   <li>If specified, the Custom Fields are merged with the Custom Fields on the referenced QuoteRequest and added to the StagedQuote.</li>
     *   <li>If empty, the Custom Fields on the referenced QuoteRequest are added to the StagedQuote automatically.</li>
     *  </ul>
     * @param custom value to be set
     * @return Builder
     */

    public StagedQuoteDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>State of the Staged Quote. This reference can point to a State in a custom workflow.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public StagedQuoteDraftBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State of the Staged Quote. This reference can point to a State in a custom workflow.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public StagedQuoteDraftBuilder withState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReference> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>State of the Staged Quote. This reference can point to a State in a custom workflow.</p>
     * @param state value to be set
     * @return Builder
     */

    public StagedQuoteDraftBuilder state(@Nullable final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>QuoteRequest from which the StagedQuote is created.</p>
     * @return quoteRequest
     */

    public com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifier getQuoteRequest() {
        return this.quoteRequest;
    }

    /**
     *  <p>Current version of the QuoteRequest.</p>
     * @return quoteRequestVersion
     */

    public Long getQuoteRequestVersion() {
        return this.quoteRequestVersion;
    }

    /**
     *  <p>If <code>true</code>, the <code>quoteRequestState</code> of the referenced QuoteRequest will be set to <code>Accepted</code>.</p>
     * @return quoteRequestStateToAccepted
     */

    @Nullable
    public Boolean getQuoteRequestStateToAccepted() {
        return this.quoteRequestStateToAccepted;
    }

    /**
     *  <p>User-defined unique identifier for the StagedQuote.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Custom Fields to be added to the StagedQuote.</p>
     *  <ul>
     *   <li>If specified, the Custom Fields are merged with the Custom Fields on the referenced QuoteRequest and added to the StagedQuote.</li>
     *   <li>If empty, the Custom Fields on the referenced QuoteRequest are added to the StagedQuote automatically.</li>
     *  </ul>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>State of the Staged Quote. This reference can point to a State in a custom workflow.</p>
     * @return state
     */

    @Nullable
    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    /**
     * builds StagedQuoteDraft with checking for non-null required values
     * @return StagedQuoteDraft
     */
    public StagedQuoteDraft build() {
        Objects.requireNonNull(quoteRequest, StagedQuoteDraft.class + ": quoteRequest is missing");
        Objects.requireNonNull(quoteRequestVersion, StagedQuoteDraft.class + ": quoteRequestVersion is missing");
        return new StagedQuoteDraftImpl(quoteRequest, quoteRequestVersion, quoteRequestStateToAccepted, key, custom,
            state);
    }

    /**
     * builds StagedQuoteDraft without checking for non-null required values
     * @return StagedQuoteDraft
     */
    public StagedQuoteDraft buildUnchecked() {
        return new StagedQuoteDraftImpl(quoteRequest, quoteRequestVersion, quoteRequestStateToAccepted, key, custom,
            state);
    }

    /**
     * factory method for an instance of StagedQuoteDraftBuilder
     * @return builder
     */
    public static StagedQuoteDraftBuilder of() {
        return new StagedQuoteDraftBuilder();
    }

    /**
     * create builder for StagedQuoteDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteDraftBuilder of(final StagedQuoteDraft template) {
        StagedQuoteDraftBuilder builder = new StagedQuoteDraftBuilder();
        builder.quoteRequest = template.getQuoteRequest();
        builder.quoteRequestVersion = template.getQuoteRequestVersion();
        builder.quoteRequestStateToAccepted = template.getQuoteRequestStateToAccepted();
        builder.key = template.getKey();
        builder.custom = template.getCustom();
        builder.state = template.getState();
        return builder;
    }

}
