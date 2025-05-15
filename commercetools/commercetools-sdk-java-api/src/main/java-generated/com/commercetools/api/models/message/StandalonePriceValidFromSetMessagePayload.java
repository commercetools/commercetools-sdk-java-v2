
package com.commercetools.api.models.message;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Valid From update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceValidFromSetMessagePayload standalonePriceValidFromSetMessagePayload = StandalonePriceValidFromSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StandalonePriceValidFromSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceValidFromSetMessagePayloadImpl.class)
public interface StandalonePriceValidFromSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for StandalonePriceValidFromSetMessagePayload
     */
    String STANDALONE_PRICE_VALID_FROM_SET = "StandalonePriceValidFromSet";

    /**
     *  <p>Value of StandalonePrice <code>validFrom</code> after the Set Valid From update action.</p>
     * @return validFrom
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Value of StandalonePrice <code>validFrom</code> before the Set Valid From update action.</p>
     * @return previousValidFrom
     */

    @JsonProperty("previousValidFrom")
    public ZonedDateTime getPreviousValidFrom();

    /**
     *  <p>Value of StandalonePrice <code>validFrom</code> after the Set Valid From update action.</p>
     * @param validFrom value to be set
     */

    public void setValidFrom(final ZonedDateTime validFrom);

    /**
     *  <p>Value of StandalonePrice <code>validFrom</code> before the Set Valid From update action.</p>
     * @param previousValidFrom value to be set
     */

    public void setPreviousValidFrom(final ZonedDateTime previousValidFrom);

    /**
     * factory method
     * @return instance of StandalonePriceValidFromSetMessagePayload
     */
    public static StandalonePriceValidFromSetMessagePayload of() {
        return new StandalonePriceValidFromSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceValidFromSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceValidFromSetMessagePayload of(
            final StandalonePriceValidFromSetMessagePayload template) {
        StandalonePriceValidFromSetMessagePayloadImpl instance = new StandalonePriceValidFromSetMessagePayloadImpl();
        instance.setValidFrom(template.getValidFrom());
        instance.setPreviousValidFrom(template.getPreviousValidFrom());
        return instance;
    }

    public StandalonePriceValidFromSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceValidFromSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceValidFromSetMessagePayload deepCopy(
            @Nullable final StandalonePriceValidFromSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        StandalonePriceValidFromSetMessagePayloadImpl instance = new StandalonePriceValidFromSetMessagePayloadImpl();
        instance.setValidFrom(template.getValidFrom());
        instance.setPreviousValidFrom(template.getPreviousValidFrom());
        return instance;
    }

    /**
     * builder factory method for StandalonePriceValidFromSetMessagePayload
     * @return builder
     */
    public static StandalonePriceValidFromSetMessagePayloadBuilder builder() {
        return StandalonePriceValidFromSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for StandalonePriceValidFromSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceValidFromSetMessagePayloadBuilder builder(
            final StandalonePriceValidFromSetMessagePayload template) {
        return StandalonePriceValidFromSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceValidFromSetMessagePayload(
            Function<StandalonePriceValidFromSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceValidFromSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceValidFromSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceValidFromSetMessagePayload>";
            }
        };
    }
}
