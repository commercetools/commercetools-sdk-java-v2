
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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
     */
    @NotNull
    @JsonProperty("shippingMethodKey")
    public String getShippingMethodKey();

    /**
     *  <p>Tax Rate for the Shipping Method.</p>
     */
    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();

    public void setShippingMethodKey(final String shippingMethodKey);

    public void setTaxRate(final TaxRate taxRate);

    public static MethodTaxRate of() {
        return new MethodTaxRateImpl();
    }

    public static MethodTaxRate of(final MethodTaxRate template) {
        MethodTaxRateImpl instance = new MethodTaxRateImpl();
        instance.setShippingMethodKey(template.getShippingMethodKey());
        instance.setTaxRate(template.getTaxRate());
        return instance;
    }

    public static MethodTaxRateBuilder builder() {
        return MethodTaxRateBuilder.of();
    }

    public static MethodTaxRateBuilder builder(final MethodTaxRate template) {
        return MethodTaxRateBuilder.of(template);
    }

    default <T> T withMethodTaxRate(Function<MethodTaxRate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MethodTaxRate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MethodTaxRate>() {
            @Override
            public String toString() {
                return "TypeReference<MethodTaxRate>";
            }
        };
    }
}
