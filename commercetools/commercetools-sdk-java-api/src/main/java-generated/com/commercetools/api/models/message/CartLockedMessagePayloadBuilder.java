
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartLockedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartLockedMessagePayload cartLockedMessagePayload = CartLockedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartLockedMessagePayloadBuilder implements Builder<CartLockedMessagePayload> {

    /**
     * builds CartLockedMessagePayload with checking for non-null required values
     * @return CartLockedMessagePayload
     */
    public CartLockedMessagePayload build() {
        return new CartLockedMessagePayloadImpl();
    }

    /**
     * builds CartLockedMessagePayload without checking for non-null required values
     * @return CartLockedMessagePayload
     */
    public CartLockedMessagePayload buildUnchecked() {
        return new CartLockedMessagePayloadImpl();
    }

    /**
     * factory method for an instance of CartLockedMessagePayloadBuilder
     * @return builder
     */
    public static CartLockedMessagePayloadBuilder of() {
        return new CartLockedMessagePayloadBuilder();
    }

    /**
     * create builder for CartLockedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartLockedMessagePayloadBuilder of(final CartLockedMessagePayload template) {
        CartLockedMessagePayloadBuilder builder = new CartLockedMessagePayloadBuilder();
        return builder;
    }

}
