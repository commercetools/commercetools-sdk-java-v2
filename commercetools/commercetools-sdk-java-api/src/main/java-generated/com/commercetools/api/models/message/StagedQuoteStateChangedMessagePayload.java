
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.staged_quote.StagedQuoteState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteStateChangedMessagePayload
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedQuoteStateChangedMessagePayloadImpl.class)
public interface StagedQuoteStateChangedMessagePayload extends MessagePayload {

    String STAGED_QUOTE_STATE_CHANGED = "StagedQuoteStateChanged";

    /**
     *  <p>Predefined states tracking the status of the Staged Quote.</p>
     */
    @NotNull
    @JsonProperty("stagedQuoteState")
    public StagedQuoteState getStagedQuoteState();

    /**
     *  <p>Predefined states tracking the status of the Staged Quote.</p>
     */
    @NotNull
    @JsonProperty("oldStagedQuoteState")
    public StagedQuoteState getOldStagedQuoteState();

    public void setStagedQuoteState(final StagedQuoteState stagedQuoteState);

    public void setOldStagedQuoteState(final StagedQuoteState oldStagedQuoteState);

    public static StagedQuoteStateChangedMessagePayload of() {
        return new StagedQuoteStateChangedMessagePayloadImpl();
    }

    public static StagedQuoteStateChangedMessagePayload of(final StagedQuoteStateChangedMessagePayload template) {
        StagedQuoteStateChangedMessagePayloadImpl instance = new StagedQuoteStateChangedMessagePayloadImpl();
        instance.setStagedQuoteState(template.getStagedQuoteState());
        instance.setOldStagedQuoteState(template.getOldStagedQuoteState());
        return instance;
    }

    public static StagedQuoteStateChangedMessagePayloadBuilder builder() {
        return StagedQuoteStateChangedMessagePayloadBuilder.of();
    }

    public static StagedQuoteStateChangedMessagePayloadBuilder builder(
            final StagedQuoteStateChangedMessagePayload template) {
        return StagedQuoteStateChangedMessagePayloadBuilder.of(template);
    }

    default <T> T withStagedQuoteStateChangedMessagePayload(Function<StagedQuoteStateChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteStateChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteStateChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteStateChangedMessagePayload>";
            }
        };
    }
}
