
package com.commercetools.checkout.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartReference cartReference = CartReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartReferenceBuilder implements Builder<CartReference> {

    private String id;

    /**
     *  <p>Unique identifier of the referenced <span>Cart</span>.</p>
     * @param id value to be set
     * @return Builder
     */

    public CartReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <span>Cart</span>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * builds CartReference with checking for non-null required values
     * @return CartReference
     */
    public CartReference build() {
        Objects.requireNonNull(id, CartReference.class + ": id is missing");
        return new CartReferenceImpl(id);
    }

    /**
     * builds CartReference without checking for non-null required values
     * @return CartReference
     */
    public CartReference buildUnchecked() {
        return new CartReferenceImpl(id);
    }

    /**
     * factory method for an instance of CartReferenceBuilder
     * @return builder
     */
    public static CartReferenceBuilder of() {
        return new CartReferenceBuilder();
    }

    /**
     * create builder for CartReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartReferenceBuilder of(final CartReference template) {
        CartReferenceBuilder builder = new CartReferenceBuilder();
        builder.id = template.getId();
        return builder;
    }

}
