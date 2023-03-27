
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountKeyReference productDiscountKeyReference = ProductDiscountKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountKeyReferenceBuilder implements Builder<ProductDiscountKeyReference> {

    private String key;

    /**
     * set the value to the key
     * @param key value to be set
     * @return Builder
     */

    public ProductDiscountKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     * value of key}
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     * builds ProductDiscountKeyReference with checking for non-null required values
     * @return ProductDiscountKeyReference
     */
    public ProductDiscountKeyReference build() {
        Objects.requireNonNull(key, ProductDiscountKeyReference.class + ": key is missing");
        return new ProductDiscountKeyReferenceImpl(key);
    }

    /**
     * builds ProductDiscountKeyReference without checking for non-null required values
     * @return ProductDiscountKeyReference
     */
    public ProductDiscountKeyReference buildUnchecked() {
        return new ProductDiscountKeyReferenceImpl(key);
    }

    /**
     * factory method for an instance of ProductDiscountKeyReferenceBuilder
     * @return builder
     */
    public static ProductDiscountKeyReferenceBuilder of() {
        return new ProductDiscountKeyReferenceBuilder();
    }

    /**
     * create builder for ProductDiscountKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountKeyReferenceBuilder of(final ProductDiscountKeyReference template) {
        ProductDiscountKeyReferenceBuilder builder = new ProductDiscountKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
