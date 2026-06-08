
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Setting the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderState" rel="nofollow">RecurringOrderState</a> generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderStateChangedMessage" rel="nofollow">RecurringOrderStateChanged</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderSetStateAction recurringOrderSetStateAction = RecurringOrderSetStateAction.builder()
 *             .recurringOrderState(recurringOrderStateBuilder -> recurringOrderStateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setRecurringOrderState")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderSetStateActionImpl.class)
public interface RecurringOrderSetStateAction extends RecurringOrderUpdateAction {

    /**
     * discriminator value for RecurringOrderSetStateAction
     */
    String SET_RECURRING_ORDER_STATE = "setRecurringOrderState";

    /**
     *  <p>New state of the RecurringOrder.</p>
     * @return recurringOrderState
     */
    @NotNull
    @Valid
    @JsonProperty("recurringOrderState")
    public RecurringOrderStateDraft getRecurringOrderState();

    /**
     *  <p>New state of the RecurringOrder.</p>
     * @param recurringOrderState value to be set
     */

    public void setRecurringOrderState(final RecurringOrderStateDraft recurringOrderState);

    /**
     * factory method
     * @return instance of RecurringOrderSetStateAction
     */
    public static RecurringOrderSetStateAction of() {
        return new RecurringOrderSetStateActionImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderSetStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderSetStateAction of(final RecurringOrderSetStateAction template) {
        RecurringOrderSetStateActionImpl instance = new RecurringOrderSetStateActionImpl();
        instance.setRecurringOrderState(template.getRecurringOrderState());
        return instance;
    }

    public RecurringOrderSetStateAction copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderSetStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderSetStateAction deepCopy(@Nullable final RecurringOrderSetStateAction template) {
        if (template == null) {
            return null;
        }
        RecurringOrderSetStateActionImpl instance = new RecurringOrderSetStateActionImpl();
        instance.setRecurringOrderState(com.commercetools.api.models.recurring_order.RecurringOrderStateDraft
                .deepCopy(template.getRecurringOrderState()));
        return instance;
    }

    /**
     * builder factory method for RecurringOrderSetStateAction
     * @return builder
     */
    public static RecurringOrderSetStateActionBuilder builder() {
        return RecurringOrderSetStateActionBuilder.of();
    }

    /**
     * create builder for RecurringOrderSetStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderSetStateActionBuilder builder(final RecurringOrderSetStateAction template) {
        return RecurringOrderSetStateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderSetStateAction(Function<RecurringOrderSetStateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderSetStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderSetStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderSetStateAction>";
            }
        };
    }
}
