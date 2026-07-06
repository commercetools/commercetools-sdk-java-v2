
package com.commercetools.api.models.product_tailoring;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringReference productTailoringReference = ProductTailoringReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringReferenceBuilder implements Builder<ProductTailoringReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.product_tailoring.ProductTailoring obj;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public ProductTailoringReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded ProductTailoring. Only present in responses to requests with <span>Reference Expansion</span> for ProductTailoring.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public ProductTailoringReferenceBuilder obj(
            Function<com.commercetools.api.models.product_tailoring.ProductTailoringBuilder, com.commercetools.api.models.product_tailoring.ProductTailoringBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.product_tailoring.ProductTailoringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded ProductTailoring. Only present in responses to requests with <span>Reference Expansion</span> for ProductTailoring.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public ProductTailoringReferenceBuilder withObj(
            Function<com.commercetools.api.models.product_tailoring.ProductTailoringBuilder, com.commercetools.api.models.product_tailoring.ProductTailoring> builder) {
        this.obj = builder.apply(com.commercetools.api.models.product_tailoring.ProductTailoringBuilder.of());
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded ProductTailoring. Only present in responses to requests with <span>Reference Expansion</span> for ProductTailoring.</p>
     * @param obj value to be set
     * @return Builder
     */

    public ProductTailoringReferenceBuilder obj(
            @Nullable final com.commercetools.api.models.product_tailoring.ProductTailoring obj) {
        this.obj = obj;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Contains the representation of the expanded ProductTailoring. Only present in responses to requests with <span>Reference Expansion</span> for ProductTailoring.</p>
     * @return obj
     */

    @Nullable
    public com.commercetools.api.models.product_tailoring.ProductTailoring getObj() {
        return this.obj;
    }

    /**
     * builds ProductTailoringReference with checking for non-null required values
     * @return ProductTailoringReference
     */
    public ProductTailoringReference build() {
        Objects.requireNonNull(id, ProductTailoringReference.class + ": id is missing");
        return new ProductTailoringReferenceImpl(id, obj);
    }

    /**
     * builds ProductTailoringReference without checking for non-null required values
     * @return ProductTailoringReference
     */
    public ProductTailoringReference buildUnchecked() {
        return new ProductTailoringReferenceImpl(id, obj);
    }

    /**
     * factory method for an instance of ProductTailoringReferenceBuilder
     * @return builder
     */
    public static ProductTailoringReferenceBuilder of() {
        return new ProductTailoringReferenceBuilder();
    }

    /**
     * create builder for ProductTailoringReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringReferenceBuilder of(final ProductTailoringReference template) {
        ProductTailoringReferenceBuilder builder = new ProductTailoringReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
