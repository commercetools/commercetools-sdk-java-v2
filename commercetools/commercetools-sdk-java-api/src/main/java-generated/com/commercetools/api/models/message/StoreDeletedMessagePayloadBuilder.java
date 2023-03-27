
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreDeletedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreDeletedMessagePayload storeDeletedMessagePayload = StoreDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreDeletedMessagePayloadBuilder implements Builder<StoreDeletedMessagePayload> {

    /**
     * builds StoreDeletedMessagePayload with checking for non-null required values
     * @return StoreDeletedMessagePayload
     */
    public StoreDeletedMessagePayload build() {
        return new StoreDeletedMessagePayloadImpl();
    }

    /**
     * builds StoreDeletedMessagePayload without checking for non-null required values
     * @return StoreDeletedMessagePayload
     */
    public StoreDeletedMessagePayload buildUnchecked() {
        return new StoreDeletedMessagePayloadImpl();
    }

    /**
     * factory method for an instance of StoreDeletedMessagePayloadBuilder
     * @return builder
     */
    public static StoreDeletedMessagePayloadBuilder of() {
        return new StoreDeletedMessagePayloadBuilder();
    }

    /**
     * create builder for StoreDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreDeletedMessagePayloadBuilder of(final StoreDeletedMessagePayload template) {
        StoreDeletedMessagePayloadBuilder builder = new StoreDeletedMessagePayloadBuilder();
        return builder;
    }

}
