
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.recurring_order.RecurringOrderState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Set RecurringOrderState update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderStateChangedMessage recurringOrderStateChangedMessage = RecurringOrderStateChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .state(RecurringOrderState.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RecurringOrderStateChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderStateChangedMessageImpl.class)
public interface RecurringOrderStateChangedMessage extends Message {

    /**
     * discriminator value for RecurringOrderStateChangedMessage
     */
    String RECURRING_ORDER_STATE_CHANGED = "RecurringOrderStateChanged";

    /**
     *  <p>RecurringOrderState after the Set RecurringOrderState update action.</p>
     * @return state
     */
    @NotNull
    @JsonProperty("state")
    public RecurringOrderState getState();

    /**
     *  <p>RecurringOrderState before the Set RecurringOrderState update action.</p>
     * @return oldState
     */

    @JsonProperty("oldState")
    public RecurringOrderState getOldState();

    /**
     *  <p>RecurringOrderState after the Set RecurringOrderState update action.</p>
     * @param state value to be set
     */

    public void setState(final RecurringOrderState state);

    /**
     *  <p>RecurringOrderState before the Set RecurringOrderState update action.</p>
     * @param oldState value to be set
     */

    public void setOldState(final RecurringOrderState oldState);

    /**
     * factory method
     * @return instance of RecurringOrderStateChangedMessage
     */
    public static RecurringOrderStateChangedMessage of() {
        return new RecurringOrderStateChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderStateChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderStateChangedMessage of(final RecurringOrderStateChangedMessage template) {
        RecurringOrderStateChangedMessageImpl instance = new RecurringOrderStateChangedMessageImpl();
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
        instance.setState(template.getState());
        instance.setOldState(template.getOldState());
        return instance;
    }

    public RecurringOrderStateChangedMessage copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderStateChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderStateChangedMessage deepCopy(
            @Nullable final RecurringOrderStateChangedMessage template) {
        if (template == null) {
            return null;
        }
        RecurringOrderStateChangedMessageImpl instance = new RecurringOrderStateChangedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setState(template.getState());
        instance.setOldState(template.getOldState());
        return instance;
    }

    /**
     * builder factory method for RecurringOrderStateChangedMessage
     * @return builder
     */
    public static RecurringOrderStateChangedMessageBuilder builder() {
        return RecurringOrderStateChangedMessageBuilder.of();
    }

    /**
     * create builder for RecurringOrderStateChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderStateChangedMessageBuilder builder(final RecurringOrderStateChangedMessage template) {
        return RecurringOrderStateChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderStateChangedMessage(Function<RecurringOrderStateChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderStateChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderStateChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderStateChangedMessage>";
            }
        };
    }
}
