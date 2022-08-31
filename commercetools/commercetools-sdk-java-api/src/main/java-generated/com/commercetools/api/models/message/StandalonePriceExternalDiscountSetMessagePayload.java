
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
 *  <p>Generated after a successful Set Discounted Price update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceExternalDiscountSetMessagePayload standalonePriceExternalDiscountSetMessagePayload = StandalonePriceExternalDiscountSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceExternalDiscountSetMessagePayloadImpl.class)
public interface StandalonePriceExternalDiscountSetMessagePayload extends MessagePayload {

    String STANDALONE_PRICE_EXTERNAL_DISCOUNT_SET = "StandalonePriceExternalDiscountSet";

    /**
     *  <p>The <code>discounted</code> value of the StandalonePrice after the Set Discounted Price update action.</p>
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();

    public void setDiscounted(final DiscountedPrice discounted);

    public static StandalonePriceExternalDiscountSetMessagePayload of() {
        return new StandalonePriceExternalDiscountSetMessagePayloadImpl();
    }

    public static StandalonePriceExternalDiscountSetMessagePayload of(
            final StandalonePriceExternalDiscountSetMessagePayload template) {
        StandalonePriceExternalDiscountSetMessagePayloadImpl instance = new StandalonePriceExternalDiscountSetMessagePayloadImpl();
        instance.setDiscounted(template.getDiscounted());
        return instance;
    }

    public static StandalonePriceExternalDiscountSetMessagePayloadBuilder builder() {
        return StandalonePriceExternalDiscountSetMessagePayloadBuilder.of();
    }

    public static StandalonePriceExternalDiscountSetMessagePayloadBuilder builder(
            final StandalonePriceExternalDiscountSetMessagePayload template) {
        return StandalonePriceExternalDiscountSetMessagePayloadBuilder.of(template);
    }

    default <T> T withStandalonePriceExternalDiscountSetMessagePayload(
            Function<StandalonePriceExternalDiscountSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceExternalDiscountSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceExternalDiscountSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceExternalDiscountSetMessagePayload>";
            }
        };
    }
}
