
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Represents the portions that sum up to the <code>totalGross</code> field of a TaxedPrice.</p>
 *  <p>The portions are calculated from the TaxRates. If a Tax Rate has SubRates, they are used and can be identified by name. Tax portions from Line Items with the same <code>rate</code> and <code>name</code> will be accumulated to the same tax portion.</p>
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

    public void setName(final String name);

    public void setRate(final Double rate);

    public void setAmount(final Money amount);

    public static TaxPortionDraft of() {
        return new TaxPortionDraftImpl();
    }

    public static TaxPortionDraft of(final TaxPortionDraft template) {
        TaxPortionDraftImpl instance = new TaxPortionDraftImpl();
        instance.setName(template.getName());
        instance.setRate(template.getRate());
        instance.setAmount(template.getAmount());
        return instance;
    }

    public static TaxPortionDraftBuilder builder() {
        return TaxPortionDraftBuilder.of();
    }

    public static TaxPortionDraftBuilder builder(final TaxPortionDraft template) {
        return TaxPortionDraftBuilder.of(template);
    }

    default <T> T withTaxPortionDraft(Function<TaxPortionDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TaxPortionDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxPortionDraft>() {
            @Override
            public String toString() {
                return "TypeReference<TaxPortionDraft>";
            }
        };
    }
}
