
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

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

    @Nullable
    private com.commercetools.api.models.product_type.ProductType obj;

    /**
     *  <p>Unique identifier of the referenced ProductType.</p>
     * @param id value to be set
     * @return Builder
     */

    public ProductTypeReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded ProductType. Only present in responses to requests with Reference Expansion for ProductTypes.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public ProductTypeReferenceBuilder obj(
            Function<com.commercetools.api.models.product_type.ProductTypeBuilder, com.commercetools.api.models.product_type.ProductTypeBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.product_type.ProductTypeBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded ProductType. Only present in responses to requests with Reference Expansion for ProductTypes.</p>
     * @param obj value to be set
     * @return Builder
     */

    public ProductTypeReferenceBuilder obj(@Nullable final com.commercetools.api.models.product_type.ProductType obj) {
        this.obj = obj;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced ProductType.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Contains the representation of the expanded ProductType. Only present in responses to requests with Reference Expansion for ProductTypes.</p>
     * @return obj
     */

    @Nullable
    public com.commercetools.api.models.product_type.ProductType getObj() {
        return this.obj;
    }

    /**
     * builds ProductTypeReference with checking for non-null required values
     * @return ProductTypeReference
     */
    public ProductTypeReference build() {
        Objects.requireNonNull(id, ProductTypeReference.class + ": id is missing");
        return new ProductTypeReferenceImpl(id, obj);
    }

    /**
     * builds ProductTypeReference without checking for non-null required values
     * @return ProductTypeReference
     */
    public ProductTypeReference buildUnchecked() {
        return new ProductTypeReferenceImpl(id, obj);
    }

    /**
     * factory method for an instance of ProductTypeReferenceBuilder
     * @return builder
     */
    public static ProductTypeReferenceBuilder of() {
        return new ProductTypeReferenceBuilder();
    }

    /**
     * create builder for ProductTypeReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeReferenceBuilder of(final ProductTypeReference template) {
        ProductTypeReferenceBuilder builder = new ProductTypeReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
