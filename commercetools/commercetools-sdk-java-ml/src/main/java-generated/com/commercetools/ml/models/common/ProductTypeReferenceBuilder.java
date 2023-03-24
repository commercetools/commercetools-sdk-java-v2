
package com.commercetools.ml.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeReference productTypeReference = ProductTypeReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeReferenceBuilder implements Builder<ProductTypeReference> {

    private String id;

    /**
     *
     * @param id value to be set
     * @return Builder
     */

    public ProductTypeReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    /**
     * builds ProductTypeReference with checking for non-null required values
     * @return ProductTypeReference
     */
    public ProductTypeReference build() {
        Objects.requireNonNull(id, ProductTypeReference.class + ": id is missing");
        return new ProductTypeReferenceImpl(id);
    }

    /**
     * builds ProductTypeReference without checking for non-null required values
     * @return ProductTypeReference
     */
    public ProductTypeReference buildUnchecked() {
        return new ProductTypeReferenceImpl(id);
    }

    public static ProductTypeReferenceBuilder of() {
        return new ProductTypeReferenceBuilder();
    }

    public static ProductTypeReferenceBuilder of(final ProductTypeReference template) {
        ProductTypeReferenceBuilder builder = new ProductTypeReferenceBuilder();
        builder.id = template.getId();
        return builder;
    }

}
