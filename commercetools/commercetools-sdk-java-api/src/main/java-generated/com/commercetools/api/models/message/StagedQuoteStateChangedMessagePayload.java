
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.staged_quote.StagedQuoteState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuoteChangeStagedQuoteStateAction" rel="nofollow">Change Staged Quote State</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteStateChangedMessagePayload stagedQuoteStateChangedMessagePayload = StagedQuoteStateChangedMessagePayload.builder()
 *             .stagedQuoteState(StagedQuoteState.IN_PROGRESS)
 *             .oldStagedQuoteState(StagedQuoteState.IN_PROGRESS)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StagedQuoteStateChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedQuoteStateChangedMessagePayloadImpl.class)
public interface StagedQuoteStateChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for StagedQuoteStateChangedMessagePayload
     */
    String STAGED_QUOTE_STATE_CHANGED = "StagedQuoteStateChanged";

    /**
     *  <p>State of the Staged Quote after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuoteChangeStagedQuoteStateAction" rel="nofollow">Change Staged Quote State</a> update action.</p>
     * @return stagedQuoteState
     */
    @NotNull
    @JsonProperty("stagedQuoteState")
    public StagedQuoteState getStagedQuoteState();

    /**
     *  <p>State of the Staged Quote before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuoteChangeStagedQuoteStateAction" rel="nofollow">Change Staged Quote State</a> update action.</p>
     * @return oldStagedQuoteState
     */
    @NotNull
    @JsonProperty("oldStagedQuoteState")
    public StagedQuoteState getOldStagedQuoteState();

    /**
     *  <p>State of the Staged Quote after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuoteChangeStagedQuoteStateAction" rel="nofollow">Change Staged Quote State</a> update action.</p>
     * @param stagedQuoteState value to be set
     */

    public void setStagedQuoteState(final StagedQuoteState stagedQuoteState);

    /**
     *  <p>State of the Staged Quote before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuoteChangeStagedQuoteStateAction" rel="nofollow">Change Staged Quote State</a> update action.</p>
     * @param oldStagedQuoteState value to be set
     */

    public void setOldStagedQuoteState(final StagedQuoteState oldStagedQuoteState);

    /**
     * factory method
     * @return instance of StagedQuoteStateChangedMessagePayload
     */
    public static StagedQuoteStateChangedMessagePayload of() {
        return new StagedQuoteStateChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StagedQuoteStateChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedQuoteStateChangedMessagePayload of(final StagedQuoteStateChangedMessagePayload template) {
        StagedQuoteStateChangedMessagePayloadImpl instance = new StagedQuoteStateChangedMessagePayloadImpl();
        instance.setStagedQuoteState(template.getStagedQuoteState());
        instance.setOldStagedQuoteState(template.getOldStagedQuoteState());
        return instance;
    }

    public StagedQuoteStateChangedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of StagedQuoteStateChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedQuoteStateChangedMessagePayload deepCopy(
            @Nullable final StagedQuoteStateChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        StagedQuoteStateChangedMessagePayloadImpl instance = new StagedQuoteStateChangedMessagePayloadImpl();
        instance.setStagedQuoteState(template.getStagedQuoteState());
        instance.setOldStagedQuoteState(template.getOldStagedQuoteState());
        return instance;
    }

    /**
     * builder factory method for StagedQuoteStateChangedMessagePayload
     * @return builder
     */
    public static StagedQuoteStateChangedMessagePayloadBuilder builder() {
        return StagedQuoteStateChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for StagedQuoteStateChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteStateChangedMessagePayloadBuilder builder(
            final StagedQuoteStateChangedMessagePayload template) {
        return StagedQuoteStateChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedQuoteStateChangedMessagePayload(Function<StagedQuoteStateChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteStateChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteStateChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteStateChangedMessagePayload>";
            }
        };
    }
}
