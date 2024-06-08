
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
 *  <p>Generated after a Product Discount is successfully applied to a StandalonePrice.</p>
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

    /**
     * discriminator value for StandalonePriceDiscountSetMessagePayload
     */
    String STANDALONE_PRICE_DISCOUNT_SET = "StandalonePriceDiscountSet";

    /**
     *  <p>The new <code>discounted</code> value of the updated StandalonePrice.</p>
     * @return discounted
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();

    /**
     *  <p>The new <code>discounted</code> value of the updated StandalonePrice.</p>
     * @param discounted value to be set
     */

    public void setDiscounted(final DiscountedPrice discounted);

    /**
     * factory method
     * @return instance of StandalonePriceDiscountSetMessagePayload
     */
    public static StandalonePriceDiscountSetMessagePayload of() {
        return new StandalonePriceDiscountSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceDiscountSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceDiscountSetMessagePayload of(final StandalonePriceDiscountSetMessagePayload template) {
        StandalonePriceDiscountSetMessagePayloadImpl instance = new StandalonePriceDiscountSetMessagePayloadImpl();
        instance.setDiscounted(template.getDiscounted());
        return instance;
    }

    /**
     * factory method to create a deep copy of StandalonePriceDiscountSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceDiscountSetMessagePayload deepCopy(
            @Nullable final StandalonePriceDiscountSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        StandalonePriceDiscountSetMessagePayloadImpl instance = new StandalonePriceDiscountSetMessagePayloadImpl();
        instance.setDiscounted(com.commercetools.api.models.common.DiscountedPrice.deepCopy(template.getDiscounted()));
        return instance;
    }

    /**
     * builder factory method for StandalonePriceDiscountSetMessagePayload
     * @return builder
     */
    public static StandalonePriceDiscountSetMessagePayloadBuilder builder() {
        return StandalonePriceDiscountSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for StandalonePriceDiscountSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceDiscountSetMessagePayloadBuilder builder(
            final StandalonePriceDiscountSetMessagePayload template) {
        return StandalonePriceDiscountSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceDiscountSetMessagePayload(
            Function<StandalonePriceDiscountSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceDiscountSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceDiscountSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceDiscountSetMessagePayload>";
            }
        };
    }
}
