
package com.commercetools.api.models.quote;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifier;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

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
public interface QuoteDraft extends com.commercetools.api.models.CustomizableDraft<QuoteDraft>,
        com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<QuoteDraft> {

    /**
     *  <p>User-defined unique identifier for the Quote.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>StagedQuote from which the Quote is created.</p>
     * @return stagedQuote
     */
    @NotNull
    @Valid
    @JsonProperty("stagedQuote")
    public StagedQuoteResourceIdentifier getStagedQuote();

    /**
     *  <p>Current version of the StagedQuote.</p>
     * @return stagedQuoteVersion
     */
    @NotNull
    @JsonProperty("stagedQuoteVersion")
    public Long getStagedQuoteVersion();

    /**
     *  <p>If <code>true</code>, the <code>stagedQuoteState</code> of the referenced <span>StagedQuote</span> will be set to <code>Sent</code>.</p>
     * @return stagedQuoteStateToSent
     */

    @JsonProperty("stagedQuoteStateToSent")
    public Boolean getStagedQuoteStateToSent();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> of the Quote. This reference can point to a State in a custom workflow.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
     *  <p><span>Custom Fields</span> to be added to the Quote.</p>
     *  <ul>
     *   <li>If specified, the Custom Fields are merged with the Custom Fields on the referenced <span>StagedQuote</span> and added to the Quote.</li>
     *   <li>If empty, the Custom Fields on the referenced <span>StagedQuote</span> are added to the Quote automatically.</li>
     *  </ul>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>User-defined unique identifier for the Quote.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>StagedQuote from which the Quote is created.</p>
     * @param stagedQuote value to be set
     */

    public void setStagedQuote(final StagedQuoteResourceIdentifier stagedQuote);

    /**
     *  <p>Current version of the StagedQuote.</p>
     * @param stagedQuoteVersion value to be set
     */

    public void setStagedQuoteVersion(final Long stagedQuoteVersion);

    /**
     *  <p>If <code>true</code>, the <code>stagedQuoteState</code> of the referenced <span>StagedQuote</span> will be set to <code>Sent</code>.</p>
     * @param stagedQuoteStateToSent value to be set
     */

    public void setStagedQuoteStateToSent(final Boolean stagedQuoteStateToSent);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> of the Quote. This reference can point to a State in a custom workflow.</p>
     * @param state value to be set
     */

    public void setState(final StateReference state);

    /**
     *  <p><span>Custom Fields</span> to be added to the Quote.</p>
     *  <ul>
     *   <li>If specified, the Custom Fields are merged with the Custom Fields on the referenced <span>StagedQuote</span> and added to the Quote.</li>
     *   <li>If empty, the Custom Fields on the referenced <span>StagedQuote</span> are added to the Quote automatically.</li>
     *  </ul>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of QuoteDraft
     */
    public static QuoteDraft of() {
        return new QuoteDraftImpl();
    }

    /**
     * factory method to create a shallow copy QuoteDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteDraft of(final QuoteDraft template) {
        QuoteDraftImpl instance = new QuoteDraftImpl();
        instance.setKey(template.getKey());
        instance.setStagedQuote(template.getStagedQuote());
        instance.setStagedQuoteVersion(template.getStagedQuoteVersion());
        instance.setStagedQuoteStateToSent(template.getStagedQuoteStateToSent());
        instance.setState(template.getState());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public QuoteDraft copyDeep();

    /**
     * factory method to create a deep copy of QuoteDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteDraft deepCopy(@Nullable final QuoteDraft template) {
        if (template == null) {
            return null;
        }
        QuoteDraftImpl instance = new QuoteDraftImpl();
        instance.setKey(template.getKey());
        instance.setStagedQuote(com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifier
                .deepCopy(template.getStagedQuote()));
        instance.setStagedQuoteVersion(template.getStagedQuoteVersion());
        instance.setStagedQuoteStateToSent(template.getStagedQuoteStateToSent());
        instance.setState(com.commercetools.api.models.state.StateReference.deepCopy(template.getState()));
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for QuoteDraft
     * @return builder
     */
    public static QuoteDraftBuilder builder() {
        return QuoteDraftBuilder.of();
    }

    /**
     * create builder for QuoteDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteDraftBuilder builder(final QuoteDraft template) {
        return QuoteDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteDraft(Function<QuoteDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteDraft>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteDraft>";
            }
        };
    }
}
