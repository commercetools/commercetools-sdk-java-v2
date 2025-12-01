
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountReference cartDiscountReference = CartDiscountReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountReferenceBuilder implements Builder<CartDiscountReference> {

    private String id;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscount</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public CartDiscountReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscount</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * builds CartDiscountReference with checking for non-null required values
     * @return CartDiscountReference
     */
    public CartDiscountReference build() {
        Objects.requireNonNull(id, CartDiscountReference.class + ": id is missing");
        return new CartDiscountReferenceImpl(id);
    }

    /**
     * builds CartDiscountReference without checking for non-null required values
     * @return CartDiscountReference
     */
    public CartDiscountReference buildUnchecked() {
        return new CartDiscountReferenceImpl(id);
    }

    /**
     * factory method for an instance of CartDiscountReferenceBuilder
     * @return builder
     */
    public static CartDiscountReferenceBuilder of() {
        return new CartDiscountReferenceBuilder();
    }

    /**
     * create builder for CartDiscountReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountReferenceBuilder of(final CartDiscountReference template) {
        CartDiscountReferenceBuilder builder = new CartDiscountReferenceBuilder();
        builder.id = template.getId();
        return builder;
    }

}
