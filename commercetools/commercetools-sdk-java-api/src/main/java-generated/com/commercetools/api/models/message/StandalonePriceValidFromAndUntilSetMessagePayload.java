
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
 *  <p>Generated after a successful Set Valid From and Until update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceValidFromAndUntilSetMessagePayload standalonePriceValidFromAndUntilSetMessagePayload = StandalonePriceValidFromAndUntilSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceValidFromAndUntilSetMessagePayloadImpl.class)
public interface StandalonePriceValidFromAndUntilSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for StandalonePriceValidFromAndUntilSetMessagePayload
     */
    String STANDALONE_PRICE_VALID_FROM_AND_UNTIL_SET = "StandalonePriceValidFromAndUntilSet";

    /**
     *  <p>Value of StandalonePrice <code>validFrom</code> after the Set Valid From and Until update action.</p>
     * @return validFrom
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Value of StandalonePrice <code>validFrom</code> before the Set Valid From and Until update action.</p>
     * @return previousValidFrom
     */

    @JsonProperty("previousValidFrom")
    public ZonedDateTime getPreviousValidFrom();

    /**
     *  <p>Value of StandalonePrice <code>validUntil</code> after the Set Valid From and Until update action.</p>
     * @return validUntil
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Value of StandalonePrice <code>validUntil</code> before the Set Valid From and Until update action.</p>
     * @return previousValidUntil
     */

    @JsonProperty("previousValidUntil")
    public ZonedDateTime getPreviousValidUntil();

    /**
     *  <p>Value of StandalonePrice <code>validFrom</code> after the Set Valid From and Until update action.</p>
     * @param validFrom value to be set
     */

    public void setValidFrom(final ZonedDateTime validFrom);

    /**
     *  <p>Value of StandalonePrice <code>validFrom</code> before the Set Valid From and Until update action.</p>
     * @param previousValidFrom value to be set
     */

    public void setPreviousValidFrom(final ZonedDateTime previousValidFrom);

    /**
     *  <p>Value of StandalonePrice <code>validUntil</code> after the Set Valid From and Until update action.</p>
     * @param validUntil value to be set
     */

    public void setValidUntil(final ZonedDateTime validUntil);

    /**
     *  <p>Value of StandalonePrice <code>validUntil</code> before the Set Valid From and Until update action.</p>
     * @param previousValidUntil value to be set
     */

    public void setPreviousValidUntil(final ZonedDateTime previousValidUntil);

    /**
     * factory method
     * @return instance of StandalonePriceValidFromAndUntilSetMessagePayload
     */
    public static StandalonePriceValidFromAndUntilSetMessagePayload of() {
        return new StandalonePriceValidFromAndUntilSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceValidFromAndUntilSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceValidFromAndUntilSetMessagePayload of(
            final StandalonePriceValidFromAndUntilSetMessagePayload template) {
        StandalonePriceValidFromAndUntilSetMessagePayloadImpl instance = new StandalonePriceValidFromAndUntilSetMessagePayloadImpl();
        instance.setValidFrom(template.getValidFrom());
        instance.setPreviousValidFrom(template.getPreviousValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setPreviousValidUntil(template.getPreviousValidUntil());
        return instance;
    }

    /**
     * factory method to create a deep copy of StandalonePriceValidFromAndUntilSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceValidFromAndUntilSetMessagePayload deepCopy(
            @Nullable final StandalonePriceValidFromAndUntilSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        StandalonePriceValidFromAndUntilSetMessagePayloadImpl instance = new StandalonePriceValidFromAndUntilSetMessagePayloadImpl();
        instance.setValidFrom(template.getValidFrom());
        instance.setPreviousValidFrom(template.getPreviousValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setPreviousValidUntil(template.getPreviousValidUntil());
        return instance;
    }

    /**
     * builder factory method for StandalonePriceValidFromAndUntilSetMessagePayload
     * @return builder
     */
    public static StandalonePriceValidFromAndUntilSetMessagePayloadBuilder builder() {
        return StandalonePriceValidFromAndUntilSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for StandalonePriceValidFromAndUntilSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceValidFromAndUntilSetMessagePayloadBuilder builder(
            final StandalonePriceValidFromAndUntilSetMessagePayload template) {
        return StandalonePriceValidFromAndUntilSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceValidFromAndUntilSetMessagePayload(
            Function<StandalonePriceValidFromAndUntilSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceValidFromAndUntilSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceValidFromAndUntilSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceValidFromAndUntilSetMessagePayload>";
            }
        };
    }
}
