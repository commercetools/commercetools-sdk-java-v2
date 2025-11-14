
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartUnfrozenMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartUnfrozenMessagePayload cartUnfrozenMessagePayload = CartUnfrozenMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartUnfrozenMessagePayloadBuilder implements Builder<CartUnfrozenMessagePayload> {

    /**
     * builds CartUnfrozenMessagePayload with checking for non-null required values
     * @return CartUnfrozenMessagePayload
     */
    public CartUnfrozenMessagePayload build() {
        return new CartUnfrozenMessagePayloadImpl();
    }

    /**
     * builds CartUnfrozenMessagePayload without checking for non-null required values
     * @return CartUnfrozenMessagePayload
     */
    public CartUnfrozenMessagePayload buildUnchecked() {
        return new CartUnfrozenMessagePayloadImpl();
    }

    /**
     * factory method for an instance of CartUnfrozenMessagePayloadBuilder
     * @return builder
     */
    public static CartUnfrozenMessagePayloadBuilder of() {
        return new CartUnfrozenMessagePayloadBuilder();
    }

    /**
     * create builder for CartUnfrozenMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartUnfrozenMessagePayloadBuilder of(final CartUnfrozenMessagePayload template) {
        CartUnfrozenMessagePayloadBuilder builder = new CartUnfrozenMessagePayloadBuilder();
        return builder;
    }

}
