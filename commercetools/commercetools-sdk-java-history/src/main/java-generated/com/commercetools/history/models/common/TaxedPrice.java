
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

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
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TaxedPriceImpl.class)
public interface TaxedPrice {

    /**
     *
     * @return totalNet
     */
    @NotNull
    @Valid
    @JsonProperty("totalNet")
    public Money getTotalNet();

    /**
     *
     * @return totalGross
     */
    @NotNull
    @Valid
    @JsonProperty("totalGross")
    public Money getTotalGross();

    /**
     * set totalNet
     * @param totalNet value to be set
     */

    public void setTotalNet(final Money totalNet);

    /**
     * set totalGross
     * @param totalGross value to be set
     */

    public void setTotalGross(final Money totalGross);

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
        instance.setTotalNet(com.commercetools.history.models.common.Money.deepCopy(template.getTotalNet()));
        instance.setTotalGross(com.commercetools.history.models.common.Money.deepCopy(template.getTotalGross()));
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
