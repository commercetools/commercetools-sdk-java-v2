
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
     *  <p>Fraction (per ten thousand) the price is reduced by. For example, <code>1000</code> will result in a 10% price reduction.</p>
     * @param permyriad value to be set
     * @return Builder
     */

    public ProductDiscountValueRelativeBuilder permyriad(final Long permyriad) {
        this.permyriad = permyriad;
        return this;
    }

    /**
     *  <p>Fraction (per ten thousand) the price is reduced by. For example, <code>1000</code> will result in a 10% price reduction.</p>
     * @return permyriad
     */

    public Long getPermyriad() {
        return this.permyriad;
    }

    /**
     * builds ProductDiscountValueRelative with checking for non-null required values
     * @return ProductDiscountValueRelative
     */
    public ProductDiscountValueRelative build() {
        Objects.requireNonNull(permyriad, ProductDiscountValueRelative.class + ": permyriad is missing");
        return new ProductDiscountValueRelativeImpl(permyriad);
    }

    /**
     * builds ProductDiscountValueRelative without checking for non-null required values
     * @return ProductDiscountValueRelative
     */
    public ProductDiscountValueRelative buildUnchecked() {
        return new ProductDiscountValueRelativeImpl(permyriad);
    }

    /**
     * factory method for an instance of ProductDiscountValueRelativeBuilder
     * @return builder
     */
    public static ProductDiscountValueRelativeBuilder of() {
        return new ProductDiscountValueRelativeBuilder();
    }

    /**
     * create builder for ProductDiscountValueRelative instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountValueRelativeBuilder of(final ProductDiscountValueRelative template) {
        ProductDiscountValueRelativeBuilder builder = new ProductDiscountValueRelativeBuilder();
        builder.permyriad = template.getPermyriad();
        return builder;
    }

}
