
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceKeySetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceKeySetMessagePayload standalonePriceKeySetMessagePayload = StandalonePriceKeySetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceKeySetMessagePayloadBuilder implements Builder<StandalonePriceKeySetMessagePayload> {

    @Nullable
    private String key;

    @Nullable
    private String oldKey;

    /**
     *  <p><code>key</code> value of the StandalonePrice after the Set Key update action.</p>
     * @param key
     * @return Builder
     */

    public StandalonePriceKeySetMessagePayloadBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p><code>key</code> value of the StandalonePrice before the Set Key update action.</p>
     * @param oldKey
     * @return Builder
     */

    public StandalonePriceKeySetMessagePayloadBuilder oldKey(@Nullable final String oldKey) {
        this.oldKey = oldKey;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    @Nullable
    public String getOldKey() {
        return this.oldKey;
    }

    public StandalonePriceKeySetMessagePayload build() {
        return new StandalonePriceKeySetMessagePayloadImpl(key, oldKey);
    }

    /**
     * builds StandalonePriceKeySetMessagePayload without checking for non null required values
     */
    public StandalonePriceKeySetMessagePayload buildUnchecked() {
        return new StandalonePriceKeySetMessagePayloadImpl(key, oldKey);
    }

    public static StandalonePriceKeySetMessagePayloadBuilder of() {
        return new StandalonePriceKeySetMessagePayloadBuilder();
    }

    public static StandalonePriceKeySetMessagePayloadBuilder of(final StandalonePriceKeySetMessagePayload template) {
        StandalonePriceKeySetMessagePayloadBuilder builder = new StandalonePriceKeySetMessagePayloadBuilder();
        builder.key = template.getKey();
        builder.oldKey = template.getOldKey();
        return builder;
    }

}
