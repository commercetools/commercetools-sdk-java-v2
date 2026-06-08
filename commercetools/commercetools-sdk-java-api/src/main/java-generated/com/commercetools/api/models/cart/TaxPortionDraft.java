
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Represents the portions that sum up to the <code>totalGross</code> field of a <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxedPrice" rel="nofollow">TaxedPrice</a>.</p>
 *  <p>The portions are calculated from the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRates</a>. If a Tax Rate has <a href="https://docs.commercetools.com/apis/ctp:api:type:SubRate" rel="nofollow">SubRates</a>, they are used and can be identified by name. Tax portions from Line Items with the same <code>rate</code> and <code>name</code> will be accumulated to the same tax portion.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxPortionDraft taxPortionDraft = TaxPortionDraft.builder()
 *             .rate(0.3)
 *             .amount(amountBuilder -> amountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TaxPortionDraftImpl.class)
public interface TaxPortionDraft extends io.vrap.rmf.base.client.Draft<TaxPortionDraft> {

    /**
     *  <p>Name of the tax portion.</p>
     * @return name
     */

    @JsonProperty("name")
    public String getName();

    /**
     *  <p>A number in the range 0-1.</p>
     * @return rate
     */
    @NotNull
    @JsonProperty("rate")
    public Double getRate();

    /**
     *  <p>Money value for the tax portion.</p>
     * @return amount
     */
    @NotNull
    @Valid
    @JsonProperty("amount")
    public Money getAmount();

    /**
     *  <p>Name of the tax portion.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>A number in the range 0-1.</p>
     * @param rate value to be set
     */

    public void setRate(final Double rate);

    /**
     *  <p>Money value for the tax portion.</p>
     * @param amount value to be set
     */

    public void setAmount(final Money amount);

    /**
     * factory method
     * @return instance of TaxPortionDraft
     */
    public static TaxPortionDraft of() {
        return new TaxPortionDraftImpl();
    }

    /**
     * factory method to create a shallow copy TaxPortionDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static TaxPortionDraft of(final TaxPortionDraft template) {
        TaxPortionDraftImpl instance = new TaxPortionDraftImpl();
        instance.setName(template.getName());
        instance.setRate(template.getRate());
        instance.setAmount(template.getAmount());
        return instance;
    }

    public TaxPortionDraft copyDeep();

    /**
     * factory method to create a deep copy of TaxPortionDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TaxPortionDraft deepCopy(@Nullable final TaxPortionDraft template) {
        if (template == null) {
            return null;
        }
        TaxPortionDraftImpl instance = new TaxPortionDraftImpl();
        instance.setName(template.getName());
        instance.setRate(template.getRate());
        instance.setAmount(com.commercetools.api.models.common.Money.deepCopy(template.getAmount()));
        return instance;
    }

    /**
     * builder factory method for TaxPortionDraft
     * @return builder
     */
    public static TaxPortionDraftBuilder builder() {
        return TaxPortionDraftBuilder.of();
    }

    /**
     * create builder for TaxPortionDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxPortionDraftBuilder builder(final TaxPortionDraft template) {
        return TaxPortionDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTaxPortionDraft(Function<TaxPortionDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TaxPortionDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxPortionDraft>() {
            @Override
            public String toString() {
                return "TypeReference<TaxPortionDraft>";
            }
        };
    }
}
