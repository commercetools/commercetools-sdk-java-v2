
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountValue cartDiscountValue = CartDiscountValue.builder()
 *             .type("{type}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountValueBuilder implements Builder<CartDiscountValue> {

    private String type;

    /**
     * set the value to the type
     * @param type value to be set
     * @return Builder
     */

    public CartDiscountValueBuilder type(final String type) {
        this.type = type;
        return this;
    }

    /**
     * value of type}
     * @return type
     */

    public String getType() {
        return this.type;
    }

    /**
     * builds CartDiscountValue with checking for non-null required values
     * @return CartDiscountValue
     */
    public CartDiscountValue build() {
        Objects.requireNonNull(type, CartDiscountValue.class + ": type is missing");
        return new CartDiscountValueImpl(type);
    }

    /**
     * builds CartDiscountValue without checking for non-null required values
     * @return CartDiscountValue
     */
    public CartDiscountValue buildUnchecked() {
        return new CartDiscountValueImpl(type);
    }

    /**
     * factory method for an instance of CartDiscountValueBuilder
     * @return builder
     */
    public static CartDiscountValueBuilder of() {
        return new CartDiscountValueBuilder();
    }

    /**
     * create builder for CartDiscountValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountValueBuilder of(final CartDiscountValue template) {
        CartDiscountValueBuilder builder = new CartDiscountValueBuilder();
        builder.type = template.getType();
        return builder;
    }

}
