
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionReference productSelectionReference = ProductSelectionReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionReferenceBuilder implements Builder<ProductSelectionReference> {

    private String id;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelection" rel="nofollow">ProductSelection</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public ProductSelectionReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelection" rel="nofollow">ProductSelection</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * builds ProductSelectionReference with checking for non-null required values
     * @return ProductSelectionReference
     */
    public ProductSelectionReference build() {
        Objects.requireNonNull(id, ProductSelectionReference.class + ": id is missing");
        return new ProductSelectionReferenceImpl(id);
    }

    /**
     * builds ProductSelectionReference without checking for non-null required values
     * @return ProductSelectionReference
     */
    public ProductSelectionReference buildUnchecked() {
        return new ProductSelectionReferenceImpl(id);
    }

    /**
     * factory method for an instance of ProductSelectionReferenceBuilder
     * @return builder
     */
    public static ProductSelectionReferenceBuilder of() {
        return new ProductSelectionReferenceBuilder();
    }

    /**
     * create builder for ProductSelectionReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionReferenceBuilder of(final ProductSelectionReference template) {
        ProductSelectionReferenceBuilder builder = new ProductSelectionReferenceBuilder();
        builder.id = template.getId();
        return builder;
    }

}
