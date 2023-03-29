
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
 * TaxedPrice
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxedPrice taxedPrice = TaxedPrice.builder()
 *             .totalNet(totalNetBuilder -> totalNetBuilder)
 *             .totalGross(totalGrossBuilder -> totalGrossBuilder)
 *             .plusTaxPortions(taxPortionsBuilder -> taxPortionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TaxedPriceImpl.class)
public interface TaxedPrice {

    /**
     *  <p>Total net price of the Cart or Order.</p>
     * @return totalNet
     */
    @NotNull
    @Valid
    @JsonProperty("totalNet")
    public CentPrecisionMoney getTotalNet();

    /**
     *  <p>Total gross price of the Cart or Order.</p>
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
     *  <p>Total tax applicable for the Cart or Order.</p>
     *  <p>Automatically calculated as the difference between the <code>totalGross</code> and <code>totalNet</code> values.</p>
     * @return totalTax
     */
    @Valid
    @JsonProperty("totalTax")
    public CentPrecisionMoney getTotalTax();

    /**
     *  <p>Total net price of the Cart or Order.</p>
     * @param totalNet value to be set
     */

    public void setTotalNet(final CentPrecisionMoney totalNet);

    /**
     *  <p>Total gross price of the Cart or Order.</p>
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
     *  <p>Total tax applicable for the Cart or Order.</p>
     *  <p>Automatically calculated as the difference between the <code>totalGross</code> and <code>totalNet</code> values.</p>
     * @param totalTax value to be set
     */

    public void setTotalTax(final CentPrecisionMoney totalTax);

    /**
     * factory method
     * @return instance of TaxedPrice
     */
    public static TaxedPrice of() {
        return new TaxedPriceImpl();
    }

    /**
     * factory method to create a shallow copy TaxedPrice
     * @param template instance to be copied
     * @return copy instance
     */
    public static TaxedPrice of(final TaxedPrice template) {
        TaxedPriceImpl instance = new TaxedPriceImpl();
        instance.setTotalNet(template.getTotalNet());
        instance.setTotalGross(template.getTotalGross());
        instance.setTaxPortions(template.getTaxPortions());
        instance.setTotalTax(template.getTotalTax());
        return instance;
    }

    /**
     * factory method to create a deep copy of TaxedPrice
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TaxedPrice deepCopy(@Nullable final TaxedPrice template) {
        if (template == null) {
            return null;
        }
        TaxedPriceImpl instance = new TaxedPriceImpl();
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
     * builder factory method for TaxedPrice
     * @return builder
     */
    public static TaxedPriceBuilder builder() {
        return TaxedPriceBuilder.of();
    }

    /**
     * create builder for TaxedPrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxedPriceBuilder builder(final TaxedPrice template) {
        return TaxedPriceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTaxedPrice(Function<TaxedPrice, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TaxedPrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxedPrice>() {
            @Override
            public String toString() {
                return "TypeReference<TaxedPrice>";
            }
        };
    }
}
