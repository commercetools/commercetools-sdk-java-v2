
package com.commercetools.api.models.product_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountValueRelativeDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountValueRelativeDraft productDiscountValueRelativeDraft = ProductDiscountValueRelativeDraft.builder()
 *             .permyriad(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountValueRelativeDraftBuilder implements Builder<ProductDiscountValueRelativeDraft> {

    private Long permyriad;

    /**
     *  <p>Fraction (per ten thousand) the price is reduced by. For example, <code>1000</code> will result in a 10% price reduction.</p>
     * @param permyriad
     * @return Builder
     */

    public ProductDiscountValueRelativeDraftBuilder permyriad(final Long permyriad) {
        this.permyriad = permyriad;
        return this;
    }

    public Long getPermyriad() {
        return this.permyriad;
    }

    public ProductDiscountValueRelativeDraft build() {
        Objects.requireNonNull(permyriad, ProductDiscountValueRelativeDraft.class + ": permyriad is missing");
        return new ProductDiscountValueRelativeDraftImpl(permyriad);
    }

    /**
     * builds ProductDiscountValueRelativeDraft without checking for non null required values
     */
    public ProductDiscountValueRelativeDraft buildUnchecked() {
        return new ProductDiscountValueRelativeDraftImpl(permyriad);
    }

    public static ProductDiscountValueRelativeDraftBuilder of() {
        return new ProductDiscountValueRelativeDraftBuilder();
    }

    public static ProductDiscountValueRelativeDraftBuilder of(final ProductDiscountValueRelativeDraft template) {
        ProductDiscountValueRelativeDraftBuilder builder = new ProductDiscountValueRelativeDraftBuilder();
        builder.permyriad = template.getPermyriad();
        return builder;
    }

}
