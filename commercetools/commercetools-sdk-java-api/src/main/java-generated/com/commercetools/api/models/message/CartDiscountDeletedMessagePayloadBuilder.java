
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountDeletedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountDeletedMessagePayload cartDiscountDeletedMessagePayload = CartDiscountDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountDeletedMessagePayloadBuilder implements Builder<CartDiscountDeletedMessagePayload> {

    /**
     * builds CartDiscountDeletedMessagePayload with checking for non-null required values
     * @return CartDiscountDeletedMessagePayload
     */
    public CartDiscountDeletedMessagePayload build() {
        return new CartDiscountDeletedMessagePayloadImpl();
    }

    /**
     * builds CartDiscountDeletedMessagePayload without checking for non-null required values
     * @return CartDiscountDeletedMessagePayload
     */
    public CartDiscountDeletedMessagePayload buildUnchecked() {
        return new CartDiscountDeletedMessagePayloadImpl();
    }

    /**
     * factory method for an instance of CartDiscountDeletedMessagePayloadBuilder
     * @return builder
     */
    public static CartDiscountDeletedMessagePayloadBuilder of() {
        return new CartDiscountDeletedMessagePayloadBuilder();
    }

    /**
     * create builder for CartDiscountDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountDeletedMessagePayloadBuilder of(final CartDiscountDeletedMessagePayload template) {
        CartDiscountDeletedMessagePayloadBuilder builder = new CartDiscountDeletedMessagePayloadBuilder();
        return builder;
    }

}
