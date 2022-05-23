
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ProductTypeKeyReference productTypeKeyReference = ProductTypeKeyReference.builder()
           .key("{key}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeKeyReferenceBuilder implements Builder<ProductTypeKeyReference> {

    private String key;

    public ProductTypeKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public ProductTypeKeyReference build() {
        Objects.requireNonNull(key, ProductTypeKeyReference.class + ": key is missing");
        return new ProductTypeKeyReferenceImpl(key);
    }

    /**
     * builds ProductTypeKeyReference without checking for non null required values
     */
    public ProductTypeKeyReference buildUnchecked() {
        return new ProductTypeKeyReferenceImpl(key);
    }

    public static ProductTypeKeyReferenceBuilder of() {
        return new ProductTypeKeyReferenceBuilder();
    }

    public static ProductTypeKeyReferenceBuilder of(final ProductTypeKeyReference template) {
        ProductTypeKeyReferenceBuilder builder = new ProductTypeKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
