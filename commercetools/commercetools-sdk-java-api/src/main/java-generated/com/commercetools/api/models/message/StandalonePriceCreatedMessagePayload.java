
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.standalone_price.StandalonePrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Create StandalonePrice request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceCreatedMessagePayload standalonePriceCreatedMessagePayload = StandalonePriceCreatedMessagePayload.builder()
 *             .standalonePrice(standalonePriceBuilder -> standalonePriceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceCreatedMessagePayloadImpl.class)
public interface StandalonePriceCreatedMessagePayload extends MessagePayload {

    /**
     * discriminator value for StandalonePriceCreatedMessagePayload
     */
    String STANDALONE_PRICE_CREATED = "StandalonePriceCreated";

    /**
     *  <p>Standalone Price that was created.</p>
     * @return standalonePrice
     */
    @NotNull
    @Valid
    @JsonProperty("standalonePrice")
    public StandalonePrice getStandalonePrice();

    /**
     *  <p>Standalone Price that was created.</p>
     * @param standalonePrice value to be set
     */

    public void setStandalonePrice(final StandalonePrice standalonePrice);

    /**
     * factory method
     * @return instance of StandalonePriceCreatedMessagePayload
     */
    public static StandalonePriceCreatedMessagePayload of() {
        return new StandalonePriceCreatedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceCreatedMessagePayload of(final StandalonePriceCreatedMessagePayload template) {
        StandalonePriceCreatedMessagePayloadImpl instance = new StandalonePriceCreatedMessagePayloadImpl();
        instance.setStandalonePrice(template.getStandalonePrice());
        return instance;
    }

    /**
     * factory method to create a deep copy of StandalonePriceCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceCreatedMessagePayload deepCopy(
            @Nullable final StandalonePriceCreatedMessagePayload template) {
        if (template == null) {
            return null;
        }
        StandalonePriceCreatedMessagePayloadImpl instance = new StandalonePriceCreatedMessagePayloadImpl();
        instance.setStandalonePrice(Optional.ofNullable(template.getStandalonePrice())
                .map(com.commercetools.api.models.standalone_price.StandalonePrice::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StandalonePriceCreatedMessagePayload
     * @return builder
     */
    public static StandalonePriceCreatedMessagePayloadBuilder builder() {
        return StandalonePriceCreatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for StandalonePriceCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceCreatedMessagePayloadBuilder builder(
            final StandalonePriceCreatedMessagePayload template) {
        return StandalonePriceCreatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceCreatedMessagePayload(Function<StandalonePriceCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceCreatedMessagePayload>";
            }
        };
    }
}
