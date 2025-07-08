
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.recurring_order.RecurringOrder;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Create RecurringOrder request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderCreatedMessagePayload recurringOrderCreatedMessagePayload = RecurringOrderCreatedMessagePayload.builder()
 *             .order(orderBuilder -> orderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RecurringOrderCreated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderCreatedMessagePayloadImpl.class)
public interface RecurringOrderCreatedMessagePayload extends MessagePayload {

    /**
     * discriminator value for RecurringOrderCreatedMessagePayload
     */
    String RECURRING_ORDER_CREATED = "RecurringOrderCreated";

    /**
     *  <p>RecurringOrder that was created.</p>
     * @return order
     */
    @NotNull
    @Valid
    @JsonProperty("order")
    public RecurringOrder getOrder();

    /**
     *  <p>RecurringOrder that was created.</p>
     * @param order value to be set
     */

    public void setOrder(final RecurringOrder order);

    /**
     * factory method
     * @return instance of RecurringOrderCreatedMessagePayload
     */
    public static RecurringOrderCreatedMessagePayload of() {
        return new RecurringOrderCreatedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderCreatedMessagePayload of(final RecurringOrderCreatedMessagePayload template) {
        RecurringOrderCreatedMessagePayloadImpl instance = new RecurringOrderCreatedMessagePayloadImpl();
        instance.setOrder(template.getOrder());
        return instance;
    }

    public RecurringOrderCreatedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderCreatedMessagePayload deepCopy(
            @Nullable final RecurringOrderCreatedMessagePayload template) {
        if (template == null) {
            return null;
        }
        RecurringOrderCreatedMessagePayloadImpl instance = new RecurringOrderCreatedMessagePayloadImpl();
        instance.setOrder(com.commercetools.api.models.recurring_order.RecurringOrder.deepCopy(template.getOrder()));
        return instance;
    }

    /**
     * builder factory method for RecurringOrderCreatedMessagePayload
     * @return builder
     */
    public static RecurringOrderCreatedMessagePayloadBuilder builder() {
        return RecurringOrderCreatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for RecurringOrderCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderCreatedMessagePayloadBuilder builder(
            final RecurringOrderCreatedMessagePayload template) {
        return RecurringOrderCreatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderCreatedMessagePayload(Function<RecurringOrderCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderCreatedMessagePayload>";
            }
        };
    }
}
