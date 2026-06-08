
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
@io.vrap.rmf.base.client.utils.json.SubType("StagedQuoteLabel")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedQuoteLabelImpl.class)
public interface StagedQuoteLabel extends Label {

    /**
     * discriminator value for StagedQuoteLabel
     */
    String STAGED_QUOTE_LABEL = "StagedQuoteLabel";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>User-defined unique identifier of the Staged Quote.</p>
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
     *  <p>Quote Request related to the Staged Quote.</p>
     * @return quoteRequest
     */
    @NotNull
    @Valid
    @JsonProperty("quoteRequest")
    public Reference getQuoteRequest();

    /**
     *  <p>User-defined unique identifier of the Staged Quote.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>The <span>Buyer</span> who requested the Quote.</p>
     * @param customer value to be set
     */

    public void setCustomer(final Reference customer);

    /**
     *  <p>Quote Request related to the Staged Quote.</p>
     * @param quoteRequest value to be set
     */

    public void setQuoteRequest(final Reference quoteRequest);

    /**
     * factory method
     * @return instance of StagedQuoteLabel
     */
    public static StagedQuoteLabel of() {
        return new StagedQuoteLabelImpl();
    }

    /**
     * factory method to create a shallow copy StagedQuoteLabel
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedQuoteLabel of(final StagedQuoteLabel template) {
        StagedQuoteLabelImpl instance = new StagedQuoteLabelImpl();
        instance.setKey(template.getKey());
        instance.setCustomer(template.getCustomer());
        instance.setQuoteRequest(template.getQuoteRequest());
        return instance;
    }

    public StagedQuoteLabel copyDeep();

    /**
     * factory method to create a deep copy of StagedQuoteLabel
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedQuoteLabel deepCopy(@Nullable final StagedQuoteLabel template) {
        if (template == null) {
            return null;
        }
        StagedQuoteLabelImpl instance = new StagedQuoteLabelImpl();
        instance.setKey(template.getKey());
        instance.setCustomer(com.commercetools.history.models.common.Reference.deepCopy(template.getCustomer()));
        instance.setQuoteRequest(
            com.commercetools.history.models.common.Reference.deepCopy(template.getQuoteRequest()));
        return instance;
    }

    /**
     * builder factory method for StagedQuoteLabel
     * @return builder
     */
    public static StagedQuoteLabelBuilder builder() {
        return StagedQuoteLabelBuilder.of();
    }

    /**
     * create builder for StagedQuoteLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteLabelBuilder builder(final StagedQuoteLabel template) {
        return StagedQuoteLabelBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedQuoteLabel(Function<StagedQuoteLabel, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteLabel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteLabel>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteLabel>";
            }
        };
    }
}
