
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

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
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TaxedItemPriceImpl.class)
public interface TaxedItemPrice {

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
        return instance;
    }

    public TaxedItemPrice copyDeep();

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
        instance.setTotalNet(com.commercetools.history.models.common.Money.deepCopy(template.getTotalNet()));
        instance.setTotalGross(com.commercetools.history.models.common.Money.deepCopy(template.getTotalGross()));
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
