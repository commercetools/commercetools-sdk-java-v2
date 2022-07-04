
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
    private String key;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p>The QuoteRequest from which this StagedQuote is created.</p>
     */

    public StagedQuoteDraftBuilder quoteRequest(
            Function<com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifierBuilder, com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifierBuilder> builder) {
        this.quoteRequest = builder
                .apply(com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The QuoteRequest from which this StagedQuote is created.</p>
     */

    public StagedQuoteDraftBuilder quoteRequest(
            final com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifier quoteRequest) {
        this.quoteRequest = quoteRequest;
        return this;
    }

    /**
     *  <p>Current version of the QuoteRequest.</p>
     */

    public StagedQuoteDraftBuilder quoteRequestVersion(final Long quoteRequestVersion) {
        this.quoteRequestVersion = quoteRequestVersion;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the StagedQuote.</p>
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
     */

    public StagedQuoteDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    public com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifier getQuoteRequest() {
        return this.quoteRequest;
    }

    public Long getQuoteRequestVersion() {
        return this.quoteRequestVersion;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public StagedQuoteDraft build() {
        Objects.requireNonNull(quoteRequest, StagedQuoteDraft.class + ": quoteRequest is missing");
        Objects.requireNonNull(quoteRequestVersion, StagedQuoteDraft.class + ": quoteRequestVersion is missing");
        return new StagedQuoteDraftImpl(quoteRequest, quoteRequestVersion, key, custom);
    }

    /**
     * builds StagedQuoteDraft without checking for non null required values
     */
    public StagedQuoteDraft buildUnchecked() {
        return new StagedQuoteDraftImpl(quoteRequest, quoteRequestVersion, key, custom);
    }

    public static StagedQuoteDraftBuilder of() {
        return new StagedQuoteDraftBuilder();
    }

    public static StagedQuoteDraftBuilder of(final StagedQuoteDraft template) {
        StagedQuoteDraftBuilder builder = new StagedQuoteDraftBuilder();
        builder.quoteRequest = template.getQuoteRequest();
        builder.quoteRequestVersion = template.getQuoteRequestVersion();
        builder.key = template.getKey();
        builder.custom = template.getCustom();
        return builder;
    }

}
