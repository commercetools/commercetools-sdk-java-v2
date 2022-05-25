
package com.commercetools.ml.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductReference productReference = ProductReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductReferenceBuilder implements Builder<ProductReference> {

    private String id;

    /**
     *
     */

    public ProductReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public ProductReference build() {
        Objects.requireNonNull(id, ProductReference.class + ": id is missing");
        return new ProductReferenceImpl(id);
    }

    /**
     * builds ProductReference without checking for non null required values
     */
    public ProductReference buildUnchecked() {
        return new ProductReferenceImpl(id);
    }

    public static ProductReferenceBuilder of() {
        return new ProductReferenceBuilder();
    }

    public static ProductReferenceBuilder of(final ProductReference template) {
        ProductReferenceBuilder builder = new ProductReferenceBuilder();
        builder.id = template.getId();
        return builder;
    }

}
