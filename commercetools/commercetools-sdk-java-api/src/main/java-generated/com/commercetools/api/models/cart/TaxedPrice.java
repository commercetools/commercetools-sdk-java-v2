
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    public void setTotalNet(final CentPrecisionMoney totalNet);

    public void setTotalGross(final CentPrecisionMoney totalGross);

    @JsonIgnore
    public void setTaxPortions(final TaxPortion... taxPortions);

    public void setTaxPortions(final List<TaxPortion> taxPortions);

    public void setTotalTax(final CentPrecisionMoney totalTax);

    public static TaxedPrice of() {
        return new TaxedPriceImpl();
    }

    public static TaxedPrice of(final TaxedPrice template) {
        TaxedPriceImpl instance = new TaxedPriceImpl();
        instance.setTotalNet(template.getTotalNet());
        instance.setTotalGross(template.getTotalGross());
        instance.setTaxPortions(template.getTaxPortions());
        instance.setTotalTax(template.getTotalTax());
        return instance;
    }

    public static TaxedPriceBuilder builder() {
        return TaxedPriceBuilder.of();
    }

    public static TaxedPriceBuilder builder(final TaxedPrice template) {
        return TaxedPriceBuilder.of(template);
    }

    default <T> T withTaxedPrice(Function<TaxedPrice, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TaxedPrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxedPrice>() {
            @Override
            public String toString() {
                return "TypeReference<TaxedPrice>";
            }
        };
    }
}
