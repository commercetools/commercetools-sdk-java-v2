
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Delete StagedQuote request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteDeletedMessagePayload stagedQuoteDeletedMessagePayload = StagedQuoteDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StagedQuoteDeleted")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedQuoteDeletedMessagePayloadImpl.class)
public interface StagedQuoteDeletedMessagePayload extends MessagePayload {

    /**
     * discriminator value for StagedQuoteDeletedMessagePayload
     */
    String STAGED_QUOTE_DELETED = "StagedQuoteDeleted";

    /**
     * factory method
     * @return instance of StagedQuoteDeletedMessagePayload
     */
    public static StagedQuoteDeletedMessagePayload of() {
        return new StagedQuoteDeletedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StagedQuoteDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedQuoteDeletedMessagePayload of(final StagedQuoteDeletedMessagePayload template) {
        StagedQuoteDeletedMessagePayloadImpl instance = new StagedQuoteDeletedMessagePayloadImpl();
        return instance;
    }

    public StagedQuoteDeletedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of StagedQuoteDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedQuoteDeletedMessagePayload deepCopy(@Nullable final StagedQuoteDeletedMessagePayload template) {
        if (template == null) {
            return null;
        }
        StagedQuoteDeletedMessagePayloadImpl instance = new StagedQuoteDeletedMessagePayloadImpl();
        return instance;
    }

    /**
     * builder factory method for StagedQuoteDeletedMessagePayload
     * @return builder
     */
    public static StagedQuoteDeletedMessagePayloadBuilder builder() {
        return StagedQuoteDeletedMessagePayloadBuilder.of();
    }

    /**
     * create builder for StagedQuoteDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteDeletedMessagePayloadBuilder builder(final StagedQuoteDeletedMessagePayload template) {
        return StagedQuoteDeletedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedQuoteDeletedMessagePayload(Function<StagedQuoteDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteDeletedMessagePayload>";
            }
        };
    }
}
