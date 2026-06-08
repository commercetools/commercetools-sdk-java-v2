
package com.commercetools.api.models.message;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuoteSetValidToAction" rel="nofollow">Set Valid To</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteValidToSetMessagePayload stagedQuoteValidToSetMessagePayload = StagedQuoteValidToSetMessagePayload.builder()
 *             .validTo(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StagedQuoteValidToSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedQuoteValidToSetMessagePayloadImpl.class)
public interface StagedQuoteValidToSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for StagedQuoteValidToSetMessagePayload
     */
    String STAGED_QUOTE_VALID_TO_SET = "StagedQuoteValidToSet";

    /**
     *  <p>Expiration date for the Staged Quote after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuoteSetValidToAction" rel="nofollow">Set Valid To</a> update action.</p>
     * @return validTo
     */
    @NotNull
    @JsonProperty("validTo")
    public ZonedDateTime getValidTo();

    /**
     *  <p>Expiration date for the Staged Quote after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuoteSetValidToAction" rel="nofollow">Set Valid To</a> update action.</p>
     * @param validTo value to be set
     */

    public void setValidTo(final ZonedDateTime validTo);

    /**
     * factory method
     * @return instance of StagedQuoteValidToSetMessagePayload
     */
    public static StagedQuoteValidToSetMessagePayload of() {
        return new StagedQuoteValidToSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StagedQuoteValidToSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedQuoteValidToSetMessagePayload of(final StagedQuoteValidToSetMessagePayload template) {
        StagedQuoteValidToSetMessagePayloadImpl instance = new StagedQuoteValidToSetMessagePayloadImpl();
        instance.setValidTo(template.getValidTo());
        return instance;
    }

    public StagedQuoteValidToSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of StagedQuoteValidToSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedQuoteValidToSetMessagePayload deepCopy(
            @Nullable final StagedQuoteValidToSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        StagedQuoteValidToSetMessagePayloadImpl instance = new StagedQuoteValidToSetMessagePayloadImpl();
        instance.setValidTo(template.getValidTo());
        return instance;
    }

    /**
     * builder factory method for StagedQuoteValidToSetMessagePayload
     * @return builder
     */
    public static StagedQuoteValidToSetMessagePayloadBuilder builder() {
        return StagedQuoteValidToSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for StagedQuoteValidToSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteValidToSetMessagePayloadBuilder builder(
            final StagedQuoteValidToSetMessagePayload template) {
        return StagedQuoteValidToSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedQuoteValidToSetMessagePayload(Function<StagedQuoteValidToSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteValidToSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteValidToSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteValidToSetMessagePayload>";
            }
        };
    }
}
