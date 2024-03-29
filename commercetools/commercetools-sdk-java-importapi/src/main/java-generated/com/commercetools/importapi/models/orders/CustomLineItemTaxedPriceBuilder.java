
package com.commercetools.importapi.models.orders;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomLineItemTaxedPriceBuilder
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
public class CustomLineItemTaxedPriceBuilder implements Builder<CustomLineItemTaxedPrice> {

    private com.commercetools.importapi.models.common.TypedMoney totalNet;

    private com.commercetools.importapi.models.common.TypedMoney totalGross;

    /**
     * set the value to the totalNet
     * @param totalNet value to be set
     * @return Builder
     */

    public CustomLineItemTaxedPriceBuilder totalNet(
            final com.commercetools.importapi.models.common.TypedMoney totalNet) {
        this.totalNet = totalNet;
        return this;
    }

    /**
     * set the value to the totalNet using the builder function
     * @param builder function to build the totalNet value
     * @return Builder
     */

    public CustomLineItemTaxedPriceBuilder totalNet(
            Function<com.commercetools.importapi.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.importapi.models.common.TypedMoney>> builder) {
        this.totalNet = builder.apply(com.commercetools.importapi.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the totalGross
     * @param totalGross value to be set
     * @return Builder
     */

    public CustomLineItemTaxedPriceBuilder totalGross(
            final com.commercetools.importapi.models.common.TypedMoney totalGross) {
        this.totalGross = totalGross;
        return this;
    }

    /**
     * set the value to the totalGross using the builder function
     * @param builder function to build the totalGross value
     * @return Builder
     */

    public CustomLineItemTaxedPriceBuilder totalGross(
            Function<com.commercetools.importapi.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.importapi.models.common.TypedMoney>> builder) {
        this.totalGross = builder.apply(com.commercetools.importapi.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     * value of totalNet}
     * @return totalNet
     */

    public com.commercetools.importapi.models.common.TypedMoney getTotalNet() {
        return this.totalNet;
    }

    /**
     * value of totalGross}
     * @return totalGross
     */

    public com.commercetools.importapi.models.common.TypedMoney getTotalGross() {
        return this.totalGross;
    }

    /**
     * builds CustomLineItemTaxedPrice with checking for non-null required values
     * @return CustomLineItemTaxedPrice
     */
    public CustomLineItemTaxedPrice build() {
        Objects.requireNonNull(totalNet, CustomLineItemTaxedPrice.class + ": totalNet is missing");
        Objects.requireNonNull(totalGross, CustomLineItemTaxedPrice.class + ": totalGross is missing");
        return new CustomLineItemTaxedPriceImpl(totalNet, totalGross);
    }

    /**
     * builds CustomLineItemTaxedPrice without checking for non-null required values
     * @return CustomLineItemTaxedPrice
     */
    public CustomLineItemTaxedPrice buildUnchecked() {
        return new CustomLineItemTaxedPriceImpl(totalNet, totalGross);
    }

    /**
     * factory method for an instance of CustomLineItemTaxedPriceBuilder
     * @return builder
     */
    public static CustomLineItemTaxedPriceBuilder of() {
        return new CustomLineItemTaxedPriceBuilder();
    }

    /**
     * create builder for CustomLineItemTaxedPrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomLineItemTaxedPriceBuilder of(final CustomLineItemTaxedPrice template) {
        CustomLineItemTaxedPriceBuilder builder = new CustomLineItemTaxedPriceBuilder();
        builder.totalNet = template.getTotalNet();
        builder.totalGross = template.getTotalGross();
        return builder;
    }

}
