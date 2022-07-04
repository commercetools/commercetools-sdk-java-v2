
package com.commercetools.api.models.staged_quote;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteDraft
 *
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
@JsonDeserialize(as = StagedQuoteDraftImpl.class)
public interface StagedQuoteDraft {

    /**
     *  <p>The QuoteRequest from which this StagedQuote is created.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("quoteRequest")
    public QuoteRequestResourceIdentifier getQuoteRequest();

    /**
     *  <p>Current version of the QuoteRequest.</p>
     */
    @NotNull
    @JsonProperty("quoteRequestVersion")
    public Long getQuoteRequestVersion();

    /**
     *  <p>User-defined unique identifier for the StagedQuote.</p>
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Custom Fields to be added to the StagedQuote.</p>
     *  <ul>
     *   <li>If specified, the Custom Fields are merged with the Custom Fields on the referenced QuoteRequest and added to the StagedQuote.</li>
     *   <li>If empty, the Custom Fields on the referenced QuoteRequest are added to the StagedQuote automatically.</li>
     *  </ul>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    public void setQuoteRequest(final QuoteRequestResourceIdentifier quoteRequest);

    public void setQuoteRequestVersion(final Long quoteRequestVersion);

    public void setKey(final String key);

    public void setCustom(final CustomFieldsDraft custom);

    public static StagedQuoteDraft of() {
        return new StagedQuoteDraftImpl();
    }

    public static StagedQuoteDraft of(final StagedQuoteDraft template) {
        StagedQuoteDraftImpl instance = new StagedQuoteDraftImpl();
        instance.setQuoteRequest(template.getQuoteRequest());
        instance.setQuoteRequestVersion(template.getQuoteRequestVersion());
        instance.setKey(template.getKey());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static StagedQuoteDraftBuilder builder() {
        return StagedQuoteDraftBuilder.of();
    }

    public static StagedQuoteDraftBuilder builder(final StagedQuoteDraft template) {
        return StagedQuoteDraftBuilder.of(template);
    }

    default <T> T withStagedQuoteDraft(Function<StagedQuoteDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteDraft>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteDraft>";
            }
        };
    }
}
