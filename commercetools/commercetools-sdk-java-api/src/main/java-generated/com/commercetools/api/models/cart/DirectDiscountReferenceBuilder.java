
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DirectDiscountReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DirectDiscountReference directDiscountReference = DirectDiscountReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DirectDiscountReferenceBuilder implements Builder<DirectDiscountReference> {

    private String id;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscount" rel="nofollow">DirectDiscount</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public DirectDiscountReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscount" rel="nofollow">DirectDiscount</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * builds DirectDiscountReference with checking for non-null required values
     * @return DirectDiscountReference
     */
    public DirectDiscountReference build() {
        Objects.requireNonNull(id, DirectDiscountReference.class + ": id is missing");
        return new DirectDiscountReferenceImpl(id);
    }

    /**
     * builds DirectDiscountReference without checking for non-null required values
     * @return DirectDiscountReference
     */
    public DirectDiscountReference buildUnchecked() {
        return new DirectDiscountReferenceImpl(id);
    }

    /**
     * factory method for an instance of DirectDiscountReferenceBuilder
     * @return builder
     */
    public static DirectDiscountReferenceBuilder of() {
        return new DirectDiscountReferenceBuilder();
    }

    /**
     * create builder for DirectDiscountReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DirectDiscountReferenceBuilder of(final DirectDiscountReference template) {
        DirectDiscountReferenceBuilder builder = new DirectDiscountReferenceBuilder();
        builder.id = template.getId();
        return builder;
    }

}
