
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Requests the creation of the next Order of the Recurring Order immediately, instead of waiting for <code>nextOrderAt</code>. The early Order consumes the upcoming occurrence: the number of Orders over time does not change, and the recurrence schedule does not shift.</p>
 *  <p>The request is processed asynchronously. The response contains the updated Recurring Order with the original <code>nextOrderAt</code>. After the request is accepted, the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderNowRequestedMessage" rel="nofollow">RecurringOrderNowRequested</a> Message is generated. The Order is then created through the regular Recurring Order process, which generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderCreatedFromRecurringOrderMessage" rel="nofollow">OrderCreatedFromRecurringOrder</a> Message. Only after that, <code>lastOrderAt</code> and <code>nextOrderAt</code> are updated.</p>
 *  <p>If the Order creation fails, the occurrence is not consumed and <code>nextOrderAt</code> remains unchanged.</p>
 *  <p>Returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error in the following situations:</p>
 *  <ul>
 *   <li>The Recurring Order is not active, has expired, or has not started yet.</li>
 *   <li>There is no upcoming Order to bring forward, or the upcoming Order falls on or after <code>expiresAt</code>.</li>
 *   <li>A <a href="https://docs.commercetools.com/apis/ctp:api:type:SkipConfiguration" rel="nofollow">Skip Configuration</a> still has Orders left to skip.</li>
 *   <li>The Recurring Order is currently processing an Order, including one that awaits a Checkout payment.</li>
 *   <li>Fewer days than the <code>minDaysBetweenOrders</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a> have passed since <code>lastOrderAt</code>.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderRequestOrderNowAction recurringOrderRequestOrderNowAction = RecurringOrderRequestOrderNowAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("requestOrderNow")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderRequestOrderNowActionImpl.class)
public interface RecurringOrderRequestOrderNowAction extends RecurringOrderUpdateAction {

    /**
     * discriminator value for RecurringOrderRequestOrderNowAction
     */
    String REQUEST_ORDER_NOW = "requestOrderNow";

    /**
     *  <p>Note recorded on the resulting <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderNowRequestedMessage" rel="nofollow">RecurringOrderNowRequested</a> Message.</p>
     *  <p>If <code>reason</code> is longer than 256 characters, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @return reason
     */

    @JsonProperty("reason")
    public String getReason();

    /**
     *  <p>Note recorded on the resulting <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderNowRequestedMessage" rel="nofollow">RecurringOrderNowRequested</a> Message.</p>
     *  <p>If <code>reason</code> is longer than 256 characters, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @param reason value to be set
     */

    public void setReason(final String reason);

    /**
     * factory method
     * @return instance of RecurringOrderRequestOrderNowAction
     */
    public static RecurringOrderRequestOrderNowAction of() {
        return new RecurringOrderRequestOrderNowActionImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderRequestOrderNowAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderRequestOrderNowAction of(final RecurringOrderRequestOrderNowAction template) {
        RecurringOrderRequestOrderNowActionImpl instance = new RecurringOrderRequestOrderNowActionImpl();
        instance.setReason(template.getReason());
        return instance;
    }

    public RecurringOrderRequestOrderNowAction copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderRequestOrderNowAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderRequestOrderNowAction deepCopy(
            @Nullable final RecurringOrderRequestOrderNowAction template) {
        if (template == null) {
            return null;
        }
        RecurringOrderRequestOrderNowActionImpl instance = new RecurringOrderRequestOrderNowActionImpl();
        instance.setReason(template.getReason());
        return instance;
    }

    /**
     * builder factory method for RecurringOrderRequestOrderNowAction
     * @return builder
     */
    public static RecurringOrderRequestOrderNowActionBuilder builder() {
        return RecurringOrderRequestOrderNowActionBuilder.of();
    }

    /**
     * create builder for RecurringOrderRequestOrderNowAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderRequestOrderNowActionBuilder builder(
            final RecurringOrderRequestOrderNowAction template) {
        return RecurringOrderRequestOrderNowActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderRequestOrderNowAction(Function<RecurringOrderRequestOrderNowAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<RecurringOrderRequestOrderNowAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<RecurringOrderRequestOrderNowAction>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderRequestOrderNowAction>";
            }
        };
    }
}
