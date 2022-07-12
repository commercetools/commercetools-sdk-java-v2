
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Change Value update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceValueChangedMessagePayload standalonePriceValueChangedMessagePayload = StandalonePriceValueChangedMessagePayload.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceValueChangedMessagePayloadImpl.class)
public interface StandalonePriceValueChangedMessagePayload extends MessagePayload {

    String STANDALONE_PRICE_VALUE_CHANGED = "StandalonePriceValueChanged";

    /**
     *  <p>The new value of the updated StandalonePrice.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();

    public void setValue(final Money value);

    public static StandalonePriceValueChangedMessagePayload of() {
        return new StandalonePriceValueChangedMessagePayloadImpl();
    }

    public static StandalonePriceValueChangedMessagePayload of(
            final StandalonePriceValueChangedMessagePayload template) {
        StandalonePriceValueChangedMessagePayloadImpl instance = new StandalonePriceValueChangedMessagePayloadImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public static StandalonePriceValueChangedMessagePayloadBuilder builder() {
        return StandalonePriceValueChangedMessagePayloadBuilder.of();
    }

    public static StandalonePriceValueChangedMessagePayloadBuilder builder(
            final StandalonePriceValueChangedMessagePayload template) {
        return StandalonePriceValueChangedMessagePayloadBuilder.of(template);
    }

    default <T> T withStandalonePriceValueChangedMessagePayload(
            Function<StandalonePriceValueChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceValueChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceValueChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceValueChangedMessagePayload>";
            }
        };
    }
}
