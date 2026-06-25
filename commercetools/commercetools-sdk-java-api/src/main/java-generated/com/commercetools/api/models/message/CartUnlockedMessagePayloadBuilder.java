
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartUnlockedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartUnlockedMessagePayload cartUnlockedMessagePayload = CartUnlockedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartUnlockedMessagePayloadBuilder implements Builder<CartUnlockedMessagePayload> {

    /**
     * builds CartUnlockedMessagePayload with checking for non-null required values
     * @return CartUnlockedMessagePayload
     */
    public CartUnlockedMessagePayload build() {
        return new CartUnlockedMessagePayloadImpl();
    }

    /**
     * builds CartUnlockedMessagePayload without checking for non-null required values
     * @return CartUnlockedMessagePayload
     */
    public CartUnlockedMessagePayload buildUnchecked() {
        return new CartUnlockedMessagePayloadImpl();
    }

    /**
     * factory method for an instance of CartUnlockedMessagePayloadBuilder
     * @return builder
     */
    public static CartUnlockedMessagePayloadBuilder of() {
        return new CartUnlockedMessagePayloadBuilder();
    }

    /**
     * create builder for CartUnlockedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartUnlockedMessagePayloadBuilder of(final CartUnlockedMessagePayload template) {
        CartUnlockedMessagePayloadBuilder builder = new CartUnlockedMessagePayloadBuilder();
        return builder;
    }

}
