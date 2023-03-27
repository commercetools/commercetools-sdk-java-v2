
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
 *  <p>Generated after a successful Change Staged Quote State update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteStateChangedMessage stagedQuoteStateChangedMessage = StagedQuoteStateChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .stagedQuoteState(StagedQuoteState.IN_PROGRESS)
 *             .oldStagedQuoteState(StagedQuoteState.IN_PROGRESS)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedQuoteStateChangedMessageImpl.class)
public interface StagedQuoteStateChangedMessage extends Message {

    /**
     * discriminator value for StagedQuoteStateChangedMessage
     */
    String STAGED_QUOTE_STATE_CHANGED = "StagedQuoteStateChanged";

    /**
     *  <p>State of the Staged Quote after the Change Staged Quote State update action.</p>
     * @return stagedQuoteState
     */
    @NotNull
    @JsonProperty("stagedQuoteState")
    public StagedQuoteState getStagedQuoteState();

    /**
     *  <p>State of the Staged Quote before the Change Staged Quote State update action.</p>
     * @return oldStagedQuoteState
     */
    @NotNull
    @JsonProperty("oldStagedQuoteState")
    public StagedQuoteState getOldStagedQuoteState();

    /**
     *  <p>State of the Staged Quote after the Change Staged Quote State update action.</p>
     * @param stagedQuoteState value to be set
     */

    public void setStagedQuoteState(final StagedQuoteState stagedQuoteState);

    /**
     *  <p>State of the Staged Quote before the Change Staged Quote State update action.</p>
     * @param oldStagedQuoteState value to be set
     */

    public void setOldStagedQuoteState(final StagedQuoteState oldStagedQuoteState);

    /**
     * factory method
     * @return instance of StagedQuoteStateChangedMessage
     */
    public static StagedQuoteStateChangedMessage of() {
        return new StagedQuoteStateChangedMessageImpl();
    }

    /**
     * factory method to copy an instance of StagedQuoteStateChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedQuoteStateChangedMessage of(final StagedQuoteStateChangedMessage template) {
        StagedQuoteStateChangedMessageImpl instance = new StagedQuoteStateChangedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setStagedQuoteState(template.getStagedQuoteState());
        instance.setOldStagedQuoteState(template.getOldStagedQuoteState());
        return instance;
    }

    /**
     * builder factory method for StagedQuoteStateChangedMessage
     * @return builder
     */
    public static StagedQuoteStateChangedMessageBuilder builder() {
        return StagedQuoteStateChangedMessageBuilder.of();
    }

    /**
     * create builder for StagedQuoteStateChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteStateChangedMessageBuilder builder(final StagedQuoteStateChangedMessage template) {
        return StagedQuoteStateChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedQuoteStateChangedMessage(Function<StagedQuoteStateChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteStateChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteStateChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteStateChangedMessage>";
            }
        };
    }
}
