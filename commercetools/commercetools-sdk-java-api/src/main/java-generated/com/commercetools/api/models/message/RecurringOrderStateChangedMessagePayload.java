
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetStateAction" rel="nofollow">Set RecurringOrderState</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderStateChangedMessagePayload recurringOrderStateChangedMessagePayload = RecurringOrderStateChangedMessagePayload.builder()
 *             .state(RecurringOrderState.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RecurringOrderStateChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderStateChangedMessagePayloadImpl.class)
public interface RecurringOrderStateChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for RecurringOrderStateChangedMessagePayload
     */
    String RECURRING_ORDER_STATE_CHANGED = "RecurringOrderStateChanged";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderState" rel="nofollow">RecurringOrderState</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetStateAction" rel="nofollow">Set RecurringOrderState</a> update action.</p>
     * @return state
     */
    @NotNull
    @JsonProperty("state")
    public RecurringOrderState getState();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderState" rel="nofollow">RecurringOrderState</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetStateAction" rel="nofollow">Set RecurringOrderState</a> update action.</p>
     * @return oldState
     */

    @JsonProperty("oldState")
    public RecurringOrderState getOldState();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderState" rel="nofollow">RecurringOrderState</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetStateAction" rel="nofollow">Set RecurringOrderState</a> update action.</p>
     * @param state value to be set
     */

    public void setState(final RecurringOrderState state);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderState" rel="nofollow">RecurringOrderState</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetStateAction" rel="nofollow">Set RecurringOrderState</a> update action.</p>
     * @param oldState value to be set
     */

    public void setOldState(final RecurringOrderState oldState);

    /**
     * factory method
     * @return instance of RecurringOrderStateChangedMessagePayload
     */
    public static RecurringOrderStateChangedMessagePayload of() {
        return new RecurringOrderStateChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderStateChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderStateChangedMessagePayload of(final RecurringOrderStateChangedMessagePayload template) {
        RecurringOrderStateChangedMessagePayloadImpl instance = new RecurringOrderStateChangedMessagePayloadImpl();
        instance.setState(template.getState());
        instance.setOldState(template.getOldState());
        return instance;
    }

    public RecurringOrderStateChangedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderStateChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderStateChangedMessagePayload deepCopy(
            @Nullable final RecurringOrderStateChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        RecurringOrderStateChangedMessagePayloadImpl instance = new RecurringOrderStateChangedMessagePayloadImpl();
        instance.setState(template.getState());
        instance.setOldState(template.getOldState());
        return instance;
    }

    /**
     * builder factory method for RecurringOrderStateChangedMessagePayload
     * @return builder
     */
    public static RecurringOrderStateChangedMessagePayloadBuilder builder() {
        return RecurringOrderStateChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for RecurringOrderStateChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderStateChangedMessagePayloadBuilder builder(
            final RecurringOrderStateChangedMessagePayload template) {
        return RecurringOrderStateChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderStateChangedMessagePayload(
            Function<RecurringOrderStateChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderStateChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderStateChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderStateChangedMessagePayload>";
            }
        };
    }
}
