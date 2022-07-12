
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.DiscountedPrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Emitted when the affected StandalonePrice is updated based on a Product Discount being applied.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceDiscountSetMessagePayload standalonePriceDiscountSetMessagePayload = StandalonePriceDiscountSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceDiscountSetMessagePayloadImpl.class)
public interface StandalonePriceDiscountSetMessagePayload extends MessagePayload {

    String STANDALONE_PRICE_DISCOUNT_SET = "StandalonePriceDiscountSet";

    /**
     *  <p>The new <code>discounted</code> value of the updated StandalonePrice.</p>
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();

    public void setDiscounted(final DiscountedPrice discounted);

    public static StandalonePriceDiscountSetMessagePayload of() {
        return new StandalonePriceDiscountSetMessagePayloadImpl();
    }

    public static StandalonePriceDiscountSetMessagePayload of(final StandalonePriceDiscountSetMessagePayload template) {
        StandalonePriceDiscountSetMessagePayloadImpl instance = new StandalonePriceDiscountSetMessagePayloadImpl();
        instance.setDiscounted(template.getDiscounted());
        return instance;
    }

    public static StandalonePriceDiscountSetMessagePayloadBuilder builder() {
        return StandalonePriceDiscountSetMessagePayloadBuilder.of();
    }

    public static StandalonePriceDiscountSetMessagePayloadBuilder builder(
            final StandalonePriceDiscountSetMessagePayload template) {
        return StandalonePriceDiscountSetMessagePayloadBuilder.of(template);
    }

    default <T> T withStandalonePriceDiscountSetMessagePayload(
            Function<StandalonePriceDiscountSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceDiscountSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceDiscountSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceDiscountSetMessagePayload>";
            }
        };
    }
}
