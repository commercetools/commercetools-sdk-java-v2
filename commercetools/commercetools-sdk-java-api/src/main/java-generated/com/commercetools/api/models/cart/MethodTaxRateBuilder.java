
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
     * @param shippingMethodKey value to be set
     * @return Builder
     */

    public MethodTaxRateBuilder shippingMethodKey(final String shippingMethodKey) {
        this.shippingMethodKey = shippingMethodKey;
        return this;
    }

    /**
     *  <p>Tax Rate for the Shipping Method.</p>
     * @param builder function to build the taxRate value
     * @return Builder
     */

    public MethodTaxRateBuilder taxRate(
            Function<com.commercetools.api.models.tax_category.TaxRateBuilder, com.commercetools.api.models.tax_category.TaxRateBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.tax_category.TaxRateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Tax Rate for the Shipping Method.</p>
     * @param taxRate value to be set
     * @return Builder
     */

    public MethodTaxRateBuilder taxRate(@Nullable final com.commercetools.api.models.tax_category.TaxRate taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @return shippingMethodKey
     */

    public String getShippingMethodKey() {
        return this.shippingMethodKey;
    }

    /**
     *  <p>Tax Rate for the Shipping Method.</p>
     * @return taxRate
     */

    @Nullable
    public com.commercetools.api.models.tax_category.TaxRate getTaxRate() {
        return this.taxRate;
    }

    /**
     * builds MethodTaxRate with checking for non-null required values
     * @return MethodTaxRate
     */
    public MethodTaxRate build() {
        Objects.requireNonNull(shippingMethodKey, MethodTaxRate.class + ": shippingMethodKey is missing");
        return new MethodTaxRateImpl(shippingMethodKey, taxRate);
    }

    /**
     * builds MethodTaxRate without checking for non-null required values
     * @return MethodTaxRate
     */
    public MethodTaxRate buildUnchecked() {
        return new MethodTaxRateImpl(shippingMethodKey, taxRate);
    }

    /**
     * factory method for an instance of MethodTaxRateBuilder
     * @return builder
     */
    public static MethodTaxRateBuilder of() {
        return new MethodTaxRateBuilder();
    }

    /**
     * create builder for MethodTaxRate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MethodTaxRateBuilder of(final MethodTaxRate template) {
        MethodTaxRateBuilder builder = new MethodTaxRateBuilder();
        builder.shippingMethodKey = template.getShippingMethodKey();
        builder.taxRate = template.getTaxRate();
        return builder;
    }

}
