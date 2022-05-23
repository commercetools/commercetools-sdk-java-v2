
package com.commercetools.api.models.product_discount;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ProductDiscountSetValidFromAndUntilAction productDiscountSetValidFromAndUntilAction = ProductDiscountSetValidFromAndUntilAction.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountSetValidFromAndUntilActionBuilder
        implements Builder<ProductDiscountSetValidFromAndUntilAction> {

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    /**
     *  <p>Value to set. Take Eventual Consistency into account for calculated undiscounted values.</p>
     */

    public ProductDiscountSetValidFromAndUntilActionBuilder validFrom(
            @Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Value to set. Take Eventual Consistency into account for calculated undiscounted values.</p>
     */

    public ProductDiscountSetValidFromAndUntilActionBuilder validUntil(
            @Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    public ProductDiscountSetValidFromAndUntilAction build() {
        return new ProductDiscountSetValidFromAndUntilActionImpl(validFrom, validUntil);
    }

    /**
     * builds ProductDiscountSetValidFromAndUntilAction without checking for non null required values
     */
    public ProductDiscountSetValidFromAndUntilAction buildUnchecked() {
        return new ProductDiscountSetValidFromAndUntilActionImpl(validFrom, validUntil);
    }

    public static ProductDiscountSetValidFromAndUntilActionBuilder of() {
        return new ProductDiscountSetValidFromAndUntilActionBuilder();
    }

    public static ProductDiscountSetValidFromAndUntilActionBuilder of(
            final ProductDiscountSetValidFromAndUntilAction template) {
        ProductDiscountSetValidFromAndUntilActionBuilder builder = new ProductDiscountSetValidFromAndUntilActionBuilder();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        return builder;
    }

}
