
package com.commercetools.api.models.cart;

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
 * MethodTaxedPrice
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MethodTaxedPrice methodTaxedPrice = MethodTaxedPrice.builder()
 *             .shippingMethodKey("{shippingMethodKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MethodTaxedPriceImpl.class)
public interface MethodTaxedPrice {

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @return shippingMethodKey
     */
    @NotNull
    @JsonProperty("shippingMethodKey")
    public String getShippingMethodKey();

    /**
     *  <p>Total taxed price based on the quantity of the Line Item or Custom Line Item assigned to the Shipping Method identified by <code>shippingMethodKey</code>.</p>
     * @return taxedPrice
     */
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedItemPrice getTaxedPrice();

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param shippingMethodKey value to be set
     */

    public void setShippingMethodKey(final String shippingMethodKey);

    /**
     *  <p>Total taxed price based on the quantity of the Line Item or Custom Line Item assigned to the Shipping Method identified by <code>shippingMethodKey</code>.</p>
     * @param taxedPrice value to be set
     */

    public void setTaxedPrice(final TaxedItemPrice taxedPrice);

    /**
     * factory method
     * @return instance of MethodTaxedPrice
     */
    public static MethodTaxedPrice of() {
        return new MethodTaxedPriceImpl();
    }

    /**
     * factory method to create a shallow copy MethodTaxedPrice
     * @param template instance to be copied
     * @return copy instance
     */
    public static MethodTaxedPrice of(final MethodTaxedPrice template) {
        MethodTaxedPriceImpl instance = new MethodTaxedPriceImpl();
        instance.setShippingMethodKey(template.getShippingMethodKey());
        instance.setTaxedPrice(template.getTaxedPrice());
        return instance;
    }

    /**
     * factory method to create a deep copy of MethodTaxedPrice
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MethodTaxedPrice deepCopy(@Nullable final MethodTaxedPrice template) {
        if (template == null) {
            return null;
        }
        MethodTaxedPriceImpl instance = new MethodTaxedPriceImpl();
        instance.setShippingMethodKey(template.getShippingMethodKey());
        instance.setTaxedPrice(com.commercetools.api.models.cart.TaxedItemPrice.deepCopy(template.getTaxedPrice()));
        return instance;
    }

    /**
     * builder factory method for MethodTaxedPrice
     * @return builder
     */
    public static MethodTaxedPriceBuilder builder() {
        return MethodTaxedPriceBuilder.of();
    }

    /**
     * create builder for MethodTaxedPrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MethodTaxedPriceBuilder builder(final MethodTaxedPrice template) {
        return MethodTaxedPriceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMethodTaxedPrice(Function<MethodTaxedPrice, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MethodTaxedPrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MethodTaxedPrice>() {
            @Override
            public String toString() {
                return "TypeReference<MethodTaxedPrice>";
            }
        };
    }
}
