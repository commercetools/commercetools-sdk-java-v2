
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.CentPrecisionMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxedItemPrice
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxedItemPrice taxedItemPrice = TaxedItemPrice.builder()
 *             .totalNet(totalNetBuilder -> totalNetBuilder)
 *             .totalGross(totalGrossBuilder -> totalGrossBuilder)
 *             .plusTaxPortions(taxPortionsBuilder -> taxPortionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TaxedItemPriceImpl.class)
public interface TaxedItemPrice {

    /**
     *  <p>Total net amount of the Line Item or Custom Line Item.</p>
     * @return totalNet
     */
    @NotNull
    @Valid
    @JsonProperty("totalNet")
    public CentPrecisionMoney getTotalNet();

    /**
     *  <p>Total gross amount of the Line Item or Custom Line Item.</p>
     * @return totalGross
     */
    @NotNull
    @Valid
    @JsonProperty("totalGross")
    public CentPrecisionMoney getTotalGross();

    /**
     *  <p>Taxable portions added to the total net price.</p>
     *  <p>Calculated from the TaxRates.</p>
     * @return taxPortions
     */
    @NotNull
    @Valid
    @JsonProperty("taxPortions")
    public List<TaxPortion> getTaxPortions();

    /**
     *  <p>Total tax applicable for the Line Item or Custom Line Item. Automatically calculated as the difference between the <code>totalGross</code> and <code>totalNet</code> values.</p>
     * @return totalTax
     */
    @Valid
    @JsonProperty("totalTax")
    public CentPrecisionMoney getTotalTax();

    /**
     *  <p>Total net amount of the Line Item or Custom Line Item.</p>
     * @param totalNet value to be set
     */

    public void setTotalNet(final CentPrecisionMoney totalNet);

    /**
     *  <p>Total gross amount of the Line Item or Custom Line Item.</p>
     * @param totalGross value to be set
     */

    public void setTotalGross(final CentPrecisionMoney totalGross);

    /**
     *  <p>Taxable portions added to the total net price.</p>
     *  <p>Calculated from the TaxRates.</p>
     * @param taxPortions values to be set
     */

    @JsonIgnore
    public void setTaxPortions(final TaxPortion... taxPortions);

    /**
     *  <p>Taxable portions added to the total net price.</p>
     *  <p>Calculated from the TaxRates.</p>
     * @param taxPortions values to be set
     */

    public void setTaxPortions(final List<TaxPortion> taxPortions);

    /**
     *  <p>Total tax applicable for the Line Item or Custom Line Item. Automatically calculated as the difference between the <code>totalGross</code> and <code>totalNet</code> values.</p>
     * @param totalTax value to be set
     */

    public void setTotalTax(final CentPrecisionMoney totalTax);

    /**
     * factory method
     * @return instance of TaxedItemPrice
     */
    public static TaxedItemPrice of() {
        return new TaxedItemPriceImpl();
    }

    /**
     * factory method to create a shallow copy TaxedItemPrice
     * @param template instance to be copied
     * @return copy instance
     */
    public static TaxedItemPrice of(final TaxedItemPrice template) {
        TaxedItemPriceImpl instance = new TaxedItemPriceImpl();
        instance.setTotalNet(template.getTotalNet());
        instance.setTotalGross(template.getTotalGross());
        instance.setTaxPortions(template.getTaxPortions());
        instance.setTotalTax(template.getTotalTax());
        return instance;
    }

    /**
     * factory method to create a deep copy of TaxedItemPrice
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TaxedItemPrice deepCopy(@Nullable final TaxedItemPrice template) {
        if (template == null) {
            return null;
        }
        TaxedItemPriceImpl instance = new TaxedItemPriceImpl();
        instance.setTotalNet(com.commercetools.api.models.common.CentPrecisionMoney.deepCopy(template.getTotalNet()));
        instance.setTotalGross(
            com.commercetools.api.models.common.CentPrecisionMoney.deepCopy(template.getTotalGross()));
        instance.setTaxPortions(Optional.ofNullable(template.getTaxPortions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.TaxPortion::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setTotalTax(com.commercetools.api.models.common.CentPrecisionMoney.deepCopy(template.getTotalTax()));
        return instance;
    }

    /**
     * builder factory method for TaxedItemPrice
     * @return builder
     */
    public static TaxedItemPriceBuilder builder() {
        return TaxedItemPriceBuilder.of();
    }

    /**
     * create builder for TaxedItemPrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxedItemPriceBuilder builder(final TaxedItemPrice template) {
        return TaxedItemPriceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTaxedItemPrice(Function<TaxedItemPrice, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TaxedItemPrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxedItemPrice>() {
            @Override
            public String toString() {
                return "TypeReference<TaxedItemPrice>";
            }
        };
    }
}
