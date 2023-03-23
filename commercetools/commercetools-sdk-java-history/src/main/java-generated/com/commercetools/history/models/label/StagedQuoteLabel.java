
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
 * StagedQuoteLabel
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteLabel stagedQuoteLabel = StagedQuoteLabel.builder()
 *             .key("{key}")
 *             .customer(customerBuilder -> customerBuilder)
 *             .quoteRequest(quoteRequestBuilder -> quoteRequestBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedQuoteLabelImpl.class)
public interface StagedQuoteLabel extends Label {

    String STAGED_QUOTE_LABEL = "StagedQuoteLabel";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *
     * @return customer
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public Reference getCustomer();

    /**
     *
     * @return quoteRequest
     */
    @NotNull
    @Valid
    @JsonProperty("quoteRequest")
    public Reference getQuoteRequest();

    public void setKey(final String key);

    public void setCustomer(final Reference customer);

    public void setQuoteRequest(final Reference quoteRequest);

    public static StagedQuoteLabel of() {
        return new StagedQuoteLabelImpl();
    }

    public static StagedQuoteLabel of(final StagedQuoteLabel template) {
        StagedQuoteLabelImpl instance = new StagedQuoteLabelImpl();
        instance.setKey(template.getKey());
        instance.setCustomer(template.getCustomer());
        instance.setQuoteRequest(template.getQuoteRequest());
        return instance;
    }

    public static StagedQuoteLabelBuilder builder() {
        return StagedQuoteLabelBuilder.of();
    }

    public static StagedQuoteLabelBuilder builder(final StagedQuoteLabel template) {
        return StagedQuoteLabelBuilder.of(template);
    }

    default <T> T withStagedQuoteLabel(Function<StagedQuoteLabel, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteLabel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteLabel>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteLabel>";
            }
        };
    }
}
