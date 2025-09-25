
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * RecurringOrderSetOrderSkipConfigurationAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderSetOrderSkipConfigurationAction recurringOrderSetOrderSkipConfigurationAction = RecurringOrderSetOrderSkipConfigurationAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setOrderSkipConfiguration")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderSetOrderSkipConfigurationActionImpl.class)
public interface RecurringOrderSetOrderSkipConfigurationAction extends RecurringOrderUpdateAction {

    /**
     * discriminator value for RecurringOrderSetOrderSkipConfigurationAction
     */
    String SET_ORDER_SKIP_CONFIGURATION = "setOrderSkipConfiguration";

    /**
     *  <p>Configuration for skipping future orders of the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Order</a>.</p>
     * @return skipConfigurationInputDraft
     */
    @Valid
    @JsonProperty("skipConfigurationInputDraft")
    public SkipConfigurationDraft getSkipConfigurationInputDraft();

    /**
     *  <p>Date and time (UTC) the Recurring Order will expire and stop generating new orders.</p>
     * @return updatedExpiresAt
     */

    @JsonProperty("updatedExpiresAt")
    public ZonedDateTime getUpdatedExpiresAt();

    /**
     *  <p>Configuration for skipping future orders of the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Order</a>.</p>
     * @param skipConfigurationInputDraft value to be set
     */

    public void setSkipConfigurationInputDraft(final SkipConfigurationDraft skipConfigurationInputDraft);

    /**
     *  <p>Date and time (UTC) the Recurring Order will expire and stop generating new orders.</p>
     * @param updatedExpiresAt value to be set
     */

    public void setUpdatedExpiresAt(final ZonedDateTime updatedExpiresAt);

    /**
     * factory method
     * @return instance of RecurringOrderSetOrderSkipConfigurationAction
     */
    public static RecurringOrderSetOrderSkipConfigurationAction of() {
        return new RecurringOrderSetOrderSkipConfigurationActionImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderSetOrderSkipConfigurationAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderSetOrderSkipConfigurationAction of(
            final RecurringOrderSetOrderSkipConfigurationAction template) {
        RecurringOrderSetOrderSkipConfigurationActionImpl instance = new RecurringOrderSetOrderSkipConfigurationActionImpl();
        instance.setSkipConfigurationInputDraft(template.getSkipConfigurationInputDraft());
        instance.setUpdatedExpiresAt(template.getUpdatedExpiresAt());
        return instance;
    }

    public RecurringOrderSetOrderSkipConfigurationAction copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderSetOrderSkipConfigurationAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderSetOrderSkipConfigurationAction deepCopy(
            @Nullable final RecurringOrderSetOrderSkipConfigurationAction template) {
        if (template == null) {
            return null;
        }
        RecurringOrderSetOrderSkipConfigurationActionImpl instance = new RecurringOrderSetOrderSkipConfigurationActionImpl();
        instance.setSkipConfigurationInputDraft(com.commercetools.api.models.recurring_order.SkipConfigurationDraft
                .deepCopy(template.getSkipConfigurationInputDraft()));
        instance.setUpdatedExpiresAt(template.getUpdatedExpiresAt());
        return instance;
    }

    /**
     * builder factory method for RecurringOrderSetOrderSkipConfigurationAction
     * @return builder
     */
    public static RecurringOrderSetOrderSkipConfigurationActionBuilder builder() {
        return RecurringOrderSetOrderSkipConfigurationActionBuilder.of();
    }

    /**
     * create builder for RecurringOrderSetOrderSkipConfigurationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderSetOrderSkipConfigurationActionBuilder builder(
            final RecurringOrderSetOrderSkipConfigurationAction template) {
        return RecurringOrderSetOrderSkipConfigurationActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderSetOrderSkipConfigurationAction(
            Function<RecurringOrderSetOrderSkipConfigurationAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderSetOrderSkipConfigurationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderSetOrderSkipConfigurationAction>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderSetOrderSkipConfigurationAction>";
            }
        };
    }
}
