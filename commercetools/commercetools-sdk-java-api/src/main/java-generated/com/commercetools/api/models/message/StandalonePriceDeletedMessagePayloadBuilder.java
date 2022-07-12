
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

    public StandalonePriceDeletedMessagePayload build() {
        return new StandalonePriceDeletedMessagePayloadImpl();
    }

    /**
     * builds StandalonePriceDeletedMessagePayload without checking for non null required values
     */
    public StandalonePriceDeletedMessagePayload buildUnchecked() {
        return new StandalonePriceDeletedMessagePayloadImpl();
    }

    public static StandalonePriceDeletedMessagePayloadBuilder of() {
        return new StandalonePriceDeletedMessagePayloadBuilder();
    }

    public static StandalonePriceDeletedMessagePayloadBuilder of(final StandalonePriceDeletedMessagePayload template) {
        StandalonePriceDeletedMessagePayloadBuilder builder = new StandalonePriceDeletedMessagePayloadBuilder();
        return builder;
    }

}
