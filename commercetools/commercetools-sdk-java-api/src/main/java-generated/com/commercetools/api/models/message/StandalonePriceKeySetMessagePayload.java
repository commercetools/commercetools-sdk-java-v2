
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Key update action.</p>
 *
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
@JsonDeserialize(as = StandalonePriceKeySetMessagePayloadImpl.class)
public interface StandalonePriceKeySetMessagePayload extends MessagePayload {

    String STANDALONE_PRICE_KEY_SET = "StandalonePriceKeySet";

    /**
     *  <p><code>key</code> value of the StandalonePrice after the Set Key update action.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p><code>key</code> value of the StandalonePrice before the Set Key update action.</p>
     * @return oldKey
     */

    @JsonProperty("oldKey")
    public String getOldKey();

    public void setKey(final String key);

    public void setOldKey(final String oldKey);

    public static StandalonePriceKeySetMessagePayload of() {
        return new StandalonePriceKeySetMessagePayloadImpl();
    }

    public static StandalonePriceKeySetMessagePayload of(final StandalonePriceKeySetMessagePayload template) {
        StandalonePriceKeySetMessagePayloadImpl instance = new StandalonePriceKeySetMessagePayloadImpl();
        instance.setKey(template.getKey());
        instance.setOldKey(template.getOldKey());
        return instance;
    }

    public static StandalonePriceKeySetMessagePayloadBuilder builder() {
        return StandalonePriceKeySetMessagePayloadBuilder.of();
    }

    public static StandalonePriceKeySetMessagePayloadBuilder builder(
            final StandalonePriceKeySetMessagePayload template) {
        return StandalonePriceKeySetMessagePayloadBuilder.of(template);
    }

    default <T> T withStandalonePriceKeySetMessagePayload(Function<StandalonePriceKeySetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceKeySetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceKeySetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceKeySetMessagePayload>";
            }
        };
    }
}
