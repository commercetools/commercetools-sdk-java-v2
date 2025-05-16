
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.DiscountedPrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

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
@io.vrap.rmf.base.client.utils.json.SubType("StandalonePriceExternalDiscountSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceExternalDiscountSetMessagePayloadImpl.class)
public interface StandalonePriceExternalDiscountSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for StandalonePriceExternalDiscountSetMessagePayload
     */
    String STANDALONE_PRICE_EXTERNAL_DISCOUNT_SET = "StandalonePriceExternalDiscountSet";

    /**
     *  <p>The <code>discounted</code> value of the StandalonePrice after the Set Discounted Price update action.</p>
     * @return discounted
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();

    /**
     *  <p>The <code>discounted</code> value of the StandalonePrice after the Set Discounted Price update action.</p>
     * @param discounted value to be set
     */

    public void setDiscounted(final DiscountedPrice discounted);

    /**
     * factory method
     * @return instance of StandalonePriceExternalDiscountSetMessagePayload
     */
    public static StandalonePriceExternalDiscountSetMessagePayload of() {
        return new StandalonePriceExternalDiscountSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceExternalDiscountSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceExternalDiscountSetMessagePayload of(
            final StandalonePriceExternalDiscountSetMessagePayload template) {
        StandalonePriceExternalDiscountSetMessagePayloadImpl instance = new StandalonePriceExternalDiscountSetMessagePayloadImpl();
        instance.setDiscounted(template.getDiscounted());
        return instance;
    }

    public StandalonePriceExternalDiscountSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceExternalDiscountSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceExternalDiscountSetMessagePayload deepCopy(
            @Nullable final StandalonePriceExternalDiscountSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        StandalonePriceExternalDiscountSetMessagePayloadImpl instance = new StandalonePriceExternalDiscountSetMessagePayloadImpl();
        instance.setDiscounted(com.commercetools.api.models.common.DiscountedPrice.deepCopy(template.getDiscounted()));
        return instance;
    }

    /**
     * builder factory method for StandalonePriceExternalDiscountSetMessagePayload
     * @return builder
     */
    public static StandalonePriceExternalDiscountSetMessagePayloadBuilder builder() {
        return StandalonePriceExternalDiscountSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for StandalonePriceExternalDiscountSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceExternalDiscountSetMessagePayloadBuilder builder(
            final StandalonePriceExternalDiscountSetMessagePayload template) {
        return StandalonePriceExternalDiscountSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceExternalDiscountSetMessagePayload(
            Function<StandalonePriceExternalDiscountSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceExternalDiscountSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceExternalDiscountSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceExternalDiscountSetMessagePayload>";
            }
        };
    }
}
