
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidUntilAction" rel="nofollow">Set Valid Until</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceValidUntilSetMessagePayload standalonePriceValidUntilSetMessagePayload = StandalonePriceValidUntilSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StandalonePriceValidUntilSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceValidUntilSetMessagePayloadImpl.class)
public interface StandalonePriceValidUntilSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for StandalonePriceValidUntilSetMessagePayload
     */
    String STANDALONE_PRICE_VALID_UNTIL_SET = "StandalonePriceValidUntilSet";

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validUntil</code> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidUntilAction" rel="nofollow">Set Valid Until</a> update action.</p>
     * @return validUntil
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validUntil</code> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidUntilAction" rel="nofollow">Set Valid Until</a> update action.</p>
     * @return previousValidUntil
     */

    @JsonProperty("previousValidUntil")
    public ZonedDateTime getPreviousValidUntil();

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validUntil</code> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidUntilAction" rel="nofollow">Set Valid Until</a> update action.</p>
     * @param validUntil value to be set
     */

    public void setValidUntil(final ZonedDateTime validUntil);

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validUntil</code> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidUntilAction" rel="nofollow">Set Valid Until</a> update action.</p>
     * @param previousValidUntil value to be set
     */

    public void setPreviousValidUntil(final ZonedDateTime previousValidUntil);

    /**
     * factory method
     * @return instance of StandalonePriceValidUntilSetMessagePayload
     */
    public static StandalonePriceValidUntilSetMessagePayload of() {
        return new StandalonePriceValidUntilSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceValidUntilSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceValidUntilSetMessagePayload of(
            final StandalonePriceValidUntilSetMessagePayload template) {
        StandalonePriceValidUntilSetMessagePayloadImpl instance = new StandalonePriceValidUntilSetMessagePayloadImpl();
        instance.setValidUntil(template.getValidUntil());
        instance.setPreviousValidUntil(template.getPreviousValidUntil());
        return instance;
    }

    public StandalonePriceValidUntilSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceValidUntilSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceValidUntilSetMessagePayload deepCopy(
            @Nullable final StandalonePriceValidUntilSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        StandalonePriceValidUntilSetMessagePayloadImpl instance = new StandalonePriceValidUntilSetMessagePayloadImpl();
        instance.setValidUntil(template.getValidUntil());
        instance.setPreviousValidUntil(template.getPreviousValidUntil());
        return instance;
    }

    /**
     * builder factory method for StandalonePriceValidUntilSetMessagePayload
     * @return builder
     */
    public static StandalonePriceValidUntilSetMessagePayloadBuilder builder() {
        return StandalonePriceValidUntilSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for StandalonePriceValidUntilSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceValidUntilSetMessagePayloadBuilder builder(
            final StandalonePriceValidUntilSetMessagePayload template) {
        return StandalonePriceValidUntilSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceValidUntilSetMessagePayload(
            Function<StandalonePriceValidUntilSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceValidUntilSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceValidUntilSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceValidUntilSetMessagePayload>";
            }
        };
    }
}
