
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ProductReference productReference = ProductReference.builder()
           .id("{id}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductReferenceBuilder implements Builder<ProductReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.product.Product obj;

    /**
     *  <p>Platform-generated unique identifier of the referenced Product.</p>
     */

    public ProductReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Product. Only present in responses to requests with Reference Expansion for Products.</p>
     */

    public ProductReferenceBuilder obj(
            Function<com.commercetools.api.models.product.ProductBuilder, com.commercetools.api.models.product.ProductBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.product.ProductBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Product. Only present in responses to requests with Reference Expansion for Products.</p>
     */

    public ProductReferenceBuilder obj(@Nullable final com.commercetools.api.models.product.Product obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.product.Product getObj() {
        return this.obj;
    }

    public ProductReference build() {
        Objects.requireNonNull(id, ProductReference.class + ": id is missing");
        return new ProductReferenceImpl(id, obj);
    }

    /**
     * builds ProductReference without checking for non null required values
     */
    public ProductReference buildUnchecked() {
        return new ProductReferenceImpl(id, obj);
    }

    public static ProductReferenceBuilder of() {
        return new ProductReferenceBuilder();
    }

    public static ProductReferenceBuilder of(final ProductReference template) {
        ProductReferenceBuilder builder = new ProductReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
