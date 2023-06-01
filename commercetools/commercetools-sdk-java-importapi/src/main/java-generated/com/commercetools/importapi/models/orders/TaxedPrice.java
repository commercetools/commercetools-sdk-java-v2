package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.Money;
import com.commercetools.importapi.models.orders.TaxPortion;
import com.commercetools.importapi.models.orders.TaxedPriceImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = TaxedPriceImpl.class)
public interface TaxedPrice  {


    /**
     *  <p>Maps to <code>TaxedPrice.totalNet</code>.</p>
     * @return totalNet
     */
    @NotNull
    @Valid
    @JsonProperty("totalNet")
    public Money getTotalNet();
    /**
     *  <p>Maps to <code>TaxedPrice.totalGross</code>.</p>
     * @return totalGross
     */
    @NotNull
    @Valid
    @JsonProperty("totalGross")
    public Money getTotalGross();
    /**
     *  <p>Maps to <code>TaxedPrice.taxPortions</code>.</p>
     * @return taxPortions
     */
    @NotNull
    @Valid
    @JsonProperty("taxPortions")
    public List<TaxPortion> getTaxPortions();

    /**
     *  <p>Maps to <code>TaxedPrice.totalNet</code>.</p>
     * @param totalNet value to be set
     */
    
    public void setTotalNet(final Money totalNet);
    
    
    /**
     *  <p>Maps to <code>TaxedPrice.totalGross</code>.</p>
     * @param totalGross value to be set
     */
    
    public void setTotalGross(final Money totalGross);
    
    
    /**
     *  <p>Maps to <code>TaxedPrice.taxPortions</code>.</p>
     * @param taxPortions values to be set
     */
    
    @JsonIgnore
    public void setTaxPortions(final TaxPortion ...taxPortions);
    /**
     *  <p>Maps to <code>TaxedPrice.taxPortions</code>.</p>
     * @param taxPortions values to be set
     */
    
    public void setTaxPortions(final List<TaxPortion> taxPortions);

    /**
     * factory method
     * @return instance of TaxedPrice
     */
    public static TaxedPrice of(){
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
        instance.setTotalNet(com.commercetools.importapi.models.common.Money.deepCopy(template.getTotalNet()));
        instance.setTotalGross(com.commercetools.importapi.models.common.Money.deepCopy(template.getTotalGross()));
        instance.setTaxPortions(Optional.ofNullable(template.getTaxPortions())
                .map(t -> t.stream().map(com.commercetools.importapi.models.orders.TaxPortion::deepCopy).collect(Collectors.toList()))
                .orElse(null));
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
