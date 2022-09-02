
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MethodTaxRateBuilder
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
public class MethodTaxRateBuilder implements Builder<MethodTaxRate> {

    private String shippingMethodKey;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxRate taxRate;

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     */

    public MethodTaxRateBuilder shippingMethodKey(final String shippingMethodKey) {
        this.shippingMethodKey = shippingMethodKey;
        return this;
    }

    /**
     *  <p>Tax Rate for the Shipping Method.</p>
     */

    public MethodTaxRateBuilder taxRate(
            Function<com.commercetools.api.models.tax_category.TaxRateBuilder, com.commercetools.api.models.tax_category.TaxRateBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.tax_category.TaxRateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Tax Rate for the Shipping Method.</p>
     */

    public MethodTaxRateBuilder taxRate(@Nullable final com.commercetools.api.models.tax_category.TaxRate taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    public String getShippingMethodKey() {
        return this.shippingMethodKey;
    }

    @Nullable
    public com.commercetools.api.models.tax_category.TaxRate getTaxRate() {
        return this.taxRate;
    }

    public MethodTaxRate build() {
        Objects.requireNonNull(shippingMethodKey, MethodTaxRate.class + ": shippingMethodKey is missing");
        return new MethodTaxRateImpl(shippingMethodKey, taxRate);
    }

    /**
     * builds MethodTaxRate without checking for non null required values
     */
    public MethodTaxRate buildUnchecked() {
        return new MethodTaxRateImpl(shippingMethodKey, taxRate);
    }

    public static MethodTaxRateBuilder of() {
        return new MethodTaxRateBuilder();
    }

    public static MethodTaxRateBuilder of(final MethodTaxRate template) {
        MethodTaxRateBuilder builder = new MethodTaxRateBuilder();
        builder.shippingMethodKey = template.getShippingMethodKey();
        builder.taxRate = template.getTaxRate();
        return builder;
    }

}
