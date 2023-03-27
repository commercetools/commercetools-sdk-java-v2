
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceDeletedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceDeletedMessagePayload standalonePriceDeletedMessagePayload = StandalonePriceDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceDeletedMessagePayloadBuilder implements Builder<StandalonePriceDeletedMessagePayload> {

    /**
     * builds StandalonePriceDeletedMessagePayload with checking for non-null required values
     * @return StandalonePriceDeletedMessagePayload
     */
    public StandalonePriceDeletedMessagePayload build() {
        return new StandalonePriceDeletedMessagePayloadImpl();
    }

    /**
     * builds StandalonePriceDeletedMessagePayload without checking for non-null required values
     * @return StandalonePriceDeletedMessagePayload
     */
    public StandalonePriceDeletedMessagePayload buildUnchecked() {
        return new StandalonePriceDeletedMessagePayloadImpl();
    }

    /**
     * factory method for an instance of StandalonePriceDeletedMessagePayloadBuilder
     * @return builder
     */
    public static StandalonePriceDeletedMessagePayloadBuilder of() {
        return new StandalonePriceDeletedMessagePayloadBuilder();
    }

    /**
     * create builder for StandalonePriceDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceDeletedMessagePayloadBuilder of(final StandalonePriceDeletedMessagePayload template) {
        StandalonePriceDeletedMessagePayloadBuilder builder = new StandalonePriceDeletedMessagePayloadBuilder();
        return builder;
    }

}
