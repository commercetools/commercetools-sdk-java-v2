
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
     *  <p>Total net price of the Line Item or Custom Line Item.</p>
     * @return totalNet
     */
    @NotNull
    @Valid
    @JsonProperty("totalNet")
    public Money getTotalNet();

    /**
     *  <p>Total gross price of the Line Item or Custom Line Item.</p>
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
     *  <p>Total net price of the Line Item or Custom Line Item.</p>
     * @param totalNet value to be set
     */

    public void setTotalNet(final Money totalNet);

    /**
     *  <p>Total gross price of the Line Item or Custom Line Item.</p>
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
        return instance;
    }

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
        instance.setTotalNet(Optional.ofNullable(template.getTotalNet())
                .map(com.commercetools.api.models.common.Money::deepCopy)
                .orElse(null));
        instance.setTotalGross(Optional.ofNullable(template.getTotalGross())
                .map(com.commercetools.api.models.common.Money::deepCopy)
                .orElse(null));
        instance.setTaxPortions(Optional.ofNullable(template.getTaxPortions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.TaxPortionDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
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
