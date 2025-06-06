
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.common.TypedMoneyDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * TaxedPriceDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxedPriceDraft taxedPriceDraft = TaxedPriceDraft.builder()
 *             .totalNet(totalNetBuilder -> totalNetBuilder)
 *             .totalGross(totalGrossBuilder -> totalGrossBuilder)
 *             .plusTaxPortions(taxPortionsBuilder -> taxPortionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TaxedPriceDraftImpl.class)
public interface TaxedPriceDraft extends io.vrap.rmf.base.client.Draft<TaxedPriceDraft> {

    /**
     *  <p>Total net price of the Cart or Order.</p>
     * @return totalNet
     */
    @NotNull
    @Valid
    @JsonProperty("totalNet")
    public Money getTotalNet();

    /**
     *  <p>Total gross price of the Cart or Order.</p>
     * @return totalGross
     */
    @NotNull
    @Valid
    @JsonProperty("totalGross")
    public Money getTotalGross();

    /**
     *  <p>Taxable portions added to the <code>totalGross</code>.</p>
     *  <p>Calculated from the TaxRates.</p>
     * @return taxPortions
     */
    @NotNull
    @Valid
    @JsonProperty("taxPortions")
    public List<TaxPortionDraft> getTaxPortions();

    /**
     *  <p>Total tax applicable for the Cart or Order.</p>
     * @return totalTax
     */
    @Valid
    @JsonProperty("totalTax")
    public TypedMoneyDraft getTotalTax();

    /**
     *  <p>Total net price of the Cart or Order.</p>
     * @param totalNet value to be set
     */

    public void setTotalNet(final Money totalNet);

    /**
     *  <p>Total gross price of the Cart or Order.</p>
     * @param totalGross value to be set
     */

    public void setTotalGross(final Money totalGross);

    /**
     *  <p>Taxable portions added to the <code>totalGross</code>.</p>
     *  <p>Calculated from the TaxRates.</p>
     * @param taxPortions values to be set
     */

    @JsonIgnore
    public void setTaxPortions(final TaxPortionDraft... taxPortions);

    /**
     *  <p>Taxable portions added to the <code>totalGross</code>.</p>
     *  <p>Calculated from the TaxRates.</p>
     * @param taxPortions values to be set
     */

    public void setTaxPortions(final List<TaxPortionDraft> taxPortions);

    /**
     *  <p>Total tax applicable for the Cart or Order.</p>
     * @param totalTax value to be set
     */

    public void setTotalTax(final TypedMoneyDraft totalTax);

    /**
     * factory method
     * @return instance of TaxedPriceDraft
     */
    public static TaxedPriceDraft of() {
        return new TaxedPriceDraftImpl();
    }

    /**
     * factory method to create a shallow copy TaxedPriceDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static TaxedPriceDraft of(final TaxedPriceDraft template) {
        TaxedPriceDraftImpl instance = new TaxedPriceDraftImpl();
        instance.setTotalNet(template.getTotalNet());
        instance.setTotalGross(template.getTotalGross());
        instance.setTaxPortions(template.getTaxPortions());
        instance.setTotalTax(template.getTotalTax());
        return instance;
    }

    public TaxedPriceDraft copyDeep();

    /**
     * factory method to create a deep copy of TaxedPriceDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TaxedPriceDraft deepCopy(@Nullable final TaxedPriceDraft template) {
        if (template == null) {
            return null;
        }
        TaxedPriceDraftImpl instance = new TaxedPriceDraftImpl();
        instance.setTotalNet(com.commercetools.api.models.common.Money.deepCopy(template.getTotalNet()));
        instance.setTotalGross(com.commercetools.api.models.common.Money.deepCopy(template.getTotalGross()));
        instance.setTaxPortions(Optional.ofNullable(template.getTaxPortions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.TaxPortionDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setTotalTax(com.commercetools.api.models.common.TypedMoneyDraft.deepCopy(template.getTotalTax()));
        return instance;
    }

    /**
     * builder factory method for TaxedPriceDraft
     * @return builder
     */
    public static TaxedPriceDraftBuilder builder() {
        return TaxedPriceDraftBuilder.of();
    }

    /**
     * create builder for TaxedPriceDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxedPriceDraftBuilder builder(final TaxedPriceDraft template) {
        return TaxedPriceDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTaxedPriceDraft(Function<TaxedPriceDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TaxedPriceDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxedPriceDraft>() {
            @Override
            public String toString() {
                return "TypeReference<TaxedPriceDraft>";
            }
        };
    }
}
