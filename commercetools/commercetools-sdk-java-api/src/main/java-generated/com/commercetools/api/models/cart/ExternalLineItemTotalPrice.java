
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExternalLineItemTotalPrice
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExternalLineItemTotalPrice externalLineItemTotalPrice = ExternalLineItemTotalPrice.builder()
 *             .price(priceBuilder -> priceBuilder)
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExternalLineItemTotalPriceImpl.class)
public interface ExternalLineItemTotalPrice {

    /**
     *  <p>Price of the Line Item.</p>
     * @return price
     */
    @NotNull
    @Valid
    @JsonProperty("price")
    public Money getPrice();

    /**
     *  <p>Total price of the Line Item.</p>
     * @return totalPrice
     */
    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public Money getTotalPrice();

    /**
     *  <p>Price of the Line Item.</p>
     * @param price value to be set
     */

    public void setPrice(final Money price);

    /**
     *  <p>Total price of the Line Item.</p>
     * @param totalPrice value to be set
     */

    public void setTotalPrice(final Money totalPrice);

    /**
     * factory method
     * @return instance of ExternalLineItemTotalPrice
     */
    public static ExternalLineItemTotalPrice of() {
        return new ExternalLineItemTotalPriceImpl();
    }

    /**
     * factory method to create a shallow copy ExternalLineItemTotalPrice
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExternalLineItemTotalPrice of(final ExternalLineItemTotalPrice template) {
        ExternalLineItemTotalPriceImpl instance = new ExternalLineItemTotalPriceImpl();
        instance.setPrice(template.getPrice());
        instance.setTotalPrice(template.getTotalPrice());
        return instance;
    }

    /**
     * factory method to create a deep copy of ExternalLineItemTotalPrice
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExternalLineItemTotalPrice deepCopy(@Nullable final ExternalLineItemTotalPrice template) {
        if (template == null) {
            return null;
        }
        ExternalLineItemTotalPriceImpl instance = new ExternalLineItemTotalPriceImpl();
        instance.setPrice(com.commercetools.api.models.common.Money.deepCopy(template.getPrice()));
        instance.setTotalPrice(com.commercetools.api.models.common.Money.deepCopy(template.getTotalPrice()));
        return instance;
    }

    /**
     * builder factory method for ExternalLineItemTotalPrice
     * @return builder
     */
    public static ExternalLineItemTotalPriceBuilder builder() {
        return ExternalLineItemTotalPriceBuilder.of();
    }

    /**
     * create builder for ExternalLineItemTotalPrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExternalLineItemTotalPriceBuilder builder(final ExternalLineItemTotalPrice template) {
        return ExternalLineItemTotalPriceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExternalLineItemTotalPrice(Function<ExternalLineItemTotalPrice, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExternalLineItemTotalPrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExternalLineItemTotalPrice>() {
            @Override
            public String toString() {
                return "TypeReference<ExternalLineItemTotalPrice>";
            }
        };
    }
}
