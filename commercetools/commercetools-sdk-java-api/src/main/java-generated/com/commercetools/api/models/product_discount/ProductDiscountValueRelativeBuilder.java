
package com.commercetools.api.models.product_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountValueRelativeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountValueRelative productDiscountValueRelative = ProductDiscountValueRelative.builder()
 *             .permyriad(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountValueRelativeBuilder implements Builder<ProductDiscountValueRelative> {

    private Long permyriad;

    /**
     <*  <p>Fraction (per ten thousand) the price is reduced by. For example, <code>1000</code> will result in a 10% price reduction.</p>>
     */

    public ProductDiscountValueRelativeBuilder permyriad(final Long permyriad) {
        this.permyriad = permyriad;
        return this;
    }

    public Long getPermyriad() {
        return this.permyriad;
    }

    public ProductDiscountValueRelative build() {
        Objects.requireNonNull(permyriad, ProductDiscountValueRelative.class + ": permyriad is missing");
        return new ProductDiscountValueRelativeImpl(permyriad);
    }

    /**
     * builds ProductDiscountValueRelative without checking for non null required values
     */
    public ProductDiscountValueRelative buildUnchecked() {
        return new ProductDiscountValueRelativeImpl(permyriad);
    }

    public static ProductDiscountValueRelativeBuilder of() {
        return new ProductDiscountValueRelativeBuilder();
    }

    public static ProductDiscountValueRelativeBuilder of(final ProductDiscountValueRelative template) {
        ProductDiscountValueRelativeBuilder builder = new ProductDiscountValueRelativeBuilder();
        builder.permyriad = template.getPermyriad();
        return builder;
    }

}
