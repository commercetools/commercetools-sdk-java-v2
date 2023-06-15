
package com.commercetools.history.models.change_value;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodTaxAmountChangeValueBuilder
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
public class ShippingMethodTaxAmountChangeValueBuilder implements Builder<ShippingMethodTaxAmountChangeValue> {

    private com.commercetools.history.models.common.TaxedPrice taxedPrice;

    private com.commercetools.history.models.common.TaxRate taxRate;

    /**
     *  <p>Taxed price for the Shipping Method based on <code>taxRate</code>.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public ShippingMethodTaxAmountChangeValueBuilder taxedPrice(
            Function<com.commercetools.history.models.common.TaxedPriceBuilder, com.commercetools.history.models.common.TaxedPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.history.models.common.TaxedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Taxed price for the Shipping Method based on <code>taxRate</code>.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public ShippingMethodTaxAmountChangeValueBuilder withTaxedPrice(
            Function<com.commercetools.history.models.common.TaxedPriceBuilder, com.commercetools.history.models.common.TaxedPrice> builder) {
        this.taxedPrice = builder.apply(com.commercetools.history.models.common.TaxedPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Taxed price for the Shipping Method based on <code>taxRate</code>.</p>
     * @param taxedPrice value to be set
     * @return Builder
     */

    public ShippingMethodTaxAmountChangeValueBuilder taxedPrice(
            final com.commercetools.history.models.common.TaxedPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    /**
     *  <p>Tax rate set externally for the Shipping Method.</p>
     * @param builder function to build the taxRate value
     * @return Builder
     */

    public ShippingMethodTaxAmountChangeValueBuilder taxRate(
            Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRateBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Tax rate set externally for the Shipping Method.</p>
     * @param builder function to build the taxRate value
     * @return Builder
     */

    public ShippingMethodTaxAmountChangeValueBuilder withTaxRate(
            Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRate> builder) {
        this.taxRate = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of());
        return this;
    }

    /**
     *  <p>Tax rate set externally for the Shipping Method.</p>
     * @param taxRate value to be set
     * @return Builder
     */

    public ShippingMethodTaxAmountChangeValueBuilder taxRate(
            final com.commercetools.history.models.common.TaxRate taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     *  <p>Taxed price for the Shipping Method based on <code>taxRate</code>.</p>
     * @return taxedPrice
     */

    public com.commercetools.history.models.common.TaxedPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
     *  <p>Tax rate set externally for the Shipping Method.</p>
     * @return taxRate
     */

    public com.commercetools.history.models.common.TaxRate getTaxRate() {
        return this.taxRate;
    }

    /**
     * builds ShippingMethodTaxAmountChangeValue with checking for non-null required values
     * @return ShippingMethodTaxAmountChangeValue
     */
    public ShippingMethodTaxAmountChangeValue build() {
        Objects.requireNonNull(taxedPrice, ShippingMethodTaxAmountChangeValue.class + ": taxedPrice is missing");
        Objects.requireNonNull(taxRate, ShippingMethodTaxAmountChangeValue.class + ": taxRate is missing");
        return new ShippingMethodTaxAmountChangeValueImpl(taxedPrice, taxRate);
    }

    /**
     * builds ShippingMethodTaxAmountChangeValue without checking for non-null required values
     * @return ShippingMethodTaxAmountChangeValue
     */
    public ShippingMethodTaxAmountChangeValue buildUnchecked() {
        return new ShippingMethodTaxAmountChangeValueImpl(taxedPrice, taxRate);
    }

    /**
     * factory method for an instance of ShippingMethodTaxAmountChangeValueBuilder
     * @return builder
     */
    public static ShippingMethodTaxAmountChangeValueBuilder of() {
        return new ShippingMethodTaxAmountChangeValueBuilder();
    }

    /**
     * create builder for ShippingMethodTaxAmountChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodTaxAmountChangeValueBuilder of(final ShippingMethodTaxAmountChangeValue template) {
        ShippingMethodTaxAmountChangeValueBuilder builder = new ShippingMethodTaxAmountChangeValueBuilder();
        builder.taxedPrice = template.getTaxedPrice();
        builder.taxRate = template.getTaxRate();
        return builder;
    }

}
