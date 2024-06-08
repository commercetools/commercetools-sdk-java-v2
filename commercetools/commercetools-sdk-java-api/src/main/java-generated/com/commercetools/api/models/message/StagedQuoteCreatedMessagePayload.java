
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.staged_quote.StagedQuote;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Create StagedQuote request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteCreatedMessagePayload stagedQuoteCreatedMessagePayload = StagedQuoteCreatedMessagePayload.builder()
 *             .stagedQuote(stagedQuoteBuilder -> stagedQuoteBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedQuoteCreatedMessagePayloadImpl.class)
public interface StagedQuoteCreatedMessagePayload extends MessagePayload {

    /**
     * discriminator value for StagedQuoteCreatedMessagePayload
     */
    String STAGED_QUOTE_CREATED = "StagedQuoteCreated";

    /**
     *  <p>Staged Quote that was created.</p>
     * @return stagedQuote
     */
    @NotNull
    @Valid
    @JsonProperty("stagedQuote")
    public StagedQuote getStagedQuote();

    /**
     *  <p>Staged Quote that was created.</p>
     * @param stagedQuote value to be set
     */

    public void setStagedQuote(final StagedQuote stagedQuote);

    /**
     * factory method
     * @return instance of StagedQuoteCreatedMessagePayload
     */
    public static StagedQuoteCreatedMessagePayload of() {
        return new StagedQuoteCreatedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StagedQuoteCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedQuoteCreatedMessagePayload of(final StagedQuoteCreatedMessagePayload template) {
        StagedQuoteCreatedMessagePayloadImpl instance = new StagedQuoteCreatedMessagePayloadImpl();
        instance.setStagedQuote(template.getStagedQuote());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedQuoteCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedQuoteCreatedMessagePayload deepCopy(@Nullable final StagedQuoteCreatedMessagePayload template) {
        if (template == null) {
            return null;
        }
        StagedQuoteCreatedMessagePayloadImpl instance = new StagedQuoteCreatedMessagePayloadImpl();
        instance.setStagedQuote(
            com.commercetools.api.models.staged_quote.StagedQuote.deepCopy(template.getStagedQuote()));
        return instance;
    }

    /**
     * builder factory method for StagedQuoteCreatedMessagePayload
     * @return builder
     */
    public static StagedQuoteCreatedMessagePayloadBuilder builder() {
        return StagedQuoteCreatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for StagedQuoteCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteCreatedMessagePayloadBuilder builder(final StagedQuoteCreatedMessagePayload template) {
        return StagedQuoteCreatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedQuoteCreatedMessagePayload(Function<StagedQuoteCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteCreatedMessagePayload>";
            }
        };
    }
}
