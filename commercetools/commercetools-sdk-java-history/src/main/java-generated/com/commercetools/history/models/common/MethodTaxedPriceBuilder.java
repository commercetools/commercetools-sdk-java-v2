
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MethodTaxedPriceBuilder
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
public class MethodTaxedPriceBuilder implements Builder<MethodTaxedPrice> {

    private String shippingMethodKey;

    @Nullable
    private com.commercetools.history.models.common.TaxedItemPrice taxedPrice;

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">Shipping Method</a> in a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @param shippingMethodKey value to be set
     * @return Builder
     */

    public MethodTaxedPriceBuilder shippingMethodKey(final String shippingMethodKey) {
        this.shippingMethodKey = shippingMethodKey;
        return this;
    }

    /**
     *  <p>Total taxed price based on the quantity of the Line Item or Custom Line Item assigned to the Shipping Method identified by <code>shippingMethodKey</code>.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public MethodTaxedPriceBuilder taxedPrice(
            Function<com.commercetools.history.models.common.TaxedItemPriceBuilder, com.commercetools.history.models.common.TaxedItemPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.history.models.common.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Total taxed price based on the quantity of the Line Item or Custom Line Item assigned to the Shipping Method identified by <code>shippingMethodKey</code>.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public MethodTaxedPriceBuilder withTaxedPrice(
            Function<com.commercetools.history.models.common.TaxedItemPriceBuilder, com.commercetools.history.models.common.TaxedItemPrice> builder) {
        this.taxedPrice = builder.apply(com.commercetools.history.models.common.TaxedItemPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Total taxed price based on the quantity of the Line Item or Custom Line Item assigned to the Shipping Method identified by <code>shippingMethodKey</code>.</p>
     * @param taxedPrice value to be set
     * @return Builder
     */

    public MethodTaxedPriceBuilder taxedPrice(
            @Nullable final com.commercetools.history.models.common.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">Shipping Method</a> in a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @return shippingMethodKey
     */

    public String getShippingMethodKey() {
        return this.shippingMethodKey;
    }

    /**
     *  <p>Total taxed price based on the quantity of the Line Item or Custom Line Item assigned to the Shipping Method identified by <code>shippingMethodKey</code>.</p>
     * @return taxedPrice
     */

    @Nullable
    public com.commercetools.history.models.common.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
     * builds MethodTaxedPrice with checking for non-null required values
     * @return MethodTaxedPrice
     */
    public MethodTaxedPrice build() {
        Objects.requireNonNull(shippingMethodKey, MethodTaxedPrice.class + ": shippingMethodKey is missing");
        return new MethodTaxedPriceImpl(shippingMethodKey, taxedPrice);
    }

    /**
     * builds MethodTaxedPrice without checking for non-null required values
     * @return MethodTaxedPrice
     */
    public MethodTaxedPrice buildUnchecked() {
        return new MethodTaxedPriceImpl(shippingMethodKey, taxedPrice);
    }

    /**
     * factory method for an instance of MethodTaxedPriceBuilder
     * @return builder
     */
    public static MethodTaxedPriceBuilder of() {
        return new MethodTaxedPriceBuilder();
    }

    /**
     * create builder for MethodTaxedPrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MethodTaxedPriceBuilder of(final MethodTaxedPrice template) {
        MethodTaxedPriceBuilder builder = new MethodTaxedPriceBuilder();
        builder.shippingMethodKey = template.getShippingMethodKey();
        builder.taxedPrice = template.getTaxedPrice();
        return builder;
    }

}
