
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.tax_category.TaxRate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MethodTaxRate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MethodTaxRate methodTaxRate = MethodTaxRate.builder()
 *             .shippingMethodKey("{shippingMethodKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MethodTaxRateImpl.class)
public interface MethodTaxRate {

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @return shippingMethodKey
     */
    @NotNull
    @JsonProperty("shippingMethodKey")
    public String getShippingMethodKey();

    /**
     *  <p>Tax Rate for the Shipping Method.</p>
     * @return taxRate
     */
    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param shippingMethodKey value to be set
     */

    public void setShippingMethodKey(final String shippingMethodKey);

    /**
     *  <p>Tax Rate for the Shipping Method.</p>
     * @param taxRate value to be set
     */

    public void setTaxRate(final TaxRate taxRate);

    /**
     * factory method
     * @return instance of MethodTaxRate
     */
    public static MethodTaxRate of() {
        return new MethodTaxRateImpl();
    }

    /**
     * factory method to create a shallow copy MethodTaxRate
     * @param template instance to be copied
     * @return copy instance
     */
    public static MethodTaxRate of(final MethodTaxRate template) {
        MethodTaxRateImpl instance = new MethodTaxRateImpl();
        instance.setShippingMethodKey(template.getShippingMethodKey());
        instance.setTaxRate(template.getTaxRate());
        return instance;
    }

    /**
     * factory method to create a deep copy of MethodTaxRate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MethodTaxRate deepCopy(@Nullable final MethodTaxRate template) {
        if (template == null) {
            return null;
        }
        MethodTaxRateImpl instance = new MethodTaxRateImpl();
        instance.setShippingMethodKey(template.getShippingMethodKey());
        instance.setTaxRate(Optional.ofNullable(template.getTaxRate())
                .map(com.commercetools.api.models.tax_category.TaxRate::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for MethodTaxRate
     * @return builder
     */
    public static MethodTaxRateBuilder builder() {
        return MethodTaxRateBuilder.of();
    }

    /**
     * create builder for MethodTaxRate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MethodTaxRateBuilder builder(final MethodTaxRate template) {
        return MethodTaxRateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMethodTaxRate(Function<MethodTaxRate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MethodTaxRate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MethodTaxRate>() {
            @Override
            public String toString() {
                return "TypeReference<MethodTaxRate>";
            }
        };
    }
}
