
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantKeyReference productVariantKeyReference = ProductVariantKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantKeyReferenceBuilder implements Builder<ProductVariantKeyReference> {

    private String key;

    /**
     *
     * @param key value to be set
     * @return Builder
     */

    public ProductVariantKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    /**
     * builds ProductVariantKeyReference with checking for non-null required values
     * @return ProductVariantKeyReference
     */
    public ProductVariantKeyReference build() {
        Objects.requireNonNull(key, ProductVariantKeyReference.class + ": key is missing");
        return new ProductVariantKeyReferenceImpl(key);
    }

    /**
     * builds ProductVariantKeyReference without checking for non-null required values
     * @return ProductVariantKeyReference
     */
    public ProductVariantKeyReference buildUnchecked() {
        return new ProductVariantKeyReferenceImpl(key);
    }

    public static ProductVariantKeyReferenceBuilder of() {
        return new ProductVariantKeyReferenceBuilder();
    }

    public static ProductVariantKeyReferenceBuilder of(final ProductVariantKeyReference template) {
        ProductVariantKeyReferenceBuilder builder = new ProductVariantKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
