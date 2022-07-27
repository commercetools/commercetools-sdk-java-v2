
package com.commercetools.history.models.label;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteLabelImpl.class)
public interface QuoteLabel extends Label {

    String QUOTE_LABEL = "QuoteLabel";

    /**
     *
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public Reference getCustomer();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("stagedQuote")
    public Reference getStagedQuote();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("quoteRequest")
    public Reference getQuoteRequest();

    public void setKey(final String key);

    public void setCustomer(final Reference customer);

    public void setStagedQuote(final Reference stagedQuote);

    public void setQuoteRequest(final Reference quoteRequest);

    public static QuoteLabel of() {
        return new QuoteLabelImpl();
    }

    public static QuoteLabel of(final QuoteLabel template) {
        QuoteLabelImpl instance = new QuoteLabelImpl();
        instance.setKey(template.getKey());
        instance.setCustomer(template.getCustomer());
        instance.setStagedQuote(template.getStagedQuote());
        instance.setQuoteRequest(template.getQuoteRequest());
        return instance;
    }

    public static QuoteLabelBuilder builder() {
        return QuoteLabelBuilder.of();
    }

    public static QuoteLabelBuilder builder(final QuoteLabel template) {
        return QuoteLabelBuilder.of(template);
    }

    default <T> T withQuoteLabel(Function<QuoteLabel, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteLabel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteLabel>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteLabel>";
            }
        };
    }
}
