
package com.commercetools.api.models.product_discount;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountSetValidFromActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountSetValidFromAction productDiscountSetValidFromAction = ProductDiscountSetValidFromAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountSetValidFromActionBuilder implements Builder<ProductDiscountSetValidFromAction> {

    @Nullable
    private java.time.ZonedDateTime validFrom;

    /**
     *  <p>Value to set. If empty, any existing value will be removed. Take Eventual Consistency into account for calculated discount values.</p>
     * @param validFrom value to be set
     * @return Builder
     */

    public ProductDiscountSetValidFromActionBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed. Take Eventual Consistency into account for calculated discount values.</p>
     * @return validFrom
     */

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     * builds ProductDiscountSetValidFromAction with checking for non-null required values
     * @return ProductDiscountSetValidFromAction
     */
    public ProductDiscountSetValidFromAction build() {
        return new ProductDiscountSetValidFromActionImpl(validFrom);
    }

    /**
     * builds ProductDiscountSetValidFromAction without checking for non-null required values
     * @return ProductDiscountSetValidFromAction
     */
    public ProductDiscountSetValidFromAction buildUnchecked() {
        return new ProductDiscountSetValidFromActionImpl(validFrom);
    }

    /**
     * factory method for an instance of ProductDiscountSetValidFromActionBuilder
     * @return builder
     */
    public static ProductDiscountSetValidFromActionBuilder of() {
        return new ProductDiscountSetValidFromActionBuilder();
    }

    /**
     * create builder for ProductDiscountSetValidFromAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountSetValidFromActionBuilder of(final ProductDiscountSetValidFromAction template) {
        ProductDiscountSetValidFromActionBuilder builder = new ProductDiscountSetValidFromActionBuilder();
        builder.validFrom = template.getValidFrom();
        return builder;
    }

}
