
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.TaxRate;
import com.commercetools.history.models.common.TaxedPrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodTaxAmountChangeValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodTaxAmountChangeValue shippingMethodTaxAmountChangeValue = ShippingMethodTaxAmountChangeValue.builder()
 *             .taxedPrice(taxedPriceBuilder -> taxedPriceBuilder)
 *             .taxRate(taxRateBuilder -> taxRateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodTaxAmountChangeValueImpl.class)
public interface ShippingMethodTaxAmountChangeValue {

    /**
     *  <p>Taxed price for the Shipping Method based on <code>taxRate</code>.</p>
     * @return taxedPrice
     */
    @NotNull
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedPrice getTaxedPrice();

    /**
     *  <p>Tax rate set externally for the Shipping Method.</p>
     * @return taxRate
     */
    @NotNull
    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();

    /**
     *  <p>Taxed price for the Shipping Method based on <code>taxRate</code>.</p>
     * @param taxedPrice value to be set
     */

    public void setTaxedPrice(final TaxedPrice taxedPrice);

    /**
     *  <p>Tax rate set externally for the Shipping Method.</p>
     * @param taxRate value to be set
     */

    public void setTaxRate(final TaxRate taxRate);

    /**
     * factory method
     * @return instance of ShippingMethodTaxAmountChangeValue
     */
    public static ShippingMethodTaxAmountChangeValue of() {
        return new ShippingMethodTaxAmountChangeValueImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodTaxAmountChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodTaxAmountChangeValue of(final ShippingMethodTaxAmountChangeValue template) {
        ShippingMethodTaxAmountChangeValueImpl instance = new ShippingMethodTaxAmountChangeValueImpl();
        instance.setTaxedPrice(template.getTaxedPrice());
        instance.setTaxRate(template.getTaxRate());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShippingMethodTaxAmountChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodTaxAmountChangeValue deepCopy(
            @Nullable final ShippingMethodTaxAmountChangeValue template) {
        if (template == null) {
            return null;
        }
        ShippingMethodTaxAmountChangeValueImpl instance = new ShippingMethodTaxAmountChangeValueImpl();
        instance.setTaxedPrice(com.commercetools.history.models.common.TaxedPrice.deepCopy(template.getTaxedPrice()));
        instance.setTaxRate(com.commercetools.history.models.common.TaxRate.deepCopy(template.getTaxRate()));
        return instance;
    }

    /**
     * builder factory method for ShippingMethodTaxAmountChangeValue
     * @return builder
     */
    public static ShippingMethodTaxAmountChangeValueBuilder builder() {
        return ShippingMethodTaxAmountChangeValueBuilder.of();
    }

    /**
     * create builder for ShippingMethodTaxAmountChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodTaxAmountChangeValueBuilder builder(final ShippingMethodTaxAmountChangeValue template) {
        return ShippingMethodTaxAmountChangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodTaxAmountChangeValue(Function<ShippingMethodTaxAmountChangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodTaxAmountChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodTaxAmountChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodTaxAmountChangeValue>";
            }
        };
    }
}
