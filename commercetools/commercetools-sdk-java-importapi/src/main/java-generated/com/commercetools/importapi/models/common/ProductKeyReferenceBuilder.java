
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductKeyReference productKeyReference = ProductKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductKeyReferenceBuilder implements Builder<ProductKeyReference> {

    private String key;

    /**
     * set the value to the key
     * @param key value to be set
     * @return Builder
     */

    public ProductKeyReferenceBuilder key(final String key) {
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
     * builds ProductKeyReference with checking for non-null required values
     * @return ProductKeyReference
     */
    public ProductKeyReference build() {
        Objects.requireNonNull(key, ProductKeyReference.class + ": key is missing");
        return new ProductKeyReferenceImpl(key);
    }

    /**
     * builds ProductKeyReference without checking for non-null required values
     * @return ProductKeyReference
     */
    public ProductKeyReference buildUnchecked() {
        return new ProductKeyReferenceImpl(key);
    }

    /**
     * factory method for an instance of ProductKeyReferenceBuilder
     * @return builder
     */
    public static ProductKeyReferenceBuilder of() {
        return new ProductKeyReferenceBuilder();
    }

    /**
     * create builder for ProductKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductKeyReferenceBuilder of(final ProductKeyReference template) {
        ProductKeyReferenceBuilder builder = new ProductKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
