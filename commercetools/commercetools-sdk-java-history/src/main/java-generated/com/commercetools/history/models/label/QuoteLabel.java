
package com.commercetools.history.models.label;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * QuoteLabel
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteLabel quoteLabel = QuoteLabel.builder()
 *             .key("{key}")
 *             .customer(customerBuilder -> customerBuilder)
 *             .stagedQuote(stagedQuoteBuilder -> stagedQuoteBuilder)
 *             .quoteRequest(quoteRequestBuilder -> quoteRequestBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("QuoteLabel")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteLabelImpl.class)
public interface QuoteLabel extends Label {

    /**
     * discriminator value for QuoteLabel
     */
    String QUOTE_LABEL = "QuoteLabel";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>User-defined unique identifier of the Quote.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>The <span>Buyer</span> who requested the Quote.</p>
     * @return customer
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public Reference getCustomer();

    /**
     *  <p>Staged Quote related to the Quote.</p>
     * @return stagedQuote
     */
    @NotNull
    @Valid
    @JsonProperty("stagedQuote")
    public Reference getStagedQuote();

    /**
     *  <p>Quote Request related to the Quote.</p>
     * @return quoteRequest
     */
    @NotNull
    @Valid
    @JsonProperty("quoteRequest")
    public Reference getQuoteRequest();

    /**
     *  <p>User-defined unique identifier of the Quote.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>The <span>Buyer</span> who requested the Quote.</p>
     * @param customer value to be set
     */

    public void setCustomer(final Reference customer);

    /**
     *  <p>Staged Quote related to the Quote.</p>
     * @param stagedQuote value to be set
     */

    public void setStagedQuote(final Reference stagedQuote);

    /**
     *  <p>Quote Request related to the Quote.</p>
     * @param quoteRequest value to be set
     */

    public void setQuoteRequest(final Reference quoteRequest);

    /**
     * factory method
     * @return instance of QuoteLabel
     */
    public static QuoteLabel of() {
        return new QuoteLabelImpl();
    }

    /**
     * factory method to create a shallow copy QuoteLabel
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteLabel of(final QuoteLabel template) {
        QuoteLabelImpl instance = new QuoteLabelImpl();
        instance.setKey(template.getKey());
        instance.setCustomer(template.getCustomer());
        instance.setStagedQuote(template.getStagedQuote());
        instance.setQuoteRequest(template.getQuoteRequest());
        return instance;
    }

    public QuoteLabel copyDeep();

    /**
     * factory method to create a deep copy of QuoteLabel
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteLabel deepCopy(@Nullable final QuoteLabel template) {
        if (template == null) {
            return null;
        }
        QuoteLabelImpl instance = new QuoteLabelImpl();
        instance.setKey(template.getKey());
        instance.setCustomer(com.commercetools.history.models.common.Reference.deepCopy(template.getCustomer()));
        instance.setStagedQuote(com.commercetools.history.models.common.Reference.deepCopy(template.getStagedQuote()));
        instance.setQuoteRequest(
            com.commercetools.history.models.common.Reference.deepCopy(template.getQuoteRequest()));
        return instance;
    }

    /**
     * builder factory method for QuoteLabel
     * @return builder
     */
    public static QuoteLabelBuilder builder() {
        return QuoteLabelBuilder.of();
    }

    /**
     * create builder for QuoteLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteLabelBuilder builder(final QuoteLabel template) {
        return QuoteLabelBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteLabel(Function<QuoteLabel, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteLabel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteLabel>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteLabel>";
            }
        };
    }
}
