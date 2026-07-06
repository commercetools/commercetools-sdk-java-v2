
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountReference productDiscountReference = ProductDiscountReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountReferenceBuilder implements Builder<ProductDiscountReference> {

    private String id;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDiscount" rel="nofollow">ProductDiscount</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public ProductDiscountReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDiscount" rel="nofollow">ProductDiscount</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * builds ProductDiscountReference with checking for non-null required values
     * @return ProductDiscountReference
     */
    public ProductDiscountReference build() {
        Objects.requireNonNull(id, ProductDiscountReference.class + ": id is missing");
        return new ProductDiscountReferenceImpl(id);
    }

    /**
     * builds ProductDiscountReference without checking for non-null required values
     * @return ProductDiscountReference
     */
    public ProductDiscountReference buildUnchecked() {
        return new ProductDiscountReferenceImpl(id);
    }

    /**
     * factory method for an instance of ProductDiscountReferenceBuilder
     * @return builder
     */
    public static ProductDiscountReferenceBuilder of() {
        return new ProductDiscountReferenceBuilder();
    }

    /**
     * create builder for ProductDiscountReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountReferenceBuilder of(final ProductDiscountReference template) {
        ProductDiscountReferenceBuilder builder = new ProductDiscountReferenceBuilder();
        builder.id = template.getId();
        return builder;
    }

}
