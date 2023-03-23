
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
     *
     * @param key
     * @return Builder
     */

    public ProductKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public ProductKeyReference build() {
        Objects.requireNonNull(key, ProductKeyReference.class + ": key is missing");
        return new ProductKeyReferenceImpl(key);
    }

    /**
     * builds ProductKeyReference without checking for non null required values
     */
    public ProductKeyReference buildUnchecked() {
        return new ProductKeyReferenceImpl(key);
    }

    public static ProductKeyReferenceBuilder of() {
        return new ProductKeyReferenceBuilder();
    }

    public static ProductKeyReferenceBuilder of(final ProductKeyReference template) {
        ProductKeyReferenceBuilder builder = new ProductKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
