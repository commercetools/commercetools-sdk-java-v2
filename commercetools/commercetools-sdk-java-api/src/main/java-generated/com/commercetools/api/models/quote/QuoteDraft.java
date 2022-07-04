
package com.commercetools.api.models.quote;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteDraft
 *
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
@JsonDeserialize(as = QuoteDraftImpl.class)
public interface QuoteDraft {

    /**
     *  <p>The StagedQuote from which this Quote is created.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("stagedQuote")
    public StagedQuoteResourceIdentifier getStagedQuote();

    /**
     *  <p>Current version of the StagedQuote.</p>
     */
    @NotNull
    @JsonProperty("stagedQuoteVersion")
    public Long getStagedQuoteVersion();

    /**
     *  <p>User-defined unique identifier for the Quote.</p>
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Custom Fields to be added to the Quote.</p>
     *  <ul>
     *   <li>If specified, the Custom Fields are merged with the Custom Fields on the referenced StagedQuote and added to the Quote.</li>
     *   <li>If empty, the Custom Fields on the referenced StagedQuote are added to the Quote automatically.</li>
     *  </ul>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    public void setStagedQuote(final StagedQuoteResourceIdentifier stagedQuote);

    public void setStagedQuoteVersion(final Long stagedQuoteVersion);

    public void setKey(final String key);

    public void setCustom(final CustomFieldsDraft custom);

    public static QuoteDraft of() {
        return new QuoteDraftImpl();
    }

    public static QuoteDraft of(final QuoteDraft template) {
        QuoteDraftImpl instance = new QuoteDraftImpl();
        instance.setStagedQuote(template.getStagedQuote());
        instance.setStagedQuoteVersion(template.getStagedQuoteVersion());
        instance.setKey(template.getKey());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static QuoteDraftBuilder builder() {
        return QuoteDraftBuilder.of();
    }

    public static QuoteDraftBuilder builder(final QuoteDraft template) {
        return QuoteDraftBuilder.of(template);
    }

    default <T> T withQuoteDraft(Function<QuoteDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteDraft>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteDraft>";
            }
        };
    }
}
