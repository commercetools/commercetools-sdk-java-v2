
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    String STANDALONE_PRICE_CREATED = "StandalonePriceCreated";

    /**
     *  <p>The Standalone Price as it was created.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("standalonePrice")
    public StandalonePrice getStandalonePrice();

    public void setStandalonePrice(final StandalonePrice standalonePrice);

    public static StandalonePriceCreatedMessagePayload of() {
        return new StandalonePriceCreatedMessagePayloadImpl();
    }

    public static StandalonePriceCreatedMessagePayload of(final StandalonePriceCreatedMessagePayload template) {
        StandalonePriceCreatedMessagePayloadImpl instance = new StandalonePriceCreatedMessagePayloadImpl();
        instance.setStandalonePrice(template.getStandalonePrice());
        return instance;
    }

    public static StandalonePriceCreatedMessagePayloadBuilder builder() {
        return StandalonePriceCreatedMessagePayloadBuilder.of();
    }

    public static StandalonePriceCreatedMessagePayloadBuilder builder(
            final StandalonePriceCreatedMessagePayload template) {
        return StandalonePriceCreatedMessagePayloadBuilder.of(template);
    }

    default <T> T withStandalonePriceCreatedMessagePayload(Function<StandalonePriceCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceCreatedMessagePayload>";
            }
        };
    }
}
