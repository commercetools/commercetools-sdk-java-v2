
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
 *  <p>Generated after a successful <span>Delete RecurringOrder</span> request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderDeletedMessagePayload recurringOrderDeletedMessagePayload = RecurringOrderDeletedMessagePayload.builder()
 *             .recurringOrder(recurringOrderBuilder -> recurringOrderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RecurringOrderDeleted")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderDeletedMessagePayloadImpl.class)
public interface RecurringOrderDeletedMessagePayload extends MessagePayload {

    /**
     * discriminator value for RecurringOrderDeletedMessagePayload
     */
    String RECURRING_ORDER_DELETED = "RecurringOrderDeleted";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> that was deleted.</p>
     * @return recurringOrder
     */
    @NotNull
    @Valid
    @JsonProperty("recurringOrder")
    public RecurringOrder getRecurringOrder();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> that was deleted.</p>
     * @param recurringOrder value to be set
     */

    public void setRecurringOrder(final RecurringOrder recurringOrder);

    /**
     * factory method
     * @return instance of RecurringOrderDeletedMessagePayload
     */
    public static RecurringOrderDeletedMessagePayload of() {
        return new RecurringOrderDeletedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderDeletedMessagePayload of(final RecurringOrderDeletedMessagePayload template) {
        RecurringOrderDeletedMessagePayloadImpl instance = new RecurringOrderDeletedMessagePayloadImpl();
        instance.setRecurringOrder(template.getRecurringOrder());
        return instance;
    }

    public RecurringOrderDeletedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderDeletedMessagePayload deepCopy(
            @Nullable final RecurringOrderDeletedMessagePayload template) {
        if (template == null) {
            return null;
        }
        RecurringOrderDeletedMessagePayloadImpl instance = new RecurringOrderDeletedMessagePayloadImpl();
        instance.setRecurringOrder(
            com.commercetools.api.models.recurring_order.RecurringOrder.deepCopy(template.getRecurringOrder()));
        return instance;
    }

    /**
     * builder factory method for RecurringOrderDeletedMessagePayload
     * @return builder
     */
    public static RecurringOrderDeletedMessagePayloadBuilder builder() {
        return RecurringOrderDeletedMessagePayloadBuilder.of();
    }

    /**
     * create builder for RecurringOrderDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderDeletedMessagePayloadBuilder builder(
            final RecurringOrderDeletedMessagePayload template) {
        return RecurringOrderDeletedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderDeletedMessagePayload(Function<RecurringOrderDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderDeletedMessagePayload>";
            }
        };
    }
}
