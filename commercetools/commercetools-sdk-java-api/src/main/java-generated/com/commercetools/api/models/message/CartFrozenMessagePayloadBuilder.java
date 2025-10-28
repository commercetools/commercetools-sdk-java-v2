
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartFrozenMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartFrozenMessagePayload cartFrozenMessagePayload = CartFrozenMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartFrozenMessagePayloadBuilder implements Builder<CartFrozenMessagePayload> {

    /**
     * builds CartFrozenMessagePayload with checking for non-null required values
     * @return CartFrozenMessagePayload
     */
    public CartFrozenMessagePayload build() {
        return new CartFrozenMessagePayloadImpl();
    }

    /**
     * builds CartFrozenMessagePayload without checking for non-null required values
     * @return CartFrozenMessagePayload
     */
    public CartFrozenMessagePayload buildUnchecked() {
        return new CartFrozenMessagePayloadImpl();
    }

    /**
     * factory method for an instance of CartFrozenMessagePayloadBuilder
     * @return builder
     */
    public static CartFrozenMessagePayloadBuilder of() {
        return new CartFrozenMessagePayloadBuilder();
    }

    /**
     * create builder for CartFrozenMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartFrozenMessagePayloadBuilder of(final CartFrozenMessagePayload template) {
        CartFrozenMessagePayloadBuilder builder = new CartFrozenMessagePayloadBuilder();
        return builder;
    }

}
