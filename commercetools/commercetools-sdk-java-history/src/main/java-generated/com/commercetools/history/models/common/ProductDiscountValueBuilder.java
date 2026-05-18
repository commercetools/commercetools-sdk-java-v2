
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountValue productDiscountValue = ProductDiscountValue.builder()
 *             .type("{type}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountValueBuilder implements Builder<ProductDiscountValue> {

    private String type;

    /**
     * set the value to the type
     * @param type value to be set
     * @return Builder
     */

    public ProductDiscountValueBuilder type(final String type) {
        this.type = type;
        return this;
    }

    /**
     * value of type}
     * @return type
     */

    public String getType() {
        return this.type;
    }

    /**
     * builds ProductDiscountValue with checking for non-null required values
     * @return ProductDiscountValue
     */
    public ProductDiscountValue build() {
        Objects.requireNonNull(type, ProductDiscountValue.class + ": type is missing");
        return new ProductDiscountValueImpl(type);
    }

    /**
     * builds ProductDiscountValue without checking for non-null required values
     * @return ProductDiscountValue
     */
    public ProductDiscountValue buildUnchecked() {
        return new ProductDiscountValueImpl(type);
    }

    /**
     * factory method for an instance of ProductDiscountValueBuilder
     * @return builder
     */
    public static ProductDiscountValueBuilder of() {
        return new ProductDiscountValueBuilder();
    }

    /**
     * create builder for ProductDiscountValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountValueBuilder of(final ProductDiscountValue template) {
        ProductDiscountValueBuilder builder = new ProductDiscountValueBuilder();
        builder.type = template.getType();
        return builder;
    }

}
