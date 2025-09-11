
package com.commercetools.api.models.product_discount;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountSetValidFromAndUntilActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountSetValidFromAndUntilAction productDiscountSetValidFromAndUntilAction = ProductDiscountSetValidFromAndUntilAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountSetValidFromAndUntilActionBuilder
        implements Builder<ProductDiscountSetValidFromAndUntilAction> {

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    /**
     *  <p>Value to set. Take <span>Eventual Consistency</span> into account for calculated undiscounted values.</p>
     * @param validFrom value to be set
     * @return Builder
     */

    public ProductDiscountSetValidFromAndUntilActionBuilder validFrom(
            @Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Value to set. Take <span>Eventual Consistency</span> into account for calculated undiscounted values.</p>
     * @param validUntil value to be set
     * @return Builder
     */

    public ProductDiscountSetValidFromAndUntilActionBuilder validUntil(
            @Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>Value to set. Take <span>Eventual Consistency</span> into account for calculated undiscounted values.</p>
     * @return validFrom
     */

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Value to set. Take <span>Eventual Consistency</span> into account for calculated undiscounted values.</p>
     * @return validUntil
     */

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     * builds ProductDiscountSetValidFromAndUntilAction with checking for non-null required values
     * @return ProductDiscountSetValidFromAndUntilAction
     */
    public ProductDiscountSetValidFromAndUntilAction build() {
        return new ProductDiscountSetValidFromAndUntilActionImpl(validFrom, validUntil);
    }

    /**
     * builds ProductDiscountSetValidFromAndUntilAction without checking for non-null required values
     * @return ProductDiscountSetValidFromAndUntilAction
     */
    public ProductDiscountSetValidFromAndUntilAction buildUnchecked() {
        return new ProductDiscountSetValidFromAndUntilActionImpl(validFrom, validUntil);
    }

    /**
     * factory method for an instance of ProductDiscountSetValidFromAndUntilActionBuilder
     * @return builder
     */
    public static ProductDiscountSetValidFromAndUntilActionBuilder of() {
        return new ProductDiscountSetValidFromAndUntilActionBuilder();
    }

    /**
     * create builder for ProductDiscountSetValidFromAndUntilAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountSetValidFromAndUntilActionBuilder of(
            final ProductDiscountSetValidFromAndUntilAction template) {
        ProductDiscountSetValidFromAndUntilActionBuilder builder = new ProductDiscountSetValidFromAndUntilActionBuilder();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        return builder;
    }

}
