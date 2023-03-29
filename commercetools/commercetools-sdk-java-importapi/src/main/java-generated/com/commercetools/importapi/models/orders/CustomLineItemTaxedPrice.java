
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.TypedMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomLineItemTaxedPrice
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomLineItemTaxedPrice customLineItemTaxedPrice = CustomLineItemTaxedPrice.builder()
 *             .totalNet(totalNetBuilder -> totalNetBuilder)
 *             .totalGross(totalGrossBuilder -> totalGrossBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomLineItemTaxedPriceImpl.class)
public interface CustomLineItemTaxedPrice {

    /**
     *
     * @return totalNet
     */
    @NotNull
    @Valid
    @JsonProperty("totalNet")
    public TypedMoney getTotalNet();

    /**
     *
     * @return totalGross
     */
    @NotNull
    @Valid
    @JsonProperty("totalGross")
    public TypedMoney getTotalGross();

    /**
     * set totalNet
     * @param totalNet value to be set
     */

    public void setTotalNet(final TypedMoney totalNet);

    /**
     * set totalGross
     * @param totalGross value to be set
     */

    public void setTotalGross(final TypedMoney totalGross);

    /**
     * factory method
     * @return instance of CustomLineItemTaxedPrice
     */
    public static CustomLineItemTaxedPrice of() {
        return new CustomLineItemTaxedPriceImpl();
    }

    /**
     * factory method to create a shallow copy CustomLineItemTaxedPrice
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomLineItemTaxedPrice of(final CustomLineItemTaxedPrice template) {
        CustomLineItemTaxedPriceImpl instance = new CustomLineItemTaxedPriceImpl();
        instance.setTotalNet(template.getTotalNet());
        instance.setTotalGross(template.getTotalGross());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomLineItemTaxedPrice
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomLineItemTaxedPrice deepCopy(@Nullable final CustomLineItemTaxedPrice template) {
        if (template == null) {
            return null;
        }
        CustomLineItemTaxedPriceImpl instance = new CustomLineItemTaxedPriceImpl();
        instance.setTotalNet(Optional.ofNullable(template.getTotalNet())
                .map(com.commercetools.importapi.models.common.TypedMoney::deepCopy)
                .orElse(null));
        instance.setTotalGross(Optional.ofNullable(template.getTotalGross())
                .map(com.commercetools.importapi.models.common.TypedMoney::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CustomLineItemTaxedPrice
     * @return builder
     */
    public static CustomLineItemTaxedPriceBuilder builder() {
        return CustomLineItemTaxedPriceBuilder.of();
    }

    /**
     * create builder for CustomLineItemTaxedPrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomLineItemTaxedPriceBuilder builder(final CustomLineItemTaxedPrice template) {
        return CustomLineItemTaxedPriceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomLineItemTaxedPrice(Function<CustomLineItemTaxedPrice, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomLineItemTaxedPrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomLineItemTaxedPrice>() {
            @Override
            public String toString() {
                return "TypeReference<CustomLineItemTaxedPrice>";
            }
        };
    }
}
