
package com.commercetools.api.models.staged_quote;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifier;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

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
public interface StagedQuoteDraft
        extends com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<StagedQuoteDraft> {

    /**
     *  <p>QuoteRequest from which the StagedQuote is created.</p>
     * @return quoteRequest
     */
    @NotNull
    @Valid
    @JsonProperty("quoteRequest")
    public QuoteRequestResourceIdentifier getQuoteRequest();

    /**
     *  <p>Current version of the QuoteRequest.</p>
     * @return quoteRequestVersion
     */
    @NotNull
    @JsonProperty("quoteRequestVersion")
    public Long getQuoteRequestVersion();

    /**
     *  <p>If <code>true</code>, the <code>quoteRequestState</code> of the referenced QuoteRequest will be set to <code>Accepted</code>.</p>
     * @return quoteRequestStateToAccepted
     */

    @JsonProperty("quoteRequestStateToAccepted")
    public Boolean getQuoteRequestStateToAccepted();

    /**
     *  <p>User-defined unique identifier for the StagedQuote.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Custom Fields to be added to the StagedQuote.</p>
     *  <ul>
     *   <li>If specified, the Custom Fields are merged with the Custom Fields on the referenced QuoteRequest and added to the StagedQuote.</li>
     *   <li>If empty, the Custom Fields on the referenced QuoteRequest are added to the StagedQuote automatically.</li>
     *  </ul>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>State of the Staged Quote. This reference can point to a State in a custom workflow.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
     *  <p>QuoteRequest from which the StagedQuote is created.</p>
     * @param quoteRequest value to be set
     */

    public void setQuoteRequest(final QuoteRequestResourceIdentifier quoteRequest);

    /**
     *  <p>Current version of the QuoteRequest.</p>
     * @param quoteRequestVersion value to be set
     */

    public void setQuoteRequestVersion(final Long quoteRequestVersion);

    /**
     *  <p>If <code>true</code>, the <code>quoteRequestState</code> of the referenced QuoteRequest will be set to <code>Accepted</code>.</p>
     * @param quoteRequestStateToAccepted value to be set
     */

    public void setQuoteRequestStateToAccepted(final Boolean quoteRequestStateToAccepted);

    /**
     *  <p>User-defined unique identifier for the StagedQuote.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Custom Fields to be added to the StagedQuote.</p>
     *  <ul>
     *   <li>If specified, the Custom Fields are merged with the Custom Fields on the referenced QuoteRequest and added to the StagedQuote.</li>
     *   <li>If empty, the Custom Fields on the referenced QuoteRequest are added to the StagedQuote automatically.</li>
     *  </ul>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     *  <p>State of the Staged Quote. This reference can point to a State in a custom workflow.</p>
     * @param state value to be set
     */

    public void setState(final StateReference state);

    /**
     * factory method
     * @return instance of StagedQuoteDraft
     */
    public static StagedQuoteDraft of() {
        return new StagedQuoteDraftImpl();
    }

    /**
     * factory method to create a shallow copy StagedQuoteDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedQuoteDraft of(final StagedQuoteDraft template) {
        StagedQuoteDraftImpl instance = new StagedQuoteDraftImpl();
        instance.setQuoteRequest(template.getQuoteRequest());
        instance.setQuoteRequestVersion(template.getQuoteRequestVersion());
        instance.setQuoteRequestStateToAccepted(template.getQuoteRequestStateToAccepted());
        instance.setKey(template.getKey());
        instance.setCustom(template.getCustom());
        instance.setState(template.getState());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedQuoteDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedQuoteDraft deepCopy(@Nullable final StagedQuoteDraft template) {
        if (template == null) {
            return null;
        }
        StagedQuoteDraftImpl instance = new StagedQuoteDraftImpl();
        instance.setQuoteRequest(com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifier
                .deepCopy(template.getQuoteRequest()));
        instance.setQuoteRequestVersion(template.getQuoteRequestVersion());
        instance.setQuoteRequestStateToAccepted(template.getQuoteRequestStateToAccepted());
        instance.setKey(template.getKey());
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        instance.setState(com.commercetools.api.models.state.StateReference.deepCopy(template.getState()));
        return instance;
    }

    /**
     * builder factory method for StagedQuoteDraft
     * @return builder
     */
    public static StagedQuoteDraftBuilder builder() {
        return StagedQuoteDraftBuilder.of();
    }

    /**
     * create builder for StagedQuoteDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteDraftBuilder builder(final StagedQuoteDraft template) {
        return StagedQuoteDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedQuoteDraft(Function<StagedQuoteDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteDraft>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteDraft>";
            }
        };
    }
}
