
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

    /**
     * discriminator value for StandalonePriceDeletedMessagePayload
     */
    String STANDALONE_PRICE_DELETED = "StandalonePriceDeleted";

    /**
     * factory method
     * @return instance of StandalonePriceDeletedMessagePayload
     */
    public static StandalonePriceDeletedMessagePayload of() {
        return new StandalonePriceDeletedMessagePayloadImpl();
    }

    /**
     * factory method to copy an instance of StandalonePriceDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceDeletedMessagePayload of(final StandalonePriceDeletedMessagePayload template) {
        StandalonePriceDeletedMessagePayloadImpl instance = new StandalonePriceDeletedMessagePayloadImpl();
        return instance;
    }

    /**
     * builder factory method for StandalonePriceDeletedMessagePayload
     * @return builder
     */
    public static StandalonePriceDeletedMessagePayloadBuilder builder() {
        return StandalonePriceDeletedMessagePayloadBuilder.of();
    }

    /**
     * create builder for StandalonePriceDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceDeletedMessagePayloadBuilder builder(
            final StandalonePriceDeletedMessagePayload template) {
        return StandalonePriceDeletedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceDeletedMessagePayload(Function<StandalonePriceDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceDeletedMessagePayload>";
            }
        };
    }
}
