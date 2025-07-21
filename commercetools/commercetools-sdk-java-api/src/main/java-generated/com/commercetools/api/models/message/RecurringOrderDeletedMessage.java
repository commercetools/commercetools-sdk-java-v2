
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
 *  <p>Generated after a successful Delete RecurringOrder request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderDeletedMessage recurringOrderDeletedMessage = RecurringOrderDeletedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .recurringOrder(recurringOrderBuilder -> recurringOrderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RecurringOrderDeleted")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderDeletedMessageImpl.class)
public interface RecurringOrderDeletedMessage extends Message {

    /**
     * discriminator value for RecurringOrderDeletedMessage
     */
    String RECURRING_ORDER_DELETED = "RecurringOrderDeleted";

    /**
     *  <p>RecurringOrder that was deleted.</p>
     * @return recurringOrder
     */
    @NotNull
    @Valid
    @JsonProperty("recurringOrder")
    public RecurringOrder getRecurringOrder();

    /**
     *  <p>RecurringOrder that was deleted.</p>
     * @param recurringOrder value to be set
     */

    public void setRecurringOrder(final RecurringOrder recurringOrder);

    /**
     * factory method
     * @return instance of RecurringOrderDeletedMessage
     */
    public static RecurringOrderDeletedMessage of() {
        return new RecurringOrderDeletedMessageImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderDeletedMessage of(final RecurringOrderDeletedMessage template) {
        RecurringOrderDeletedMessageImpl instance = new RecurringOrderDeletedMessageImpl();
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
        instance.setRecurringOrder(template.getRecurringOrder());
        return instance;
    }

    public RecurringOrderDeletedMessage copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderDeletedMessage deepCopy(@Nullable final RecurringOrderDeletedMessage template) {
        if (template == null) {
            return null;
        }
        RecurringOrderDeletedMessageImpl instance = new RecurringOrderDeletedMessageImpl();
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
        instance.setRecurringOrder(
            com.commercetools.api.models.recurring_order.RecurringOrder.deepCopy(template.getRecurringOrder()));
        return instance;
    }

    /**
     * builder factory method for RecurringOrderDeletedMessage
     * @return builder
     */
    public static RecurringOrderDeletedMessageBuilder builder() {
        return RecurringOrderDeletedMessageBuilder.of();
    }

    /**
     * create builder for RecurringOrderDeletedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderDeletedMessageBuilder builder(final RecurringOrderDeletedMessage template) {
        return RecurringOrderDeletedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderDeletedMessage(Function<RecurringOrderDeletedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderDeletedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderDeletedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderDeletedMessage>";
            }
        };
    }
}
