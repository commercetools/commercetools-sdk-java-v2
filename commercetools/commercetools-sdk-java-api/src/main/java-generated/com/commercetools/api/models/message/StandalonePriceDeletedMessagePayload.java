
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Delete StandalonePrice request.</p>
 *
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
@JsonDeserialize(as = StandalonePriceDeletedMessagePayloadImpl.class)
public interface StandalonePriceDeletedMessagePayload extends MessagePayload {

    String STANDALONE_PRICE_DELETED = "StandalonePriceDeleted";

    public static StandalonePriceDeletedMessagePayload of() {
        return new StandalonePriceDeletedMessagePayloadImpl();
    }

    public static StandalonePriceDeletedMessagePayload of(final StandalonePriceDeletedMessagePayload template) {
        StandalonePriceDeletedMessagePayloadImpl instance = new StandalonePriceDeletedMessagePayloadImpl();
        return instance;
    }

    public static StandalonePriceDeletedMessagePayloadBuilder builder() {
        return StandalonePriceDeletedMessagePayloadBuilder.of();
    }

    public static StandalonePriceDeletedMessagePayloadBuilder builder(
            final StandalonePriceDeletedMessagePayload template) {
        return StandalonePriceDeletedMessagePayloadBuilder.of(template);
    }

    default <T> T withStandalonePriceDeletedMessagePayload(Function<StandalonePriceDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceDeletedMessagePayload>";
            }
        };
    }
}
