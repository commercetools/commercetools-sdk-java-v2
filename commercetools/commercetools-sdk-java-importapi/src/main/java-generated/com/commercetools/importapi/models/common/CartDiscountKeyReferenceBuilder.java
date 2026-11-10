
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountKeyReference cartDiscountKeyReference = CartDiscountKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountKeyReferenceBuilder implements Builder<CartDiscountKeyReference> {

    private String key;

    /**
     *  <p>User-defined unique identifier of the referenced CartDiscount.</p>
     * @param key value to be set
     * @return Builder
     */

    public CartDiscountKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced CartDiscount.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     * builds CartDiscountKeyReference with checking for non-null required values
     * @return CartDiscountKeyReference
     */
    public CartDiscountKeyReference build() {
        Objects.requireNonNull(key, CartDiscountKeyReference.class + ": key is missing");
        return new CartDiscountKeyReferenceImpl(key);
    }

    /**
     * builds CartDiscountKeyReference without checking for non-null required values
     * @return CartDiscountKeyReference
     */
    public CartDiscountKeyReference buildUnchecked() {
        return new CartDiscountKeyReferenceImpl(key);
    }

    /**
     * factory method for an instance of CartDiscountKeyReferenceBuilder
     * @return builder
     */
    public static CartDiscountKeyReferenceBuilder of() {
        return new CartDiscountKeyReferenceBuilder();
    }

    /**
     * create builder for CartDiscountKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountKeyReferenceBuilder of(final CartDiscountKeyReference template) {
        CartDiscountKeyReferenceBuilder builder = new CartDiscountKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
