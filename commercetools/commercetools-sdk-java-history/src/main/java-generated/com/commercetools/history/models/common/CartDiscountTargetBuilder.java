
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountTargetBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountTarget cartDiscountTarget = CartDiscountTarget.builder()
 *             .type("{type}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountTargetBuilder implements Builder<CartDiscountTarget> {

    private String type;

    /**
     * set the value to the type
     * @param type value to be set
     * @return Builder
     */

    public CartDiscountTargetBuilder type(final String type) {
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
     * builds CartDiscountTarget with checking for non-null required values
     * @return CartDiscountTarget
     */
    public CartDiscountTarget build() {
        Objects.requireNonNull(type, CartDiscountTarget.class + ": type is missing");
        return new CartDiscountTargetImpl(type);
    }

    /**
     * builds CartDiscountTarget without checking for non-null required values
     * @return CartDiscountTarget
     */
    public CartDiscountTarget buildUnchecked() {
        return new CartDiscountTargetImpl(type);
    }

    /**
     * factory method for an instance of CartDiscountTargetBuilder
     * @return builder
     */
    public static CartDiscountTargetBuilder of() {
        return new CartDiscountTargetBuilder();
    }

    /**
     * create builder for CartDiscountTarget instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountTargetBuilder of(final CartDiscountTarget template) {
        CartDiscountTargetBuilder builder = new CartDiscountTargetBuilder();
        builder.type = template.getType();
        return builder;
    }

}
