
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
 *     RecurringOrderCreatedMessage recurringOrderCreatedMessage = RecurringOrderCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .order(orderBuilder -> orderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RecurringOrderCreated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderCreatedMessageImpl.class)
public interface RecurringOrderCreatedMessage extends Message {

    /**
     * discriminator value for RecurringOrderCreatedMessage
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
     * @return instance of RecurringOrderCreatedMessage
     */
    public static RecurringOrderCreatedMessage of() {
        return new RecurringOrderCreatedMessageImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderCreatedMessage of(final RecurringOrderCreatedMessage template) {
        RecurringOrderCreatedMessageImpl instance = new RecurringOrderCreatedMessageImpl();
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
        instance.setOrder(template.getOrder());
        return instance;
    }

    public RecurringOrderCreatedMessage copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderCreatedMessage deepCopy(@Nullable final RecurringOrderCreatedMessage template) {
        if (template == null) {
            return null;
        }
        RecurringOrderCreatedMessageImpl instance = new RecurringOrderCreatedMessageImpl();
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
        instance.setOrder(com.commercetools.api.models.recurring_order.RecurringOrder.deepCopy(template.getOrder()));
        return instance;
    }

    /**
     * builder factory method for RecurringOrderCreatedMessage
     * @return builder
     */
    public static RecurringOrderCreatedMessageBuilder builder() {
        return RecurringOrderCreatedMessageBuilder.of();
    }

    /**
     * create builder for RecurringOrderCreatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderCreatedMessageBuilder builder(final RecurringOrderCreatedMessage template) {
        return RecurringOrderCreatedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderCreatedMessage(Function<RecurringOrderCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderCreatedMessage>";
            }
        };
    }
}
